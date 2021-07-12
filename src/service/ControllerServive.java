package service;

import com.util.TextUtil;
import com.wu.bean.Customer;
import com.wu.bean.CustomerData;

import java.util.List;
import java.util.Scanner;

//此类是 完成客户的所有业务（增删改查）
public class ControllerServive {
    private List<Customer> customerList;
    private Customer currenCustomer;

    // CustomerData customerData =   CustomerData.getInstance();
    // List<Customer> customerList =  customerData.getCustomerList();
    public void checkPwd(String cardid, String CardPwd) {
        CustomerData customerData = CustomerData.getInstance();
        customerList = customerData.getCustomerList();

        System.out.println("cardid = " + cardid);
        System.out.println("CardPwd = " + CardPwd);
        for (Customer customer : customerList) {
            if (customer.getAccount().equals(cardid) && customer.getPassword().equals(CardPwd)) {
                currenCustomer = customer;
                System.out.println("欢迎" + customer.getCname() + "顾客登录1请您注意安全");

                TextUtil.oneLeveOption();//界面
                Scanner scanner = new Scanner(System.in);
                String option = scanner.nextLine();
                oneOption(option);

            }
        }
    }

    private void oneOption(String option) {
        switch (option) {
            case "1":
                System.out.println("查询余额");
                //查询余额外
                doSelectMoney();

                //按下1之后 回退到一级选项
                goOneHome();
                break;
            case "2":
                goGetMoneyHome();
                 goOneHome();
                break;
            case "3":
                doTruanMoney();
                System.out.println("转账 ");
                goOneHome();
                break;

            case "4":
                doSaveMoney();

                goOneHome();
                break;
            case "5":
                doQuitCard();
                System.out.println("退卡");
                System.exit(0);
                goOneHome();
                break;

        }
    }
    //退卡
     private  void doQuitCard(){
         System.out.println("你是否继续操作yes/no[Y/N]");
         Scanner scanner = new Scanner(System.in);
         String s = scanner.nextLine();

if (s.equalsIgnoreCase("y")){
             TextUtil.welcome();
         }
    if(s.equalsIgnoreCase("n")){


    }

         }

    //存款
    private  void doSaveMoney() {
      // 1.提示页面
       /* System.out.println("请输入你的余额");

        //2. scanner 接收 钱数
        Scanner scanner = new Scanner(System.in);
        String moneyIn = scanner.nextLine();
       Double moneyInInt = Double.valueOf(moneyIn);
       double newMoney = currenCustomer.getMoney()+moneyInInt;
        //更新当前用户余额
        currenCustomer.setMoney(newMoney);
        System.out.println("你的账户余额是："+newMoney);*/
        TextUtil.getmoneyUI();
        //让客户输入
        Scanner scanner = new Scanner(System.in);
        String numIn = scanner.nextLine();
        if (numIn.equals("1")){
            double money = currenCustomer.getMoney();
            money= money+100;
            System.out.println("你的余额是："+money);
            currenCustomer.setMoney(money);
        }else  if (numIn.equals("2")){
            double money = currenCustomer.getMoney();
            money= money+200;
            System.out.println("你的余额是："+money);
            currenCustomer.setMoney(money);



        }else  if (numIn.equals("3")) {
            double money = currenCustomer.getMoney();
            money = money + 300;
            System.out.println("你的余额是：" + money);
            currenCustomer.setMoney(money);
        }else  if (numIn.equals("4")) {
            double money = currenCustomer.getMoney();
            money = money + 400;
            System.out.println("你的余额是：" + money);
            currenCustomer.setMoney(money);
        }else  if (numIn.equals("5")) {
            double money = currenCustomer.getMoney();
            money = money + 800;
            System.out.println("你的余额是：" + money);
            currenCustomer.setMoney(money);
        }else  if (numIn.equals("6")) {
            double money = currenCustomer.getMoney();
            money = money + 1000;
            System.out.println("你的余额是：" + money);
            currenCustomer.setMoney(money);
        }else  if (numIn.equals("7")) {
            double money = currenCustomer.getMoney();
            money = money + 2000;
            System.out.println("你的余额是：" + money);
            currenCustomer.setMoney(money);
        }else if(numIn.equals("8")){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的存款金额：");
            int money = sc.nextInt();
            if (money>0&&money<=currenCustomer.getMoney()){
                currenCustomer.setMoney(currenCustomer.getMoney()+money);
                System.out.println("存款成功");
                System.out.println("你的当前余额为："+currenCustomer.getMoney());
            }else {
                System.out.println("输入错误");
            }
        }

    }
    //取钱
    private void goGetMoneyHome() {
        TextUtil.getmoneyUI();
        Scanner scanner = new Scanner(System.in);
        String numIn = scanner.nextLine();

        if (numIn.equals("1")) {
            //按1   取出100   -100
            double money = currenCustomer.getMoney();
            money = money - 100;
            System.out.println("你的余额是：" + money);
            //取完款 更新原有的存款
            currenCustomer.setMoney(money);
        } else if (numIn.equals("2")) {
            //按下2  取款200
            double money = currenCustomer.getMoney();
            money = money - 200;
            System.out.println("你的余额是：" + money);
            //取完款后 更新原有存款
            currenCustomer.setMoney(money);

        } else if (numIn.equals("3")) {
            double money = currenCustomer.getMoney();
            money = money - 300;
            System.out.println("你的余额是：" + money);
            currenCustomer.setMoney(money);
        }else if(numIn.equals("4")) {
            double money = currenCustomer.getMoney();
            money = money - 500;
            System.out.println("你的余额是：" + money);
            currenCustomer.setMoney(money);
        }else  if (numIn.equals("5")){
            double money = currenCustomer.getMoney();
            money= money-800;
            System.out.println("你的余额是："+money);
            currenCustomer.setMoney(money);


        }else  if (numIn.equals("6")){
            double money = currenCustomer.getMoney();
            money= money-1000;
            System.out.println("你的余额是："+money);
            currenCustomer.setMoney(money);


        }else if(numIn.equals("7")){
            double money = currenCustomer.getMoney();
            money= money-2000;
            System.out.println("你的余额是："+money);
            currenCustomer.setMoney(money);


        }else if(numIn.equals("8")){
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
    }
//转账
    private  void  doTruanMoney(){
        System.out.println("请输入对方的卡号：");
        Scanner scanner = new Scanner(System.in);
        String otherAccout = scanner.nextLine();
        System.out.println("请输入你转账的金额");
        String otherMoney = scanner.nextLine();
                         //做计算，自己的钱 - otherMoney ，别人的钱+otherMoney
                         //减钱
        Double otherMoneyInt = Double.parseDouble(otherMoney);
   double currentMoney =  currenCustomer.getMoney()-otherMoneyInt;//自己的钱 - 被转之后的钱
                                // 别人 加钱 根据账户 otherAccout 本人的账户查询 别人的余额， 查出别人的余额后  修改别人的余额
                                //因为所有人都在 customerList 都在这个集合中  呢么遍历这个集合
        Customer other = null;

        for (Customer customer : customerList) {
            if (customer.getAccount().equals(otherAccout)) {
                //
                other=customer;
            }
        }
          double otherOneMoney =  other.getMoney()+otherMoneyInt;//别人的余额
         currenCustomer.setMoney(currentMoney);
         other.setMoney(otherOneMoney);  // 注意： 不能直接创建对象了
    }

//查询
    private void doSelectMoney() {
        double money = currenCustomer.getMoney();
        System.out.println("余额是" + money);
    }
private void goOneHome() {
        TextUtil.oneLeveOption();

        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option1 = " + option);
        oneOption(option);
    }

}