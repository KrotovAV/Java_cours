// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break. 
// * ближайшего к оператору



// public class program11 { //Циклы
// // В java доступны следующие циклы:
// // цикл while;
// // цикл do while;
// // цикл for; и его модификация for in

//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//             System.out.println(count);
//         }
//          // System.out.println(count);
//     }
// }

// public class program11 { 
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do {
//             value /= 10;
//             count++;
//             System.out.println(count);
//         } while (value != 0);
//         // System.out.println(count);
//     }
// }


// public class program11 {
//     public static void main(String[] args) {

//         for (int i = 0; i < 10; i++) {
//             if (i % 2 == 0){
//                 continue;
//                 // breack;
//             }
//             System.out.println(i);
//         }
//     }
// }

// public class program11 {
//     public static void main(String[] args) {

//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }


// public class program11 { // вложенные цыклы
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class program11 { //Работает только для коллекций
//     public static void main(String[] args) {

//         int arr[] = new int[] {1, 2, 3,4, 5, 6, 7};
//         for (int item : arr) {
//             System.out.println(item);
//             // System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }

