package com.verenaputz.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DatabaseAccessor {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public DatabaseAccessor(){
        // Persistence unit name kommt aus der persistence.xml
        this.entityManagerFactory = Persistence.createEntityManagerFactory("Quotes");
    }

    //JPQL
    public List<Quote> getQuotes(){
        String s = "SELECT q FROM Quote q";
        this.entityManager = this.entityManagerFactory.createEntityManager();
        TypedQuery<Quote> query = this.entityManager.createQuery(s, Quote.class);
        List<Quote> quoteList = query.getResultList();
        this.entityManager.close();
        return quoteList;
    }


}
