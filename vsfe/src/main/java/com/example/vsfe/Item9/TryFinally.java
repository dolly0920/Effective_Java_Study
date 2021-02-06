package com.example.vsfe.Item9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryFinally {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            try {
                fis = new FileInputStream("file.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            bis = new BufferedInputStream(fis);
            int data;
            while((data = bis.read()) != -1)
                System.out.println((char) data);
        } finally {
            if (fis != null) fis.close();
            if (bis != null) bis.close();
        }
    }
}
