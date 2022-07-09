package org.kuro.jlpt.entity;

public class Question {

    private Integer id;

    // 真题名称
    private String name;

    // 题数
    private Integer count;

    public Question() {
    }

    public Question(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public Question(Integer id, String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
