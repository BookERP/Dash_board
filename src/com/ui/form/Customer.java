package com.ui.form;

import com.ui.component.Card;
import com.ui.model.Model_Card;
import com.ui.swing.PanelBorder;
import com.ui.swing.Table;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Customer extends JPanel implements ActionListener {
    private Card c1;
    private Card c2;
    private Card c3;
    private JLabel label;
    private JLayeredPane panel;
    private PanelBorder panelBorder;
    private JScrollPane spTable;
    private Table table;

    public Customer() {
        initComponents();
        c1.setData(new Model_Card(new ImageIcon(Objects.requireNonNull(getClass().getResource("/com/ui/icon/stock.png"))), "Stock Total", "$200000", "Increased by 60%"));

    }
    private void initComponents() {
        panel = new JLayeredPane();
        c1 = new Card();
        c2 = new Card();
        c3 = new Card();
        panelBorder = new PanelBorder();
        label = new JLabel();
        spTable = new JScrollPane();
        table = new Table();



        setBackground(new Color(242, 242, 242));

        label.setFont(new Font("sansserif", 0, 36)); // NOI18N
        label.setForeground(new java.awt.Color(106, 106, 106));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText("고객정보.ErpCrud 클래스 리펙토링 필요.");
//        label.setUI(c1);
        c1.setData(new Model_Card(new ImageIcon(Objects.requireNonNull(getClass().getResource("/com/ui/icon/stock.png"))), "Stock Total", "$200000", "Increased by 60%"));

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
