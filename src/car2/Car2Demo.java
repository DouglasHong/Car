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
public class Car2Demo {

    public static void main(String A[]) {
        Car2 car2 = new Car2(5);

        int mySpeed = car2.currentSpeed();
        System.out.println(mySpeed);

        car2.inclementSpeed(10);
        mySpeed = car2.currentSpeed();
        System.out.println(mySpeed);

        car2.decreaseSpeed(9);
        mySpeed = car2.currentSpeed();
        System.out.println(mySpeed);

        car2.multiplySpeed(12);
        mySpeed = car2.currentSpeed();
        System.out.println(mySpeed);

        car2.divideSpeed(15);
        mySpeed = car2.currentSpeed();
        System.out.println(mySpeed);

    }

}
