package org.reso.apache.java;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.reso.apache.java.action.CreateExcelFile;
import org.reso.apache.java.action.ModifyExcelFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
public class JavaApplication {

    public static void main(String[] args) throws InvalidFormatException {
        CreateExcelFile createExcelFile = new CreateExcelFile();
        ModifyExcelFile modifyExcelFile = new ModifyExcelFile();
        try {
            System.out.println("Generating New File");
            createExcelFile.generateFile();
            System.out.println("Modifying Newly created File");
            modifyExcelFile.modifyFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SpringApplication.run(JavaApplication.class, args);
    }
}
