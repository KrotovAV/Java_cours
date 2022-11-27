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
    public static void main(String[] args) {
        // int a = 2, b = 7, c = 2, d = 1; //-> 3
        int a = 3, b = 27, c = 3, d = 2; //-> 6
        // int a = 55, b = 555, c = 35, d = 2; //-> 30
        int aa = a;
        int cc = (b - a)/c;
        int dd = (b - a)/d;
        String flag;
        String wey = "";
        // System.out.printf("a start = %d,\n", a);
        // System.out.printf("cc = %d,\n", cc);
        // System.out.printf("dd = %d,\n", dd);


        // System.out.println(a + cc*c);
        // System.out.println(a + d*dd);
        int co = 0;
        flag = "c_flag";
        for (int i = 0; i < cc; i++) {
            wey = "";
            a = aa;
            if (flag == "c_flag"){
            // if (a + a*c < b || a + a*c == b) a = a + a*c;
                if (flag == "c_flag" && a + a*c < b) a = a*c*i;
                if (flag == "c_flag") flag = "d_flag";
                if (flag == "d_flag" && a + d < b) a = a + d * i;
                if (flag == "d_flag") flag = "c_flag";
                wey = wey + "*c";
                System.out.println(wey);
                // System.out.printf("c = %d, a = %d,\n", c, a);
                for (int j = 0; j < dd; j++) {
                    // if (a + d < b || a + d == b) a = a + d;
                    if (flag == "c_flag" && a + a*c < b) a = a*c*j;
                    if (flag == "c_flag") flag = "d_flag";
                    if (flag == "d_flag" && a + d < b) a = a + d * j;
                    if (flag == "d_flag") flag = "c_flag";
                    wey = wey + "+d";
                    System.out.println(wey);
                    if (a == b) System.out.printf(" count = %d, %d, %d, wey = %d\n", co, a, b, wey );
                        // System.out.printf("ok a = %d,\n", a);
                        co = co + 1;
                }
            }
            // if (flag == "d_flag"){
            // // if (a + a*c < b || a + a*c == b) a = a + a*c;
            //     if (a + a*c < b) a = a*c*i;
            //         if (flag == "d_flag") flag = "c_flag";
            //         if (flag == "c_flag") flag = "d_flag";
            //         wey = wey + "*c";
            //     // System.out.printf("c = %d, a = %d,\n", c, a);
            //     for (int j = 0; j < dd; j++) {
            //         // if (a + d < b || a + d == b) a = a + d;
            //         if (a + d < b) a = a + d * j;
            //             if (flag == "d_flag") flag = "c_flag";
            //             if (flag == "c_flag") flag = "d_flag";
            //             wey = wey + "*d";
            //         // System.out.printf("d = %d a = %d,\n", d, a);
            //         if (a == b) System.out.printf(" count = %d, %d, %d, wey = %d\n", co, a, b, wey );
            //             // System.out.printf("ok a = %d,\n", a);
            //             co = co + 1;
                // }
            // }
            if (flag == "d_flag") flag = "c_flag";
            if (flag == "c_flag") flag = "d_flag";
        }
        if (co != 0) System.out.printf(" count = %d,\n", co);
        else System.out.printf(" не имеет решения ");
    }

}
