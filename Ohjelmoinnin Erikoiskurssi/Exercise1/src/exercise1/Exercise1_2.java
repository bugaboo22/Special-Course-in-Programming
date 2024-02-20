package exercise1;

public class Exercise1_2 {
	
	public static <T extends Comparable<T>> T maxOfThree(T a, T b, T c) {
        T max = a;
        
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        
        return max;
    }

    public static void main(String[] args) {
        
        System.out.println("Max of 3, 7, 5 is: " + maxOfThree(3, 7, 5));
 
        System.out.println("Max of apple, orange, banana is: " + maxOfThree("apple", "orange", "banana"));

        System.out.println("Max of 3.5, 2.5, 4.5 is: " + maxOfThree(3.5, 2.5, 4.5));
    }

}
