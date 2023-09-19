public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int x = 14;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == x) {
                System.out.println("Элемент " + x + " найден! Его порядковый номер в массиве равен: " + middle);
                break;
            } else if (arr[middle] > x) {
                right = middle - 1;
            } else if (arr[middle] < x) {
                left = middle + 1;
            }
        }
    }
}
