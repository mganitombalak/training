package com.ibtech.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AeroEntityManager {

    private static EntityManagerFactory emFactory;

    public static EntityManager getEntityManager() {
        init();
        return emFactory.createEntityManager();
    }

    private static void init() {
        emFactory = Persistence.createEntityManagerFactory("IBTech");
    }

    public static void close() {
        emFactory.close();
    }
}
