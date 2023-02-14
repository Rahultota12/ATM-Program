 import java.util.*;
public class ATMprogram{
    public static void main(String[] args) {
        int balance = 100000, withdraw,cheackbalance, diposit,num,pass;
        Scanner sc =new Scanner(System.in);
           {
            System.out.println("||=============================================================||");
            System.out.println("||                                                             ||");
            System.out.println("||                 WEL COME SBI ATM                            ||");
            System.out.println("||                                                             ||");
            System.out.println("||=============================================================||");
            System.out.println("      1.withdrow");
            System.out.println("      2. Diposite");
            System.out.println("      3.check the balance");
            System.out.println("      enter your choice");
            num=sc.nextInt();
            System.out.println("    Enter your pin");
            pass=sc.nextInt();
           if(pass==1234){ 
            switch(num){
               case 1:
               System.out.println("  enter the Amount");
               withdraw=sc.nextInt();
               if(balance>=withdraw){
                balance= balance-withdraw;
                System.out.println("your withdraw Amount" + withdraw );
              System.out.println("please collect Amount");
              System.out.println("your Account  balance is " + balance);

               }else{
                System.out.println("you dont throw is withdrow");
               }
               System.out.println(" ");
               break;

               case 2:
               System.out.println("enter Amout for diposit");
               diposit=sc.nextInt();
               balance=balance+diposit;
               System.out.println("your diposit Amount is " + diposit);
               System.out.println("maney has been diposite succesfully");
               System.out.println(" your Account balance is " +balance);
               break;
               case 3:
               System.out.println(" balance " + balance);
               break;
               
            }
        }else{
            System.out.println("incorrect pin \n THANK YOU");
           }
            
        }
    }

}