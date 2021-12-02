import java.util.Arrays;

public class Main {
    public static int shellSort(int []arr){
        int elements = arr.length;
        int comperingTime = 0;
        // Start with a big gap, then reduce the gap
        for (int gap = elements/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < elements; i += 1)
            {
                comperingTime++;


                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];

                }

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }

        }
        comperingTime =comperingTime + (int) Math.log10(elements);
        return comperingTime;
    }

    public  static int []shellSortV1(int []arr){
        double pass  = Math.floor(Math.log( 2 * arr.length + 1 ))


        return arr;
    }



    public static void main(String[] args) {

	int []array = {10 ,9 ,8, 7 ,6, 5 ,4 ,3 ,2 ,1};
         shellSort(array);
         System.out.println(Arrays.toString(array));
           double c =   shellSort(array);
          System.out.println(c);



    }
}
