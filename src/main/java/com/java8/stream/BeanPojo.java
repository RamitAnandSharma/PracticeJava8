package com.java8.stream;

public class BeanPojo {
    private String obj1;
    private String obj2;
    private int obj3;

    public BeanPojo(String obj1, String obj2, int obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public int getObj3() {
        return this.obj3;
    }

    public void setObj3(int obj3) {
        this.obj3 = obj3;
    }

    public String getObj1() {
        return this.obj1;
    }

    public void setObj1(String obj1) {
        this.obj1 = obj1;
    }

    public String getObj2() {
        return this.obj2;
    }

    public void setObj2(String obj2) {
        this.obj2 = obj2;
    }

    public String toString() {
        return "BeanPojo [obj1=" + this.obj1 + ", obj2=" + this.obj2 + ", obj3=" + this.obj3 + "]";
    }
}

