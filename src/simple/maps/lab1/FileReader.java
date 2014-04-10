/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simple.maps.lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jrheingans1
 */
public class FileReader {
    public static void main(String[] args) {
        
        File data = new File("src" + File.separatorChar
                + "Contacts.txt");
        BufferedReader in = null;
        List<String> contactsFile = new ArrayList<String>();
        try {
            in = new BufferedReader(new java.io.FileReader(data));
            String line = in.readLine();
            while (line != null) {
                contactsFile.add(line);
                line = in.readLine();  // strips out any carriage return chars
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
        

        final int LINES_PER_REC = 6;
        List<Contact> contacts = new ArrayList<Contact>();
        for(int i=1; i <= contactsFile.size(); i++) {
            if( (i % LINES_PER_REC) == 0) {
                Contact contact = new Contact();
                contact.setFirstName(contactsFile.get(i-6));
                contact.setLastName(contactsFile.get(i-5));
                contact.setAddress(contactsFile.get(i-4));
                contact.setCity(contactsFile.get(i-3));
                contact.setState(contactsFile.get(i-2));
                contact.setZipcode(contactsFile.get(i-1));
                contacts.add(contact);
            }
        }        
        
//        int lineCount = 1;
//        final int LINES_PER_REC = 6;
//        List<String> record = new ArrayList<String>();
//        List<Contact> contacts = new ArrayList<Contact>();
//        for(String s : contactsFile) {
//            record.add(s);
//            if( (lineCount % LINES_PER_REC) == 0) {
//                Contact contact = new Contact();
//                contact.setFirstName(record.get(0));
//                contact.setLastName(record.get(1));
//                contact.setAddress(record.get(2));
//                contact.setCity(record.get(3));
//                contact.setState(record.get(4));
//                contact.setZipcode(record.get(5));
//                contacts.add(contact);
//                record.clear();
//            }
//            lineCount++;
//        }
        
        
        
//        for (String s : ContactsFile) {     
//            System.out.println(s);
//        }
        Set<Contact> noDupes = new HashSet<Contact>(contacts);
        contacts = new ArrayList<Contact>(noDupes);
        System.out.println("\nList after dupes removed:");
        for(Contact obj : contacts) {
            
            System.out.println(obj);
        }
//        contactsFile.toString();
//        List<String> ContactsFile = new ArrayList<String>();
    }
}
