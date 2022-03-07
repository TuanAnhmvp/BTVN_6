package com.example.myapplication.Manage_Folder;

public class Mngfolder {
//    private int resouceImage;
    private String name_folder;
    private String content_folder;

    public Mngfolder(String name_folder, String content_folder) {
        this.name_folder = name_folder;
        this.content_folder = content_folder;
    }

    public String getName_folder() {
        return name_folder;
    }

    public void setName_folder(String name_folder) {
        this.name_folder = name_folder;
    }

    public String getContent_folder() {
        return content_folder;
    }

    public void setContent_folder(String content_folder) {
        this.content_folder = content_folder;
    }

}
