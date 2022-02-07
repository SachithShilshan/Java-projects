package Pack01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Start extends MouseAdapter {

    Icon img = new ImageIcon("LOGO.jpg"); // picking the image icon from folder
    
//add buttons
    static JButton start = new JButton("Start New Game");
    static JButton resume = new JButton("Resume");
    static JButton exit = new JButton("Exit");
//frame with title
    static JFrame frame = new JFrame("TicTacToe Ultimate");
//labal for image set  
    static JLabel labalImg = new JLabel();
    
    //input players names 
    static JLabel Player1labal = new JLabel("Player1 Name");
    static JTextField Player1Input = new JTextField(12);
    static JLabel Player2labal = new JLabel("Player2 Name");
    static JTextField Player2Input = new JTextField(12);

    
    StartPane startpanel = new StartPane();

    Start() {
        //set image
        labalImg.setIcon(img);
        startpanel.add(labalImg);

        frame.setLocation(200, 50);//frame location
        frame.add(startpanel); //add panel in frame
        startpanel.add(resume);//add resume button
        resume.setVisible(false); //visible resume button
        startpanel.add(exit);  //add exit button
        startpanel.add(start);  //add exit button
        

        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startpanel.setBackground(Color.WHITE);
        frame.setVisible(true);

        startpanel.add(Player1labal);
        startpanel.add(Player1Input);
        
        startpanel.add(Player2labal);
        startpanel.add(Player2Input);

        
        resume.addMouseListener(this);// mouselistener for resume
        exit.addMouseListener(this);// mouselistener for exit
        start.addMouseListener(this);// mouselistener for exit

    }

    @Override
    public void mouseClicked(MouseEvent ae) {

        if (ae.getSource() == resume) {
            frame.setVisible(false);
            startpanel.main.setVisible(true);// main invisible/can't play

        }
        if (ae.getSource() == exit) {
            System.exit(0); // exit the app
        }
        if (ae.getSource() == start) {
            frame.setVisible(false);
            startpanel.main.reset();

            Game game = new Game();
            game.name1 = Player1Input.getText();
            game.name2 = Player2Input.getText();
            game.InitBoard();
            
            //Now save the board
            game.SaveBoard();
            
            //print save players name
            System.out.println("Player1 Name is:" + game.name1);
            System.out.println("Player2 Name is:" + game.name2);
            game.LoadBoard();
            System.out.println("Loaded Board, Player1 Name is:" + game.name1);
            System.out.println("Loaded Board, Player2 Name is:" + game.name2);

            startpanel.main.setVisible(true);// main invisible/can play
        }

    }

}
