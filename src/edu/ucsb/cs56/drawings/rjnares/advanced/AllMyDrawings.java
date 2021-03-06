package edu.ucsb.cs56.drawings.rjnares.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few rocks 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Rock r1 = new Rock(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(r1);
	
	// Make a black rock that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	g2.setColor(Color.BLACK); g2.draw(r2);
	
	// Here's a rock that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	r2 = ShapeTransforms.scaledCopyOfLL(r2,4,4);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(r2); 
	
	// Draw two pet rocks
	PetRock r_1 = new PetRock(50,350,40,75);
	PetRock r_2 = new PetRock(200,350,200,100);
	
	g2.draw(r_1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(r_2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A FEW ROCKS by Roberto J. Nares", 20,20);
    }
    
    
    /** Draw a picture with a few rocks and pet rocks
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some rocks.
	Rock large = new Rock(100,50,225,150);
	Rock small = new Rock(20,50,40,30);
	Rock tallSkinny = new Rock(20,150,20,40);
	Rock shortFat = new Rock(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Rock r1 = new Rock(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(r1);
	
	// Make a black rock that's half the size, 
	// and moved over 150 pixels in x direction
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	g2.setColor(Color.BLACK); g2.draw(r2);
	
	// Here's a rock that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	r2 = ShapeTransforms.scaledCopyOfLL(r2,4,4);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(r2); 

	// Draw two pet rocks 
	PetRock r_1 = new PetRock(50,350,40,75);
	PetRock r_2 = new PetRock(200,350,200,100);
	
	g2.draw(r_1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second rock 45 degrees around its center.
	Shape r_3 = ShapeTransforms.rotatedCopyOf(r_2, Math.PI/4.0);
	
	g2.draw(r_3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A BUNCH OF ROCKS AND A FEW PET ROCKS by Roberto J. Nares", 20,20);
    }
    
    /** Draw a different picture with a few rocks and more rocks
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing	
	g2.drawString("A COUPLE OF ROCKS by Roberto J. Nares", 20,20);
		
	// Draw some rocks
	Rock large = new Rock(100,50,225,150);
	Rock small = new Rock(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
    }       
}
