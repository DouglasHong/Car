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
public class Car3 {

    Speed speed;

    public Car3(Speed speed) {

        this.speed = speed;
    }

    public void inclementSpeed(int s1) {

        speed.setMph(speed.getMph() + s1);

    }

    public void decreaseSpeed(int s2) {
        speed.setMph(speed.getMph() - s2);
    }

    public void multiplySpeed(int s4) {
        inclementSpeed(s4);
        speed.setMph(speed.getMph() * s4);
    }

    public void divideSpeed(int s5) {
        decreaseSpeed(s5);
        speed.setMph(speed.getMph() / s5);
    }

    public int currentSpeed() {
        return speed.getMph();
    }

    public Citation calculateCitation() {
        Citation citation = new Citation();
        citation.calculateCitation(speed);
        return citation;
    }
}
