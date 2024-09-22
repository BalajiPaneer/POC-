/*
package com.sample1.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EnvConfig implements EnvironmentRepository {

    private final JdbcTemplate jdbcTemplate;

    public EnvConfig(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Environment findOne(String application, String profile, String label) {
        Environment environment = new Environment(application, profile);
        Map<String, String> properties = new HashMap<>();
        jdbcTemplate.query(
                "SELECT key, value FROM properties",
                (rs, rowNum) -> {
                    properties.put(rs.getString("key"), rs.getString("value"));
                    return null;
                }
        );
        environment.add(new PropertySource("database", properties));
        return environment;
    }
}
*/
