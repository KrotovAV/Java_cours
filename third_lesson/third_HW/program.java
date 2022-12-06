package third_lesson.third_HW;
// На вход некоторому исполнителю
// подаётся два числа (a, b).

// У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раз (xC), а умножается на c
// - команда 2 (к2): увеличить на d ( +d ), к a прибавляется d
// написать программу, которая выдаёт общее количество
// возможных преобразований a в b.
// a < b; a, b, c, d - натуральные

// Пример 1: а = 2, b = 7, c = 2, d = 1 ответ 3
// Подумать как можно показать хотя бы один маршрут преобразования
// ответ: (+1) (x2) (+1) или (х2) (+1) (+1) (+1)
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения.
public class program {

    public static int funNamAdd(int aF, int bF, int dF) {
        int co = ((bF - aF) / dF) + 1;
        return co;
    }

    public static int funNamMult(int aF, int bF, int cF) {
        int co = 0;
        for (int i = aF; i < bF; i++) {
            i = funcMult(i, cF);
            co = co + 1;
        }
        return co;
    }

    public static int[] createArr(int nF) {
        int[] newArrF = new int[nF];
        return newArrF;
    }

    public static int funcAdd(int aF, int dF) {
        aF = aF + dF;
        return aF;
    }

    public static int funcMult(int aF, int cF) {
        aF = aF * cF;
        return aF;
    }

    public static int[] fillAddArr(int[] arrF, int addF, int aF, int bF, int dF) {
        for (int i = 0; i < addF; i++) {
            arrF[i] = aF;
            aF = funcAdd(aF, dF);
        }
        return arrF;
    }

    public static int[] fillMultArr(int[] arrF, int multF, int aF, int bF, int cF) {
        for (int i = 0; i < multF; i++) {
            arrF[i] = aF;
            aF = funcMult(aF, cF);
        }
        return arrF;
    }

    public static void printArr(int[] arrF) { 
        for (int item : arrF) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }

    public static int func(int xF, int aF, int bF, int cF, int dF) {
        String resStri = "";
        int fF;
        if (xF == aF) {
            fF = 1;
            // System.out.print("|");
            return fF;
        }
        if (xF < aF) {
            fF = 0;
            // System.out.print("||");
            return fF;
        }
        if (xF % cF == 0) {
            fF = func(xF - dF, aF, bF, cF, dF) + func(xF / cF, aF, bF, cF, dF);
            // resStri = resStri + Integer.toString(cF) + " * " ;
        } else {
            fF = func(xF - dF, aF, bF, cF, dF);
            // resStri = resStri + Integer.toString(dF) + " + " ;
        }
        // if (xF == bF) System.out.printf(resStri);
        return fF;
    }

    public static int[] funcAddFuncArr(int[] addArrF, int aF, int bF, int cF, int dF){
        int[] addFuncArrF = createArr(addArrF.length);
        for (int i = 0; i < addArrF.length; i++) {
            addFuncArrF[i] = func(addArrF[i] , aF, bF, cF, dF);
        }
        return addFuncArrF;
    }

    public static void result(int[] addArrF, int[] multArrF, int[] addMirrorArrF, int aF, int bF){
        if (addArrF[addArrF.length-1] != bF && multArrF[multArrF.length-1] != bF){
            System.out.printf("Не существует путей приобразования %d в %d.\n", aF, bF);
        } else {
            int res = addMirrorArrF[addMirrorArrF.length-1];
            System.out.printf("Существует %d путей приобразования %d в %d.\n",res, aF, bF);
        }
    }
    public static void main(String[] args) {
        // int a = 2, b = 18, c = 3, d = 2; //-> 5
        // int a = 30, b = 345, c = 5, d = 6; // -> 0
        int a = 3, b = 27, c = 3, d = 2; //-> 6
        // int a = 22, b = 2022, c = 11, d = 10; //-> 18
        // int a = 22, b = 222, c = 11, d = 10; //-> 1
        // int a = 22, b = 333, c = 3, d = 1; //-> 467
        // int a = 11, b = 7, c = 2, d = 1; // -> нет решения.

        System.out.println();
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
        
        if (a > b){
            System.out.printf("%d > %d - невозможно приобразовать (+ %d) и (* %d).\n", a, b, d, c);
            System.out.println();
            return;
        } 
        
        int nAdd = funNamAdd(a, b, d);
        int nMult = funNamMult(a, b, c);
        int[] addArr = createArr(nAdd);
        int[] multArr = createArr(nMult);
        addArr = fillAddArr(addArr, nAdd, a, b, d);
        multArr = fillMultArr(multArr, nMult, a, b, c);
        int[] addMirrorArr = createArr(addArr.length);
        addMirrorArr = funcAddFuncArr(addArr, a,b, c, d);

        // System.out.println();
        // printArr(addArr);
        // printArr(addMirrorArr);
        System.out.println();
        result(addArr, multArr, addMirrorArr, a, b);
        System.out.println();
    }
}


