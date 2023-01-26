/*
 * Decompiled with CFR 0_110.
 */
package com.java8.file.rename;

import java.io.File;
import java.io.PrintStream;

public class RemanefileJar {
    public static void main(String[] args) {
        File[] listFiles;
        String namx = "C:\\Users\\sbbras\\Desktop\\Songs\\1 New";
        File directory = new File(namx);
        File[] arrfile = listFiles = directory.listFiles();
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            File file = arrfile[n2];
            String name = file.getName();
            if (name.contains("[") && name.contains("]")) {
                String[] split = name.split("\\[");
                String[] split2 = split[1].split("\\]");
                name = split[0].concat(split2[1]);
            }
            name = name.replace(" - 320Kbps ", "");
            name = name.replace(" -320Kbps ", "");
            name = name.replace(" - 190Kbps ", "");
            name = name.replace(" -190Kbps ", "");
            name = name.replace(".mp3", "");
            name = name.replace(".mp", "");
            name = name.replace("- DownloadMing.SE", "");
            name = name.replace("SongsMp.Com", "");
            name = name.replaceAll("[0-9]", "");
            name = name.replace(" -  - ", "");
            name = name.replace("Kbps", "");
            if ((name = name.trim()).startsWith("-")) {
                name = name.replace("-", "");
                name = name.trim();
            }
            if (name.endsWith("-")) {
                name = name.replace("-", "");
                name = name.trim();
            }
            name = name.replace("()", "");
            name = name.replace("\\s+", " ");
            System.out.println(name);
            File f1 = new File(String.valueOf(namx) + "\\" + name + ".mp3");
            file.renameTo(f1);
            ++n2;
        }
    }
}

