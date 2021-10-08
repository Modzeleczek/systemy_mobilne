package com.modzel.quiz;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {
    private int id;
    private boolean isTrue;

    public Question(int id, boolean isTrue) {
        this.id = id;
        this.isTrue = isTrue;
    }
}
