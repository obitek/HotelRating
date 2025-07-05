
import java.util.Scanner;

public class MatrixAddition {
    public static void add(int[][] matA, int[][] matB){
         System.out.println("Matrix A + B: ");
         for(int i = 0; i < matA.length; i++){
             for(int j = 0; j < matA[i].length; j++){
                 System.out.printf("\t\t%d", (matA[i][j] + matB[i][j]));
             }
             System.out.println();
         } 
         System.out.println();
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        for(;;){
            int[][] matA = new int[3][3], matB = new int[3][3];

            // load matric A
            for(int i = 0; i < matA.length; i++){
                for(int j = 0; j < matA[i].length; j++){
                    System.out.printf("Enter the %d%dth element of matrix A: ", i,j);
                    matA[i][j] = scan.nextInt();
                }
            } 
            
            // load matric B
            System.out.println();
            for(int i = 0; i < matB.length; i++){
                for(int j = 0; j < matB[i].length; j++){
                    System.out.printf("Enter the %d%dth element of matrix B: ", i,j);
                    matB[i][j] = scan.nextInt();
                }
            } 

            // print matrix A
            System.out.println("Matrix A: ");
            for(int i = 0; i < matA.length; i++){
                for(int j = 0; j < matA[i].length; j++){
                    System.out.printf("\t\t%d", matA[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            
            // print matrix B
            System.out.println("Matrix B: ");
            for(int i = 0; i < matB.length; i++){
                for(int j = 0; j < matB[i].length; j++){
                    System.out.printf("\t\t%d",  matB[i][j]);
                }
                System.out.println();
            }  
            System.out.println();
   
            add(matA, matB); // add the matric and print result
            
            scan.nextLine();
            System.out.println();
            System.out.print("Do you want to continue (yes/y) or any other input to exit: ");
            String answer = scan.nextLine();
            if(!(answer.equalsIgnoreCase("yes") ||answer.equalsIgnoreCase("y"))){
                break;
            } else {
               System.out.println();
            }
            
        }
        scan.close();
    }
}

