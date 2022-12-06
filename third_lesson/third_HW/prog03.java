package third_lesson.third_HW;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.apache.commons.lang.ArrayUtils;

public class prog03 {

    public static int[] insertAnElementAtAGivenIndex(final int[] srcArray, int index, int newElement) {
        int[] destArray = new int[srcArray.length+1];
        int j = 0;
        for(int i = 0; i < destArray.length-1; i++) {
    
            if(i == index) {
                destArray[i] = newElement;
            } else {
                destArray[i] = srcArray[j];
                j++;
            }
        }
        return destArray;
    }

    public static <T> T[] merge(int[] newMultArr11, int[] addArr) {
        int aLen = newMultArr11.length;
        int bLen = addArr.length;
  
        @SuppressWarnings("unchecked")
        T[] c = (T[]) Array.newInstance(newMultArr11.getClass().getComponentType(), aLen + bLen);
        System.arraycopy(newMultArr11, 0, c, 0, aLen);
        System.arraycopy(addArr, 0, c, aLen, bLen);
        return c;
    }
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }

    public static int[] createArr(int nF) {
        int[] newArrF = new int[nF];
        return newArrF;
    }
    public static int[] fillAddArr(int[] arrF, int addF, int aF, int bF, int dF) {
        for (int i = 0; i < addF; i++) {
            arrF[i] = aF;
            aF = funcAdd(aF, dF);
            // if (aF == bF) System.out.printf("-xxxx--%d \n", aF);
        }
        return arrF;
    }
    public static int[] fillMultArr(int[] arrF, int multF, int aF, int bF, int cF) {
        for (int i = 0; i < multF; i++) {
            arrF[i] = aF;
            aF = funcMult(aF, cF);
            // if (aF == bF) System.out.printf("-xxxx--%d \n", aF);
        }
        return arrF;
    }

    public static int funcAdd(int aF, int dF) {
        aF = aF + dF;
        return aF;
    }
    public static int funcMult(int aF, int cF) {
        aF = aF * cF;
        return aF;
    }

    public static void printArr(int[] arrF) { 
        for (int item : arrF) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }

    public static int[] newMultArr(int[] addArrF, int bF,int cF){
        int[] newMultArrF = createArr(addArrF.length);
        for (int i = 0; i < newMultArrF.length; i++) {
            // if (funcMult(addArrF[i], cF) == bF) System.out.printf("-xxxx--%d \n", funcMult(addArrF[i], cF));
            if (funcMult(addArrF[i], cF) <= bF && addArrF[i] != 0){
                newMultArrF[i] = funcMult(addArrF[i], cF);
            }
        }
        newMultArrF = insertAnElementAtAGivenIndex(newMultArrF, 0, addArrF[0]);
        newMultArrF = removeElement(newMultArrF, 0);
        return newMultArrF;
    }
    public static int[] newAddArr(int[] multArrF, int bF, int dF){
        int[] newAddArrF = createArr(multArrF.length);
        for (int i = 0; i < newAddArrF.length; i++) {
            // if (funcAdd(multArrF[i], dF) == bF) System.out.printf("-xxxx--%d \n", funcAdd(multArrF[i], dF));
            if (funcAdd(multArrF[i], dF) <= bF && multArrF[i] != 0) {
                newAddArrF[i] = funcAdd(multArrF[i], dF);
            }
        }
        newAddArrF = insertAnElementAtAGivenIndex(newAddArrF, 0, multArrF[0]);
        newAddArrF = removeElement(newAddArrF, 0);
        return newAddArrF;
    }

    public static int[][] mainFuncToAddArr(int[][] addArrF, int bF, int cF, int dF){
        int[] addArr1F = addArrF[0];
        // int[] addArr1F = addArrF[1];
        int[] newAddArr1F = newMultArr(addArr1F, bF, cF);
        // printArr(newAddArr1F);

        int[] newAddArr2F = newAddArr(addArr1F, bF, dF);
        // printArr(newAddArr2F);
        addArrF[0] = newAddArr1F;
        addArrF[1] = newAddArr2F;
        return addArrF;
    }
    public static int[][] mainFuncToMultArr(int[][] multArrF, int bF, int cF, int dF){
        int[] multArr1F = multArrF[0];
        int[] newMultArr1F = newAddArr(multArr1F, bF, dF);
        printArr(newMultArr1F);
        int[] newMultArr2F = newMultArr(multArr1F, bF, cF);
        printArr(newMultArr2F);

        multArrF[0] = newMultArr1F;
        multArrF[1] = newMultArr2F;
        return multArrF;
    }
    
    public static void main(String[] args) {
        // int a = 30, b = 345, c = 5, d = 6; // -> 0
        // int a = 2, b = 7, c = 2, d = 1; //-> 3
        int a = 3, b = 27, c = 3, d = 2; //-> 6
        // int a = 55, b = 555, c = 5, d = 2; //-> 30
        // int a = 22, b = 2022, c = 11, d = 56; //-> 0
        // int a = 22, b = 2022, c = 11, d = 10; //-> 18
        // int a = 22, b = 333, c = 3, d = 1; //-> 467
        // int a = 22, b = 2022, c = 3, d = 1; //-> 763827
        // int a = 11, b = 7, c = 2, d = 1; // -> нет решения.

        System.out.println();
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
        
        int nAdd = ((b - a) / d) + 1; 
        // System.out.println(add);
        int nMult = ((b - a) / funcMult(a, c)) + 1;
        // System.out.println(mult);

        int[] addArr = createArr(nAdd);
        addArr = fillAddArr(addArr, nAdd, a, b, d);
        // System.out.printf("addArr - ");
        // printArr(addArr);
        int[] multArr = createArr(nMult);
        multArr = fillMultArr(multArr, nMult, a, b, c);
        // System.out.printf("multArr - ");
        // printArr(multArr);
        // System.out.printf("0-0------------------------ \n");
        int[] arr1;
        int[] arr2;
        if ((a + d) < (a * c)){
            System.out.printf("2-1------------------------ \n");
            int[] newMultArr21 = newMultArr(addArr, b, c);
            System.out.printf("     Arr1: ");
            printArr(addArr);
            arr1 = addArr;
            System.out.println();
            System.out.printf("     Arr2: ");
            printArr(newMultArr21);
            arr2 = newMultArr21;
        } else {
            System.out.printf("2-2------------------------ \n");
            int[] newAddArr22 = newAddArr(multArr, b, d);
            System.out.printf("     Arr1: ");
            printArr(multArr);
            arr1 = multArr;
            System.out.println();
            System.out.printf("     Arr2: ");
            printArr(newAddArr22);
            arr2 = newAddArr22;
        }
        // System.out.println(arr1[arr1.length-1]);
        // System.out.println(arr2[arr2.length-1]);
        // System.out.println(arr1[1]);
        // System.out.println(arr2[1]);
        int mainCount = 0, l1, l2;
        if (arr1[0] == a && arr1[arr1.length-1] == b) mainCount = mainCount + 1;
        if (arr2[0] == a && arr2[arr2.length-1] == b) mainCount = mainCount + 1;

        if (arr1[arr1.length-1] != b && arr2[arr2.length-1] != b){
            mainCount = 0;
        } else {
            if(arr1[arr1.length - 1] != b){
                l1 = arr1.length;
            } else {
                l1 = arr1.length - 1;
            }
            if(arr2[arr2.length - 1] != b){
                l2 = arr2.length;
            } else {
                l2 = arr2.length - 1;
            }
            for (int i = 1; i < l1; i++) {
                for (int j = 1; j < l2; j++){
                    if (arr1[i] == arr2[j]){
                        // System.out.println("xxxx");
                        mainCount = mainCount + 1;
                    }
                }
            }
        }
        System.out.printf("%d way from %d to %d whith (+ %d) or (* %d)\n", mainCount, a, b, d, c );

        // System.out.printf("===========================\n ");
        // int[] newAddArr12 = newAddArr(addArr, b, d);
        // System.out.printf("newAddArr12 - addArr: ");
        // printArr(newAddArr12);
        // System.out.printf("2------------------------- \n");
        // int[] newMultArr21 = newMultArr(multArr, b, c);
        // System.out.printf("newMultArr21 - multArr: ");
        // printArr(newMultArr21);
        // int[] newAddArr22 = newAddArr(multArr, b, d);
        // System.out.printf("newMultArr22 - multArr: ");
        // printArr(newAddArr22);

    }

}

