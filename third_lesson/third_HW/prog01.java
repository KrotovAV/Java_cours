package third_lesson.third_HW;

public class prog01 {
    public static int dev1(int namF, int cF) {
        int nam1F = namF * cF;
        return nam1F;
    }
    public static int dev2(int namF, int dF) {
        int nam2F = namF + dF;
        return nam2F;
    }
    public static int[] funcAddMult(int[] aF, int bF, int cF, int dF) {
        int[] namsF = new int[2];
        namsF[0] = dev1(aF, cF);
        if (aF == bF) System.out.printf("* %d\n", cF);
        namsF[1] = dev2(aF, dF);
        if (aF == bF) System.out.printf("+ %d\n", dF);
        System.out.printf("nams[0] = %d, nams[1] = %d\n",namsF[0], namsF[1]);
        return namsF;
    }
    public static void func(int[] namsF, int aF, int bF, int cF, int dF) {
        
        // int[] namsFF = new int[2];
        if (aF > namsF[0] || aF > namsF[1]) {
            return;
        } else {
            // int[] namsFF = new int[2];
            // namsFF[0] = funcAddMult(namsF[0], bF, cF, dF);
            // namsFF[1] = funcAddMult(namsF[1], bF, cF, dF);
            funcAddMult(namsF[0], bF, cF, dF);
            funcAddMult(namsF[1], bF, cF, dF);

        }return;
    // return namsFF;
    }
    public static void main(String[] args) {
        // int a = 2, b = 7, c = 2, d = 1; //-> 3
        int a = 3, b = 27, c = 3, d = 2; //-> 6
        System.out.println();
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
        // int mult = b/c;
        // System.out.println(mult);
        // int add = b/d; 
        // System.out.println(add);
        // System.out.println(funMult(a, b, c, d));
        // funcPrint(funcAddMult( a, b, c, d), a, b, c, d);
        int[] nams = new int[2];
        nams[0] = a;
        nams[1] = a;
        func(nams, a, b, c, d);
        System.out.println();
    }
}

// public static int funMult(int aF, int bF, int cF, int dF) {
//     int cou = 0;
//     while (dev1(aF, cF) <= bF){
//         System.out.printf("aOld = %d ", aF);
//         aF = dev1(aF, cF);
//         System.out.printf("* %d, aNew = %d, b = %d\n",cF, aF, bF);
//         cou = cou + 1;
//         if (aF == bF) {
//             System.out.printf("count = %d\n", cou);
//         }
//     }
//     return aF;
// }
