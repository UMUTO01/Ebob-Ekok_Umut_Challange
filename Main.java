import java.util.Scanner;

public class Main {


    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Ebob();



        // System.out.println("Hello world!");
    }


    public static void Ebob(){



        System.out.println("Enter two Number:");

        System.out.println("First Number:");

        double a = scan.nextDouble();

        System.out.println("Second Number: ");

        double b = scan.nextDouble();

        double Highest =0;
        double Lowest = 0;

        if(a>b){
            System.out.println("Greatest Num = "+ a);
            Highest =+ a;
            Lowest =+ b;
        }

        else {
            System.out.println("Greatest Num = "+ b);
            Highest =+ b;
            Lowest =+ a;
        }


        double ebob = 0;


        for(double argument = 1; argument <= Lowest; argument++){

            if(Lowest%argument==0  && Highest%argument == 0){
                ebob = argument;
            }
        }

        System.out.println("Ebob of two numbers is: "+ ebob);

        boolean ant = true;

        double checker = Highest;

        while (ant == true){

            if(checker%Lowest == 0){


                ant = false;
            }
            else {
                checker++;
                ant = true;
            }

        }

        System.out.println("Ekok is: "+ checker);



    }
}