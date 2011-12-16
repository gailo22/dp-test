/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author User
 */
public class LegacyRectangle {
    public void draw(int x, int y, int w, int h) {
        System.out.println("rectangle at (" + x + ',' + y + ") with width " + w
          + " and height " + h);
    }
}
