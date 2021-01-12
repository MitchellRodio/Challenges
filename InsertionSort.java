class insertionSort {

    public static void Insertion(int [] sort_array){

      for(int i=0; i < sort_array.length; ++i){

        int j = i;
        
        while(j > 0 && sort_array[j-1] > sort_array[j]){

          int key = sort_arr[j];
          sort_array[j] = sort_array[j-1];
          sort_array[j-1] = key;
          j = j - 1; 

        }
      }
    }

    public static void main( String args[] ) {
        int [] array = {9, 24, 13, 5, 9};
        Insertion(array);

        for(int i=0; i < array.length; ++i){
          System.out.print(array[i] + " ");
        }
    }
}
