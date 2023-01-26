/*
 * Decompiled with CFR 0_110.
 */
package com.java8.service;

import java.io.File;
import java.io.FileFilter;
import java.io.PrintStream;

public class FileList {
    public static void main(String[] args) {
        FileList.methodA();
        FileList.methodB();
    }

    private static void methodA() {
        File[] listFiles = new File("C:\\Users\\sbbras\\Desktop\\Java8Test").listFiles(new FileFilter(){

            @Override
            public boolean accept(File file) {
                if (file.isHidden()) {
                    return true;
                }
                return false;
            }
        });
        System.out.println("methodA:: " + listFiles.length);
    }

    private static void methodB() {
        File[] listFiles = new File("C:\\Users\\sbbras\\Desktop\\Java8Test").listFiles(File::isHidden);
        System.out.println("methodB:: " + listFiles.length);
    }

}

