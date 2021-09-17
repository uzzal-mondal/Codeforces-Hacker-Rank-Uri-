package DolarArray106.D_16_ArrayFrequency_8;

public class Frequency {

    public void countFreeQuency(int[] array, int n) {
        boolean[] visited = new boolean[10];
        int i, j;
        int count = 1;

        for (i = 0; i < n; i++) {
            if (visited[i] = true) {
                continue;
            }

            for (j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(array[i]+" "+count);
        }
    }
}
