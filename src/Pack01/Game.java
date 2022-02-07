
package Pack01;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    Board board;
    String name1;//plyer 1 name
    String name2;//plyer 2 name


    public void InitBoard()
    {
        board = new Board();// new board
    }

    //names save
    public void SaveBoard()
    {
        try {
            SavedState state = new SavedState(board,name1,name2);
            OutputStream file = new FileOutputStream("game.mine");
            OutputStream buffer = new BufferedOutputStream(file);
            ObjectOutput output = new ObjectOutputStream(buffer);
            output.writeObject(state);
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //file read
    public void LoadBoard()
    {
        SavedState state;

         InputStream file;
        try {
            file = new FileInputStream("game.mine");
            InputStream buffer = new BufferedInputStream(file);
            ObjectInput input = new ObjectInputStream (buffer);
            state = (SavedState)input.readObject();
            this.board = state.board;
            this.name1 = state.player1Name;
            this.name2 = state.player2Name;
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

class Board implements Serializable {
    ArrayList<Integer> boardElements = new ArrayList<Integer>(); 

    public Board() {
        boardElements.add(1); 
    }

}

class SavedState implements Serializable {

    Board board;
    String player1Name;
    String player2Name;

    public SavedState(Board board, String player1Name, String player2Name) {
        this.board = board;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public SavedState(Board board, String playerName) {
        this.board = board;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    

    
}