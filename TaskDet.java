import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
public class TaskDet {


    public static void main(String args[]) throws Exception {

        DET det = new DET();


        int[][] mat1 = new int[10][10];

        int[][] mat2 = new int[3][3];

        int [][] mat3 = new int[13][13];


        det.failInput("input3.txt", mat2,3);
        det.failInput("input10.txt",mat1,mat1.length);
       // det.failInput("input13.txt",mat3,mat3.length);

       det.failOuPut("input3.txt","outputTasks3.txt",mat2,mat2.length);
       det.failOuPut("input10.txt","outputTasks10",mat1,mat1.length);
      //  det.failOuPut("input13.txt","outputTasks10",mat3,mat3.length);






    }
}