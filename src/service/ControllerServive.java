package service;

import com.util.TextUtil;
import com.wu.bean.Customer;
import com.wu.bean.CustomerData;

import java.util.List;
import java.util.Scanner;

//此类是 完成客户的所有业务（增删改查）
public class ControllerServive{
   private List<Customer> customerList;
   private Customer currenCustomer;
    // CustomerData customerData =   CustomerData.getInstance();
    // List<Customer> customerList =  customerData.getCustomerList();
     public void checkPwd(String cardid,String CardPwd){
         CustomerData customerData =   CustomerData.getInstance();
         customerList =  customerData.getCustomerList();

         System.out.println("cardid = " + cardid);
         System.out.println("CardPwd = " + CardPwd);
         for (Customer customer : customerList) {
                if(customer.getAccount().equals(cardid) && customer.getPassword().equals(CardPwd)){
                     currenCustomer = customer;
                     System. out.println("欢迎"+customer.getCname()+"顾客登录1请您注意安全");

                     TextUtil.oneLeveOption();//界面
                   Scanner scanner =   new Scanner(System.in);
                   String option = scanner.nextLine();
                     oneOption(option);

                 }
         }
     }
private void oneOption(String option) {
        switch (option){
            case "1":
                System.out.println("查询余额");
                //查询余额
                doSelectMoney();

   //按下1之后 回退到一级选项
                goOneHome();
             break;
            case "2":
                System.out.println("取款");
                withdrawMoney();
                goOneHome();
                break;
            case "3":
                System.out.println("转账 ");
                Money();
                goOneHome();
                break;
            case "4":
                System.out.println("存款");
                saveMoney();
                goOneHome();
                break;
            case "5":
                System.out.println("退卡");
                System.exit(0);
                goOneHome();
                break;

        }
    }
    private  void  doSelectMoney(){
        double money =   currenCustomer.getMoney();
        System.out.println("余额是"+money);
    }
    //取款
    private void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的取款金额：");
        int money = sc.nextInt();
        if (money>0&&money<=currenCustomer.getMoney()){
            currenCustomer.setMoney(currenCustomer.getMoney()-money);
            System.out.println("取款成功");
            System.out.println("你的当前余额为："+currenCustomer.getMoney());
        }else {
            System.out.println("输入错误");
        }
    }
    //转账
    private void Money() {
        System.out.println("请输入您要转账的卡号：");
        Scanner account = new Scanner(System.in);
        int money = account.nextInt();
        Customer nuser = null;
        boolean IsExit = false;
    }




    //存款
    private void saveMoney(){
        System.out.println("请输入您的存款金额：");
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        if (currenCustomer!=null){
            if (money>0){
                currenCustomer.setMoney(currenCustomer.getMoney()+money);
                System.out.println("存款成功");
                System.out.println("你的当前余额为："+currenCustomer.getMoney());
            }else{
                System.out.println("输入错误");
            }

        }
    }
   private  void  goOneHome( ){
       TextUtil.oneLeveOption();

       Scanner scanner = new Scanner(System.in);
       String option = scanner.nextLine();
       System.out.println("option1 = " + option);
       oneOption(option);
   }
}
