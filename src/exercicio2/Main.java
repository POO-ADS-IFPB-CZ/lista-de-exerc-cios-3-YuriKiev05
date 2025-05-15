package src.exercicio2;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

       // nao pode repetir
        //nao pode menor q 1 e maior que 60
        System.out.println("type a  number between 1 and 60");
        numbers[0] = scanner.nextInt();
        for(int i = 1; i<6; i++){
            System.out.println("type another number");
            int num = scanner.nextInt();
            boolean invalid = false;

            do{
                invalid = false;
                if(num < 1 || num > 60) invalid = true;

                for(int number : numbers){
                    if(num == number) invalid =true;
                }

                if(invalid){
                    System.out.println("You must type numbers between 1 and 60 whitout repeat");
                    System.out.print("try again:  ");
                    num = scanner.nextInt();
                }

            }while (invalid);

            numbers[i] = num;


        }


        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static boolean validate(int num){
        if(num < 1 || num > 60) return false;


        return true;
    }



}


