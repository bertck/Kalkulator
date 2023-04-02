package layout;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LayoutElements {

    public JLabel getLabel(String value, Color textColor, Color bgColor, int txtAlign, int fontSize, int w, int h) {
        JLabel label = new JLabel(value, txtAlign);
        
        label.setSize(w, h);
        label.setFont(new Font("Baskerville", Font.PLAIN, fontSize));
        label.setBackground(bgColor);
        label.setForeground(textColor);
        label.setVerticalAlignment(SwingConstants.CENTER);

        return label;
    }

    public JButton getButton(String value, Color textColor, Color bgColor, int fontSize, int sideSize) {
        JButton button = new JButton(value);
        
        button.setBackground(bgColor);
        button.setForeground(textColor);
        button.setFont(new Font("Baskerville", Font.PLAIN, fontSize));

        button.setSize(sideSize, sideSize);

        return button;
    }

    
}
