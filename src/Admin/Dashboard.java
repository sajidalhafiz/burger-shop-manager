package Admin;

import Authenticatio.LoginMenu;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard(){
        setSize(816,538);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel background = new JLabel();
        background.setBounds(0,0,800,500);
        ImageIcon backImg = new ImageIcon("Images/Admin/Dashboard/background.png");
        background.setIcon(backImg);
        add(background);


        JButton earningsBtn = new JButton();
        earningsBtn.setBounds(45,110,170,110);
        earningsBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        earningsBtn.setBorder(null);
        ImageIcon earningsBtnIcon = new ImageIcon("Images/Admin/Dashboard/earningsBtn.png");
        earningsBtn.setIcon(earningsBtnIcon);
        background.add(earningsBtn);

        JButton liveSellerBtn = new JButton();
        liveSellerBtn.setBounds(239,110,170,110);
        liveSellerBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        liveSellerBtn.setBorder(null);
        ImageIcon liveSellerBtnIcon = new ImageIcon("Images/Admin/Dashboard/liveSellerBtn.png");
        liveSellerBtn.setIcon(liveSellerBtnIcon);
        background.add(liveSellerBtn);

        JButton buyerListBtn = new JButton();
        buyerListBtn.setBounds(433,110,170,110);
        buyerListBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buyerListBtn.setBorder(null);
        ImageIcon buyerListBtnIcon = new ImageIcon("Images/Admin/Dashboard/buyerListBtn.png");
        buyerListBtn.setIcon(buyerListBtnIcon);
        background.add(buyerListBtn);

        JButton approveSellerBtn = new JButton();
        approveSellerBtn.setBounds(142,266,170,110);
        approveSellerBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        approveSellerBtn.setBorder(null);
        ImageIcon approveSellerBtnIcon = new ImageIcon("Images/Admin/Dashboard/approveSellerBtn.png");
        approveSellerBtn.setIcon(approveSellerBtnIcon);
        background.add(approveSellerBtn);

        JButton removeSellerBtn = new JButton();
        removeSellerBtn.setBounds(336,266,170,110);
        removeSellerBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        removeSellerBtn.setBorder(null);
        ImageIcon removeSellerBtnIcon = new ImageIcon("Images/Admin/Dashboard/removeSellerBtn.png");
        removeSellerBtn.setIcon(removeSellerBtnIcon);
        background.add(removeSellerBtn);



        JButton logoutBtn = new JButton();
        logoutBtn.setBounds(667,430,115,50);
        logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon logoutIcon = new ImageIcon("Images/Buyer/Order Confirm/logoutBtn.png");
        logoutBtn.setIcon(logoutIcon);
        background.add(logoutBtn);

        logoutBtn.addActionListener( e -> {
            dispose();
            new LoginMenu();
        });

        earningsBtn.addActionListener(e -> {
            dispose();
            new Earnings();
        });
        liveSellerBtn.addActionListener(e -> {
            dispose();
            new LiveSeller();
        });
        buyerListBtn.addActionListener(e -> {
            dispose();
            new BuyerList();
        });
        approveSellerBtn.addActionListener(e -> {
            dispose();
            new ApproveSeller();
        });
        removeSellerBtn.addActionListener( e -> {
            dispose();
            new RemoveSeller();
        });


        setVisible(true);
    }
}
