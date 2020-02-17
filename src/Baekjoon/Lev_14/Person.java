package Baekjoon.Lev_14;

public class Person {

    private int age;
    private String name;
    private int joinOrder;

    public Person(int age, String name, int joinOrder) {
        this.age = age;
        this.name = name;
        this.joinOrder = joinOrder;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getJoinOrder() {
        return joinOrder;
    }

}
