package com.wu.bean;

import java.util.ArrayList;

public class MyJava {
      // main  方法快捷键   psvm
      public static void main(String[] args) {
          System.out.println("输出的快捷键 是sout");

          String name ="小吴";
          System.out.println("name = " + name);//soutv 可以显示变量
          System.out.println("MyJava.main");//soutm 是输出方法名称
          System.out.println("args = [" + args + "]");// soutp 输出方法的参数
   int age = 17;
          if (age < 18) {  //  if快捷键  ifn
              System.out.println("此人未成年");
          }
           ArrayList<String> strings = new ArrayList<>();

          strings.add("唐1藏");//ctrl+d  快速复制一行  Ctrl+z 是一行撤销  ctrl+y 快速删除一行 Ctrl+shift +z夺不走撤销
          strings.add("唐2藏");
          strings.add("唐3藏");//Alt+鼠标 多行编辑
          strings.add("唐4藏");

          for (String string : strings) {//遍历循环的快捷键  inte
              System.out.println("string = " + string);  


          }
//创建电脑
            Computer c1 = new Computer();//说明构造方法公开
           c1.setColor("白色");
           c1.setPrice(12);
           c1.setType("联想");

          System.out.println("c1 = " + c1);
          Computer c2 = new Computer();
          c2.setColor("白色");
          c2.setPrice(12);
          c2.setType("联想");

          System.out.println("c2 = " + c2);

          System.out.println(c1==c2);//false


      //测试单例模式
       //   Phone p1 = new    Phone();// 无参构造  私有化
          Phone p1 =     Phone.getInstance();

          Phone p2 =     Phone.getInstance();
          System.out.println(p1==p2);
      }

}
