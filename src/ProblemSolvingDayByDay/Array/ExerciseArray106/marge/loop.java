package ProblemSolvingDayByDay.Array.ExerciseArray106.marge;

public class loop {
    public static void main(String[] args) {
        int count = 0;
        for (; count < 10; ) {
            System.out.println(count++);
        }

        int i = 0, j = 100;
        for (; i < 10; i++, j++) {
            System.out.println(j);
        }
    }
}
