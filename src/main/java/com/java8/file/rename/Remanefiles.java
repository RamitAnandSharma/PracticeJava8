/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  com.mpatric.mp3agic.ID3v1
 *  com.mpatric.mp3agic.Mp3File
 */
package com.java8.file.rename;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.Mp3File;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Remanefiles {
    static List<String> list = new ArrayList<String>();
    static String namx = "C:\\Users\\sbbras\\Desktop\\Songs\\abc";

    public static void main(String[] args) throws Exception {
        Remanefiles.run1();
        Remanefiles.run();
    }

    public static void run1() throws Exception {
        File[] listFiles;
        File directory = new File(namx);
        File[] arrfile = listFiles = directory.listFiles();
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            String comment;
            File file = arrfile[n2];
            String name = file.getName();
            Mp3File mp3file = new Mp3File(String.valueOf(namx) + "\\" + name);
            ID3v1 id3v1Tag = mp3file.getId3v1Tag();
            if (id3v1Tag != null && (comment = id3v1Tag.getComment()) != null && !comment.trim().isEmpty()) {
                list.add(comment);
            }
            ++n2;
        }
    }

    public static void run() throws Exception {
        File[] listFiles;
        File directory = new File(namx);
        File[] arrfile = listFiles = directory.listFiles();
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            File file = arrfile[n2];
            String name = file.getName();
            Mp3File mp3file = new Mp3File(String.valueOf(namx) + "\\" + name);
            ID3v1 id3v1Tag = mp3file.getId3v1Tag();
            if (name.equals("Neendein Khul Jaati Hain - Son")) {
                System.out.println("hi");
            }
            String rename = "";
            if (id3v1Tag != null) {
                id3v1Tag.setComment("");
                id3v1Tag.setTrack("");
                if (mp3file.hasCustomTag()) {
                    System.out.println("true");
                }
                rename = id3v1Tag.getTitle().trim().equals("") ? Remanefiles.rename(name) : Remanefiles.rename(id3v1Tag.getTitle());
                mp3file.setId3v1Tag(id3v1Tag);
            }
            mp3file.save(rename);
            ++n2;
        }
    }

    public static String rename(String name) {
        if (name.contains("[") && name.contains("]")) {
            String[] split = name.split("\\[");
            String[] split2 = split[1].split("\\]");
            name = split[0].concat(split2[1]);
        }
        name = name.replace("'", "");
        name = name.replace("\"", "");
        name = name.replace(" - 320Kbps ", "");
        name = name.replace(" -320Kbps ", "");
        name = name.replace(" - 190Kbps ", "");
        name = name.replace(" -190Kbps ", "");
        name = name.replace(".mp3", "");
        name = name.replace(".mp", "");
        name = name.replace("- DownloadMing.SE", "");
        name = name.replace("SongsMp.Com", "");
        name = name.replace("Songspk.CC", "");
        name = name.replace("Songspk.LINK", "");
        name = name.replace("DJMaza.Info", "");
        name = name.replace("SongsMp3.Com", "");
        name = name.replace("www.DJMaza.Info", "");
        name = name.replace("Songspk.name", "");
        name = name.replace("MyMp3Song.Com", "");
        name = name.replace("PakiUM.Com", "");
        name = name.replace("Songspk.name", "");
        name = name.replace("", "");
        name = name.replace("", "");
        name = name.replace("", "");
        name = name.replace("", "");
        name = name.replace("", "");
        name = name.replace("", "");
        name = name.replace("", "");
        name = name.replace("", "");
        name = name.replace("", "");
        name = name.replace("", "");
        for (String string : list) {
            name = name.replace(string, "");
        }
        name = name.replaceAll("[0-9]", "");
        name = name.replace(" -  - ", "");
        name = name.replace("Kbps", "");
        name = name.replace("kbps", "");
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
        return name;
    }
}

