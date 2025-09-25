package ch.heigvd.ios.text;

import ch.heigvd.ios.Readable;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/**
 * A class that reads text files. This implementation reads the file byte per byte. It manages the
 * file reader properly with a try-catch-finally block.
 */
public class TextFileReader implements Readable {

  @Override
  public void read(String filename) {
    try {
      Reader reader = new FileReader(filename, StandardCharsets.UTF_8);

      int c;
      while( (c = reader.read()) != -1) {
        System.out.print((char) c);
      }

      reader.close();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
