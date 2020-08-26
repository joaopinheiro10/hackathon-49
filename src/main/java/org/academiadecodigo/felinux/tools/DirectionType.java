package org.academiadecodigo.felinux.tools;

public enum DirectionType {

    UP(new String[]{"sad", "asd"}),
    DOWN(new String[]{"sad", "asd"}),
    LEFT(new String[]{"sad", "asd"}),
    RIGHT(new String[]{"sad", "asd"});

    private String[] images;

    DirectionType(String[] images) {
        this.images = images;
    }

    public String getImage(int position){
        return this.images[position];
    }
}
