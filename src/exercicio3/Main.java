package src.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("type a positive number: ");
        int num = scanner.nextInt();

        int first = 0, second = 1;
        for(int i = 0; i < num; i++){
            System.out.print(first +  " ");
            int next = first + second;
            first = second;
            second = next;

        }

    }
}
