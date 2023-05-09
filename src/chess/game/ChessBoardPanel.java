// a sakktábla grafikus megjelenítését végzi

package chess.game;
	
	import java.awt.Color;
	import java.awt.Graphics;
	
	import javax.swing.JPanel;
	
	public class ChessBoardPanel extends JPanel {
	
	    private static final long serialVersionUID = 1L;
	    
	    private static final int BOARD_SIZE = 8;
	    private static final int SQUARE_SIZE = 50;
	
	    @Override
	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        
	        for (int i = 0; i < BOARD_SIZE; i++) {
	            for (int j = 0; j < BOARD_SIZE; j++) {
	                if ((i + j) % 2 == 0) {
	                    g.setColor(Color.WHITE);
	                } else {
	                    g.setColor(Color.BLACK);
	                }
	                g.fillRect(i * SQUARE_SIZE, j * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
	            }
	        }
	    }
	}
