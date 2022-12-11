package fourth_lesson;

public class prog {
    public static int[] createArr(int nF) {
        int[] newArrF = new int[nF];
        return newArrF;
    }
    
    public static int[][] createArrArr(int nF, int mF) {
        int[] newArrF[] = new int[nF][mF];
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

    public static void printArrArr(int[][] arrF) { 
        System.out.print("[");
        for (int i = 0; i < arrF.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrF[i].length; j++) {
                System.out.printf("%d,", arrF[i][j]);
            }
            System.out.print("],");
        }
        System.out.print("] ");
    }

    public static void printEmrty(){
        System.out.println();
    }
    public static int[][] checkNamArrArr(int newArr[], int newArrArr[][]){
        for (int i = 0; i < newArrArr.length; i++) {
            newArrArr[i][0] = newArr[0] + i;
        }
        for (int i = 0; i < newArrArr.length; i++) {
            int count = 0;
            for (int j = 0; j < newArr.length; j++){
                if (newArrArr[i][0] == newArr[j]) count = count + 1;
            }
            newArrArr[i][1] = count;
        }
        return newArrArr;
    }
    public static void main(String[] args) {
        int n = 10;
        int start = -9;
        int end = 9;
        printEmrty();
        System.out.printf("n = %d, from = %d, to = %d\n", n, start, end);
        int[] newArr = createArr(n);
        newArr = fillRandomArr(newArr,n, start, end);
        int n2 = end - start;
        int m = 2;
        int[][] newArrArr = createArrArr(n2, m);
        newArrArr = checkNamArrArr(newArr, newArrArr);
        printArr(newArr);
        // printEmrty();
        printArrArr(newArrArr);
        printEmrty();
        printEmrty();
    }
}
    
