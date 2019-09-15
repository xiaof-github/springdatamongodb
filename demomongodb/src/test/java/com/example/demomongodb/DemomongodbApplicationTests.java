package com.example.demomongodb;

import com.example.demomongodb.dao.StockRepository;
import com.example.demomongodb.document.Stock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemomongodbApplicationTests {
    private static final String COLLECTION_NAME = "test_stock";

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    private static final Logger logger = LoggerFactory.getLogger(DemomongodbApplicationTests.class);

    @Test
    public void queryDemo() {
        //add sort
        Criteria criteria = Criteria.where("ts_code").is("600318.SH");
        Query query = new Query(criteria);
        List<Stock> results = mongoTemplate.find(query, Stock.class, COLLECTION_NAME);
        for (Stock each:results) {
            logger.info("each={}", each.toString());
        }
    }

}
