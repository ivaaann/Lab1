package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Hello Java world\n");

        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");

        int a = 3;
        double b = 4.21;
        String s = "tekst";
        System.out.printf("a = %d, b = %f, s = %s %n", a, b, s);
        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);

        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));

        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
        for (int i = 1; i <= 64; i += i) {
            int result = (int) (Math.log(i) / Math.log(2));
            int sum = i + result;

            System.out.printf("%d\t%d\t%d\t\n", i, result, sum);
        }

        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.print("Podaj pierwsza liczbe: ");
        num1 = input.nextInt();
        System.out.print("Podaj druga liczbe:");
        num2 = input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d%n", num1,num2,num1+num2);



      Scanner input = new Scanner(System.in);
      int num1 = 0, num2 = 0;
      do {
          System.out.print("Podaj liczbe ktore mam dodac:");
          num1 = input.nextInt();
          num2 = input.nextInt();
          if ((num1 == 0) || (num2 == 0)) ;
          System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
      } while (true);

        int[] liczby = new int[30];
        Random rnd = new Random();

        for (int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();

        int mx = Integer.MAX_VALUE;
        int mn = Integer.MIN_VALUE;
        long avg = 0;
        for (int l : liczby)
        {
            System.out.println(l);
            if (l < mn) mn = 1;
            if (l > mx) mx = 1;
            avg += 1;
        };
        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float) avg / liczby.length);

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int num = input.nextInt();
        String toHEX = Integer.toHexString(num);
        String toBIN = Integer.toBinaryString(num);
        System.out.println("DEC = " + num + " BIN = " + leftPad(toBIN, '0', 8) +
                " HEX = %" + leftPad(toHEX, '0', 4).toUpperCase());


        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.println(acc.getName());
        System.out.printf("%s%n", Account.translit("Наташа"));
        System.out.printf("%s%n", Account.translit("Андрей"));
        System.out.printf("%s%n", Account.translit("Иван"));
    }
}