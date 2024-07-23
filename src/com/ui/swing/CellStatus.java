package com.ui.swing;

import com.ui.model.StatusType;

import javax.swing.*;

public class CellStatus extends JPanel {

    public CellStatus(StatusType type) {
        initComponents();
        status.setType(type);
    }


    private void initComponents() {

        status = new com.ui.swing.TableStatus();

        setBackground(new java.awt.Color(255, 255, 255));

        status.setHorizontalAlignment(SwingConstants.CENTER);
        status.setText("tableStatus1");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(status, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(status, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
    }

    private TableStatus status;
}
