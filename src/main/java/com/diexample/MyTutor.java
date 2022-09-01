package com.diexample;

public class MyTutor implements MyTutorService {

    private Subjects subjects;

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

}
