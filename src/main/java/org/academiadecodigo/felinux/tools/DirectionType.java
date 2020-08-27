package org.academiadecodigo.felinux.tools;

public enum DirectionType {

    GIRL_FRONT(new String[]{"/img/chars/girl/WALK_BACK_1.png", "/img/chars/girl/WALK_BACK_2.png", "/img/chars/girl/WALK_BACK_3.png", "/img/chars/girl/WALK_BACK_4.png"}),
    GIRL_BACK(new String[]{"/img/chars/girl/WALK_FRONT_1.png", "/img/chars/girl/WALK_FRONT_2.png", "/img/chars/girl/WALK_FRONT_3.png", "/img/chars/girl/WALK_FRONT_4.png"}),
    GIRL_LEFT(new String[]{"/img/chars/girl/WALK_LEFT_1.png", "/img/chars/girl/WALK_LEFT_2.png", "/img/chars/girl/WALK_LEFT_3.png", "/img/chars/girl/WALK_LEFT_4.png"}),
    GIRL_RIGHT(new String[]{"/img/chars/girl/WALK_RIGHT_1.png", "/img/chars/girl/WALK_RIGHT_2.png", "/img/chars/girl/WALK_RIGHT_3.png", "/img/chars/girl/WALK_RIGHT_4.png"}),
    IDLE(new String[]{"/img/chars/girl/WALK_FRONT_1.png", "/img/chars/girl/WALK_FRONT_2.png", "/img/chars/girl/WALK_FRONT_3.png", "/img/chars/girl/WALK_FRONT_4.png"}),

    OLD_FRONT(new String[]{"/img/chars/oldLady/WALK_BACK_1.png", "/img/chars/oldLady/WALK_BACK_2.png", "/img/chars/oldLady/WALK_BACK_3.png", "/img/chars/oldLady/WALK_BACK_4.png"}),
    OLD_BACK(new String[]{"/img/chars/oldLady/WALK_FRONT_1.png", "/img/chars/oldLady/WALK_FRONT_2.png", "/img/chars/oldLady/WALK_FRONT_3.png", "/img/chars/oldLady/WALK_FRONT_4.png"}),
    OLD_LEFT(new String[]{"/img/chars/oldLady/WALK_LEFT_1.png", "/img/chars/oldLady/WALK_LEFT_2.png", "/img/chars/oldLady/WALK_LEFT_3.png", "/img/chars/oldLady/WALK_LEFT_4.png"}),
    OLD_RIGHT(new String[]{"/img/chars/oldLady/WALK_RIGHT_1.png", "/img/chars/oldLady/WALK_RIGHT_2.png", "/img/chars/oldLady/WALK_RIGHT_3.png", "/img/chars/oldLady/WALK_RIGHT_4.png"}),
    OLD_IDLE(new String[]{"/img/chars/oldLady/IDLE_FRONT_1.png", "/img/chars/oldLady/IDLE_FRONT_2.png", "/img/chars/oldLady/IDLE_FRONT_3.png", "/img/chars/oldLady/IDLE_FRONT_4.png"});

    private String[] images;

    DirectionType(String[] images) {
        this.images = images;
    }

    public String getImage(int position){
        return this.images[position];
    }
}
