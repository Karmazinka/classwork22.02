package org.itstep;

public class DataTypes {
    public static void main(String[] args) {
        /*
        1. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
        2. Дано трехзначное число. В нем зачеркнули первую слева цифру и приписали ее справа. Вывести полученное число.
        3. Дано трехзначное число. Вывести число, полученное при переста¬новке цифр сотен и десятков исходного числа (например,
        123 перейдет в 213).
        4. Дано трехзначное число. Заменить в нем вторую цифру, если она является четной, на ближайшую большую нечетную цифру.
        5. Дано трехзначное число. Изменить одну его цифру так, чтобы оно стало палиндромом (одинаково читается справа налево и слева направо).
        6. Дано трехзначное число. Определить, является ли его число десятков четным числом.
        7. Дано трехзначное число. Определить, является ли его число сотен нечетным числом.
        8. Определить, является ли введенное трехзначное число палиндромом (одинаково читается справа налево и слева направо).
        9. Дано целое число, большее 999. Найти цифру, соответствующую разряду сотен в записи этого числа.
        10. Дано трехзначное число. Определить разность между этим числом и числом, записанным из тех же цифр, но в обратном порядке.
        11. Дано трехзначное число. Округлить его до десятков.
        12. Дано трехзначное число. Округлить его до сотен.
         */

        //boolean, byte, short, int, long, float, double, char
        int number = 123;
        int hundreds = number/100;
        int tens = (number%100)/10;
        int ones = number%10;
        int number2 = ones*100+tens*10+hundreds;
        System.out.println(number2);

        number = 141;
        //235/10=(23; 5)
        hundreds = number/100;
        tens = (number%100)/10;
        ones = number%10;
        number2 = tens*100+ones*10+hundreds;
        System.out.println(number2);

        boolean b = tens%2==0;

        int x = ++tens; //x=tens; tens++;
        x = tens++; //x=tens; tens++;
        System.out.println(x);
        System.out.println(tens);

        if (b)
            tens++;
        number2 = hundreds*100+tens*10+ones;
        System.out.println(number2);

        if (hundreds==ones)
        System.out.println("palindrom");
        else
            System.out.println("not a palindrom");

        String s = hundreds==ones?"palindrom":"not a palindrom";
        System.out.println(s);

    }
}
