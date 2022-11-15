import java.util.Scanner;

public class Board {
    private static String[] positions = new String[] {"1","2","3","4","5","6","7","8","9"};

    public static void printBoard() {
        System.out.println(positions[0] + " | " + positions[1] + " | " + positions[2]);
        System.out.println("---------");
        System.out.println(positions[3] + " | " + positions[4] + " | " + positions[5]);
        System.out.println("---------");
        System.out.println(positions[6] + " | " + positions[7] + " | " + positions[8]);
    }

    public static String[] getPositions() {
        return positions;
    }

    public static void setPositions(int choice, String playerSymbol) {
        checkUnavailability(choice);
        positions[choice-1]= playerSymbol;
    }

    public static boolean checkUnavailability(int option){
        if(positions[option].equals("X") || positions[option].equals("O")){
            System.out.println("Position unavailable. You lost your turn");
            return true;
        }
        return false;
    }
}
