// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package DesktopClient;

import static DesktopClient.DesktopClient.*;

import static java.awt.event.MouseEvent.*;

import static DesktopClient.Mouse.Buttons.*;

import java.awt.event.*;

/** Add your docs here. */
public class Mouse 
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

    // public int getConvX() {

    // }

    // public int getConvY() {

    // }
}
