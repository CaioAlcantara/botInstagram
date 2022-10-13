package Seguidores;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class GetFollowers extends Thread {

   private static Robot robo;
   private static Integer x = 719;
   private static Integer y = 128;

    public GetFollowers(){
    }

    public GetFollowers(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    static {
        try {
            robo = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        try {
            getFollowers();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void getFollowers() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        for (int i = 0; i < 10; i++) {
                            if (i == 5 || i == 9) Thread.sleep(900000);
                            robo.mouseMove(878, 427);
                            Thread.sleep(1000);
                            mousePress();
                            Thread.sleep(1000);
                            robo.mouseMove(866, 486);
                            Thread.sleep(1000);
                            mousePress();
                            robo.mouseMove(874, 539);
                            mousePress();
                            Thread.sleep(1000);

                            robo.mouseMove(934, 565);
                            Thread.sleep(1000);
                            mousePress();
                            Thread.sleep(1000);
                            mousePress();
                            Thread.sleep(1000);
                            mousePress();
                            Thread.sleep(1000);
                            mousePress();
                            Thread.sleep(1000);
                        }
                        mousePress();
                        Thread.sleep(1000);
                        mousePress();
                        Thread.sleep(1000);
                        mousePress();
                        Thread.sleep(1000);

                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });
        t1.start();
    }

    private static void mousePress(){
        var botao = InputEvent.BUTTON1_DOWN_MASK;
        robo.mousePress(botao);
        robo.delay(100);
        robo.mouseRelease(botao);
    }

    private static void escrever(String keys){
        char[] chars = keys.toCharArray();
        for (char caracter : chars){
            var letra = KeyEvent.getExtendedKeyCodeForChar(caracter);
            robo.keyPress(letra);
            robo.delay(200);
            robo.keyRelease(letra);
        }
    }


}
