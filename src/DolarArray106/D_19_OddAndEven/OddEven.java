package DolarArray106.D_19_OddAndEven;

public class OddEven {

    public void showEven(int[] arrayNum, int testNum) {
        int i;
        System.out.println("Even elements : ");
        for (i = 0; i < testNum; i++) {
            if (arrayNum[i] % 2 == 0) {
                System.out.printf("%d ", arrayNum[i]);
            }
        }
    }

    public void showOdd(int[] arrayNum, int testNum) {
        int i;
        System.out.println("\nOdd elements : ");
        for (i = 0; i < testNum; i++) {
            if (arrayNum[i] % 2 != 0) {
                System.out.printf("%d ", arrayNum[i]);
            }
        }
    }
}
