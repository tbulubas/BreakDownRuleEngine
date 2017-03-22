package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Size;
import com.tb_optimus.breakdown.domain.SizeImpl;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

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
        Set<Size> sizes = new HashSet<Size>();
        Size size1 = new SizeImpl("S32", 10);
        Size size2 = new SizeImpl("S34", 20);
        Size size3 = new SizeImpl("S36", 30);
        sizes.addAll(Lists.newArrayList(size1, size2, size3));
        sizeOrder.setSizeOrder(sizes);
        em.persist(sizeOrder);
        Long id = sizeOrder.getId();
        // when
        SizeOrderDB sizeOrder1 = em.find(SizeOrderDB.class, id);
        // then
        assertThat(sizeOrder1.getId()).isEqualTo(sizeOrder1.getId());
    }


}
