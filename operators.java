public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic
        System.out.println("a + b = " + (a + b));  // 13
        System.out.println("a - b = " + (a - b));  // 7
        System.out.println("a * b = " + (a * b));  // 30
        System.out.println("a / b = " + (a / b));  // 3
        System.out.println("a % b = " + (a % b));  // 1

        // Relational
        System.out.println(a > b);   // true
        System.out.println(a == b);  // false

        // Logical
        boolean x = true, y = false;
        System.out.println(x && y);  // false
        System.out.println(x || y);  // true
        System.out.println(!x);      // false
    }
}
