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
public class Car3Demo {

    public static void main(String A[]) {
        Speed speed = new Speed(5);
        Car3 car3 = new Car3(speed);
        int mySpeed = car3.currentSpeed();
        System.out.println("Speed: " + mySpeed);

        car3.inclementSpeed(10);
        mySpeed = car3.currentSpeed();
        System.out.println("Speed: " + mySpeed);

        car3.decreaseSpeed(9);
        mySpeed = car3.currentSpeed();
        System.out.println("Speed: " + mySpeed);
        calculateCitations(car3);
        
        car3.multiplySpeed(12);
        mySpeed = car3.currentSpeed();
        System.out.println("Speed: " + mySpeed);

        car3.divideSpeed(15);
        mySpeed = car3.currentSpeed();
        System.out.println("Speed: " + mySpeed);
        calculateCitations(car3);
        
        car3.inclementSpeed(120);
        mySpeed = car3.currentSpeed();
        System.out.println("Speed: " + mySpeed);
        calculateCitations(car3);
        
        car3.inclementSpeed(120);
        mySpeed = car3.currentSpeed();
        System.out.println("Speed: " + mySpeed);
        calculateCitations(car3);

    }

    private static void calculateCitations(Car3 car3) {
        Citation citations = car3.calculateCitation();
        if (citations.getTicket() == true) {
            System.out.println("Sorry, but you have to go back to driving school.");
        } else {
            System.out.println("No ticket bill. You're a good driver.");
        }
    }
}
