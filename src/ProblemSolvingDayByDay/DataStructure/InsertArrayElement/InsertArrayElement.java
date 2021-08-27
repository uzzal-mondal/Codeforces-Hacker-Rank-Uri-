package ProblemSolvingDayByDay.DataStructure.InsertArrayElement;

public class InsertArrayElement {

    public void showArrayElement(int[] array, int inputNum) {
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }


    public void showInsertArray(int[] array, int inputNum, int value, int pos) {
        for (int i = inputNum - 1; i >= pos - 1; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = value;

        System.out.println("Including the value of array position : ");
        for (int i = 0; i < inputNum + 1; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}

