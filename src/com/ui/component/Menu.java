package com.ui.component;

import com.ui.event.EventMenuSelected;
import com.ui.model.Model_Menu;
import com.ui.swing.ListMenu;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Objects;
import javax.swing.*;

public class Menu extends JPanel {

    private EventMenuSelected event;

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }

    private void init() {
        listMenu1.addItem(new Model_Menu("1", "매출 현황", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("2", "책 검색", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("3", "책 주문", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("4", "고객정보", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("5", "X", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));

        listMenu1.addItem(new Model_Menu("", "관리자", Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("6", "My page", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("7", "X", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("1", "X", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("9", "X", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("10", "X", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    }

    private void initComponents() {

        panelMoving = new JPanel();
        JLabel jLabel1 = new JLabel();
        listMenu1 = new ListMenu<>();

        panelMoving.setOpaque(false);

        jLabel1.setFont(new Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/com/ui/icon/logo.png")))); // NOI18N
        jLabel1.setText("Application");

        GroupLayout panelMovingLayout = new GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
                panelMovingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelMovingLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
                panelMovingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelMoving, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listMenu1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelMoving, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(listMenu1, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
        );
    }
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    private ListMenu<String> listMenu1;
    private JPanel panelMoving;
}
