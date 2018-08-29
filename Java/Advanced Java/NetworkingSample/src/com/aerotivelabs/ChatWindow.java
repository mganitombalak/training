package com.aerotivelabs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {

    public ChatWindow() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setTitle("YKB Chat");

        JMenuBar menuBar = new JMenuBar();
        JMenu connectionMenu = new JMenu("Connection");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(connectionMenu);
        menuBar.add(helpMenu);

        JMenuItem connectMenuItem = new JMenuItem("Connect");
        JMenuItem disConnectMenuItem = new JMenuItem("DisConnect");

        connectionMenu.add(connectMenuItem);
        connectionMenu.add(disConnectMenuItem);

        JMenuItem aboutMenuItem = new JMenuItem("About");
        helpMenu.add(aboutMenuItem);

        JPanel panel = new JPanel();

        JLabel enterMessageLabel = new JLabel("Enter your message:");
        JTextField messageTextField = new JTextField(15);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Helloooo");
            }
        });

        JButton resetButton = new JButton("Reset");

        panel.add(enterMessageLabel);
        panel.add(messageTextField);
        panel.add(sendButton);
        panel.add(resetButton);

        JTextArea textArea = new JTextArea();

        this.getContentPane().add(BorderLayout.NORTH,menuBar);
        this.getContentPane().add(BorderLayout.CENTER,textArea);
        this.getContentPane().add(BorderLayout.SOUTH,panel);

        this.setLocation(200,200);
        this.setVisible(true);

    }
}
