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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbell17
 */
public class TextFileReader implements FileReaderStrategy {

    private List<String> text = new ArrayList<String>();
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public TextFileReader(File file) {
        setFile(file);
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }
    
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
                
                getText().add(line);
                //System.out.println(line);
                line = reader.readLine();

            }
        } catch (Exception e) {
            throw e;
        } finally {
            reader.close();
        }
    }
}
