// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package DesktopClient;

import static DesktopClient.DesktopClient.*;

import static DesktopClient.Constants.Keyboard.*;
import static DesktopClient.Keyboard.Keys.*;
import static java.awt.event.KeyEvent.*;

import java.awt.event.*;

/** Add your docs here. */
public class Keyboard 
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

        // Symbols
        public static final int MN_ = VK_MINUS - FIRST_KEY_OFFSET;
        public static final int EQ_ = VK_EQUALS - FIRST_KEY_OFFSET; 
        public static final int LB_ = VK_BRACELEFT - FIRST_KEY_OFFSET;
        public static final int RB_ = VK_BRACERIGHT - FIRST_KEY_OFFSET;
        public static final int BS_ = VK_BACK_SLASH - FIRST_KEY_OFFSET;
        public static final int SC_ = VK_SEMICOLON - FIRST_KEY_OFFSET;
        public static final int QU_ = VK_QUOTE - FIRST_KEY_OFFSET;
        public static final int CM_ = VK_COMMA - FIRST_KEY_OFFSET;
        public static final int PR_ = VK_PERIOD - FIRST_KEY_OFFSET;
        public static final int SL_ = VK_SLASH - FIRST_KEY_OFFSET;
        public static final int SP_ = VK_SPACE - FIRST_KEY_OFFSET;

        // Mods
        public static final int EC_ = VK_ESCAPE - FIRST_KEY_OFFSET;
        public static final int DL_ = VK_DELETE - FIRST_KEY_OFFSET;
        public static final int BP_ = VK_BACK_SPACE - FIRST_KEY_OFFSET;
        public static final int TB_ = VK_TAB - FIRST_KEY_OFFSET;
        public static final int EN_ = VK_ENTER - FIRST_KEY_OFFSET;
        public static final int SH_ = VK_SHIFT - FIRST_KEY_OFFSET;
        public static final int CT_ = VK_CONTROL - FIRST_KEY_OFFSET;
        public static final int AT_ = VK_ALT - FIRST_KEY_OFFSET;

        // Function
        public static final int F1_ = VK_F1 - FIRST_KEY_OFFSET;
        public static final int F2_ = VK_F2 - FIRST_KEY_OFFSET;
        public static final int F3_ = VK_F3 - FIRST_KEY_OFFSET;
        public static final int F4_ = VK_F4 - FIRST_KEY_OFFSET;
        public static final int F5_ = VK_F5 - FIRST_KEY_OFFSET;
        public static final int F6_ = VK_F6 - FIRST_KEY_OFFSET;
        public static final int F7_ = VK_F7 - FIRST_KEY_OFFSET;
        public static final int F8_ = VK_F8 - FIRST_KEY_OFFSET;
        public static final int F9_ = VK_F9 - FIRST_KEY_OFFSET;
        public static final int F10_ = VK_F10 - FIRST_KEY_OFFSET;
        public static final int F11_ = VK_F11 - FIRST_KEY_OFFSET;
        public static final int F12_ = VK_F12 - FIRST_KEY_OFFSET;
        // public static final int F13_ = VK_F13 - FIRST_KEY_OFFSET; Note makes keysEntries[] to large
        // public static final int F14_ = VK_F14 - FIRST_KEY_OFFSET;
        // public static final int F15_ = VK_F15 - FIRST_KEY_OFFSET;
        // public static final int F16_ = VK_F16 - FIRST_KEY_OFFSET;
        // public static final int F17_ = VK_F17 - FIRST_KEY_OFFSET;
        // public static final int F18_ = VK_F18 - FIRST_KEY_OFFSET;
        // public static final int F19_ = VK_F19 - FIRST_KEY_OFFSET;
        // public static final int F20_ = VK_F20 - FIRST_KEY_OFFSET;
        // public static final int F21_ = VK_F21 - FIRST_KEY_OFFSET;
        // public static final int F22_ = VK_F22 - FIRST_KEY_OFFSET;
        // public static final int F23_ = VK_F23 - FIRST_KEY_OFFSET;
        // public static final int F24_ = VK_F24 - FIRST_KEY_OFFSET;

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
