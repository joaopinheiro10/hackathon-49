package org.academiadecodigo.felinux.tools;

public enum DirectionType {

    UP(new String[]{"/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png"}),
    DOWN(new String[]{"/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png"}),
    LEFT(new String[]{"/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png"}),
    RIGHT(new String[]{"/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png"}),
    IDLE(new String[]{"/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png", "/sprites/girl/WALK_FRONT_4.png"});

    private String[] images;

    DirectionType(String[] images) {
        this.images = images;
    }

    public String getImage(int position){
        return this.images[position];
    }
}
