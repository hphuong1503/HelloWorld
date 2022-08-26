import java.util.Scanner;

public class GoalDifference {

    public static void main(String[] args) {
//        goalDiff();
        truthInTheMiddle();


    }

    private static void truthInTheMiddle() {


        Scanner scanner = new Scanner(System.in);
        int size;
        try {
            size = scanner.nextInt();
            if (size % 2 == 0) {
                System.out.println("Invalid size of matrix");
                return;
            }

        } catch (Exception exception) {
            System.out.println("Invalid size of matrix");
            return;
        }



        char arr[][] = new char[size][size];

//        nhap ma tran
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                    arr[i][j] = scanner.next().charAt(0);
            }
        }

//        validate matrix

        int count =0;
        int rowOfT=0, columnOfT=0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(arr[i][j]=='T' )
                {
                    rowOfT = i;
                    columnOfT=j;
                    count++;
                }
                if(count>1)
                {
                    System.out.println("Invalid matrix");
                    return;
                }
            }
        }


//        Tinh so buoc
        if(count==1)
        {
            int truth = (size / 2) + 1;
            int numberOfStep = Math.abs( rowOfT+1-truth ) + Math.abs(columnOfT+1 -truth);
            System.out.println("Number of Step" + numberOfStep);

        }






        /*
           1 2 3 4 5
       1 * F F F F F
       2 * F F F F T
       3 * F F F F F
       4 * F F F F F
       5 * F F F F F
        * */

    }

    /*
     * this method solve goal difference
     * */

    static void goalDiff() {
        Scanner scanner = new Scanner(System.in);
        try {
            int scoreTeamA = scanner.nextInt();
            int scoreTeamB = scanner.nextInt();

            if (scoreTeamA >= 0 && scoreTeamB >= 0) {

                if (scoreTeamA == scoreTeamB) {
                    System.out.println("This match is a tie");
                } else {
                    int result = scoreTeamA - scoreTeamB;
//                    result = result > 0 ? result : -result;
//                    Math.abs()

                    System.out.println("The match is won by " + result + " goals");
                }

            } else {
                System.out.println("Bad Input");
            }

        } catch (Exception e) {
            System.out.println("Bad Input");
        }

    }

    static int abs(int number) {
        if (number > 0)
            return number;
        return -number;
    }

}
