package pl.monikagapinska.firstprogramme.classandobject;

public class ArraysInJava {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for(int x=0; x<matrix.length; x++){
            for(int y = 0; y<matrix[x].length; y++){
                matrix[x][y]=0;
            }
        }
        matrix[0][3] = 10;
        matrix[6][2] = 24;

        System.out.println(matrix[0][3]);
    }
}
