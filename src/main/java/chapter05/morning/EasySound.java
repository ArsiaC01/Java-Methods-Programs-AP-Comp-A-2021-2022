package chapter05.morning;// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class EasySound
{
  private SourceDataLine line = null;
  // audioBytes is declared immutable by the final keyword. In Java, class properties declared immutable can be
  // assigned only once. Generally, this should be done as much as possible. Also, final declares the reference
  // immutable; the property cannot be reassigned by the object it points to can be changed (does not apply to
  // primitives). For more about the final keyword, read https://en.wikipedia.org/wiki/Final_(Java)#Final_variables.
  private final byte[] audioBytes;
  private int numBytes;

  public EasySound(String fileName)
  {
    File  soundFile = new File(fileName);
    AudioInputStream audioInputStream = null;
    try
    {
      audioInputStream = AudioSystem.getAudioInputStream(soundFile);
    }
    catch (Exception ex)
    {
      System.out.println("*** Cannot find " + fileName + " ***");
      System.exit(1);
    }

    AudioFormat audioFormat = audioInputStream.getFormat();
    DataLine.Info info = new DataLine.Info(SourceDataLine.class,
                         audioFormat);
    try
    {
      line = (SourceDataLine)AudioSystem.getLine(info);
      line.open(audioFormat);
    }
    catch (LineUnavailableException ex)
    {
      System.out.println("*** Audio line unavailable ***");
      System.exit(1);
    }

    line.start();

    audioBytes = new byte[(int)soundFile.length()];

    try
    {
      numBytes = audioInputStream.read(audioBytes, 0, audioBytes.length);
    }
    catch (IOException ex)
    {
      System.out.println("*** Cannot read " + fileName + " ***");
      System.exit(1);
    }
  }

  public void play()
  {
    line.write(audioBytes, 0, numBytes);
  }
}