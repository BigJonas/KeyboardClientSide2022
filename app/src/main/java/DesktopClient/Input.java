// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package DesktopClient;

import static DesktopClient.DesktopClient.*;

import static java.awt.event.MouseEvent.*;
import static DesktopClient.Constants.Keyboard.*;
import static DesktopClient.Input.Keyboard.Keys.*;
import static java.awt.event.KeyEvent.*;

import static DesktopClient.Input.Mouse.Buttons.*;

import java.awt.event.*;

/** Add your docs here. */
public class Input {

    public static class Keyboard 
        extends KeyAdapter {

        public static final class Keys {

            // Alphanumerics
            public static final int A_ = VK_A - FIRST_KEY_OFFSET;
            public static final int B_ = VK_B - FIRST_KEY_OFFSET;
            public static final int C_ = VK_C - FIRST_KEY_OFFSET;
            public static final int D_ = VK_D - FIRST_KEY_OFFSET;
            public static final int E_ = VK_E - FIRST_KEY_OFFSET;
            public static final int F_ = VK_F - FIRST_KEY_OFFSET;
            public static final int G_ = VK_G - FIRST_KEY_OFFSET;
            public static final int H_ = VK_H - FIRST_KEY_OFFSET;
            public static final int I_ = VK_I - FIRST_KEY_OFFSET;
            public static final int J_ = VK_J - FIRST_KEY_OFFSET;
            public static final int K_ = VK_K - FIRST_KEY_OFFSET;
            public static final int L_ = VK_L - FIRST_KEY_OFFSET;
            public static final int M_ = VK_M - FIRST_KEY_OFFSET;
            public static final int N_ = VK_N - FIRST_KEY_OFFSET;
            public static final int O_ = VK_O - FIRST_KEY_OFFSET;
            public static final int P_ = VK_P - FIRST_KEY_OFFSET;
            public static final int Q_ = VK_Q - FIRST_KEY_OFFSET;
            public static final int R_ = VK_R - FIRST_KEY_OFFSET;
            public static final int S_ = VK_S - FIRST_KEY_OFFSET;
            public static final int T_ = VK_T - FIRST_KEY_OFFSET;
            public static final int U_ = VK_U - FIRST_KEY_OFFSET;
            public static final int V_ = VK_V - FIRST_KEY_OFFSET;
            public static final int W_ = VK_W - FIRST_KEY_OFFSET;
            public static final int X_ = VK_X - FIRST_KEY_OFFSET;
            public static final int Y_ = VK_Y - FIRST_KEY_OFFSET;
            public static final int Z_ = VK_Z - FIRST_KEY_OFFSET;

            public static final int N0_ = VK_0 - FIRST_KEY_OFFSET;
            public static final int N1_ = VK_1 - FIRST_KEY_OFFSET;
            public static final int N2_ = VK_2 - FIRST_KEY_OFFSET;
            public static final int N3_ = VK_3 - FIRST_KEY_OFFSET;
            public static final int N4_ = VK_4 - FIRST_KEY_OFFSET;
            public static final int N5_ = VK_5 - FIRST_KEY_OFFSET;
            public static final int N6_ = VK_6 - FIRST_KEY_OFFSET;
            public static final int N7_ = VK_7 - FIRST_KEY_OFFSET;
            public static final int N8_ = VK_8 - FIRST_KEY_OFFSET;
            public static final int N9_ = VK_9 - FIRST_KEY_OFFSET;

        }

        public Keyboard() {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            keysEntries[e.getKeyCode() - FIRST_KEY_OFFSET].setBoolean(true);
            System.out.println("Key pressed");

            if(e.getKeyCode() == CM_ + FIRST_KEY_OFFSET) System.exit(0);

        }

        @Override
        public void keyReleased(KeyEvent e) {
            keysEntries[e.getKeyCode() - FIRST_KEY_OFFSET].setBoolean(false);
            System.out.println("Key released");

        }

    }

    public static class Mouse 
        extends MouseAdapter {

        public static final class Buttons {

            // Mouse Buttons
            public static final int M1_ = BUTTON1;
            public static final int M2_ = BUTTON2;
            public static final int M3_ = BUTTON3;
            public static final int MX_ = 4;
            public static final int MY_ = 5;
            public static final int MS_ = 6;
            
        }

        private int mouseX;
        private int mouseY;

        public Mouse() {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            mouseEntries[e.getButton()].setBoolean(true);

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            mouseEntries[e.getButton()].setBoolean(false);
            
        }


        @Override
        public void mouseMoved(MouseEvent e) {
            updatePos(e);
            
        }

        private void updatePos(MouseEvent e) {
            mouseX = e.getX();
            mouseY = e.getY();

            mouseEntries[MX_].setNumber(mouseX);
            mouseEntries[MY_].setNumber(mouseY);

        }

        public int getRawX() {
            return mouseX;
        }

        public int getRawY() {
            return mouseY;
        }

    }
}
