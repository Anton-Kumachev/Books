package chap10;

import java.util.Date;

public class TestFormats {
    public static void main(String[] args) {
        String s1 = String.format("%,d", 1000_000_000);
        System.out.println(s1);
        String s2 = String.format("Мне нужно исправить %,.2f ошибки.", 476578.09876);
        System.out.println(s2);

        int one = 20456654;
        double two = 100567890.248907;
        String s3 = String.format("Уровень %,d из %,.2f", one, two);
        System.out.println(s3);

        Date today = new Date();
        String s4 = String.format("%tA, %tB %td", today, today, today);
        System.out.println(s4);

        String s5 = String.format("%tA, %<tB %<td", today); // Сокращёная запись
        System.out.println(s5);
    }
}
