package atmpackage;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Obtions extends Account{

    Scanner scan=new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> data=new HashMap<>();
    boolean flag=true; // it is kind of counter
    public void login (){
        System.out.println("Hi!, Welcome");
        do{
            data.put(12345,1234);//user 1
            data.put(23456,2345);//user 2
            data.put(34567,3456);//user3
            data.put(45678,4567);//user4

            try {
                System.out.println("Enter account number");
                setAccountNumber(scan.nextInt());// i get the account number from user
                System.out.println("Enter the pin nnumber");
                setPinNumber(scan.nextInt());
            }catch(Exception e){
                System.out.println("Invalid character");
                System.out.println("please enter an integer to proceed or you can type in 'Q'to exit");
                scan.nextLine();
                String exit =scan.next().toLowerCase();
                if (exit.equals('q')){
                    flag=false;
                }
                e.printStackTrace();
            }
            int count=0;
            for (Map.Entry<Integer,Integer> w: data.entrySet()){
                if(w.getKey().equals(getAccountNumber())&& w.getValue().equals(getPinNumber())){
                System.out.println("welcomte to your account");
            }else{
                    count++;
                }
            }
            if (count==data.size()){

                System.out.println("account number or pin number does not match our users");
                System.out.println("invalid user");
                System.out.println("press any integer to try again or press ''Q to exit");
                String exit =scan.next();
                if (exit.equalsIgnoreCase("Q")){
                    flag=false;

                }
            }





        }while (flag);



    }
}
