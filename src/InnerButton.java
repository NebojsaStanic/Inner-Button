import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerButton {
	
	JFrame frame;
	JButton button;

	public static void main(String[] args) {
		InnerButton gui = new InnerButton();
		gui.go();

	}
	
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("A");
		button.addActionListener(new BListener());
		
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	class BListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(button.getText().equals("A")){
				button.setText("B");
			}
			else{
				button.setText("A");
			}
		}
		
	} 
	

}
