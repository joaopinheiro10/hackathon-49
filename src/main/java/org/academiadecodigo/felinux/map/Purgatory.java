package org.academiadecodigo.felinux.map;
import org.academiadecodigo.felinux.GameObjects.mapObjects.Fire;
import org.academiadecodigo.felinux.GameObjects.mapObjects.Water;

import static org.academiadecodigo.felinux.map.MapType.*;

public class Purgatory extends Map{

    private Fire fire;
    private Water water;

    public Purgatory() {
        super(PURGATORY);
        fire = new Fire();
        water = new Water();
    }

    public void animate() {
        fire.animate();
        water.animate();
    }
}
