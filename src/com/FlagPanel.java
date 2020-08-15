package com;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.swing.*;

public class FlagPanel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.decode("#FF8F1C"));
		g.drawRect(10, 10, 400, 70);
		g.fillRect(10, 10, 400, 70);
		
		g.setColor(Color.white);
		g.drawRect(10, 80, 400, 70);
		g.fillRect(10, 80, 400, 70);
		
		g.setColor(Color.decode("#509E2F"));
		g.drawRect(10, 150, 400, 70);
		g.fillRect(10, 150, 400, 70);
		
		g.setColor(Color.black);
		g.fillRect(10, 10, 5, 540);
		
		try {
			
			Image img = ImageIO.read(new FileInputStream("src/a.jfif"));
			
			g.drawImage(img, 165, 80, 70, 70, null);
			
			g.setFont(new Font("Lato", Font.BOLD, 30));
			g.setColor(Color.BLUE);
			g.drawString("Happy Independence Day", 25, 400);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
