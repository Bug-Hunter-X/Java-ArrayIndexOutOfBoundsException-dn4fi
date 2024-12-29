public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        int index = 5; //Example of index out of bounds
        if(index >=0 && index < array.length){
            array[index] = 10; 
            System.out.println("Value at index " + index + ": " + array[index]);
        } else {
            System.out.println("Index out of bounds");
        }
        
    }
}