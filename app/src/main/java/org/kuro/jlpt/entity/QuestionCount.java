package org.kuro.jlpt.entity;

public class QuestionCount {

    private Integer n1Count;
    private Integer n2Count;
    private Integer n3Count;
    private Integer n4Count;
    private Integer n5Count;

    public QuestionCount() {
    }

    public QuestionCount(Integer n1Count, Integer n2Count, Integer n3Count, Integer n4Count, Integer n5Count) {
        this.n1Count = n1Count;
        this.n2Count = n2Count;
        this.n3Count = n3Count;
        this.n4Count = n4Count;
        this.n5Count = n5Count;
    }

    public Integer getN1Count() {
        return n1Count;
    }

    public void setN1Count(Integer n1Count) {
        this.n1Count = n1Count;
    }

    public Integer getN2Count() {
        return n2Count;
    }

    public void setN2Count(Integer n2Count) {
        this.n2Count = n2Count;
    }

    public Integer getN3Count() {
        return n3Count;
    }

    public void setN3Count(Integer n3Count) {
        this.n3Count = n3Count;
    }

    public Integer getN4Count() {
        return n4Count;
    }

    public void setN4Count(Integer n4Count) {
        this.n4Count = n4Count;
    }

    public Integer getN5Count() {
        return n5Count;
    }

    public void setN5Count(Integer n5Count) {
        this.n5Count = n5Count;
    }
}
