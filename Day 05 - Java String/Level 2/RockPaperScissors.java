import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors{
    public static String getchoice(){
        String[] choices = {"Rock", "Paper", "Scissor"};
        return choices[new Random().nextInt(3)];
    }
    public static String getWinner(String player, String computer){
        if(player.equals(computer)){
            return "Draw";
        }
        else if((player.equals("Rock") && computer.equals("Scissor")) || (player.equals("Paper") && computer.equals("Rock")) || (player.equals("Scissor") && computer.equals("Paper"))){
            return "Player";
        }
        else{
            return "Computer";
        }
    }
    public static String[][] getStats(int playerWins, int computerWins, int draws, int totalGames){
        double playerWinPerc = (playerWins/(double)totalGames)*100;
        double computerWinPerc = (computerWins/(double)totalGames)*100;
        double drawPerc = (draws/(double)totalGames)*100;
        String[][] stats = {
            {"Category", "Count", "Percentage"},
            {"Player Wins", String.valueOf(playerWins), String.format("%.2f%%", playerWinPerc)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerWinPerc)},
            {"Draws", String.valueOf(draws), String.format("%.2f%%", drawPerc)}
        };
        return stats;
    }
    public static void displayResults(String[][] gameResults, String[][]stats){
        System.out.println("\nGame Results");
        System.out.printf("%-15s %-10s %-10s %-15s%n", "Game#", "Player choice", "Computer choice", "Winner");
        System.out.println("----------------------------------------------------");
        for(String[] game:gameResults){
            System.out.printf("%-15s %-10s %-10s %-15s%n", game[0], game[1], game[2], game[3]);
        }
        System.out.println("\nStatistics");
        System.out.printf("%-15s %-10s %-10s%n","Category", "Count", "Percentage");
        System.out.println("--------------------------------------------");
        for(int i=0; i<stats.length; i++){
            System.out.printf("%-15s %-10s %-10s%n", stats[i][0], stats[i][1], stats[i][2]);
        }
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();
        String[][] gameResults = new String[numGames][4];
        int playerWins = 0, computerWins = 0, draws = 0;
        for(int i=0; i<gameResults.length; i++){
            String playerChoice = scanner.nextLine().trim();
            while(!playerChoice.equalsIgnoreCase("Rock") && !playerChoice.equalsIgnoreCase("Paper") && !playerChoice.equalsIgnoreCase("Scissor")){
                System.out.println("Invalid choice. Enter Rock, Paper or Scissor");
                playerChoice =scanner.nextLine().trim();
            }
            playerChoice = playerChoice.substring(0,1).toUpperCase() + playerChoice.substring(1).toLowerCase();
            String computerChoice = getchoice();
            String winner = getWinner(playerChoice, computerChoice);
            if(winner.equals("Player")){
                playerWins++;
            }
            else if(winner.equals("Computer")){
                computerWins++;
            }
            else{
                draws++;
            }
            gameResults[i][0] = String.valueOf(i+1);
            gameResults[i][1] = playerChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }
        String[][]stats = getStats(playerWins, computerWins, draws, numGames);
        displayResults(gameResults, stats);
        scanner.close();
    }
}