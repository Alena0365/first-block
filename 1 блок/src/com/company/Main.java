package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int inputInt (){
        Scanner in = new Scanner(System.in);
        int vvod = in.nextInt();
        return vvod;
    }
    public static double inputDouble (){
        Scanner in = new Scanner(System.in);
        double vvod = in.nextDouble();
        return vvod;
    }
    public static String inputStr (){
        Scanner in = new Scanner(System.in);
        String vvod = in.nextLine();
        return vvod;
    }
    public static char inputchar () throws IOException {
        Scanner in = new Scanner(System.in);
        char vvod=(char)System.in.read();
        return vvod;
    }
    public static int task1(int a, int b){
        return a%b;
    }
    public static double task2(int base, int height){
        return 0.5*(base*height);
    }
    public static int task3(int chickens, int cows, int pigs ){
        int chickenslegs=2; int cowslegs=4;int pigslegs=4;
        return chickens*chickenslegs+cows*cowslegs+pigs*pigslegs;
    }
    public static boolean task4(double prob, double prize, double pay){
        if (prob*prize > pay) {
          return  true;
        }
        else return false;
    }
    public static String task5(int N,int a, int b){
        String str;
        if (a+b==N) { str="a и b должны быть сложены";}
        else if (a-b==N){ str="a и b должны быть вычтены";}
        else if (a*b==N){ str="a и b должны быть перемножены";}
        else if(a/b==N){ str="a и b должны быть разделены";}
        else {str="None";}
        return str;
    }
    public static int task6(char a){
       int ascii=(int)a;
       return ascii;
    }
    public static int task7(int last){
        int sum = last;
        while (last!=0)
        {
            last=last-1;
            sum= sum+last;
        }
        return sum;
    }
    public static int task8(int a, int b){
        int c;
        return c=a+b-1;
    }
    public static int task9(int [] arr){
        int sumofcubes=0;
        int n=arr.length;
        for (int i = 0;i<arr.length; i++){
            sumofcubes+= Math.pow(arr[i],3);
        }
        return sumofcubes;
    }
    public static boolean task10(int A, int B, int C){
        int sumA=A;
        for (int i=0;i==B;i++){
            sumA+=A;
        }
        if (A%C==0){return true;}
        else return false;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("1 задание. Введите 2 числа");
        int a= inputInt();int b=inputInt();
        System.out.println("Остаток от деления: " + task1(a,b));
        System.out.println("2 задание. Введите основание и высоту треугольника.");
        int base=inputInt(); int height=inputInt();
        System.out.println("Площадь треугольника: " + task2(base,height));
        System.out.println("3 задание. Введите количество куриц, коров и свиней");
        int chickens=inputInt(); int cows=inputInt();int pigs=inputInt();
        System.out.println("Всего лап на ферме: " + task3(chickens,cows,pigs));
        System.out.println("4 задание. Введите 3 числа: prob, prize и pay");
        double prob=inputDouble(); double prize=inputDouble(); double pay=inputDouble();
        System.out.println("Результат: " + task4(prob,prize,pay));
        System.out.println("5 задание. Введите 3 числа");
        int N=inputInt(); int a1=inputInt(); int b1=inputInt();
        System.out.println("Результат: " + task5(N,a1,b1));
        System.out.println("6 задание. Введите символ");
        char a2=inputchar();
        System.out.println("Код символа в кодировке ASCII: " + task6(a2));
        System.out.println("7 задание. Введите число");
        int last= inputInt();
        System.out.println("Сумма чисел ряда: " + task7(last));
        System.out.println("8 задание. Введите 2 числа");
        int a3= inputInt(); int b3=inputInt();
        System.out.println("Максимальная длина 3 стороны: " + task8(a3,b3));
        System.out.println("9 задание");
        System.out.println("Введите размер массива: ");
        int [] arr = new int[inputInt()];
        System.out.println("Введите элементы массива: ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=inputInt();
        }
        System.out.println("Сумма кубов чисел массива: " + task9(arr));
        System.out.println("10 задание. Введите 3 числа");
        int A= inputInt();int B=inputInt();int C=inputInt();
        System.out.println("Результат: " + task10(A,B,C));
    }
}
