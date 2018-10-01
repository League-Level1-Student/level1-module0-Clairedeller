import java.awt.Button;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
	}
	void setup () {
		JFrame j = new JFrame();
		JPanel p = new JPanel();
		Button b = new Button();
        Button u = new Button();
        Button T = new Button();
        j.add(p);
        p.add(b);
        p.add(u);
        p.add(T);
        j.setVisible(true);
        b.addActionListener(this);
        u.addActionListener(this);
        T.addActionListener(this);
	}
	
	void showDucks() {
	   
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
