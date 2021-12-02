public class Search {



    public int sequential_search(int []list , int target){
       // [1, 2, 3, 4, 5, 6, 7]
        int time = 0;
        int n = list.length;
        for (int i = 0; i < list.length; i++){
            if (target==list[i]){

                return i;
            }
        }
    return -1;
    }

    public double binarySearch(int []list, int target){
       // [1, 2, 3, 4, 5, 6, 7]
        int left = 0;
        int right = list.length - 1;
        int center = (left + right) /2;
        if (target < list[center]){
            right = center -1;
        }else if (target > list[center]){
            left = center + 1;
        }else {
            return center;
        }

        return -1;

    }


    public int interpolationSearch(int[] list, int target) {//интерполяционный
      //  [1, 2, 3, 4, 5, 6, 7]
        int n = list.length;
        int low = 0;
        int high = n - 1;
        while (low <= high && target >= list[low] && target <= list[high]) {
            int index = low + ((target - list[low]) * (high - low)) / (list[high] - list[low]);
            if (list[index] < target) {
                low = index + 1;
            } else if (list[index] > target) {
                high = index - 1;
            } else {

                return index;
            }
        }
        return -1;
    }


    public void average (int[]list ){
        double n = list.length;
         double average_seq = (n +1 ) /2;
         double  average_bin = Math.log(n) / Math.log(2);
         double average_inte = Math.log(2)/Math.log(Math.log(n)) ;
         int  interpolation_average  = (int) average_inte;
        System.out.println( "последовательный поиск: "+ average_seq + "\nдвоичный поиск :" + average_bin + "\nинтерполяционный поиск: " + interpolation_average);


    }
}
