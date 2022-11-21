// class Program {
//     public static void main(String[] args) {
//         System.out.println(Integer.MAX_VALUE); // 2147483647
//         System.out.println(Integer.MIN_VALUE); // -2147483648
//     }
// }


//Операции Java

//Присваивание: =
//Арифметические: *, /, +, -, %, ++, --
//Операции сравнения: <, >, ==, !=, >=, <=
//Логические операции:  ||, &&, ^, !
//Побитовые операции <<, >>, &, |, ^

public class program2 {
    public static void main(String[] args) {
        int a = 123;
        a++;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);
        boolean f = 123 > 234;
        System.out.println(f);
        boolean g = 123 != 234;
        System.out.println(g);

        int b = 8;// побитовый сдвиг
        // 1000
        // b = b << 1;
        System.out.println(b<<1);
        //10000 -это 16

        int c = 5;
        int d = 2;
        System.out.println(c | d); // побитоваоя операция или
        // 5 это 101
        // 2 это 010
        //           выполняем или
        //       111
        int n = 5;
        int k = 2;
        System.out.println(n & k); // побитоваоя операция и
        // 5 это 101
        // 2 это 010
        //           выполняем и
        //       000

        boolean r = true;
        boolean t = true;
        System.out.println(r & t);
        // 1
        // 0
        //           выполняем и
        // 0

        String e = "qwer1ty";
        // boolean j = e.length() >= 5 && e.charAt(4) == '1' ;
        boolean j = e.length() >= 5 & e.charAt(4) == '1' ;
        System.out.println(j);

  }
}