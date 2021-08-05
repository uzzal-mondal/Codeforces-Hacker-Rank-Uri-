package ProblemSolvingDayByDay.Array.TwoDArray;

public class IntroductionArray {
    public static void main(String[] args) {

        //initialize to 2D Array..
        //see the array 5 means row, 4 means column.
        int[][] num = new int[2][4];
       // System.out.println(num.length);
        num[0][0] = 10;
        num[0][1] = 20;
        num[0][2] = 30;
        num[0][3] = 40;
        //second row.
        num[1][0] = 60;
        num[1][1] = 70;
        num[1][2] = 80;
        num[1][3] = 90;
        // System.out.println(num[1][3]);
        for (int i = 0; i < 2; i++) {
            for (int q = 0; q < 4; q++) {
                System.out.print(num[i][q] + " ");
            }
            System.out.println();
        }


        System.out.println();
        //directly initialize array.
        //3 rows are 4 columns.
        int[][] dArray = {
                {10, 20, 80, 40},
                {10, 2, 30, 40},
                {10, 20, 60, 40}
        };
        //System.out.println(dArray[1][2]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(dArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
