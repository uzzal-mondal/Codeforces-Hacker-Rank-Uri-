package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

/**
 *
 */

public class Team {
    public static void main(String[] args) {
        int testNum, i, fFriend, sFriend, tFriend, res, count = 0;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();


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
        System.out.println(count);
    }
}
