package ProblemSolvingDayByDay.ProjectSolve;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        String movieTitle;
        String movieDis;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie title: ");
        movieTitle = sc.nextLine();
        System.out.println("Enter movie description: ");
        movieDis = sc.nextLine();
        System.out.println("Enter your movie relase year.. ");
        year = sc.nextInt();

        Movie movie = new Movie(movieTitle, movieDis, year);
        System.out.println(movie.toString());


        if (movieTitle==movieTitle){
            System.out.println("I am finding it .");
        }else {
            System.out.println("No");
        }


    }

}
