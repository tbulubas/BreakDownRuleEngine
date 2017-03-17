package com.tb_optimus.breakdown_ruleengine.persistence;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.fest.assertions.Assertions.assertThat;

public class SizeOrderDBTest extends AbstractDBTest {

    private static Logger LOG = LoggerFactory.getLogger(SizeOrderDBTest.class);

    @Test
    public void shouldNotFindSizeOrder() throws Exception {
        LOG.info("Test shouldNotFindSizeOrder()");
        // given
        Long id = -1000L;
        // when
        SizeOrderDB size = em.find(SizeOrderDB.class, id);
        // then
        assertThat(size).isNull();
    }

    @Test
    public void shouldCreateAndInsertSizeOrder() throws Exception {
        LOG.info("Test shouldCreateAndInsertSizeOrder()");
        // given
        SizeOrderDB sizeOrder = new SizeOrderDB();
        em.persist(sizeOrder);
        Long id = sizeOrder.getId();
        // when
        SizeOrderDB sizeOrder1 = em.find(SizeOrderDB.class, id);
        // then
        assertThat(sizeOrder1.getId()).isEqualTo(sizeOrder1.getId());
    }

}
