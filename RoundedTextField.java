/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentenrollmentsystem;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class RoundedTextField extends JTextField {

    private int radius = 20;

    public RoundedTextField() {
        super();
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    }

    public RoundedTextField(int size) {
        super(size);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(Color.WHITE);
        // Inset by 1 pixel to prevent the smooth edges from clipping
        g2.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, radius, radius);

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // Add the anti-aliasing hint here too so the border stroke is smooth!
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(Color.GRAY);
        // Inset by 1 pixel, and shrink width/height a bit more for the border stroke
        g2.drawRoundRect(1, 1, getWidth() - 3, getHeight() - 3, radius, radius);
    }

}
