public class Merge {
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,7,6,1};

        mergeSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;// base case
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i = 0; //left Arr
        int j = 0; // right Arr

        for (; i<length;i++){
            if ( i < middle ) {
                leftArray[i] = array[i];

            }
            else {
                rightArray[j]= array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }
    //Helper method
    private static void merge( int[] leftArray , int[] rightArray, int[] array){
        int leftSize = array.length/2;
        int RightSize = array.length - leftSize;
        int i = 0, l = 0, r  = 0 ; // indices

        // chech the conditions for merging

        while(1 < leftSize && r < RightSize ) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[1];
                i++;
                l++;

            }else {
                array[i] = rightArray[r];
                i++;
                r++;

            }
        }
        while (l< leftSize){
            array[i] = leftArray[l];
            i++;
            l++;

        }
        while( r < RightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
