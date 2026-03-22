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
public class RoundedButton extends JButton {

    private int radius = 20;

    public RoundedButton() {
        super();
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);
    }

    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        // Inset by 1 pixel to prevent the smooth edges from clipping
        g2.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, radius, radius);

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getForeground()); // Or whatever color you want your border
        // Inset by 1 pixel, and shrink width/height a bit more for the border stroke
        g2.drawRoundRect(1, 1, getWidth() - 3, getHeight() - 3, radius, radius);
    }
}
