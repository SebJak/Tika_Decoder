package www.taxi.sjk.pl.tika_detector_charet;


/**
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		TikaDetectorCharSet detector = new TikaDetectorCharSet();
		detector.getEncoding("ANSI.csv");
		detector.getEncoding("UTF.csv");

	}
}
