package org.kuro.jlpt.entity;

import java.util.List;

public class QuestionDetailRes {

    private String belong;

    private List<QuestionDetail> list;

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public List<QuestionDetail> getList() {
        return list;
    }

    public void setList(List<QuestionDetail> list) {
        this.list = list;
    }
}
