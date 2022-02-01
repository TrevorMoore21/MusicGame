import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuPop
	{

		static String name;
		static JFrame frame = new JFrame();
		static int YoN;
		static int YoN2;
		
		public static void getName()
		{
			//User's name
			name = JOptionPane.showInputDialog("Hello, What is your name?");
			JOptionPane.showMessageDialog(frame, "Hi " + name);
		}
		
		
		public static void wannaPlay()
			{
				//Would you like to play a game?
				YoN = JOptionPane.showConfirmDialog(frame, 
						"Would you like to play a music game "+ name + "?", 
						"", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				
				if (YoN == JOptionPane.YES_OPTION)
					{

						YoN2 = JOptionPane.showConfirmDialog(frame, 
								"I play a song, and you pick the correct author", 
								"", JOptionPane.OK_OPTION,
								JOptionPane.QUESTION_MESSAGE);
						
						RandomNumberG.randoSong();
						
	
						
					}
				else if (YoN == JOptionPane.NO_OPTION)
					{
						System.exit(YoN);
					}
				else if (YoN ==JOptionPane.CANCEL_OPTION)
					{
						System.exit(YoN);
					}
			}
		
		
	}
