package org.lesson5;

public class ProjectFile {
    private String fileName;
    private int setting1;
    private String setting2;
    private boolean setting3;

    public ProjectFile(String fileName) {

        this.fileName = fileName;
        //TODO: Загрузка настроек проекта из файла
        setting1 = 1;
        setting2 = "...";
        setting3 = false;
    }

    public String getFileName() {
        return fileName;
    }

    public int getSetting1() {
        return setting1;
    }

    public String getSetting2() {
        return setting2;
    }

    public boolean getSetting3() {
        return setting3;
    }
}
