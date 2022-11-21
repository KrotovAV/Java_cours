public class program3 {// массив одномерный
    public static void main(String[] args) {

        // int[] arr1 = new int[10];
        // System.out.println(arr1.length); // 10
        // System.out.println(arr1[3]); // 
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5
        System.out.println(arr[0]); 
        System.out.println(arr[1]);
        System.out.println(arr);
        // System.out.println(arr[3]); // 4
        arr[2] = 9;
        System.out.println(arr[2]);
 

        int[] arr2[] = new int[3][5];
        // int[][] arr2 = new int[3][5];
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }



}
