package com.example.demomongodb.conf;

import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.net.UnknownHostException;

//@Configuration
//public class MongoDBConfig {
//
//    @Value("${spring.data.mongodb.uri}")
//    private String uri;
//
//    @Bean
//    public MongoDbFactory mongoDbFactory() throws UnknownHostException {
//        String uriStr=uri;
//        System.out.println(uriStr);
//        MongoClientURI mongoClientURI=new MongoClientURI(uriStr);
//        MongoDbFactory mongoDbFactory=new SimpleMongoDbFactory(mongoClientURI);
//        return mongoDbFactory;
//    }
//}
