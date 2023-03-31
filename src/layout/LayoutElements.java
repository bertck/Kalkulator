package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class LayoutElements {

    public LayoutElements() {
    }

    public JLabel getLabel(String value, Color textColor, Color bgColor, int txtAlign, int size, float w, float h) {
        JLabel label = new JLabel(value, txtAlign);
        
        label.setSize((int) w, (int) h);
        label.setFont(new Font("Baskerville", Font.PLAIN, size));
        label.setBackground(bgColor);
        label.setForeground(textColor);

        return label;
    }

    public Button getButton(String value) {
        return null;
    }

    
}
