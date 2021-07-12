package com.util;
/*
* 文本信息的工具类
* 以后修改文本信息，直接去修改这里就有了
*
*
* */
public class TextUtil {
    //welcome的界面
    public  static void welcome(){
        System.out.println("*******");
        System.out.println("先生/女士");
        System.out.println("欢迎使用ATM取款机");
        System.out.println("*******·");



    }
    //方法带有static关键字是静态方法，可以直接 类名.方法名（）调用
    public  static void  getmoneyUI(){
        System.out.println("************************************************");
        System.out.println("*******请输入你想取款的项目：*******************");
        System.out.println("********1.100         2.200*****************");
        System.out.println("*******3.300         4.500***********");
        System.out.println("*******5.800         6.1000***********");
        System.out.println("*****7.2000        8其他 *******");
        System.out.println("************************************************");



    }
    //存款
    public static  void doSaveMoney(){
        System.out.println("***************************");
        System.out.println("*******请输入你存款的数目******");
        System.out.println("*******1.100   2.200*******");
        System.out.println("*******3.300   4.400*******");
        System.out.println("*******5.800   6.1000*******");
        System.out.println("*******7.2000  8.其他********");
        System.out.println("****************************");
    }

//客户的1级选择
    public  static void  oneLeveOption(){
        System.out.println("************************************************");
        System.out.println("*******请输入你想要的操作类型：*******************");
        System.out.println("********1.查询余额         2.取款*****************");
        System.out.println("*******3.转账         4.存款***********");
        System.out.println("*****5.退卡         *******");
        System.out.println("************************************************");



    }
}
