public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World! more");
        for (int i = 0; i < 6; i++) {
            System.out.println("siiiiii");
        } 
        String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = "ahmed";
        }
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("small change");
    }
}
