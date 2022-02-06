import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;

import java.io.File;

import javax.sound.sampled.Clip;

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
		
		
		/*
		public static void music()
		{
			AudioPlayer AP = AudioPlayer.player;
			AudioStream AS;
			AudioData AD;
			
			ContinuousAudioDataStream loop = null;
			
			try
				{
					
				
			AS = new AudioStream(new FileInputStream("KidLaugh.wav"));
			AD = AS.getData();
			loop = new ContinuousAudioDataStream(AD);
				}
			catch (IOException error)
				{
					System.out.println("Error, no file found");
				}
			
			AP.start(loop);
		}
		*/
		
		

		
		    public static void music()
		    	{
		    		
		        //This gets the path to the project, but not into /src for eclipse
		        String path = new File("").getAbsolutePath() + "KidLaugh.wav";
		        
		        //Make a File object with a path to the audio file.
		        File sound = new File(path);

		        try {
		            AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
		            Clip c = AudioSystem.getClip();
		            c.open(ais); //Clip opens AudioInputStream
		            c.start(); //Start playing audio

		            //sleep thread for length of the song
		            Thread.sleep((int)(c.getMicrosecondLength() * 0.001));
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		        }
		    }
		}
		
		
		

	
		
	
