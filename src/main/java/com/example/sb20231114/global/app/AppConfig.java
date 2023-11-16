package com.example.sb20231114.global.app;

import com.example.sb20231114.domain.article.article.entity.Article;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    List<Article> articles2(){
        return new java.util.LinkedList<>();
    }

    @Bean
    List<Article> articles(){
        return new java.util.ArrayList<>();
    }

}