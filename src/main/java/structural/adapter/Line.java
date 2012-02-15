/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.adapter;

/**
 *
 * @author User
 */
public class Line implements Shape {
    private LegacyLine adaptee = new LegacyLine();
 
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}
