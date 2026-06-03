class selection {

    static void sort(int[] arr) {
    int n = arr.length;
    for ( int i = 0; i < n-1; i++){
       int MinIndex = i;
    for ( int j = i+1 ; j < n ; j++){
            if(arr[j] < arr[MinIndex]){
                MinIndex = j;
            
        }
    }
        int temp = arr[MinTndex];
        arr[MinTndex] = arr[i];
        arr[i] = temp;
        
}
