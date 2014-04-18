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
        TextFileReader tfr = new TextFileReader();
        File file = new File("src" + File.separatorChar + "Contacts.txt");
        tfr.readTextFile(file);
    }
}
