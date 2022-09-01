package com.diexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTutorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(TutorConfig.class);

        MyTutorService myTutorService = annotationConfigApplicationContext.getBean("tutor", MyTutorService.class);

        System.out.println(myTutorService.getTutorService());
        System.out.println(myTutorService.getMathTutor());
        System.out.println(myTutorService.getEnglishTutor());
        annotationConfigApplicationContext.close();
    }
}
