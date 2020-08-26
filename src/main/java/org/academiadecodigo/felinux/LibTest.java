package org.academiadecodigo.felinux;

import org.academiadecodigo.felinux.View.Background;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.springframework.scheduling.config.Task;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class LibTest {
    public static void main(String[] args) {
        Background background = new Background();
        int numberOfThreads = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        executorService.execute(background);
        Picture picture = new Picture(50,50, "/sprites/room.png");
        while(true){
            picture.draw();
        }
    }
}
