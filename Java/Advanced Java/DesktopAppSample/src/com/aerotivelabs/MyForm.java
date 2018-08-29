package com.aerotivelabs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame {

    public MyForm() throws HeadlessException {
        this.setSize(600, 400);
        this.setTitle("YKB Chat Window");

        JMenuBar menuBar = new JMenuBar();
        JMenu connectionMenu = new JMenu("Connection");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem connectMenuItem = new JMenuItem("Connect");
        JMenuItem disConnectMenuItem = new JMenuItem("Disconnect");

        connectionMenu.add(connectMenuItem);
        connectionMenu.add(disConnectMenuItem);

        menuBar.add(connectionMenu);
        menuBar.add(helpMenu);

        JPanel panel = new JPanel();

        JLabel enterMessageLabel = new JLabel("Enter your message");
        JTextField messageTextField = new JTextField(15);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Helooooowwwwww");
            }
        });
        JButton resetButtion = new JButton("Reset");

        panel.add(enterMessageLabel);
        panel.add(messageTextField);
        panel.add(sendButton);
        panel.add(resetButtion);
        JTextArea summary = new JTextArea();

        this.getContentPane().add(BorderLayout.PAGE_START, menuBar);
        this.getContentPane().add(BorderLayout.CENTER, summary);
        this.getContentPane().add(BorderLayout.PAGE_END, panel);
        this.setLocation(200, 200);
        this.setVisible(true);
    }
}