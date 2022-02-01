import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ReadMusic
	{

		public static void readSong2(String musicLocation)
			{
				
				try
					{
						File musicPath = new File(musicLocation);
						if(musicPath.exists())
							{
								AudioInputStream audio1 = AudioSystem.getAudioInputStream(musicPath);
								Clip clipper = AudioSystem.getClip();
								clipper.start(); 
							}
						else
							{
								System.out.println("Can't find file");
							}
					}
				
				 catch(Exception ex)
					{
						ex.printStackTrace();
					}
			}
		
		
		
	}
