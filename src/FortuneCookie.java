import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener((this));

		System.out.println("Button clicked");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "woohoo");
		int rand = new Random().nextInt(5);
		if (rand==1) { JOptionPane.showMessageDialog(null, "you will fall off a cliff");}
		if (rand==2) { JOptionPane.showMessageDialog(null, "You will eat lots of bread");}
		if (rand==3) { JOptionPane.showMessageDialog(null, "you will explode");}
		if (rand==4) { JOptionPane.showMessageDialog(null, "you will adopt a hamster");}
		if (rand==5) { JOptionPane.showMessageDialog(null, "you will become vegan");}
		// TODO Auto-generated method stub
		
	}

}
