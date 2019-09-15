package com.example.demomongodb.dao;

import com.example.demomongodb.document.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock, Long> {

}
