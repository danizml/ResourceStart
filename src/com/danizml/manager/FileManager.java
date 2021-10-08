package com.danizml.manager;

import java.io.*;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.util.function.BiPredicate;

@SuppressWarnings({"unused", "ResultOfMethodCallIgnored", "rawtypes", "DuplicatedCode", "RedundantSuppression"})
public class FileManager {

    public static void copyFile(Path files, Path Output) {
        try {
            Files.copy(files, Output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveFile(Path files, Path output) {
        try {
            Files.move(files, output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(Path file) {
        try {
            Files.delete(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static File createFile(String path, String name) {
        File file =  new File(path + "/" + name);
        try {
            file.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return file;
    }

    public static void setOwnerFile(Path file, FileOwnerAttributeView owner) {
        try {
            Files.setOwner(file, (UserPrincipal) owner);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setLastModifiedTimeFile(Path file, FileTime time) {
        try {
            Files.setLastModifiedTime(file, time);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getOwnerFile(Path file) {
        try {
            Files.getOwner(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getLastModifiedTimeFile(Path file) {
        try {
            Files.getLastModifiedTime(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findFile(Path file, int maxDepth, BiPredicate<Path, BasicFileAttributes> matcher, FileVisitOption... options) {
        try {
            Files.find(file, maxDepth, matcher, options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
