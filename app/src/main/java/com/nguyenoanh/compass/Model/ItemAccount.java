package com.nguyenoanh.compass.Model;

public class ItemAccount {
    private String name;
    private String job;
    private int image;

    private int imvPlus;

    String viewGroup;

    public ItemAccount(String name, String job, int image, int imvPlus) {
        this.name = name;
        this.job = job;
        this.image = image;
        this.imvPlus = imvPlus;
    }

    public ItemAccount(String name, String job, int image) {
        this.name = name;
        this.job = job;
        this.image = image;
    }

    public ItemAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getViewGroup() {
        return viewGroup;
    }

    public void setViewGroup(String viewGroup) {
        this.viewGroup = viewGroup;
    }

    public int getImvPlus() {
        return imvPlus;
    }

    public void setImvPlus(int imvPlus) {
        this.imvPlus = imvPlus;
    }
}
