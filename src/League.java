import java.io.BufferedReader; //is used to read the text from a character-based input stream.
import java.io.IOException; // is an exception which programmers use in the code to throw a failure in Input & Output operations
import java.io.InputStreamReader; // It reads bytes and decodes them into characters using a specified charset
import java.util.ArrayList; // Is a dynamic array for storing the elements.
import java.util.Arrays; // is a container object that holds a fixed number of values of a single type
import java.util.List; // It  represents an ordered sequence of objects

public class League {

    public static void main(String[] args) {
        int[][] scoreBoard = new int[0][];
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int data = 0;
            System.out.print("Input number of clubs:\t");
            data = Integer.parseInt(input.readLine());
1
            String[] teamList = new String[data];
            for (int i = 0; i < data; i++) {
                System.out.print("Enter club " + (i + 1) + " :\t");
                teamList[i] = input.readLine();
            }

            System.out.println("-------------------------------------------------");

            // representing 2D array of team score board where each scoreBoard is of type
            //     0      1      2      3       4
            // [played] [win] [draw] [loose] [points]
            scoreBoard = new int[data][5];
            for (int i = 0; i < data - 1; i++) {
                for (int j = i + 1; j < data; j++) {
                    System.out.print(teamList[i] + " vs " + teamList[j] + " : ");
                    String score = input.readLine();
                    List<String> scoreList = new ArrayList<String>(Arrays.asList(score.split(" ")));
                    scoreList.removeIf(s -> s.equals(""));
                    int teamAScore = Integer.parseInt(scoreList.get(0));
                    int teamBScore = Integer.parseInt(scoreList.get(1));
                    scoreBoard[i][0]++;
                    scoreBoard[j][0]++;
                    if (teamAScore > teamBScore) {
                        scoreBoard[i][1]++;
                        scoreBoard[j][3]++;
                        scoreBoard[i][4] += 3;
                    } else if (teamAScore == teamBScore) {
                        scoreBoard[i][2]++;
                        scoreBoard[j][2]++;
                        scoreBoard[i][4]++;
                        scoreBoard[j][4]++;
                    } else {
                        scoreBoard[i][3]++;
                        scoreBoard[j][1]++;
                        scoreBoard[j][4] += 3;
                    }
                }
            }

            System.out.format("%15s%15s%15s%15s%15s%15s\n", "TEAMS", "PLAYED", "WIN", "DRAW", "LOOSE", "POINTS");
            for (int i = 0; i < data; i++) {
                System.out.format("%15s", teamList[i]);
                System.out.format("%15d%15d%15d%15d%15d\n", scoreBoard[i][0], scoreBoard[i][1], scoreBoard[i][2], scoreBoard[i][3], scoreBoard[i][4]);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.print(" The TEAM with more points WINS the  TROPHY ");
    }
}

