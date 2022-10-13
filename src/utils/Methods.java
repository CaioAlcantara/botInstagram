package utils;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Methods {

    static Integer x = 719;
    static Integer y = 128;
    static Robot robo;


    static {
        try {
            robo = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }



    private static void seguidorDois() throws InterruptedException {
        while (true){
            for (int i = 0; i < 10; i++) {
                if (i == 5) Thread.sleep(900000);
                robo.mouseMove(x + 90, y - (-325));
                Thread.sleep(1000);
                mousePress();
                Thread.sleep(1000);
                robo.mouseMove(x + 90, y - (-375));
                Thread.sleep(1000);
                mousePress();
                robo.mouseMove(x + 90, y - (-430));
                mousePress();
                Thread.sleep(1000);

                robo.mouseMove(x + 160, y - (-460));
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
    }

    public void seguidorTres() throws InterruptedException {
        try {
            while (true){
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
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

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

    private static void seguidor() throws InterruptedException {
        Thread.sleep(5000);
        robo.mouseMove(x, y);
        Thread.sleep(2000);
        mousePress();
        Thread.sleep(2000);
        escrever("mamaesprimeiraviagem");
        Thread.sleep(2000);
        robo.mouseMove(x, y - (-80));
        Thread.sleep(2000);
        mousePress();
        Thread.sleep(2000);
        robo.mouseMove(x + 35, y - (-130));
        Thread.sleep(2000);
        mousePress();
        Thread.sleep(2000);


        while (true){

            for (int i = 0; i < 10; i++) {
                if (i == 5) Thread.sleep(700000);
                robo.mouseMove(x + 90, y - (-325));
                Thread.sleep(1000);
                mousePress();
                Thread.sleep(1000);
                robo.mouseMove(x + 90, y - (-375));
                Thread.sleep(1000);
                mousePress();
                robo.mouseMove(x + 90, y - (-430));
                mousePress();
                Thread.sleep(1000);

                robo.mouseMove(x + 160, y - (-460));
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
    }

}
