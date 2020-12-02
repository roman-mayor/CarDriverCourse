package ru.iteco.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.iteco")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
