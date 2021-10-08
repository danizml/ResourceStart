package com.danizml.manager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SuppressWarnings("unused")
public class FolderManager {

    public static void createFolder(Path directory, String folderName) {
        try {
            Files.createDirectories(Paths.get(directory + "/" + folderName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFolder(Path directory, String folderName) {
        try {
            Files.delete(Paths.get(directory + "/" + folderName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
