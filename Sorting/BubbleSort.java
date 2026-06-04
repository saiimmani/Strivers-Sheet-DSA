import java.util.*;

class BubbleSort {

    public void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {        // --> from last element  decrement the size of array after every iteration.

            boolean swap = false;                                         

            for (int j = 0; j < i; j++) {            

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j + 1];   // Swaping 
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }

        System.out.println("After Using Bubble Sort:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Using Bubble Sort:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        BubbleSort sorter = new BubbleSort();  // Bubble Sort --> Class ( Creating new obj)
        sorter.bubbleSort(arr); // function call  "sorter"."bubbleSort"(arr); -> obj.method();
    }
}
