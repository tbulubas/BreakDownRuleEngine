package com.tb_optimus.breakdown_ruleengine.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tb_optimus.breakdown.domain.Colour;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Ignore
public class ColourDBTest {

    private EntityManagerFactory emf;

    private EntityManager em;

    private static Logger log = LoggerFactory.getLogger(ColourDBTest.class);

    @Before
    public void setUp() {
        initHibernate();
    }

    @After
    public void tearDown() {
        purge();
    }

    @Test
    public void shouldCreateAndInsertColour() throws Exception {
        // given
        // when
        // then
    }

    private void initHibernate() {
        emf = Persistence.createEntityManagerFactory("breakdown-pu");
        em = emf.createEntityManager();
    }

    private void purge() {
//        FullTextEntityManager ftEm = org.hibernate.search.jpa.Search.getFullTextEntityManager(em);
//        ftEm.purgeAll(Colour.class);
//        ftEm.flushToIndexes();
//        ftEm.close();
        emf.close();
    }

    private List<Colour> search(String searchQuery) //throws ParseException
    {
        Query query = searchQuery(searchQuery);

        List<Colour> books = query.getResultList();

        for (Colour b : books) {
            log.info("Title: " + b.getName());
        }
        return books;
    }

    private Query searchQuery(String searchQuery) // throws ParseException
    {

        String[] colourFields = {"title", "subtitle", "authors.name", "publicationDate"};

        //lucene part
        Map<String, Float> boostPerField = new HashMap<String, Float>(4);
        boostPerField.put(colourFields[0], (float) 4);
        boostPerField.put(colourFields[1], (float) 3);
        boostPerField.put(colourFields[2], (float) 4);
        boostPerField.put(colourFields[3], (float) .5);

//		FullTextEntityManager ftEm = org.hibernate.search.jpa.Search.getFullTextEntityManager( em );
//		Analyzer customAnalyzer = ftEm.getSearchFactory().getAnalyzer( "customanalyzer" );
//		QueryParser parser = new MultiFieldQueryParser(
//				Version.LUCENE_34, colourFields,
//				customAnalyzer, boostPerField
//		);

//		org.apache.lucene.search.Query luceneQuery;
//		luceneQuery = parser.parse( searchQuery );

//		final FullTextQuery query = ftEm.createFullTextQuery( luceneQuery, Book.class );

//		return query;
        return null;
    }
}
