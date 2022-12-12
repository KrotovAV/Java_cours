package fifth_leccon.fifth_HW;
//Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;

public class progTriangl {

    public static int[] triangleArr(int n) {
        int[] arrF = new int[n];
        arrF[0] = 1; 
        // System.out.printf(" %d \n", arrF[0]);
        for (int i = 1; i < n; i++) {
            arrF[i] = i + 1 + arrF[i-1];
            // System.out.printf(" %d = %d + %d\n ",arrF[i], i, arrF[i-1]);
        }
        return arrF;
    }
    public static void printArr(int[] arrF) { 
        for (int item : arrF) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
    public static void printTrianglArr(int[] arrF) {
        int co;
        int maxLen = arrF[arrF.length-1];
        // System.out.println(maxLen);
        for (int i = 0; i < arrF.length; i++) {
            co = (maxLen-arrF[i])/2;
            // System.out.println(arrF[i]);
            System.out.println(" ".repeat(co) + "*".repeat(arrF[i]) + " ".repeat(co));
        }
        // System.out.println();
    }
    public static void printEmpty() {
        System.out.println();
    }

    public static void main(String[] args) {
        printEmpty();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Write n of triangl namber: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int[] arrF = triangleArr(n);
        printArr(arrF);
        printEmpty();
        printTrianglArr(arrF);
        printEmpty();

    }
}