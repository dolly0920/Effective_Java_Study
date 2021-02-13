package com.example.vsfe.Item9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) throws FileNotFoundException {
        try (
                FileInputStream fis = new FileInputStream("file.txt");
                BufferedInputStream bis = new BufferedInputStream(fis)
            ) {
            int data;
            while((data = bis.read()) != -1)
                System.out.println((char)data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
