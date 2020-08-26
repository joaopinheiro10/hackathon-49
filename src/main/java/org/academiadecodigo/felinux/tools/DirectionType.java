package org.academiadecodigo.felinux.tools;

public enum DirectionType {

    UP(new String[]{"/img/chars/girl/WALK_BACK_1.png", "/img/chars/girl/WALK_BACK_2.png", "/img/chars/girl/WALK_BACK_3.png", "/img/chars/girl/WALK_BACK_4.png"}),
    DOWN(new String[]{"/img/chars/girl/WALK_FRONT_1.png", "/img/chars/girl/WALK_FRONT_2.png", "/img/chars/girl/WALK_FRONT_3.png", "/img/chars/girl/WALK_FRONT_4.png"}),
    LEFT(new String[]{"/img/chars/girl/WALK_LEFT_1.png", "/img/chars/girl/WALK_LEFT_2.png", "/img/chars/girl/WALK_LEFT_3.png", "/img/chars/girl/WALK_LEFT_4.png"}),
    RIGHT(new String[]{"/img/chars/girl/WALK_RIGHT_1.png", "/img/chars/girl/WALK_RIGHT_2.png", "/img/chars/girl/WALK_RIGHT_3.png", "/img/chars/girl/WALK_RIGHT_4.png"}),
    IDLE(new String[]{"/img/chars/girl/WALK_FRONT_1.png", "/img/chars/girl/WALK_FRONT_2.png", "/img/chars/girl/WALK_FRONT_3.png", "/img/chars/girl/WALK_FRONT_4.png"});

    private String[] images;

    DirectionType(String[] images) {
        this.images = images;
    }

    public String getImage(int position){
        return this.images[position];
    }
}
