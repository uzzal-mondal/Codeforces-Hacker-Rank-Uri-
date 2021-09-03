package ProblemSolvingDayByDay.function.DeleteElementArray;

public class DeleteElementArray {

    void showTestArrayPrint(int[] arrayNum, int testNum) {
        for (int i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }

    void showDeleteElement(int[] arrayNum, int testNum, int position) {
        if (position > testNum) {
            System.out.println("sorry ! position num is higher from your input num");
        } else {
            int i, j, element = 0;

            /**
             * find the position & find the elements...
             */
            System.out.printf("delete position - %d\nelements of - %d", position, arrayNum[position - 1]);

            /**
             * delete element of the array..
             */
            for (i = position - 1; i < testNum - 1; i++) {
                arrayNum[i] = arrayNum[i + 1];
            }


            /**
             * one elements are delete...
             */
            System.out.println("\nExpected output : ");
            for (i = 0; i < testNum - 1; i++) {
                System.out.printf("%d ", arrayNum[i]);
            }
        }
    }
}
