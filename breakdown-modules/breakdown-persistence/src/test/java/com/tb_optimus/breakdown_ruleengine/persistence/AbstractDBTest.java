package com.tb_optimus.breakdown_ruleengine.persistence;

import org.junit.After;
import org.junit.Before;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by tbulu on 3/17/2017.
 */
public class AbstractDBTest {
    protected EntityManager em;
    private EntityManagerFactory emf;

    @Before
    public void setUp() {
        initHibernate();
    }

    @After
    public void tearDown() {
        purge();
    }

    private void initHibernate() {
        emf = Persistence.createEntityManagerFactory("breakdown-pu");
        em = emf.createEntityManager();
    }

    private void purge() {
        emf.close();
    }
}
