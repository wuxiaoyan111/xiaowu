package com.wu.bean;

public class Computer {
    //只有私有属性。和get set 方法叫做实体类
    //一般一个实体类对应一张表
      private  double price;
      private  String color;
      private String  type;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
