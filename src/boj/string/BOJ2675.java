package boj.string;

import java.util.Scanner;

public class BOJ2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int r = sc.nextInt();
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < r; j++)
                    System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}