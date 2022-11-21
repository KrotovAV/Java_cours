public class program {
    /*
    * комментарии чтоб не запутаться
    */
        public static void main(String[] args){
            String s= " - 2 - ";
    
            System.out.println(s);
            System.out.println("hello wold");// комментарий
        }
    
    }
    
    class Program {
        public static void main(String[] args){
            short age = 10;
            int salary = 123456;
            System.out.println(age);        //10
            System.out.println(salary);     //123456
        }
    }
    
    class Program2 {
        public static void main(String[] args){
            float fl = 25.36f;// плавающая точка
            float e = 2.7f;
            double pi = 3.1415;
            System.out.println(e);        // 2.7
            System.out.println(pi);       // 3.1415
            System.out.println(fl);
        }
    }
    
    class Program3 {
        public static void main(String[] args) {
            char ch = '1';// char это символ
            System.out.println(Character.isDigit(ch));  // true
            ch = 'a';
            System.out.println(Character.isDigit(ch));  // false
        }
    }
    
    
    public class Program4 {
        public static void main(String[] args) {
            boolean flag1 = 123 <= 234; // логический тип данны
            System.out.println(flag1);  // true
            boolean flag2 = 123 >= 234 || flag1;
            System.out.println(flag2);  // true
            boolean flag3 = flag1 ^ flag2;
            System.out.println(flag3);  // false
            boolean f = true && false; //тоже самое  boolean f = true || false;
            System.out.println(f); 
        }
    }
    
    public class Program5 {
        public static void main(String[] args) {
            String msg ="Hello world";
            System.out.println(msg); // Hello world
        }
    }
    
    public class Program6 { // Неявная типизация
        public static void main(String[] args) {
            var a = 123;
            System.out.println(a);  // 123
            var d = 123.456;
            System.out.println(d);  // 123.456
        }
    }
    
    public class Program7 {
        public static void main(String[] args) {
            var a = 123;
            System.out.println(a);  // 123
            var d = 123.456;
            System.out.println(d);  // 123.456
            System.out.println(getType(a));  // Integer
            System.out.println(getType(d));  // Double
            d = 1022;
            System.out.println(d);  // 1022
            //d = "mistake";
            //error: incompatible types:
            //String cannot be converted to double
        } 
        static String getType(Object o){
            return o.getClass().getSimpleName();
        }
    }
    
    