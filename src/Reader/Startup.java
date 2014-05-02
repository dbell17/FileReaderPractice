/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reader;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author dbell17
 */
public class Startup {
    
    public static void main(String[] args) throws Exception {
        File reader = new File("src" + File.separatorChar + "Contacts.txt");
        TextFileReader tfr = new TextFileReader(reader);
        TextFileWriter tfr1 = new TextFileWriter();
        
        File writer = new File("src" + File.separatorChar + "Contacts.txt");
        //tfr1.writeTextFile(file1);
        //tfr.readTextFile(reader);
        tfr1.writeTextFile(tfr, writer);
        
        //System.out.print(tfr.getText());
        
//        for(String s : tfr.getText()){
//            System.out.println(s);
//        }
    }
}
