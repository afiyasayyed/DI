package com.diexample;

import org.springframework.beans.factory.annotation.Value;

public class MyTutor implements MyTutorService {

    private Subjects subjects;

    @Value("${email}")
    private String email;

    @Value("${address}")
    private String address;

    @Value("${contact}")
    private String contact;

    MyTutor(Subjects theSubject){
        subjects = theSubject;
    }

    @Override
    public String getTutorService() {
        return "Welcome to Afiya's Tution Services";
    }

    @Override
    public String getEnglishTutor() {
        return subjects.myEnglishTutor();
    }

    @Override
    public String getMathTutor() {
        return subjects.myMathTutor();
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }
}
