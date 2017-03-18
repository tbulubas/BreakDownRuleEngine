package com.tb_optimus.breakdown_ruleengine.persistence;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.fest.assertions.Assertions.assertThat;

public class ColourDBTest extends AbstractDBTest {

    private static Logger LOG = LoggerFactory.getLogger(ColourDBTest.class);

    @Test
    public void shouldFindColourAlreadyInDB() throws Exception {
        LOG.info("Test shouldFindColourAlreadyInDB()");
        // given
        Long id = 1000L;
        // when
        ColourDB colour = em.find(ColourDB.class, id);
        // then
        assertThat(colour).isNotNull();
        assertThat(colour.getName()).isEqualTo("red");
    }

    @Test
    public void shouldNotFindColour() throws Exception {
        LOG.info("Test shouldNotFindColour()");
        // given
        Long id = -1000L;
        // when
        ColourDB colour = em.find(ColourDB.class, id);
        // then
        assertThat(colour).isNull();
    }

    @Test
    public void shouldCreateAndInsertColour() throws Exception {
        LOG.info("Test shouldCreateAndInsertColour()");
        // given
        ColourDB colour = new ColourDB();
        colour.setName("read");
        em.persist(colour);
        Long id = colour.getId();
        // when
        ColourDB colour1 = em.find(ColourDB.class, id);
        // then
        assertThat(colour.getId()).isEqualTo(colour1.getId());
    }

}
