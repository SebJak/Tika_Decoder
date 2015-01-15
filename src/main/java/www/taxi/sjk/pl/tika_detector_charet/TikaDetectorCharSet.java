package www.taxi.sjk.pl.tika_detector_charet;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.parser.txt.CharsetDetector;
import org.apache.tika.parser.txt.CharsetMatch;

public class TikaDetectorCharSet {

	public String checkEncoding(String filename) throws IOException{
		
				
		CharsetDetector detector = new CharsetDetector();
		InputStream str = new FileInputStream(new File(filename));
		InputStream toDetect = new BufferedInputStream(str);
		detector.setText(toDetect);
		CharsetMatch charset = detector.detect();
		
		System.out.println(charset.getName());
		
		return charset.getName();
		
	}
	
	
}
