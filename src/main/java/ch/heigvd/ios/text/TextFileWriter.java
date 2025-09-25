package ch.heigvd.ios.text;

import ch.heigvd.ios.Writable;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 * A class that writes text files. This implementation write the file byte per byte. It manages the
 * file writer properly with a try-catch-finally block.
 */
public class TextFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try {
      Writer writer = new FileWriter(filename, StandardCharsets.UTF_8);

      for (int i = 0; i < sizeInBytes; i++) {
        writer.write((char) (65+(i%26)) );
      }

      writer.close();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
