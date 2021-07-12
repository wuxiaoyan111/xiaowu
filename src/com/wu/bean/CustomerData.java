package com.wu.bean;

import java.util.ArrayList;
import java.util.List;
  //使用单例模式 吧客户初始化了
public class CustomerData {
   private  static  CustomerData ourInstance = new CustomerData();
   private List<Customer> customerList;
             public  static  CustomerData getInstance(){
         return  ourInstance;
     }

   private CustomerData(){
                 //构造中 初始话数据
         customerList = new ArrayList<>();


       for (int i = 0; i < 10; i++) {
           //每循环一次，诞生一个 customer对此昂，放入到集合当中
           Customer customer = new Customer();
              customer.setAccount("5201314"+i);
              customer.setCname("吴笑研"+ i +"号");
              customer.setPassword("123");
              customer.setMoney(1000);
              customer.setPhoneNum("123455"+i);
              customerList.add(customer);


       }
 }
       public  List<Customer>   getCustomerList(){
         return customerList;
    }
      public  void setGetCustomerList(List<Customer> customerList){

         this.customerList=customerList;
      }
}
