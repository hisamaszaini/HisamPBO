public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            String ini = "Hisam";
            int i = Integer.parseInt(ini);
            System.out.println(i);
        } catch (NumberFormatException e){
            System.out.println("String tidak dapat diubah menjadi integer!");
        }
    }
}
