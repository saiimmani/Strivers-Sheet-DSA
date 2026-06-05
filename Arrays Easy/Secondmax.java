int Largest = arr[0];
int Second = -1;
int n = arr.length;
for (int i = 0; i < n; i++){
  if (arr[i] > largest){
    second = largest;
    largest = arr[i];
  } else if (arr[i] < largest && arr[i] > Second){
    second = arr[i]
  }
  
}

return Second
