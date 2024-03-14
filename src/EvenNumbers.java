public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Здравствуйте! Эта простая программа выполняет вывод всех чётных" +
                "\nчисел из заданного массива [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)
                System.out.printf( "%d ", arr[i]);
        }
    }
}
