package www.taxi.sjk.pl.tika_detector_charet;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TikaDetectorCharSet detector = new TikaDetectorCharSet();
        try {
			detector.checkEncoding("ANSI.csv");
			
			detector.checkEncoding("UTF.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     
    }
}
