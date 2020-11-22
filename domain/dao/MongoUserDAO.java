package com.cleo.healthcare.domain.dao;

import java.util.Arrays;
import java.util.List;

public class MongoUserDAO implements UserDAO{
    @Override
    public List<String> getAllUserNames() {
        System.out.println("Getting names from Mongo Db");
        return Arrays.asList("Bond","James", "Bons");
    }
}
