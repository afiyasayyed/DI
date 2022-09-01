package com.diexample;

public class SubjectTutor implements Subjects{

    @Override
    public String myMathTutor() {
        return "Hi! This is your Math Tutor";
    }

    @Override
    public String myEnglishTutor() {
        return "Hi! This is your English Tutor";
    }
}
