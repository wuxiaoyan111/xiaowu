package com.controller;


import com.util.TextUtil;
import com.wu.bean.Customer;
import com.wu.bean.CustomerData;
import service.ControllerServive;

import java.util.List;
import java.util.Scanner;

public class AtmMain {

    private static String cardid;
    private static String cardPwd;
    private static ControllerServive controllerServive;

    public static void main(String[] args) {
        controllerServive = new  ControllerServive();
        //测试
       CustomerData customerData =   CustomerData.getInstance();
           List<Customer> customerList =  customerData.getCustomerList();
        for (Customer customer : customerList) {
            System.out.println("customer = " + customer);

        }
      TextUtil.welcome();


        //其他操作
        int i = 0;
            while (i<6){

                doWirtePassword();
                doCheckPassword(cardid,cardPwd);
                i++;
            }

    }
//校验校色和判断密码

    private static void doCheckPassword(String cardid,String cardPwd ) {
        //先校验校色   判断carID的长度
        if (cardid.length()==8) {   //客户
            //检验密码
            controllerServive.checkPwd(cardid,cardPwd);

        }

    }
//输入账户名
    private static void doWirtePassword() {
        System.out.println("请输入卡号");
        Scanner scanner = new Scanner(System.in);
        cardid = scanner.nextLine();
        System.out.println("cardid = " + cardid);
        System.out.println("请输入密码 ");
        cardPwd = scanner.nextLine();
        System.out.println("cardPwd = " + cardPwd);
    }


}