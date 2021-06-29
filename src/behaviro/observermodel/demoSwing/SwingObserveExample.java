package behaviro.observermodel.demoSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author czy
 * @date 2021/6/29
 */
public class SwingObserveExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserveExample example = new SwingObserveExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("should i do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER,button);
    }

    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Don`t do it, you might regret it! ");
        }
    }
    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Come on, do it!");
        }
    }
}
