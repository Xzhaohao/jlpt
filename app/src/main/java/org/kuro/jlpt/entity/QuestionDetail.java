package org.kuro.jlpt.entity;

public class QuestionDetail {

    // 问题
    private String question;

    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;

    // 正确答案
    private String right;
    // 解析
    private String analyze;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getAnalyze() {
        return analyze;
    }

    public void setAnalyze(String analyze) {
        this.analyze = analyze;
    }
}
