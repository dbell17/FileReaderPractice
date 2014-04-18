/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author dbell17
 */
public class TextFileReader implements FileReaderStrategy {

    @Override
    public final void readTextFile(final File file) throws Exception {
        if (file == null || !file.exists()) {
            throw new Exception();
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();

            }
        } catch (Exception e) {
            throw e;
        } finally {
            reader.close();
        }
    }
}
