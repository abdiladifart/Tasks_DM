import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        Search search = new Search();
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("элемент находится в индексе "+search.sequential_search(list,3));
        System.out.println("элемент находится в индексе "+ search.binarySearch(list,4));
        System.out.println("элемент находится в индексе "+ search.interpolationSearch(list,2));



        double n = list.length;
        double average_seq = (n +1 ) /2;//среднее число сравнений, последовательном поиске (N+1)/2
        double  average_bin = Math.log(n) / Math.log(2);//среднее число сравнений двоичный поиск log2 n
        double average_inte =Math.log(Math.log(n))/Math.log(2)/Math.log(2);///среднее число сравнений, сравнений интерполяционный log2(log2(N))
        int  interpolation_average  = (int) average_inte;


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\79507\\IdeaProjects\\Task_3_DM\\out.txt"));

            writer.write(" среднее число сравнений \n");
            writer.write(Arrays.toString(list)+"\n");
            writer.write("последовательный поиск:"+Double.toString(average_seq)+"\n");
            writer.write("двоичный поиск :"+Double.toString(average_bin)+"\n");
            writer.write("интерполяционный поиск:"+Integer.toString(interpolation_average ));
            writer.close();

        }catch (Exception exception){
            return;
        }
    }
}