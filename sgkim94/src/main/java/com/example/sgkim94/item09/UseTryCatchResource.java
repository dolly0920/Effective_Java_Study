package com.example.sgkim94.item09;

import com.example.sgkim94.item05.PrintNotification;
import lombok.extern.slf4j.Slf4j;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@Slf4j
public class UseTryCatchResource implements FileReader {

    @Override
    public void readFile() {
        try (FileOutputStream fos = new FileOutputStream("file.text")) {

            try (final ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(new PrintNotification());
                oos.flush();
            } catch (IOException e) {
                log.error("Fail write PrintNotification!");
            }
        } catch (IOException ignored) {
            log.error("Fail read file.text!");
        }
    }
}
