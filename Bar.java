/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highschooldrama;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 805619
 */
public class Bar {
    private int height;
    private int width;
    public int x;
    public int y;
    private Image img;
    private ImageIcon ii;
    
     public Bar (int cWidth, int cHeight) {
        x = 400;
        y = 550;
        this.height = 249;
        this.width = 640;
        this. ii = new ImageIcon(getClass().getResource("bar.png"));
        this.img = ii.getImage();
     }
     
     public void draw(Graphics g) {
           g.drawImage(img, this.x, this.y, this.width, this.height, null);
       }
}

