package ProblemSolvingDayByDay.Array;

public class BasicArray {
    //array definition. - same type of collection of variable.
    //array declaration.- char[] ch = new char[];
    // array initialize. - char[] ch ;
    public static void main(String[] args) {
        char[] chars = new char[5]; // elements.
        chars[0] = 'a'; // index  = value
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        chars[4] = 'e';

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
