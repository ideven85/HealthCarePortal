package com.cleo.healthcare.config;

//import java.util.concurrent.locks.Condition;

import com.cleo.healthcare.domain.dao.DatabaseType;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class DatabaseTypeCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(DatabaseType.class.getName());
        String type = (String) attributes.get("value");
        String enabledDBType = System.getProperty("dbType", "MYSQL");
        return (enabledDBType!=null && type!=null && enabledDBType.equalsIgnoreCase(type));
    }
}
