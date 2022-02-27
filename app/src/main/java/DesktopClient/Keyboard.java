// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package DesktopClient;

import static DesktopClient.Keyboard.Keys.*;
import static DesktopClient.Constants.Keyboard.*;
import static java.awt.event.KeyEvent.*;

import edu.wpi.first.networktables.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/** Add your docs here. */
public class Keyboard 
    implements KeyListener{

    public class Keys {
        public static final int firstKeyOffSet = VK_SEMICOLON;

        public static final int SC_ = VK_SEMICOLON - firstKeyOffSet;
        public static final int EQ_ = VK_EQUALS - firstKeyOffSet;

        public static final int A_ = VK_A - firstKeyOffSet;
        public static final int B_ = VK_B - firstKeyOffSet;
        public static final int C_ = VK_C - firstKeyOffSet;
        public static final int D_ = VK_D - firstKeyOffSet;
        public static final int E_ = VK_E - firstKeyOffSet;
        public static final int F_ = VK_F - firstKeyOffSet;
        public static final int G_ = VK_G - firstKeyOffSet;
        public static final int H_ = VK_H - firstKeyOffSet;
        public static final int I_ = VK_I - firstKeyOffSet;
        public static final int J_ = VK_J - firstKeyOffSet;
        public static final int K_ = VK_K - firstKeyOffSet;
        public static final int L_ = VK_L - firstKeyOffSet;
        public static final int M_ = VK_M - firstKeyOffSet;
        public static final int N_ = VK_N - firstKeyOffSet;
        public static final int O_ = VK_O - firstKeyOffSet;
        public static final int P_ = VK_P - firstKeyOffSet;
        public static final int Q_ = VK_Q - firstKeyOffSet;
        public static final int R_ = VK_R - firstKeyOffSet;
        public static final int S_ = VK_S - firstKeyOffSet;
        public static final int T_ = VK_T - firstKeyOffSet;
        public static final int U_ = VK_U - firstKeyOffSet;
        public static final int V_ = VK_V - firstKeyOffSet;
        public static final int W_ = VK_W - firstKeyOffSet;
        public static final int X_ = VK_X - firstKeyOffSet;
        public static final int Y_ = VK_Y - firstKeyOffSet;
        public static final int Z_ = VK_Z - firstKeyOffSet;

    }

    public static NetworkTableInstance inst;
    public static NetworkTable table;
    public static NetworkTableEntry keysEntries[];

    public Keyboard() {
        configurateNetworkTable();

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keysEntries[e.getKeyCode() - firstKeyOffSet].setBoolean(true);
        System.out.println(e.getKeyChar() + " pressed");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        keysEntries[e.getKeyCode() - firstKeyOffSet].setBoolean(false);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
        
    }

    private static void configurateNetworkTable() {
        inst = NetworkTableInstance.getDefault();
        table = inst.getTable("keyboard");
        keysEntries = new NetworkTableEntry[KEY_AMOUNT];
        
        keysEntries[SC_] = table.getEntry(";");
        keysEntries[EQ_] = table.getEntry("equal");
        keysEntries[A_] = table.getEntry("a");
        keysEntries[B_] = table.getEntry("b");
        keysEntries[C_] = table.getEntry("c");
        keysEntries[D_] = table.getEntry("d");
        keysEntries[E_] = table.getEntry("e");
        keysEntries[F_] = table.getEntry("f");
        keysEntries[G_] = table.getEntry("g");
        keysEntries[H_] = table.getEntry("h");
        keysEntries[I_] = table.getEntry("i");
        keysEntries[J_] = table.getEntry("j");
        keysEntries[K_] = table.getEntry("k");
        keysEntries[L_] = table.getEntry("l");
        keysEntries[M_] = table.getEntry("m");
        keysEntries[N_] = table.getEntry("n");
        keysEntries[O_] = table.getEntry("o");
        keysEntries[P_] = table.getEntry("p");
        keysEntries[Q_] = table.getEntry("q");
        keysEntries[R_] = table.getEntry("r");
        keysEntries[S_] = table.getEntry("s");
        keysEntries[T_] = table.getEntry("t");
        keysEntries[U_] = table.getEntry("u");
        keysEntries[V_] = table.getEntry("v");
        keysEntries[W_] = table.getEntry("w");
        keysEntries[X_] = table.getEntry("x");
        keysEntries[Y_] = table.getEntry("y");
        keysEntries[Z_] = table.getEntry("z");

        inst.startClientTeam(2557);
        inst.startDSClient();

    }

}
