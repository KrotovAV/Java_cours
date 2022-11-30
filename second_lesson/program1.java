// Задача 1: Задайте массив из 12 элементов,
// заполненный случайными числами из промежутка [-9, 9].
// Найдите сумму отрицательных и положительных
// элементов массива.
package second_lesson;

public class program1 {
    public static int[] createArr(int nF) {
        int[] newArrF = new int[nF];
        return newArrF;
    }
    public static int[] fillRandomArr(int[] arrF,int nF, int startF, int endF) {
        for (int i = 0; i < nF; i++) {
            arrF[i] = (int) (Math.random() * ((endF - startF) + 1)) + startF;
        }
        return arrF;
    }
    public static void printArr(int[] arrF) { 
        for (int item : arrF) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
    public static int sumNegInArr(int[] arrF, int nF) {
        int sumNegF = 0;
        for (int i = 0; i < nF; i++) {
            if (arrF[i] < 0)
                sumNegF = sumNegF + arrF[i];
        }
        return sumNegF;
    }
    public static int sumPosInArr(int[] arrF, int nF) {
        int sumPosF = 0;
        for (int i = 0; i < nF; i++) {
            if (arrF[i] > 0)
                sumPosF = sumPosF + arrF[i];
        }
        return sumPosF;
    }
    public static void printNegPos(int sumNegF, int sumPosF){
        System.out.printf("sumNeg = %d, sumPos = %d ", sumNegF, sumPosF); 
        System.out.println();
    }
    public static void printEmrty(){
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;
        int start = -9;
        int end = 9;

        printEmrty();
        int[] newArr = createArr(n);
        printArr(newArr);
        newArr = fillRandomArr(newArr,n, start, end);
        printArr(newArr);
        int sumNeg = sumNegInArr(newArr, n);
        int sumPos = sumPosInArr(newArr, n);
        printNegPos(sumNeg, sumPos);
        printEmrty();
    }
}
