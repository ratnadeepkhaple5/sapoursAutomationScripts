package generic.utilities;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.activation.MimeType;

import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

public class ScreenRecorderUtil extends ScreenRecorder {

	private static final Object MediaTypeKey = null;
	private static final Object EncodingKey = null;
	private static final Object MimeTypeKey = null;
	private static final Object MIME_AVI = null;
	private static final Object ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE = null;
	private static final Object CompressorNameKey = null;
	private static final Object DepthKey = null;
	private static final Object FrameRateKey = null;
	private static final Object QualityKey = null;
	private static final Object KeyFrameIntervalKey = null;
	public static ScreenRecorder screenRecorder;
	public String name;
	
	public ScreenRecorderUtil(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat, Format screenFormat,
			Format mouseFormat, Format audioFormat, File movieFolder, String name) throws IOException, AWTException {
		
		super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder);
		this.name=name;
	}

	@Override
	protected File createMovieFile(Format fileFormat) throws IOException {
		// TODO Auto-generated method stub
		return super.createMovieFile(fileFormat);
	}

	public void startRecord(String methodName) throws IOException, AWTException {
		
		File file=new File("./test-recordings/");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		
		Rectangle captureSize=new Rectangle(0, 0, width, height);
		
	 GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	 
	 ScreenRecorder screenRecorder = new ScreenRecorder(gc,
	            new Format(MediaTypeKey, FormatKeys.MediaType.FILE, MimeTypeKey, MIME_AVI),
	            new Format(MediaTypeKey, FormatKeys.MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	                    CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	                    DepthKey, (int) 24, FrameRateKey, Rational.valueOf(15),
	                    QualityKey, 1.0f,
	                    KeyFrameIntervalKey, (int) (15 * 60)),
	            new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
	                    FrameRateKey, Rational.valueOf(30)),
	            null);
	}

	
	public void stopRecord() throws IOException {
		// TODO Auto-generated method stub
		super.stop();
	}

	
}
