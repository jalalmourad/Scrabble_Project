import java.util.ArrayList;

/**
 * Main class of Scrabble Game
 */
public class Game {

    Hand playerHand;
    Bag bag;
    Board board;

    /**
     * Create game.
     */
    public Game() {
        playerHand = new Hand();
        bag = new Bag();
        board = new Board();
        playerHand.setLetters(bag.getAlphabet());
    }

    public void setLetterOnBoard(int x, int y, char letter){

       // if(playerHand.getLetters().contains(letter)) {

                if (playerHand.getLetters().contains(letter)) {
                    System.out.println("Letter Placed is: "+letter+"\n");
                    board.setLetterOnBoard(x, y, letter);
                    playerHand.getLetters().remove(playerHand.getLetterPosition(letter));
                }

       // }
        else {
                    System.out.println("This letter is not in your hand!\n");
                }
    }


    /**
     * Begin game, loops until game is over.
     */
    public void play() {
        printIntro();

        while (true) {
            //board.printBoard();
        }
    }

    /**
     * Print game introduction.
     */
    public void printIntro() {
        System.out.println();
        System.out.println("Welcome to the game of Scrabble!");
        System.out.println();
        System.out.println();
        System.out.println();
    }



    public static void main(String[] args) {
        Game game = new Game();
        Bag bag = new Bag();

        game.playerHand.setLetters(bag.getAlphabet());
        game.playerHand.printHand();

        game.setLetterOnBoard(1,1,'A');
        game.playerHand.printHand();
        game.setLetterOnBoard(1,2,'B');
        game.playerHand.printHand();
        game.setLetterOnBoard(1,3,'C');
        game.playerHand.printHand();
        game.setLetterOnBoard(1,4,'D');
        game.playerHand.printHand();
        game.setLetterOnBoard(1,5,'E');
        game.playerHand.printHand();

        game.board.printBoard();



//        game.play();
    }
}
