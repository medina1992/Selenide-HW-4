package operations;

public class TypeOperations {
    public static void main(String[] args) {

        // 0) Арифметические операции над двумя int
        int a = 10;
        int b = 3;
        int resultInt = (a + b) * (a - b) / b;
        System.out.println("0) Арифметика int: " + resultInt);

        // 1) Арифметические операции над int и double
        int x = 5;
        double y = 2.5;
        double resultMixed = (x + y) * (x - y) / y;
        System.out.println("1) Арифметика int и double: " + resultMixed);

        // 2) Логические операции
        System.out.println("2) Логические операции:");
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= 10: " + (a >= 10));
        System.out.println("b <= 3: " + (b <= 3));

        // 3) Диапазоны:
        System.out.println("3) Диапазоны:");
        System.out.println("Float.MIN_VALUE: " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);

        double overflowDouble = Double.MAX_VALUE * 2;
        System.out.println("Double overflow (Double.MAX_VALUE * 2): " + overflowDouble); // Infinity

        // 4) Переполнение int
        int intMax = Integer.MAX_VALUE;
        int intOverflow = intMax + 1;
        System.out.println("4) Переполнение int (Integer.MAX_VALUE + 1): " + intOverflow); // -2147483648
    }
}
