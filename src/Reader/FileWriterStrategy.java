/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reader;

import java.io.File;

/**
 *
 * @author dbell17
 */
public interface FileWriterStrategy {
    public abstract void writeTextFile(TextFileReader reader, File writer)throws Exception;
}
