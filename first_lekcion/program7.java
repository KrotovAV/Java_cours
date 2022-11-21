public class program7 {  //Область  видимости переменных
    // У переменных существует понятие «область видимости». 
    // Если переменную объявили внутри некоторого блока фигурных скобок { }, 
    // то снаружи этого блока переменная будет недоступна.
    public static void main(String[] args) {
        int b = 111;
        {
            int i = 123;
            System.out.println(i + b);
        }
        int i = 5;
         System.out.println(i);  // error: cannot find symbol
   }
}


