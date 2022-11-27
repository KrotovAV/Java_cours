public class programa {

    public static double weyFunc(double a1_f, double a2_f, int b_f, int c_f, int d_f, String wey1_f, String wey2_f) {
        if (a_f*c_f > b_f || a_f + d_f > b_f) {
            System.out.printf(" xxxxxxx ");
            // return
        }
        if(a_f < b_f) {
            a1_f = a_f * c_f;
            if (a1_f == b_f) {
                System.out.printf("%d, * %d, \n", a1_f, c_f);
                wey1_f = wey_f + " *c ";
            }
            a2_f = a_f + d_f;
            if (a1_f == b_f) {
                System.out.printf("%d, + %d, \n", a1_f, d_f);
                wey2_f = wey_f + " +d ";
            }
        }
        else{
            System.out.println("нет решений");
        }
        return weyFunc(a1_f + a1_f, b_f, c_f, d_f, wey1_f), weyFunc(a2_f +a2_f, b_f, c_f, d_f, wey2_f);

        public static double factor(int n) {
            if(n==1)return 1;
            return n * factor(n-1);

    }
    public static void main(String[] args) {
        int a = 3, b = 27, c = 3, d = 2; //-> 6
        // int a = 55, b = 555, c = 35, d = 2; //-> 30
        int aa = a;
        int cc = (b - a)/c;
        int dd = (b - a)/d;
        String flag;
        String wey = " ";
        // int co = 0;
        flag = "c_flag";




        // for (int i = 0; a < b; a = a + c||a = a*d) {
        //     // wey = "";
        //     // a = aa;
        //     if (flag == "c_flag"){
        //         if (flag == "c_flag" && a*c*i < b) {
        //             a = a*c*i;
        //             wey = wey + "*c";
        //             flag = "d_flag";
        //             System.out.println(a);
        //         }
        //         if (flag == "d_flag" && a + d*i < b){
        //             a = a + d * i;
        //             flag = "c_flag";
        //             wey = wey + "+d";
        //             System.out.println(a);
        //         }
        //     }
        // System.out.println(wey);
        // }
    }
}


