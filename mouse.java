import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class experiment9 extends Frame implements MouseListener,MouseMotionListener
{
    private int x;
    private int y;
    private String s="hello";
    experiment9()
    {
        addMouseListener(this);
        addMouseMotionListener(this);

    }
    public void mousePressed(MouseEvent me)
    {
        x=200;
        y=200;
        s="mouse pressed";
        repaint();

    }
    public void mouseMoved(MouseEvent me)
    {
        x=200;
        y=200;
        s="mouse Moved";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        x=200;
        y=200;
        s="mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        x=200;
        y=200;
        s="mouse Exited";
        repaint();
    }
    public void mouseClicked(MouseEvent me)
    {
        x=200;
        y=200;
        s="mouse Clicked";
        repaint();
        System.exit(0);
    }
    public void mouseDragged(MouseEvent me)
    {
        x=200;
        y=200;
        s="mouse Dragged";
        repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        x=200;
        y=200;
        s="mouse Released";
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(s,x,y);
    }
    public static void main(String args[])
    {
        experiment9 x=new experiment9();
//        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setSize(500,500);
        x.setVisible(true);

    }
}
