package DolarArray106.D_14_SumOfElements_3;

public class SumOfElement {

    public int showSumOfElements(int[] arrayNum, int testNum) {
        int i, sum = 0;
        System.out.println("Sum of elements in array : ");
        for (i = 0; i < testNum; i++) {
            sum = sum + arrayNum[i];
            System.out.printf("%d + ", arrayNum[i]);
        }
        System.out.printf("\ntotal num =  %d", sum);
        return i;
    }
}
