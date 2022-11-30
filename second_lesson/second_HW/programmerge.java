
package second_lesson.second_HW;
// Реализовать алгоритм сортировки массива слиянием
public class programmerge {
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

    public static int[] division1(int[] arrF){
        int len1F = arrF.length/2;
        int[] arr1F = new int[len1F];
        for (int i = 0; i < len1F; i++) {
            arr1F[i] = arrF[i];
        }
        // printArr(arr1F);
    return arr1F;
    }
    public static int[] division2(int[] arrF){
        int len2F;
        if (arrF.length%2 != 0) {
            len2F = (arrF.length/2) + 1;
        } else {
            len2F = arrF.length/2;
        }
        int[] arr2F = new int[len2F];
        for (int i = 0; i < len2F; i++) {
            arr2F[i] = arrF[arrF.length/2 + i];
        }
        // printArr(arr2F);
    return arr2F;
    }

    public static void printArr(int[] arrF) { 
        for (int item : arrF) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
    public static void printEmpty() { 
        System.out.println();
    }
    
    public static int[] merge(int[] arr1F, int[] arr2F) {
        // printArr(arr1F); printArr(arr2F);
        int[] newArrF = new int[arr1F.length+arr2F.length];
        int k1 = 0, k2 = 0, i = 0;
        while (k1 < arr1F.length && k2 <arr2F.length) {
            if (arr1F[k1] <= arr2F[k2]) {
                newArrF[i] = arr1F[k1];
                k1 = k1 + 1;
                i = i + 1;
            } else {
                newArrF[i] = arr2F[k2];
                k2 = k2 + 1;
                i = i + 1;
            }
        }
        while (k1 < arr1F.length) {
            newArrF[i] = arr1F[k1];
            k1 = k1 + 1;
            i = i + 1;
        }
        while (k2 <arr2F.length) {
            newArrF[i] = arr2F[k2];
            k2 = k2 + 1;
            i = i + 1;
        }
    // printArr(newArrF);
    return newArrF;
    }

    public static int[] sortMerger(int[] arrF){
        if (arrF.length<2){
            return arrF;
        } else {
            // printArr(arr1F);
            // int[] arr1F = division1(arrF);
            // printArr(arr1F);
            // sortMerger(arr1F);
            // sortMerger(division1(arrF));
            // int[] arr2F = division2(arrF);
            // printArr(arr2F);
            // sortMerger(arr2F);
            // sortMerger(division2(arrF));
            // int[] newArrF = merge(arr1F, arr2F);
            int[] newArrF = merge(sortMerger(division1(arrF)), sortMerger(division2(arrF)));
            // printArr(newArrF);
        return newArrF;
        }
    }

    public static void main(String[] args) {
        printEmpty();
        int n = 16, start = -10, end = 10;
        System.out.printf("n = %d, from = %d, to = %d:\n", n, start, end);
        int[] arr = createArr(n);
        arr = fillRandomArr(arr, n, start, end);
        printArr(arr);
        // printEmpty();
        printArr(sortMerger(arr));
        printEmpty();
    }
}
