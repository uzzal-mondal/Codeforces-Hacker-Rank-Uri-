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


            int i, element = 0;
            /**
             * delete element of the array..
             */
            int elements = arrayNum[position - 1];
            for (i = position - 1; i < testNum - 1; i++) {
                arrayNum[i] = arrayNum[i + 1];
            }

            System.out.printf("delete position - %d\nelements of - %d", position, elements);

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
