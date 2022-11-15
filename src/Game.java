import java.util.Scanner;

public class Game {
    private static Players winner=null;

    Scanner scanner= new Scanner(System.in);

    public static void gameOn(){
        while (!Game.checkWinningConditions()){
            Board.printBoard();
            roundCircle();
            Board.printBoard();
            roundCross();
        }
        System.out.println(Game.winner+"won!");
    }

   public static void roundCircle(){
       Game.setPlay(Players.CirclePlayer);
   }

   public static void roundCross(){
       Game.setPlay(Players.CrossPlayer);
   }

    public static void setPlay(Players player){
        Scanner scanner= new Scanner(System.in);
        String symbol= null;
        if(player.equals(Players.CirclePlayer)){
            symbol= Players.CirclePlayer.symbol;
        }else{
            symbol= Players.CrossPlayer.symbol;
        }

        System.out.println("Position: ");
        Board.setPositions(scanner.nextInt(),symbol);
    }

    public static boolean checkWinningConditions(){
        if(Board.getPositions()[0].equals(Board.getPositions()[1]) && Board.getPositions()[1].equals(Board.getPositions()[2])){
            Game.winner(Board.getPositions()[0]);
            return true;
        }
        if(Board.getPositions()[3].equals(Board.getPositions()[4]) && Board.getPositions()[4].equals(Board.getPositions()[5])){
            Game.winner(Board.getPositions()[3]);
            return true;
        }
        if(Board.getPositions()[6].equals(Board.getPositions()[7]) && Board.getPositions()[7].equals(Board.getPositions()[8])){
            Game.winner(Board.getPositions()[6]);
            return true;
        }
        if(Board.getPositions()[0].equals(Board.getPositions()[4]) && Board.getPositions()[4].equals(Board.getPositions()[8])){
            Game.winner(Board.getPositions()[0]);
            return true;
        }
        if(Board.getPositions()[2].equals(Board.getPositions()[4]) && Board.getPositions()[4].equals(Board.getPositions()[6])){
            Game.winner(Board.getPositions()[2]);
            return true;
        }
        if(Board.getPositions()[0].equals(Board.getPositions()[3]) && Board.getPositions()[3].equals(Board.getPositions()[6])){
            Game.winner(Board.getPositions()[0]);
            return true;
        }
        if(Board.getPositions()[1].equals(Board.getPositions()[4]) && Board.getPositions()[4].equals(Board.getPositions()[7])){
            Game.winner(Board.getPositions()[1]);
            return true;
        }
        if(Board.getPositions()[2].equals(Board.getPositions()[5]) && Board.getPositions()[5].equals(Board.getPositions()[8])){
            Game.winner(Board.getPositions()[2]);
            return true;
        }
        return false;
    }


    public static Players winner(String symbol){
        if(symbol.equals("O")){
            return Players.CirclePlayer;
        }else{
            return Players.CrossPlayer;
        }
    }
}
