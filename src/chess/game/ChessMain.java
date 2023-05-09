package chess.game;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import chess.board.*;
import chess.pieces.*;
import java.io.File;


public class ChessMain {

    private JFrame frame;
    private JPanel boardPanel;
    private JPanel whitePanel;
    private JPanel blackPanel;

    public ChessMain() {
	frame = new JFrame("French Chess Game");
	frame.setSize(600, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	boardPanel = new JPanel(new GridLayout(8, 8));
	boardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

	whitePanel = new JPanel(new GridLayout(1, 8));
	whitePanel.setPreferredSize(new Dimension(600, 75));
	whitePanel.setBackground(Color.WHITE);

	blackPanel = new JPanel(new GridLayout(1, 8));
	blackPanel.setPreferredSize(new Dimension(600, 75));
	blackPanel.setBackground(Color.WHITE);

	frame.add(boardPanel, BorderLayout.CENTER);
	frame.add(whitePanel, BorderLayout.NORTH);
	frame.add(blackPanel, BorderLayout.SOUTH);

	for (int i = 0; i < 64; i++) {
	    JPanel squarePanel = new JPanel(new BorderLayout());
	    if ((i / 8) % 2 == 0) {
		if (i % 2 == 0) {
		    squarePanel.setBackground(Color.WHITE);
		} else {
		    squarePanel.setBackground(Color.GRAY);
		}
	    } else {
		if (i % 2 == 0) {
		    squarePanel.setBackground(Color.GRAY);
		} else {
		    squarePanel.setBackground(Color.WHITE);
		}
	    }
	    boardPanel.add(squarePanel);
	}

	addPieces();
	frame.setLocationRelativeTo(null); // az ablak középre igazítása

	frame.setVisible(true);
    }

    private void addPieces() {
	    ChessPiece[][] pieces = BoardFactory.generateBoard();

	    // fehér bábuk létrehozása
	    for (int i = 0; i < 8; i++) {
	        JPanel piecePanel = new JPanel(new BorderLayout());
	        JLabel pieceLabel = new JLabel(new ImageIcon("C:\\\\Users\\\\Acer\\\\Desktop\\\\Project chess\\\\WORKSPACES4\\\\BoblerFrenchChessApplication\\\\src\\\\images\\\\" + pieces[0][i].getImageFileName()));
	        piecePanel.add(pieceLabel);
	        whitePanel.add(piecePanel);
	    }

	    // fekete bábuk létrehozása , ezt nem látni, nincsenek fent a sötét tisztek
	    for (int i = 0; i < 8; i++) {
	        JPanel piecePanel = new JPanel(new BorderLayout());
	        JLabel pieceLabel = new JLabel(new ImageIcon("C:\\Users\\Acer\\Desktop\\Project chess\\WORKSPACES4\\BoblerFrenchChessApplication\\src\\images\\" + pieces[1][i].getImageFileName()));
	        piecePanel.add(pieceLabel);
	        blackPanel.add(piecePanel);
	    }

	    // fekete királynő hozzáadása
	    JPanel piecePanel = new JPanel(new BorderLayout());
	    JLabel pieceLabel = new JLabel(new ImageIcon("C:\\Users\\Acer\\Desktop\\Project chess\\WORKSPACES4\\BoblerFrenchChessApplication\\src\\images\\QueenBlack.png"));
	    //JLabel pieceLabel = new JLabel(new ImageIcon("images/QueenBlack.png")); 
	    piecePanel.add(pieceLabel);
	    blackPanel.add(piecePanel);

	    // fekete király hozzáadása
	    piecePanel = new JPanel(new BorderLayout());
	    pieceLabel = new JLabel(new ImageIcon("C:\\Users\\Acer\\Desktop\\Project chess\\WORKSPACES4\\BoblerFrenchChessApplication\\src\\images\\KingBlack.png"));
	    //pieceLabel = new JLabel(new ImageIcon("images/KingBlack.png"));
	    piecePanel.add(pieceLabel);
	    blackPanel.add(piecePanel);

	    // fekete gyalogok létrehozása
	    for (int i = 0; i < 8; i++) {
	        piecePanel = new JPanel(new BorderLayout());
	        pieceLabel = new JLabel(new ImageIcon("C:\\Users\\Acer\\Desktop\\Project chess\\WORKSPACES4\\BoblerFrenchChessApplication\\src\\images\\PawnBlack.png"));
	        //pieceLabel = new JLabel(new ImageIcon("images/PawnBlack.png"));
	        piecePanel.add(pieceLabel);
	        blackPanel.add(piecePanel);
	    }

	}


public static void main(String[] args) {
   
new ChessMain();

  }
}
