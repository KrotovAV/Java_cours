public class progtest {
    public static double towWeyFuncMult(double a_f, double b_f, int c_f) {
        a_f = a_f * c_f;
        System.out.println(a_f);
        if (b_f < a_f* c_f) return 0;
        return towWeyFuncMult(a_f, b_f, c_f);
    }
    public static double towWeyFuncPlus(double a_f, double b_f, int d_f) {
        a_f = a_f + d_f;
        System.out.println(a_f);
        if (b_f < a_f + d_f) return 0;
        return towWeyFuncPlus(a_f, b_f, d_f);
    }

    public static double towWeyFuncMultFor(double a_f, double b_f, int c_f) {
        a_f = a_f * c_f;
        // System.out.println(a_f);
        if (b_f < a_f* c_f) return 0;
        return a_f;
    }
    public static double towWeyFuncPlusFor(double a_f, double b_f, int d_f) {
        a_f = a_f + d_f;
        // System.out.println(a_f);
        if (b_f < a_f + d_f) return 0;
        return a_f;
    }
    // public static double checkRec(double a_f, double b_f, int c_f, int d_f, String flag_f){
    //     int[] arr = towWeyFuncMult(double a_f, double b_f, int c_f);
    //     // if (a_f < b_f) {
    //     //     if (flag_f == "+"){
    //     //         a_f = towWeyFuncMultFor(a_f,b_f,c_f);
    //     //     }
    //     //     a_f = towWeyFuncPlusFor(a_f, b_f, d_f);
    //     }
    
        



    public static void main(String[] args) {
        double a = 2, b = 27;
        int c = 3, d = 2;
        int[] arr1;
        int[] arr2;
        // int[] arr = new int[] { 1, 2, 3, 4, 5 };
        // arr1 = towWeyFuncMult(a, b, c);
        // arr2 = towWeyFuncPlus(a, b, d);
        System.out.println(towWeyFuncMult(a, b, c));
        System.out.println(towWeyFuncPlus(a, b, d));
    }
}





        // System.out.println(a);
        // System.out.println(towWeyFuncMult(a, b, c));
        // System.out.println("--------");
        // System.out.println(a);
        // System.out.println(towWeyFuncPlus(a, b, d));

        // System.out.println("=========");
        // System.out.println(a);
        // System.out.println(towWeyFuncMultFor(a, b, c));
        // System.out.println("--------");
        // System.out.println(a);
        // System.out.println(towWeyFuncPlusFor(a, b, d));
    
//     }
// }


// public class progtest {
//     public static double towWeyFuncMult(double a_f, double b_f, int c_f) {
//         b_f = b_f/c_f;
//         System.out.println(b_f);
//         if (b_f < a_f) return 0;
//         return towWeyFuncMult(a_f, b_f, c_f);
//     }
//     public static double towWeyFuncPlus(double a_f, double b_f, int d_f) {
//         b_f = b_f - d_f;
//         System.out.println(b_f);
//         if (b_f < a_f) return 0;
//         return towWeyFuncPlus(a_f, b_f, d_f);
//     }

//     public static void main(String[] args) {
//         double a = 2, b = 27;
//         int c = 3, d = 2;
//         System.out.println(b);
//         System.out.println(towWeyFuncMult(a, b, c));
//         System.out.println("--------");
//         System.out.println(b);
//         System.out.println(towWeyFuncPlus(a, b, d));
    
//     }
// }



// public class progtest {
//     public static double[] towWeyFunc(double a_f, int c_f, int d_f) {
//         double[] pare = new double[2];
//         pare[0] = a_f * c_f;
//         pare[1] = a_f + d_f;
//         return pare;
//     }
// }

//     public static void main(String[] args) {
//         double a = 2;
//         double a1 = a, a2 = a, a3 = a, a4 = a;
//         int b = 27, c = 3, d = 2;
//         double[] new_pare;
//         // double[] new_pare = towWeyFunc(a, c, d);
//         // System.out.println(new_pare[0]);
//         // System.out.println(new_pare[1]);
        
//         // public static double factor(int n) {
//         //     if(n==1)return 1;
//         //     return n * factor(n-1);
        
//         while (a1 * c < b) {
//             new_pare = towWeyFunc(a1, c, d);
//             a1 = new_pare[0];
//             System.out.println(a1);
//             System.out.println("--------");
//             a2 = new_pare[1];
//             System.out.println(a2);
//         }

//         while (a3 + d < b) {
//             new_pare = towWeyFunc(a3, c, d);
//             a3 = new_pare[0];
//             System.out.println(a3);
//             System.out.println("========");
//             a4 = new_pare[1];
//             System.out.println(a4);
//         }
    
//     }
// }
