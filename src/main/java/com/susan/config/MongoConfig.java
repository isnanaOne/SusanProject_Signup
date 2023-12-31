package com.susan.config;
import java.util.Collection;
import java.util.Collections;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration{
    @Override
    protected String getDatabaseName() {
        // TODO Auto-generated method stub
        return null;
    }
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder().applyConnectionString(connectionString).build();
        return MongoClients.create(mongoClientSettings);
    }
    public Collection getMappingBasePackages() {
        return Collections.singleton("com.test");
    }
}