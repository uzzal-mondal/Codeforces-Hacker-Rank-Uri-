package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

/**
 *
 */

public class Team {
    public static void main(String[] args) {
        int testNum, i = 0, f, s, t, res = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();


        while (i < testNum) {
            System.out.println("First participant:");
            f = sc.nextInt();
            System.out.println("second participant:");
            s = sc.nextInt();
            System.out.println("third participant:");
            t = sc.nextInt();
            if ((f == 1 && s == 1) || (s == 1 && t == 1) || (t == 1 && f == 1)) {
                count++;
            }
            i++;
        }
        System.out.println(count);


        //todo: second problem strategy:
        /*for (int i = 0; i < testNum; i++) {
            f = sc.nextInt();
            s = sc.nextInt();
            t = sc.nextInt();
            if (f == 1) {
                count++;
            }
            if (s == 1) {
                count++;
            }
            if (t == 1) {
                count++;
            }

            if (count >= 2) {
                res++;
            }
            count = 0;
        }
        System.out.println(res);
*/

        //todo: first problem solve strategy

/*
        for (i = 1; i <= testNum; i++) {
            // System.out.println("Enter first friend");
            fFriend = sc.nextInt();
            //  System.out.println("Enter second friend");
            sFriend = sc.nextInt();
            //  System.out.println("Enter third friend");
            tFriend = sc.nextInt();
            // System.out.println(fFriend + " " + sFriend + " " + tFriend);
            res = fFriend + sFriend + tFriend;
            // System.out.println("RES : " + res);
            if (res >= 2) {
                count = count + 1;
            }
        }
        System.out.println(count);*/
    }
}
