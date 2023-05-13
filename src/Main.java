import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 2);

        }
        System.out.println("Array " + Arrays.toString(getNumber(arr)));


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0));
        System.out.println("ArrayList: " + getNumber(numbers));

        LinkedList<Integer> numbers1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numbers1.add(random.nextInt(0, 2));

        }
        System.out.println("LinkedList: " + getNumber(numbers1));


    }

    public static int[] getNumber(int[] array) {
        Arrays.sort(array);
        return array;

    }

    public static ArrayList<Integer> getNumber(ArrayList<Integer> integers) {
        Collections.sort(integers);
        return integers;
    }

    public static LinkedList<Integer> getNumber(LinkedList<Integer> integers) {
        Collections.sort(integers);
        return integers;


    }
}


