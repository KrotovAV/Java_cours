package third_lesson.third_HW;

import java.util.Arrays;

public class prog02 {
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }

    public static int[] createArr(int nF) {
        int[] newArrF = new int[nF];
        return newArrF;
    }

    public static int[] fillMultArr(int[] arrF, int multF, int aF, int bF, int cF) {
        for (int i = 0; i < multF; i++) {
            arrF[i] = aF;
            aF = funcMult(aF, cF);
            if (aF == bF) System.out.printf("-xxxx--%d \n", aF);
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
            if (funcMult(addArrF[i], cF) == bF) System.out.printf("-xxxx--%d \n", funcMult(addArrF[i], cF));
            if (funcMult(addArrF[i], cF) <= bF && addArrF[i] != 0){
                newMultArrF[i] = funcMult(addArrF[i], cF);
            }
        }
        newMultArrF = removeElement(newMultArrF, 0);
        return newMultArrF;
    }
    public static int[] newAddArr(int[] multArrF, int bF, int dF){
        int[] newAddArrF = createArr(multArrF.length);
        for (int i = 0; i < newAddArrF.length; i++) {
            if (funcAdd(multArrF[i], dF) == bF) System.out.printf("-xxxx--%d \n", funcAdd(multArrF[i], dF));
            if (funcAdd(multArrF[i], dF) <= bF && multArrF[i] != 0) {
                newAddArrF[i] = funcAdd(multArrF[i], dF);
            }
        }
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

        // Пример 2: а = 11, b = 7, c = 2, d = 1 // -> нет решения.
        System.out.println();
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
        
        int nAdd = ((b - a) / d) + 1; 
        // System.out.println(add);
        int nMult = ((b - a) / funcMult(a, c)) + 1;
        // System.out.println(mult);

        int[] addArr = createArr(nAdd);
        addArr = fillAddArr(addArr, nAdd, a, b, d);
        System.out.printf("addArr - ");
        printArr(addArr);
        int[] multArr = createArr(nMult);
        multArr = fillMultArr(multArr, nMult, a, b, c);
        System.out.printf("multArr - ");
        printArr(multArr);

        int[] newMultArr11 = newMultArr(addArr, b, c);
        System.out.printf("newMultArr11 - addArr: ");
        printArr(newMultArr11);
        int[] newAddArr12 = newAddArr(addArr, b, d);
        System.out.printf("newAddArr12 - addArr: ");
        printArr(newAddArr12);

        int[] newMultArr21 = newMultArr(multArr, b, c);
        System.out.printf("newMultArr21 - multArr: ");
        printArr(newMultArr21);
        int[] newAddArr22 = newAddArr(multArr, b, d);
        System.out.printf("newMultArr22 - multArr: ");
        printArr(newAddArr22);

// ---------------------------------------
  
        // mainFuncToAddArr(addArr, b, c, d);
        
        // mainFuncToMultArr(multArr, b, c, d);
    }

}