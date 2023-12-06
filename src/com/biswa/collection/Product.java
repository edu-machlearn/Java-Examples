package com.biswa.collection;

public class Product {
    int pid;
    String pname;
    float price;
    Product(int pid,String pname,float price){
        this.pid=pid;
        this.pname=pname;
        this.price=price;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public float getPrice() {
        return price;
    }
}
