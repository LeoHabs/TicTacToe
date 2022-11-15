import java.util.Scanner;

public class Game {
    private static String winner="";

    Scanner scanner= new Scanner(System.in);

    public static void gameOn(){
        while (true){
            Board.printBoard();
            roundCircle();
            if(Game.checkWinningConditions()){
                break;
            }
            Board.printBoard();
            roundCross();
            if(Game.checkWinningConditions()){
                break;
            }
        }
        Board.printBoard();
        System.out.println(Game.winner+" won!");
    }

   public static void roundCircle(){

       System.out.println("CIRCLE:");
       try {
           Game.setPlay(Players.CirclePlayer);
       }catch (Exception e){
           System.out.println("Number doesn't exist");
       }
   }

   public static void roundCross(){
        try{
       System.out.println("CROSS:");
       Game.setPlay(Players.CrossPlayer);
        }catch (Exception e){
            System.out.println("Number doesn't exist");
        }
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
            Game.winner=Game.winnerCheck(Board.getPositions()[0]);
            return true;
        }
        if(Board.getPositions()[3].equals(Board.getPositions()[4]) && Board.getPositions()[4].equals(Board.getPositions()[5])){
            Game.winner=Game.winnerCheck(Board.getPositions()[3]);
            return true;
        }
        if(Board.getPositions()[6].equals(Board.getPositions()[7]) && Board.getPositions()[7].equals(Board.getPositions()[8])){
            Game.winner=Game.winnerCheck(Board.getPositions()[6]);
            return true;
        }
        if(Board.getPositions()[0].equals(Board.getPositions()[4]) && Board.getPositions()[4].equals(Board.getPositions()[8])){
            Game.winner=Game.winnerCheck(Board.getPositions()[0]);
            return true;
        }
        if(Board.getPositions()[2].equals(Board.getPositions()[4]) && Board.getPositions()[4].equals(Board.getPositions()[6])){
            Game.winner=Game.winnerCheck(Board.getPositions()[2]);
            return true;
        }
        if(Board.getPositions()[0].equals(Board.getPositions()[3]) && Board.getPositions()[3].equals(Board.getPositions()[6])){
            Game.winner=Game.winnerCheck(Board.getPositions()[0]);
            return true;
        }
        if(Board.getPositions()[1].equals(Board.getPositions()[4]) && Board.getPositions()[4].equals(Board.getPositions()[7])){
            Game.winner=Game.winnerCheck(Board.getPositions()[1]);
            return true;
        }
        if(Board.getPositions()[2].equals(Board.getPositions()[5]) && Board.getPositions()[5].equals(Board.getPositions()[8])){
            Game.winner=Game.winnerCheck(Board.getPositions()[2]);
            return true;
        }
        return false;
    }


    public static String winnerCheck(String symbol){
        if(symbol.equals("O")){
            return "CIRCLE";
        }else{
            return "CROSS";
        }
    }
}
