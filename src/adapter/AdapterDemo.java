/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author User
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Line(), new Rectangle() };
        // A begin and end point from a graphical editor
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes)
          shape.draw(x1, y1, x2, y2);
    }
}
