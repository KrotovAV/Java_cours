package fourth_lesson.fourth_HW;

//есть дискретноу рабочеу поле (ДРП), со стартовой ячекой, прохдимыми или нероходимыми, и финишная.
// 3 этапа реализации алгоритма : инициализация, распространение волны и восстановление пути.
// соседние  ячейки м.б. 4 или 8
// если соседння ячейка проходима и не была отмечена ранее,то шаг в неу и плюс шагов записать в ячейку.
// так отмечается все проходимое поле.
// при прохлде назад от финишной ячеки на -1 в сторону стартовой

//=============================================
final class ArrPoints {
    public String[][] arr;
    public int start;
    public int end;
    public int nNow;
    public int mNow;
 
    public ArrPoints(String[][] arr, int start, int end, int nNow, int mNow)
    {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this. nNow =  nNow;
        this. mNow =  mNow;
    }
}
public class progWeyLi {
    public static ArrPoints getDetails(ArrPoints varTypes){
        String[][] newArrR  = varTypes.arr;
        int start =  varTypes.start;
        int end = varTypes.end;
        int nNow = varTypes.nNow;
        int mNow = varTypes.mNow;
        return new ArrPoints(newArrR, start, end, nNow, mNow);
    }
    public static ArrPoints getDetailsTypes(String[][] arrF, int startF, int endF, int nNowF, int mNowF) {
        // возвращаем данные о человеке из метода
        String[][] arr = arrF;
        int start = startF;
        int end = endF;
        int nNow = nNowF;
        int mNow = mNowF;
        return new ArrPoints(arr, start, end, nNow, mNow);
    }

    public static int randInt(int startF, int endF) {
        int v = (int) (Math.random() * ((endF - startF) + 1)) + startF;
        return v;
    }

    public static int[] createArr(int nF) {
        int[] newArrF = new int[nF];
        return newArrF;
    }
    public static String[][] createArrArr(int nF, int mF) {
        String[] newArrF[] = new String[nF][mF];
        return newArrF;
    }
    public static String[][] fillNullArrArr(String[][] arrF, int nF, int mF) {
        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < mF; j++) {
                arrF[i][j] = "0";
            }
        }
        return arrF;
    }
    public static String[][] fillXxxArrArr(String[][] arrF, int nF, int mF) {
        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < mF; j++) {
                int x = randInt(0, 1);
                if (x != 0) arrF[i][j] = "-1";
            }
        }
        return arrF;
    }

    public static void printArr(int[] arrF) { 
        for (int item : arrF) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }

    public static void printArrArr(String[][] arrF) {
        int maxLen = arrF[0][0].length(), size;
        for (int p = 0; p < arrF.length; p++) {
            for (int r = 0; r < arrF[p].length; r++) {
                if (arrF[p][r].length() > maxLen){
                    maxLen = arrF[p][r].length();
                }
            }
        }
        // System.out.println(maxLen);
        for (int i = 0; i < arrF.length; i++) {
            for (int j = 0; j < arrF[i].length; j++) {
                System.out.print("");
                if (arrF[i][j] == "-1"){
                    size = maxLen - arrF[i][j].length();
                    System.out.print("x" + " ".repeat(size+2));
                } else {
                    size = maxLen - arrF[i][j].length();
                    System.out.print(arrF[i][j] + " ".repeat(size+1));
                }
                System.out.print("");
            }
            System.out.println("");
        }
    }

    public static ArrPoints waveCell(ArrPoints varTypes){
        String[][] field  = varTypes.arr;
        int s =  varTypes.start, e = varTypes.end, n = varTypes.nNow, m = varTypes.mNow;
        int count = 1;
            while (count < field.length - 1 + field[0].length - 1){
            for (n = 0; n < field.length; n++) {
                for (m = 0; m < field[n].length; m++) {
                    // 4 ---/-
                    if (Integer.parseInt(field[n][m]) == count && n + 1 <= field.length - 1){
                        if (Integer.parseInt(field[n + 1][m]) == 0){
                            field[n + 1][m] = Integer.toString(Integer.parseInt(field[n][m]) + 1);
                        }
                    }
                    // // 3 ---
                    if (Integer.parseInt(field[n][m]) == count && n + 1 <= field.length - 1 && m + 1 <= field[0].length - 1){
                        if (Integer.parseInt(field[n + 1][m + 1]) == 0){
                            field[n + 1][m + 1] = Integer.toString(Integer.parseInt(field[n][m]) + 1);
                        }
                    }
                    // // 5 ---
                    if (Integer.parseInt(field[n][m]) == count && n + 1 <= field.length - 1 && m - 1 >= 0 ) {
                        if (Integer.parseInt(field[n + 1][m - 1]) == 0){
                            field[n + 1][m - 1] = Integer.toString(Integer.parseInt(field[n][m]) + 1);
                        }
                    }
                    // // 6---
                    if (Integer.parseInt(field[n][m]) == count && m - 1 >= 0){
                        if (Integer.parseInt(field[n][m - 1]) == 0) {
                            field[n][m - 1] = Integer.toString(Integer.parseInt(field[n][m]) + 1);
                        }
                    }
                    // // 2--
                    if (Integer.parseInt(field[n][m]) == count && m + 1 <= field[0].length -1){
                        if (Integer.parseInt(field[n][m + 1]) == 0){
                            field[n][m+1] = Integer.toString(Integer.parseInt(field[n][m]) + 1);
                        }
                    }
                    // // 7 -\
                    if (Integer.parseInt(field[n][m]) == count && n - 1 >= 0 && m - 1 >= 0){
                        if (Integer.parseInt(field[n - 1][m - 1]) == 0){
                            field[n-1][m-1] = Integer.toString(Integer.parseInt(field[n][m]) + 1);
                        }
                    }
                    // 1-/
                    if (Integer.parseInt(field[n][m]) == count && n - 1 >= 0 && m + 1 <= field[0].length - 1){
                        if (Integer.parseInt(field[n - 1][m + 1]) == 0){
                            field[n-1][m+1] = Integer.toString(Integer.parseInt(field[n][m]) + 1);
                        }
                    }
                    // // 8 ----
                    if (Integer.parseInt(field[n][m]) == count && n - 1 >= 0){
                        if (Integer.parseInt(field[n - 1][m]) == 0){
                            field[n-1][m] = Integer.toString(Integer.parseInt(field[n][m]) + 1);
                        }
                    }
                }
            }
            count = count + 1;
        }
        return new ArrPoints(field, s, e, n, m);
    } 
//-----------

public static ArrPoints beckWay(ArrPoints varTypes){
    String[][] field  = varTypes.arr;
    int s =  varTypes.start, e = varTypes.end, n = varTypes.nNow, m = varTypes.mNow;
    int count = 1;
    field[n][m] = Integer.toString( - Integer.parseInt(field[n][m]));
    while (count < field.length - 1 + field[0].length - 1){
        for (n = field.length - 1; n >= 0; n = n - 1) {
            for (m = field[0].length -1; m >= 0; m = m - 1) {
                // 4 ---
                if (n + 1 <= field.length - 1){
                    if ( - Integer.parseInt(field[n + 1][m]) - 1 == Integer.parseInt(field[n][m])) {
                        field[n + 1][m] = Integer.toString( - (Math.abs(Integer.parseInt(field[n][m])) - 1));
                    }
                }
                // // 3 ---
                if (n + 1 <= field.length - 1 && m + 1 <= field[0].length - 1){
                    if ( - Integer.parseInt(field[n + 1][m + 1]) - 1 == Integer.parseInt(field[n][m])){
                        field[n + 1][m + 1] = Integer.toString( - (Math.abs(Integer.parseInt(field[n][m])) - 1));
                    }
                }
                // // 5 ---
                if (n + 1 <= field.length - 1 && m - 1 >= 0 ) {
                    if ( - Integer.parseInt(field[n + 1][m - 1]) - 1 == Integer.parseInt(field[n][m])){
                        field[n + 1][m - 1] = Integer.toString( - (Math.abs(Integer.parseInt(field[n][m])) - 1));
                    }
                }
                // // 6---
                if (m - 1 >= 0){
                    if ( - Integer.parseInt(field[n][m - 1]) - 1 == Integer.parseInt(field[n][m])) {
                        field[n][m - 1] = Integer.toString( - (Math.abs(Integer.parseInt(field[n][m])) - 1));
                    }
                }
                // // 2--
                if (m + 1 <= field[0].length -1){
                    if ( - Integer.parseInt(field[n][m + 1]) -1 == Integer.parseInt(field[n][m])) {
                        field[n][m + 1] = Integer.toString( - (Math.abs(Integer.parseInt(field[n][m])) - 1));
                    }
                }
                // // 7 -\
                if (n - 1 >= 0 && m - 1 >= 0){
                    if ( - Integer.parseInt(field[n - 1][m - 1]) - 1 == Integer.parseInt(field[n][m])) {
                        field[n - 1][m - 1] = Integer.toString( - (Math.abs(Integer.parseInt(field[n][m])) - 1));
                    }
                }
                // 1-/
                if (n - 1 >= 0 && m + 1 <= field[0].length - 1){
                    if ( - Integer.parseInt(field[n - 1][m + 1]) - 1 == Integer.parseInt(field[n][m])) {
                        field[n - 1][m + 1] = Integer.toString( - (Math.abs(Integer.parseInt(field[n][m])) - 1));
                    }
                }
                
                // // 8 ----
                if (n - 1 >= 0){
                    if ( - Integer.parseInt(field[n - 1][m]) - 1 == Integer.parseInt(field[n][m])){
                        field[n - 1][m] = Integer.toString( - (Math.abs(Integer.parseInt(field[n][m])) - 1));
                    }
                }
            }
        }
        count = count + 1;
    }
    return new ArrPoints(field, s, e, n, m);
} 

//-----------------
    public static void main(String[] args){
        int stn = 5, enn = 20, stm = 5, enm = 20;
        int n = randInt(stn, enn);
        int m = randInt(stm, enm);
        System.out.println();
        System.out.printf("Field size [%d][%d] \n", n, m);
        String[][] field = createArrArr(n, m);
        field = fillNullArrArr(field, n, m);
        field = fillXxxArrArr(field, n, m);

        int s = randInt(0, field[0].length - 1);
        System.out.printf("Start point[0][%d]\n", s);
        field[0][s] = "1";
        int e = randInt(0, field[0].length - 1);
        System.out.printf("Finish point [%d][%d]\n", (field.length - 1), e);
        field[field.length - 1][e] = "0";
        System.out.println("--------------------");
        System.out.println("1 step - Create field ");
        System.out.println("--------------------");
        printArrArr(field);
        System.out.println("--------------------");
        System.out.println("2 step - Way from start to finish");
        System.out.println("--------------------");
        //-----------------------------------------
        ArrPoints varTypes = getDetailsTypes(field, s, e, 0, s);
        ArrPoints newVarTypes = waveCell(varTypes);

        String[][] newField = newVarTypes.arr;
        // System.out.println();
        printArrArr(newField);

        ArrPoints varTypes2 = getDetailsTypes(newField, s, e, newField.length-1, e);
        System.out.println("--------------------");
        if (Integer.parseInt(newField[field.length - 1][e]) !=0){
            System.out.printf("Way from start point to end point exist (%d step)!!!\n", Integer.parseInt(newField[field.length - 1][e]));
            ArrPoints newVarTypes2 = beckWay(varTypes2);
            System.out.println("--------------------");
            System.out.println("3 step - Way from finish to start (- )");
            System.out.println("--------------------");
            String[][] beckWayField = newVarTypes2.arr;
            // System.out.println();
            printArrArr(beckWayField);
           
            System.out.println("--------------------");
        } else {
            System.out.printf("NO WAY from start point to end point!!!\n");
            System.out.println("--------------------");
        }



    }
}