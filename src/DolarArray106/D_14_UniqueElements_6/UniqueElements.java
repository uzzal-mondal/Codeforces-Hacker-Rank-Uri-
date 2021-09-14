package DolarArray106.D_14_UniqueElements_6;

public class UniqueElements {
    public void showUniqueElements(int[] arrayNum, int tesData) {


        int i, j, count;
        for (i = 0; i < tesData; i++) {
            count = 0;
            for (j = 0; j < tesData; j++) {
                if (i != j) {
                    if (arrayNum[i] == arrayNum[j]) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Unique elements: " + arrayNum[i]);
            }
        }

    }
}
