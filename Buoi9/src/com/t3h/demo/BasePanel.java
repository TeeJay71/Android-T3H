package com.t3h.demo;

import javax.swing.*;
import java.awt.*;

public abstract class BasePanel extends JPanel {
    public BasePanel() {
        setBackground(Color.white);
        setLayout(null);
        initComponents();
    }

    protected abstract void initComponents();
}
