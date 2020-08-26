package org.academiadecodigo.felinux.tools;

public enum DirectionType {

    UP(new String[]{"img/mansion/purgatory/image4532.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png"}),
    DOWN(new String[]{"/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png"}),
    LEFT(new String[]{"/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png"}),
    RIGHT(new String[]{"/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png"}),
    IDLE(new String[]{"/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png", "/img/chars/girl/WALK_FRONT_4.png"});

    private String[] images;

    DirectionType(String[] images) {
        this.images = images;
    }

    public String getImage(int position){
        return this.images[position];
    }
}
