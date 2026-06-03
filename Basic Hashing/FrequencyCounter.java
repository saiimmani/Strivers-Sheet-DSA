import java.util.*;

class FrequencyCounter {

    public void Frequency(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>(); // Stores element -> frequency

        // Count frequencies
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);  // ( arr[i] - > Element ;  
            // map.getOrDefault(arr[i], 0) + 1 -->  tells the count or assign default as 0 ).
        }

        int maxFreq = 0, minFreq = n; //--> Absolute maximun of the array can be 
        int maxEle = 0, minEle = 0;

        // Traverse map to find min and max frequency elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey(); // mapping thr key values
            int count = entry.getValue(); // mapping values 

            if (count > maxFreq) {
                maxFreq = count;        //  gives max element 
                maxEle = element;
            }

            if (count < minFreq) {
                minFreq = count;  // min element
                minEle = element;
            }
        }

        // Print results
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

    public static void main(String[] args) {
        FrequencyCounter fc = new FrequencyCounter();
        int[] arr = {10, 5, 10, 15, 10, 5};
        fc.Frequency(arr, arr.length);
    }
}
