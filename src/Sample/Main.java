import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 3. Метод вычисляющий выражение (a + b) / c где a, b, c – входные параметры
        // этого метода, метод должен возвращать результат
        System.out.println("\n=====  Метод вычисляющий выражение (a + b) / c  ====\n\t");
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("\tВведите сумму 'a' к которой будем прибавлять: ");
            int a = in.nextInt();
            System.out.print("\tВведите сумму 'b' которую будем прибавлять: ");
            int b = in.nextInt();
            System.out.print("\tВведите сумму 'c' на которую будем делить: ");
            int c = in.nextInt();
            if (a > 0 && b > 0 && c > 0) {
                System.out.println("\n\tОтвет: " + ((a + b) / (double) c));
            } else {
                System.out.println("\n\ta, b или c меньше или равно ноль!");
            }

            // 3. Метод, принимающий на вход два числа, и проверяющий что сумма этих чисел
            // больше 0
            System.out.println("\n==============  (a + b) > 0  =================\n\t");
            System.out.print("\tВведите сумму 'a' к которой будем прибавлять: ");
            int a2 = in.nextInt();
            System.out.print("\tВведите сумму 'b' которую будем прибавлять: ");
            int b2 = in.nextInt();
            if (a2 + b2 > 0) {
                System.out.println("\tОтвет: true");
            } else if (a2 + b2 == 0) {
                System.out.println("\n\tСумма чисел a и b равно ноль!");
            } else {
                System.out.println("\n\tСумма чисел a и b меньше нуля!");
            }

            // 4. Метод, которому в качестве параметра передается строка, обозначающая
            // сообщение
            System.out.println("\n======  В параметр передается строка: «Java, сообщение!»  ======");
            printMessage("Java, сообщение!");

            // 5. Метод, который определяет количество дней в феврале
            System.out.println("\n======  Сколько дней в феврале например 1984  ======");
            System.out.print("\n\tВведите год: ");
            int year = in.nextInt();
            System.out.println("\nВ " + year + " году, в феврале месяце: " + getDaysInFebruary(year) + " дней.");
        } finally {
            in.close(); // Закрытие Scanner в блоке finally для гарантированного выполнения
        }
    }

    public static void printMessage(String message) {
        System.out.println("\n\t" + message);
    }

    public static int getDaysInFebruary(int year) {
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(year, Calendar.FEBRUARY, 1);
        return myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
