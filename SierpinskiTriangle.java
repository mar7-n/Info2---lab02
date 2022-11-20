package LAB02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SierpinskiTriangle {
	public static int SIZE = 1000;

	JFrame frame;
	JPanel panel;

	@SuppressWarnings("serial")
	public void display() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				paintSierpinskiTriangle(g, getSize());
			}
		};
		panel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				panel.repaint();
			}
		});
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setSize(SIZE, SIZE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SierpinskiTriangle triangle = new SierpinskiTriangle();
		triangle.display();
	}

	public void paintSierpinskiTriangle(Graphics g, Dimension size) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setBackground(Color.white);
		g2.clearRect(0, 0, size.width, size.height);
		g2.draw3DRect(20, 20, size.width - 40, size.height - 40, true);
		int [] x={(size.width)/2,20, size.width-20};
		int [] y={20, size.height-20, size.height-20};
		recursion(g2,x,y,size);
	}
	public void recursion(Graphics2D g2, int[] x, int [] y,Dimension size)
	{
		g2.drawPolygon(x,y,3);
		int [] newX={((x[0]+x[1])/2),(x[1]+x[2])/2,(x[2]+x[0])/2};
		int [] newY={(y[0]+y[1])/2,(y[1]+y[2])/2,(y[2]+y[0])/2};
		g2.drawPolygon(newX,newY,3);
		if(Math.abs(newX[0]-newX[1])>7)//coordinates between two points  х
		{
			recursion(g2,new int[]{x[0], newX[0], newX[2]},new int []{y[0],newY[0],newY[2]},size);
			recursion(g2,new int[]{newX[0], x[1], newX[1]},new int []{newY[0],y[1],newY[1]},size);
			recursion(g2,new int[]{newX[2], newX[1], x[2]},new int []{newY[2],newY[1],y[2]},size);

		}

	}

}
