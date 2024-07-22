package com.ui.form;

import javax.swing.*;
import java.awt.*;


public class Order extends JPanel {
    public Order() {
        initComponents();
    }
    private void initComponents() {

        JLabel label = new JLabel();

        setBackground(new Color(242, 242, 242));

        label.setFont(new Font("sansserif", 0, 36)); // NOI18N
        label.setForeground(new Color(106, 106, 106));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText("주문");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(125, 125, 125))
        );
    }

}
