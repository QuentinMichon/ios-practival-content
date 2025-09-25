package ch.heigvd.ios.text;

import ch.heigvd.ios.Readable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/**
 * A class that reads text files. This implementation reads the file using a buffered reader around
 * a file reader. It manages the reader and the buffered reader properly with a try-with-resources
 * block.
 */
public class BufferedTextFileReader implements Readable {

  @Override
  public void read(String filename) {
    try {
      Reader reader = new FileReader(filename, StandardCharsets.UTF_8);
      BufferedReader br = new BufferedReader(reader);

      int c;
      while( (c = br.read()) != -1) {
        System.out.print((char) c);
      }

      br.close();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
