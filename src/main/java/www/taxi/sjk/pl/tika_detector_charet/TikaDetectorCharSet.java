package www.taxi.sjk.pl.tika_detector_charet;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.parser.txt.CharsetDetector;
import org.apache.tika.parser.txt.CharsetMatch;

public class TikaDetectorCharSet {

	private String checkEncoding(InputStream input){
				
		CharsetDetector detector = new CharsetDetector();
		try {
			detector.setText(input);
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
		CharsetMatch charset = detector.detect();
		return charset.getName();	
	}
	
	public String getEncoding(String filename){
		InputStream str;
		String encoding;
		try {
			str = new FileInputStream(new File(filename));
			InputStream toDetect = new BufferedInputStream(str);
			encoding = checkEncoding(toDetect);
			return encoding;
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		return null;
	}
	
	
}
