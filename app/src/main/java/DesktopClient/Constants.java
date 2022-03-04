package DesktopClient;

import static DesktopClient.Keyboard.Keys.*;
import static java.awt.event.KeyEvent.*;
import java.awt.*;

import javax.swing.plaf.DimensionUIResource;


public class Constants {

    public static final class Keyboard {

        public static final int FIRST_KEY_OFFSET = VK_BACK_SPACE;
        public static final int KEY_AMOUNT = QU_;

    }

    public static final class Mouse {

        /**
         * X Position
         * Y Position
         * Mouse Button 1
         * Mouse Button 2
         * Mouse Button 3
         * Scroll wheel
         */
        public static final int ENTRY_AMOUNT = 8;

    }

    public static final class Window {

        public static final int FRAME_X = 75;
        public static final int FRAME_Y = 75;
        public static final int FRAME_WIDTH = 875;
        public static final int FRAME_LENGTH = 500;

        public static final Rectangle FRAME_RECTANGLE = 
            new Rectangle(
                FRAME_X, 
                FRAME_Y, 
                FRAME_WIDTH, 
                FRAME_LENGTH);

        public static final Dimension FRAME_DIMENSION =
            new DimensionUIResource(
                FRAME_WIDTH, 
                FRAME_LENGTH);
    }

}