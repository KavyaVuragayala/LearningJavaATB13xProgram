package ex_18_MultidimensionalArrays;

public class Lab_83_2D_Iterate_forloop {
    public static void main(String[] args) {

        int[][] a_2d = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < a_2d.length ; i++) {   // row length
            for (int j = 0; j < a_2d[i].length ; j++) {   // length of first row

                System.out.print(a_2d[i][j] + "|");
            }

            System.out.println();

        }
    }
}
