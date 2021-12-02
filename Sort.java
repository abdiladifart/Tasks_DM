import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static int []insertion_sort(int []list){
        for (int i = 1 ; i < list.length; i++){
            int current = list[i];
            int j = i - 1;
           while (j >= 0 && list[j] > current){
               list[j+1] = list[j];
               j--;
           }
           list[j+1] = current;
        }return list;




    }




}
