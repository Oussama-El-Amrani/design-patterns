package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("choice one startegy you want ?");
            String strName = scanner.next();
            if(strName.equals("q"))break;
            try{
                Class<?> clazz = Class.forName("strategy."+strName);
                IStrategy str = (IStrategy) clazz.getDeclaredConstructor().newInstance();
                context.setStrategy(str);
                context.makeStrategy();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}