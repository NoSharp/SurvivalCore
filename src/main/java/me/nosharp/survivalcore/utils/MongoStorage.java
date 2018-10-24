package me.nosharp.survivalcore.utils;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoStorage {

    private MongoClientURI uri;
    private MongoClient mongoClient;
    private DB db;
    private DBCollection mongoCollection;

    /**
     * Singleton (Private constructor).
     */
    private MongoStorage(){

        this.mongoClient = new MongoClient("95.179.203.44", 27017);


        this.db = this.mongoClient.getDB("Wrath");
        this.mongoCollection = this.db.getCollection("Players");

    }
}
