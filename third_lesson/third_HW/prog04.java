package third_lesson.third_HW;
import java.util.Arrays;
// package com.logicbig.example;

import java.lang.reflect.Array;

public class prog04 {
    public static <T> T[] merge(T[] a, T[] b) {
        int aLen = a.length;
        int bLen = b.length;
  
        @SuppressWarnings("unchecked")
        T[] c = (T[]) Array.newInstance(a.getClass().getComponentType(), aLen + bLen);
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }
    public static String valName(String mainName, int count) {
        String secjndName = Integer.toString(count);
        String name = mainName + secjndName;
    return name;
    }
    public static int[] createArr(int nF) {
        int[] newArrF = new int[nF];
        return newArrF;
    }
    public static void printArr(int[] arrF) { 
        for (int item : arrF) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
    private static <T> T[] append(T[] arr, T element)
    {
        T[] array = Arrays.copyOf(arr, arr.length + 1);
        array[arr.length] = element;
        return array;
    }
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
    
    public static Integer[] toObject(int[] intArray) {
        Integer[] result = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = Integer.valueOf(intArray[i]);
        }
        return result;
    }

    public static int[] toPrimitive(Integer[] IntegerArray) {
        int[] result = new int[IntegerArray.length];
        for (int i = 0; i < IntegerArray.length; i++) {
            result[i] = IntegerArray[i].intValue();
        }
        return result;
    }

    public static <T> T[] merge(T[] a, T[] b) {
        int aLen = a.length;
        int bLen = b.length;
  
        @SuppressWarnings("unchecked")
        T[] c = (T[]) Array.newInstance(a.getClass().getComponentType(), aLen + bLen);
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }

    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static Integer[] firstAddArr(int a, int b, int c, int d){
        int a1 = a;
        System.out.printf("addArr" + " = ");
        Integer[] addArr = toObject(createArr(1));
        addArr[0] = a1;
        while (a1 + d <= b) {
            int num = addArr[addArr.length-1] + d;
            a1 = num;
            addArr = append(addArr, num);
        }
    printArr(toPrimitive(addArr));
    return addArr;
    }
    public static Integer[] firstMultArr(int a, int b, int c,int d){
        int a1 = a;
        System.out.printf("multArr" + " = ");
        Integer[] multArr = toObject(createArr(1));
        multArr[0] = a1;
        while (a1 * c <= b) {
            int num = multArr[multArr.length-1] * c;
            a1 = num;
            multArr = append(multArr, num);
        }
    printArr(toPrimitive(multArr));
    return multArr;
    }

    public static Integer[] findAdd(int[] startArr, int b, int c,int d) {
        Integer[] findAddmainArr =  new Integer[0];
        int count1 = 1;
        for (int i = 0; i < startArr.length; i++) {
            int a1 = startArr[i];
            String varName = valName("arr1", count1);
            // System.out.printf(varName + " = ");
            Integer[] $varName = toObject(createArr(1));
            // System.out.println(a1);
            $varName[0] = a1;
            int co = 0;
            while (a1 + d <= b) {
                a1 = $varName[co] + d;
                // System.out.printf("xd = %d ", a1);
                $varName = append($varName, a1);
                co += 1;
            }
            // printArr(toPrimitive($varName));
            findAddmainArr = merge(findAddmainArr, $varName);
            count1 += 1;
        }
        return findAddmainArr;
    }
    public static Integer[] findMult(int[] startArr, int b, int c,int d) {
        Integer[] findMultmainArr =  new Integer[0];
        int count2 = 1;
        for (int i = 0; i < startArr.length; i++) {
            int a1 = startArr[i];
            String varName = valName("arr2", count2);
            // System.out.printf(varName + " = ");
            Integer[] $varName = toObject(createArr(1));
            $varName[0] = a1;
            int co = 0;
            while (a1 *c <= b) {
                a1 = $varName[co] * c;
                // System.out.printf("yd = %d", a1);
                $varName = append($varName, a1);
                co += 1;
            }
            // printArr(toPrimitive($varName));
            findMultmainArr = merge(findMultmainArr, $varName);
            count2 += 1;
        }
        return findMultmainArr;
    }

    public static void findAddMult(int[] startArr, int b, int c,int d) {
        int count1 = 1;
        Boolean varBool = true;
        for (int i = 0; i < startArr.length; i++) {
            int a1 = startArr[i];
            String varName = valName("arr1", count1);
            System.out.printf(varName + " = ");
            Integer[] $varName = toObject(createArr(1));
            // System.out.println(a1);
            $varName[0] = a1;
            int co = 0;
            if (varBool == true) {
                while (a1 + d <= b) {
                    a1 = $varName[co] + d;
                    $varName = append($varName, a1);
                    co += 1;
                    System.out.println("xxxxx");
                    varBool = false; 
                }
            } else {
                while (a1 * c <= b) {
                    a1 = $varName[co] * c;
                    $varName = append($varName, a1);
                    co += 1;
                    System.out.println("yyyyyyy");
                    varBool = true;
                }
            }
            printArr(toPrimitive($varName));
            count1 += 1;
        }
    }
    public static void findMultAdd(int[] startArr, int b, int c,int d) {
        int count1 = 1;
        Boolean varBool = true;
        for (int i = 10; i < startArr.length; i++) {
            int a1 = startArr[i];
            String varName = valName("arr1", count1);
            System.out.printf(varName + " = ");
            Integer[] $varName = toObject(createArr(1));
            // System.out.println(a1);
            $varName[0] = a1;
            int co = 0;
            if (varBool == true) {
                while (a1 * c  <= b) {
                    a1 = $varName[co] * c;
                    $varName = append($varName, a1);
                    co += 1;
                    varBool = false;
                }
            } else {
                while (a1 + d <= b) {
                    a1 = $varName[co] + d;
                    $varName = append($varName, a1);
                    co += 1;
                    varBool = true;
                }
            }
            printArr(toPrimitive($varName));
            count1 += 1;
        }
    }

	public static void main(String[] args) throws Exception{
        // int a = 30, b = 345, c = 5, d = 6; // -> 0
        // int a = 2, b = 7, c = 2, d = 1; //-> 3
        int a = 3, b = 27, c = 3, d = 2; //-> 6
        // Пример 2: а = 11, b = 7, c = 2, d = 1 // -> нет решения.
        System.out.println();
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);

        int[] arr0 = createArr(1);
        arr0[0] = a;
        System.out.printf("arr0 = ");
        printArr(arr0);
        System.out.println("00-----------------------");
        Integer[] arrAdd = firstAddArr(a, b, c, d);
        System.out.println("01-----------------------");
        Integer[] arrMult = firstMultArr(a, b, c, d);

        System.out.println("1-------------------------");
        Integer[] findAddAddArr = findAdd(toPrimitive(arrAdd), b, c, d);
        printArr(toPrimitive(findAddAddArr));

        System.out.println("2-------------------------");
        Integer[] findMultAddArr = findMult(toPrimitive(arrAdd), b, c, d);
        printArr(toPrimitive(findMultAddArr));

        System.out.println("3-------------------------");
        Integer[] findAddMultArr = findAdd(toPrimitive(arrMult), b, c, d);
        printArr(toPrimitive(findAddMultArr));

        System.out.println("4-------------------------");
        Integer[] findMultMultArr = findMult(toPrimitive(arrMult), b, c, d);
        printArr(toPrimitive(findMultMultArr));

        System.out.println("=======================");
        Integer[] mainAdd = merge(arrAdd, merge(findAddAddArr, findAddMultArr));
        printArr(toPrimitive(mainAdd));
        Integer[] mainMult = merge(arrMult, merge(findMultAddArr, findMultMultArr));
        printArr(toPrimitive(mainMult));
        System.out.println("***********************");
        int[] newMainAdd = (removeDuplicates(toPrimitive(mainAdd)));
        newMainAdd = Arrays.stream(newMainAdd).sorted().toArray();
        printArr(newMainAdd);

        int[] newMainMult = removeDuplicates(toPrimitive(mainMult));
        newMainMult = Arrays.stream(newMainMult).sorted().toArray();
        printArr(newMainMult);

        // System.out.println("-----------------------");
        // findAddMult(toPrimitive(arrAdd), b, c, d);
        // System.out.println("++++++++++++++++++++");
        // findMultAdd(toPrimitive(arrAdd), b, c, d);
        
    
    }

}

