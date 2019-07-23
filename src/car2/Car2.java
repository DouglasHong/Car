/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car2;

/**
 *
 * @author Douglas
 */
public class Car2 {

    int speed;

    public Car2(int s) {
        speed = s;
    }

    public void inclementSpeed(int s1) {
        speed = speed + s1;

    }

    public void decreaseSpeed(int s2) {
        speed = speed - s2;
    }

    public void multiplySpeed(int s4) {
        inclementSpeed(s4);
        speed = speed * s4;
    }

    public void divideSpeed(int s5) {
        decreaseSpeed(s5);
        speed = speed / s5;
    }

    public int currentSpeed() {
        return speed;
    }
}
