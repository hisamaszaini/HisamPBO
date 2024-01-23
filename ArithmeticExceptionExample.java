public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // Operasi Tidak Valid
        } catch (ArithmeticException e) {
            System.out.println("Tidak dapat membagi bilangan dengan angka 0!");
        }
    }
}
