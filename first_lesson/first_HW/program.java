// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

package first_HW;
import java.io.*;

public class program {

    public static double myCalcPower(int a, int b) {
        if (a == 0 && b == 0){
            System.out.printf("не определено \n");
            System.exit(0);
        }

        if (b == 0) {
            return 1;
        }
        int val;
        if (b % 2 == 0) {
            val = b / 2;
            }
        else{
            val = (b - 1) / 2;
        }
        
        if (val < 0) val = val * -1;

        double time = 1;
        for (int i = 1; i <= val; i++) {
            time =  time * a;
        }
        
        if (b < 0) {
            if (b % 2 == 0) {
                return 1/(time * time);
            } else {
                return 1/(a * time * time);
            }
        }
        else{
            if (b % 2 == 0) {
                return time * time;
            } else {
                return a * time * time;
            }
        }
    }

    public static int[] readFile(String pathReadF) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(pathReadF));
        String str;
        int i = 0;
        int[] readArr = new int[2];
        while ((str = br.readLine()) != null) {
            readArr[i] = Integer.parseInt (str);
            i = i + 1;
        }
        br.close();
        return readArr;
    }

    public static void readWrite(double xF, String pathWriteF) {
        try (FileWriter fw = new FileWriter(pathWriteF, false)) {
            String resF = Double.toString (xF);
            fw.write(resF);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        String pathRead = "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/Java_cours/first_lesson/first_HW/input1_1.txt";
        int[] newArr = readFile(pathRead);
        int a = newArr[0];
        int b = newArr[1];

        double x = myCalcPower(a, b);
        String res = Double.toString (x);

        String pathWrite = "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/Java_cours/first_lesson/first_HW/output1_1.txt";
        readWrite(x, pathWrite);
    }
}