package com.smith.david.advent.of.code.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;

public class FileUtil {
    private FileUtil() {
    }

    public static void read(String fileName, Consumer<String> rowReader) throws IOException {
        final var fileUrl = ClassLoader.getSystemResource(fileName);
        final var file = new File(fileUrl.getFile());

        try(var bufferedReader = new BufferedReader(new FileReader(file))) {
            for(String line; (line = bufferedReader.readLine()) != null;) {
                rowReader.accept(line);
            }
        }
    }
}
