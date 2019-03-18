package com.dao;
import com.po.Ellipse;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class DrawEllipse {
	private BufferedImage image;
	
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	public DrawEllipse(){
		
	}
	public boolean isSubmit(Ellipse ellipse){
		if(ellipse.getSubmit()!=null)
			return true;
		else
			return false;
	}
	public void drawEllipse(Ellipse ellipse){
		if(this.isSubmit(ellipse)){
			int width=ellipse.getWidth();
			int height=ellipse.getHeight();
			image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
			Graphics g=image.getGraphics();
			g.setColor(Color.white);
			g.fillRect(0, 0, width, height);
			Graphics2D g_2d=(Graphics2D)g;
			Ellipse2D ellipse_2d=new Ellipse2D.Double(20,50,120,50);
			g_2d.setColor(Color.blue);
			AffineTransform trans=new AffineTransform();
			for(int i=1;i<=24;i++){
				trans.rotate(15.0*Math.PI/180,75,75);
				g_2d.setTransform(trans);
				g_2d.draw(ellipse_2d);
			}
			g.dispose();
		}
	}
}
