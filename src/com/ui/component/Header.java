package com.ui.component;

import com.ui.swing.SearchText;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Objects;

public class Header extends JPanel {

    public Header() {
        initComponents();
        setOpaque(false);
    }

    private void initComponents() {

        label1 = new JLabel();
        searchText1 = new SearchText();
        label2 = new JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        label1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/com/ui/icon/search.png")))); // NOI18N

        label2.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/com/ui/icon/menu.png")))); // NOI18N
        label2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchText1, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchText1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    private JLabel label1;
    private JLabel label2;
    private SearchText searchText1;
}
