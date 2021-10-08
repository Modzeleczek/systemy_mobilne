package com.modzel.quiz;

public class Question {
    private int id;
    private boolean isTrue;

    public Question(int id, boolean isTrue) {
        this.id = id;
        this.isTrue = isTrue;
    }

    public int getId() {
        return id;
    }

    public boolean getIsTrue() {
        return isTrue;
    }
}
