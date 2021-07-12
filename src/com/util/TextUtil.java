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
