package com.ui.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Customer extends JPanel implements ActionListener {


    public Customer() {
        initComponents();
    }
    private void initComponents() {
        JLabel label = new JLabel();
        setBackground(new Color(242, 242, 242));

        label.setFont(new Font("sansserif", 0, 36)); // NOI18N
        label.setForeground(new java.awt.Color(106, 106, 106));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText("고객정보.ErpCrud 클래스 리펙토링 필요.");

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
