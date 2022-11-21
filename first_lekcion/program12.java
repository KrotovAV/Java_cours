import java.io.FileWriter;
import java.io.IOException;
// Работа с файламию
// public class program12 { // Создание файла и дозапись в него
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             //append: false - сли файл есть.-будет удален и перезаписан новый:
//             //append: true - дозапись в существующй файл 
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } 
// }

//---------------------------------------------------------

// Чтение,

// import java.io.*;
// public class program12 {//Вариант посимвольно
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//     }
// }

//----------------------------------------------------

import java.io.*;

public class program12 {//Вариант построчно
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}

