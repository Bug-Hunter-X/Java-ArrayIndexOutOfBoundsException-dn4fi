public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[5] = 10; // This line will throw an ArrayIndexOutOfBoundsException
        System.out.println("Value at index 5:" + array[5]);
    }
}