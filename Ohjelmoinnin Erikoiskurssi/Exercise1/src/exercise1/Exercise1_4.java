package exercise1;

import java.util.List;

public class Exercise1_4 {

	public static <T extends Number> double sumOfList(List<T> list) {
        double sum = 0.0;
        if (list != null) {
            for (T element : list) {
                sum += element.doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum of integer list: " + sumOfList(integerList));

        List<Double> doubleList = List.of(1.5, 2.5, 3.5);
        System.out.println("Sum of double list: " + sumOfList(doubleList));
    }
}
