package Seguidores;

import Objects.Size;

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

    public void run(Size followers, Size follow, Size scroll){
        try {
            getFollowers(followers,follow, scroll);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getFollowers(Size followers, Size follow, Size scroll) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    x = follow.getX();
                    y = follow.getY();
                    robo.mouseMove(followers.getX(), followers.getY());
                    mousePress();
                    Thread.sleep(3000);
                    while (true) {
                        for (int i = 0; i < 10; i++) {
                            if (i == 5 || i == 9 || i == 3) Thread.sleep(900000);
                            for (int j = 0; j < 6; j++){
                                if (j !=0 ) {
                                    y += 60;
                                }else{
                                    x = follow.getX();
                                    y = follow.getY();
                                }
                                robo.mouseMove(x, y);
                                Thread.sleep(1000);
                                mousePress();
                            }

                            robo.mouseMove(scroll.getX(), scroll.getY());
                            Thread.sleep(1000);
                            mousePress();
                            Thread.sleep(1000);
                            mousePress();
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

    private void followPeaple() throws InterruptedException {

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
