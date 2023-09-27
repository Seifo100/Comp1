public class Sorter {
        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            selectionSort(arr);
            System.out.println("Sorted array:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    
        public static void selectionSort(int[] arr) {
            int n = arr.length;
    
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap the found minimum element with the element at index i
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
   }
