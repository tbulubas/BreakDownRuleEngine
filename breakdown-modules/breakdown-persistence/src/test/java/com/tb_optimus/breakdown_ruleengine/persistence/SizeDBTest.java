package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Size;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.fest.assertions.Assertions.assertThat;

public class SizeDBTest extends AbstractDBTest {

    private static Logger LOG = LoggerFactory.getLogger(SizeDBTest.class);

    @Ignore(/* FIXME: 3/22/2017 */)
    @Test
    public void shouldFindSizeAlreadyInDB() throws Exception {
        LOG.info("Test shouldFindSizeAlreadyInDB()");
        // given
        Long id = 2001L;
        // when
        SizeDB size = em.find(SizeDB.class, id);
        // then
        assertThat(size).isNotNull();
        assertThat(size.getName()).isEqualTo("34");
        assertThat(size.getOrder()).isNotNull();
        assertThat(size.getOrder().getCount()).isEqualTo(20);
    }

    @Ignore(/* FIXME: 3/22/2017 */)
    @Test
    public void shouldNotFindSize() throws Exception {
        LOG.info("Test shouldNotFindSize()");
        // given
        Long id = -1000L;
        // when
        SizeDB size = em.find(SizeDB.class, id);
        // then
        assertThat(size).isNull();
    }

    @Ignore(/* FIXME: 3/22/2017 */)
    @Test
    public void shouldCreateAndInsertSize() throws Exception {
        LOG.info("Test shouldCreateAndInsertSize()");
        // given
        Size size = new SizeDB();
        size.setName("S32x36");
        em.persist(size);
        Long id = size.getId();
        // when
        SizeDB size1 = em.find(SizeDB.class, id);
        // then
        assertThat(size.getId()).isEqualTo(size1.getId());
    }

}
