/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Asus
 */
public class ReadWriteDemo {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Properties properties = new Properties();
        FileInputStream inputstream = new FileInputStream("C:\\Users\\Asus\\Documents\\NetBeansProjects\\ReadWriteFile\\src\\test\\java\\resources\\propertics\\testdata.properties");
        properties.load(inputstream);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("url"));
        
        FileOutputStream outputstream = new FileOutputStream("C:\\Users\\Asus\\Documents\\NetBeansProjects\\ReadWriteFile\\src\\test\\java\\resources\\propertics\\testdata.properties");
        properties.setProperty("testdata", "01793344213");
        properties.store(outputstream, "This is customer phone number data");
    }
}
