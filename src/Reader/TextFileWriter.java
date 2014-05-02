/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author dbell17
 */
public class TextFileWriter implements FileWriterStrategy {
    @Override
    public final void writeTextFile(final TextFileReader reader, File writer) throws Exception{
       
        PrintWriter writer1 = null;
        int x;
        String y;
        //double  totals = reader.getText();
        //double grandTotals;
            reader.readTextFile(reader.getFile());
            writer1 = new PrintWriter(new BufferedWriter(new FileWriter(writer, false)));
            
            
            for(String s : reader.getText()){
                x = Integer.parseInt(s);
                x = x+5;
                
             writer1.append(x + "\n" );
        }
            writer1.close();
        }
    }

