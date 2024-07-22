package com.ui.form;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class Product extends JPanel {
    public Product() {
        initComponents();
    }


    private void initComponents() {

        JLabel label = new JLabel();

        setBackground(new Color(242, 242, 242));
        label.setFont(new Font("sansserif", 0, 36)); // NOI18N
        label.setForeground(new Color(106, 106, 106));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText("상품");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );
    }
}
