/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponggame;

import java.awt.*;

import java.awt.event.*;



public class Paddle extends Rectangle
{



	int id;

	int yVelocity;

	int speed = 10;

	

	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){

		super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);

		this.id=id;

	}

	

	public void keyPressed(KeyEvent e) {

		switch(id) {

		case 1:

			if(e.getKeyCode()==KeyEvent.VK_Z) {

				setYDirection(-speed);

			}

			if(e.getKeyCode()==KeyEvent.VK_S) {

				setYDirection(speed);

			}

			break;

		case 2:

			if(e.getKeyCode()==KeyEvent.VK_UP) {

				setYDirection(-speed);

			}

			if(e.getKeyCode()==KeyEvent.VK_DOWN) {

				setYDirection(speed);

			}

			break;

		}

	}

	public void keyReleased(KeyEvent e) {

		switch(id) {

		case 1:

			if(e.getKeyCode()==KeyEvent.VK_Z) {

				setYDirection(0);

			}

			if(e.getKeyCode()==KeyEvent.VK_S) {

				setYDirection(0);

			}

			break;

		case 2:

			if(e.getKeyCode()==KeyEvent.VK_UP) {

				setYDirection(0);

			}

			if(e.getKeyCode()==KeyEvent.VK_DOWN) {

				setYDirection(0);

			}

			break;

		}

	}

	public void setYDirection(int yDirection) {

		yVelocity = yDirection;

	}

	public void move() {

		y= y + yVelocity;

	}

	public void draw(Graphics g) {

		if(id==1)

			g.setColor(Color.white);

		else

			g.setColor(Color.white);

		g.fillRect(x, y, width, height);

	}
}