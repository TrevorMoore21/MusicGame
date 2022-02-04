import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Framez
	{

		public static void Menu()
		{
			JFrame frame = new JFrame("Music Game");
			frame.setSize(300, 300);
			JButton button = new JButton("Turn on Sound");
			frame.add(button);
			button.addActionListener(new AL());
			frame. setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
	
		
		public static class AL implements ActionListener
		{
			public final void actioPerformed(ActionEvent e)
			{
				music();
			}

			@Override
			public void actionPerformed(ActionEvent e)
				{
					// TODO Auto-generated method stub
					
				}

	
		}
		
		public static void music()
		{
			AudioPlayer AP = AudioPlayer.player;
			AudioStream AS;
			AudioData AD;
			
			ContinuousAudioDataStream loop = null;
			
			try
				{
					
				
			AS = new AudioStream(new FileInputStream("Kid.Laugh1.wav"));
			AD = AS.getData();
			loop = new ContinuousAudioDataStream(AD);
				}
			catch (IOException error)
				{
					System.out.println("Error, no file found");
				}
			
			AP.start(loop);
		}

	}
		
	
