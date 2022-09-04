package com.diexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:tutorApp.properties")
public class TutorConfig {

    //define bean for SubjectTutor
    @Bean
    public Subjects subject(){
        return new SubjectTutor();
    }

    //define bean for MyTutor and inject dependency
    @Bean
    public MyTutorService tutor(){
        return new MyTutor(subject());
    }
}
