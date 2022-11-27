public class programm {
    public static void main(String[] args) {
        // int a = 2, b = 7, c = 2, d = 1; //-> 3
        int a = 3, b = 27, c = 3, d = 2; //-> 6
        // int a = 55, b = 555, c = 35, d = 2; //-> 30
        int aa = a;
        int cc = (b - a)/c;
        int dd = (b - a)/d;
        String flag;
        String wey = "";
        int co = 0;
        flag = "c_flag";
        for (int i = 0; i < cc; i++) {
            wey = "";
            // a = aa;
            if (flag == "c_flag"){
                if (flag == "c_flag" && a*c*i < b) {
                    a = a*c*i;
                    wey = wey + "*c";
                    // flag = "d_flag";
                }
                if (flag == "d_flag" && a + d*i < b){
                    a = a + d * i;
                    // flag = "c_flag";
                    wey = wey + "+d";
                }
                    System.out.println(wey);
                    // System.out.printf("c = %d, a = %d,\n", c, a);
                    for (int j = 0; j < dd; j++) {
                        // if (a + d < b || a + d == b) a = a + d;
                        if (flag == "c_flag" && a*c*j < b) {
                            a = a*c*j;
                            wey = wey + " *c ";
                            flag = "d_flag";
                        }
                        if (flag == "d_flag" && a + d*j < b){
                            a = a + d * j;
                            flag = "c_flag";
                            wey = wey + " + d";
                        }
                        System.out.println(wey);
                        // System.out.printf("c = wey, a = %d,\n", wey, a);
                        // if (a == b) System.out.printf(" count = %d, %d, %d, wey = %d\n", co, a, b, wey );
                        System.out.printf("ok a = %d,\n", a);
                        co = co + 1;
                    if (flag =="c_flag") flag ="d_flag";
                    if (flag =="d_flag") flag ="c_flag";
                    }
                if (flag =="c_flag") flag ="d_flag";
                if (flag =="d_flag") flag ="c_flag";
            }


            // if (flag == "d_flag"){
            // // if (a + a*c < b || a + a*c == b) a = a + a*c;
            //     if (flag == "d_flag" &&  a + d*i < b) {
            //         a = a + d * i;
            //         wey = wey + "+d";
            //         flag = "c_flag";
            //     }

            //     if (flag == "c_flag" && a*c*i < b) {
            //         a = a*c*i;
            //         flag = "d_flag";
            //         wey = wey + "*c";
            //     }
            //     // System.out.printf("c = %d, a = %d,\n", c, a);
            //     for (int j = 0; j < dd; j++) {
            //         // if (a + d < b || a + d == b) a = a + d;
            //         if (flag == "d_flag" && a + a + d*j < b) {
            //             a = a + d * j;
            //             wey = wey + "+d";
            //             flag = "c_flag";
            //         }
    
            //         if (flag == "c_flag" && a*c*j < b) {
            //             a = a*c*j;
            //             flag = "d_flag";
            //             wey = wey + "*c";
            //         }
            //         System.out.println(wey);
            //         // if (a == b) System.out.printf(" count = %d, %d, %d, wey = %d\n", co, a, b, wey );
            //         System.out.printf("ok a = %d,\n", a);
            //         co = co + 1;
            //     }
            // }
            if (flag == "d_flag") flag = "c_flag";
            if (flag == "c_flag") flag = "d_flag";
        }
        if (co != 0) System.out.printf(" count = %d,\n", co);
        else System.out.printf(" не имеет решения ");
    }

}
