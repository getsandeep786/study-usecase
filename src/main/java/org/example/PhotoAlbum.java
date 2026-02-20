package org.example;
import java.awt.Graphics;
        import java.awt.*;
        import java.applet.*;
        import java.applet.Applet;
        import java.awt.event.*;
        import java.awt.image.*;

public class PhotoAlbum extends Applet implements ActionListener
{

// declare all the components

    Button
            previous = new Button("Previous"),
            first = new Button("First"),
            last = new Button("Last"),
            next = new Button("Next");

    Canvas
            imageCanvas = new Canvas();

    final int total = 6;			// total # of images
    int i = 0;						// this is value of currently displayed image

    Image Pictures[] = new Image[total];


    public void init() {

        makeGui();

        // get all the images

        for (int p=0; p < total; p++) {
            Pictures[p] = getImage(getCodeBase(),+p+".JPG");
            prepareImage(Pictures[p], this);
        }

    } // init

    private void displayImage(int n) {
        // Display the nth image on the canvas
        Graphics g = imageCanvas.getGraphics();
        g.clearRect(10, 10, 700, 700);
        g.drawImage(Pictures[n], 30, 10, this);
        g.drawString("Image: "+(n+1)+"/"+total, 30, 500);
    } // displayImage

    public void drawFirst(){

        displayImage(0);

    } // drawFirst

    public void drawLast(){

        displayImage(total-1);

    } // drawLast

    public void drawPrevious(){

        i = i - 1;
        if (i <= -1){
            i = total-1;
        }
        displayImage(i);
    } // drawPrevious

    public void drawNext(){

        i = i + 1;
        if (i == total){
            i = 0;
        }

        displayImage(i);
    } // drawNext

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == previous)
            drawPrevious();
        else if (e.getSource() == first)
            drawFirst();
        else if (e.getSource() == last)
            drawLast();
        else if (e.getSource() == next)
            drawNext();
    } // actionPerformed

    public void paint(Graphics g) {
        drawFirst();
        i = 0;
    }

    private void makeGui() {

        setBackground(Color.pink);
        setForeground(Color.black);
        setLayout(new BorderLayout());

        Panel p1 = new Panel();

        p1.add(previous);
        p1.add(first);

        p1.add(next);
        p1.add(last);

        add(BorderLayout.NORTH, p1);
        add(BorderLayout.CENTER, imageCanvas);

        previous.addActionListener(this);
        first.addActionListener(this);
        last.addActionListener(this);
        next.addActionListener(this);

    } // makeGui
} // PhotoAlbum
/*
<applet code="PhotoAlbum.class" height=500 width=10000>
</applet>
*/