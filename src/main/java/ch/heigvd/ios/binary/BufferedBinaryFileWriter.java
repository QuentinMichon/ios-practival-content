package ch.heigvd.ios.binary;

import ch.heigvd.ios.Writable;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * A class that writes binary files. This implementation writes the file using a buffered output
 * stream. It manages the file output stream properly with a try-with-resources block.
 */
public class BufferedBinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try(OutputStream fos = new FileOutputStream(filename)) {
      BufferedOutputStream bos = new BufferedOutputStream(fos);

      for(int i = 0; i < sizeInBytes; i++) {
        bos.write(0x23);
      }
      //vider le buffer
      bos.flush();
      //fermer le buffer stream
      bos.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
