package classes;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
         //coffe espresso coffe , cappuccino coffee , latte coffe tea, plain tea , assam tea ,goinger tea, cardamon tea
        // soups Hot and sour soup veg corn cup
        Scanner sc = new Scanner(System.in);
        String[] coffee ={"espresso coffe" , "cappuccino coffee" , "latte coffe tea", "plain tea" , "assam tea" ,"goinger tea", "cardamon tea"};
        String[] soup ={ "Hot and sour soup", "veg corn cup"};
        String[] Beverage = {"hot chocolate drink", "badam"};

        char t = sc.next().charAt(0);
        int a = sc.nextInt();
        if(t=='c'&&a< coffee.length){
            System.out.println("welcome to coffee");
            System.out.println("enjoy your "+coffee[a]);
        }
        else if(t=='s'&&a< soup.length){
            System.out.println("welcome to soup");
            System.out.println("enjoy your "+soup[a]);
        }

        else if(t=='b'&&a< soup.length){
            System.out.println("welcome to beraverage");
            System.out.println("enjoy your "+Beverage[a]);
        }
        else{
            System.out.println("invalid input !");

        }
    }
}
