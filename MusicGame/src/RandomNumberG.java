import javax.swing.JOptionPane;

public class RandomNumberG
	{

		static int YoN3;
		
		public static void randoSong()
		{
		int introNum = (int) (Math.random() *3) + 1;
		
		if(introNum == 1)
			{
				//read song1
				String filepath = "Kid.Laugh1.wav";
				ReadMusic.readSong2(filepath);
				
				//MAKE THE JOPTIONPANE HAVE AN OPTION THAT SAYS KID
				
				YoN3 = JOptionPane.showConfirmDialog(MenuPop.frame, 
						"I play a song, and you pick the correct author", 
						"", JOptionPane.OK_OPTION,
						JOptionPane.QUESTION_MESSAGE);
			}
			
			
			
			
			
			
			
//		else if(introNum == 2)
//			{
//				System.out.println("Wassup Fart-Catcher, welcome to Monopoly");
//			}
//		else
//			{
//				System.out.println("Welcome to Monopoly fool");
//			}
		}
	
	}
