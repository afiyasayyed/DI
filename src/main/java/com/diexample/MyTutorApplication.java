package com.diexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTutorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(TutorConfig.class);

        MyTutor myTutorService = annotationConfigApplicationContext.getBean("tutor", MyTutor.class);

        System.out.println(myTutorService.getTutorService());
        System.out.println(myTutorService.getMathTutor());
        System.out.println(myTutorService.getEnglishTutor());
        System.out.println(myTutorService.getEmail());
        System.out.println(myTutorService.getAddress());
        System.out.println(myTutorService.getContact());
        annotationConfigApplicationContext.close();
    }
}
