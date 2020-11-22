package com.cleo.healthcare.domain.dao;

import java.util.Arrays;
import java.util.List;

public class JDBCUserDAO implements UserDAO{
    @Override
    public List<String> getAllUserNames() {
        System.out.println("Implementing from RDBMS");
        return Arrays.asList("Jim", "John", "Rob");
    }
}
