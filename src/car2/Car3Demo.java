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
        System.out.println(mySpeed);

        car3.inclementSpeed(10);
        mySpeed = car3.currentSpeed();
        System.out.println(mySpeed);

        car3.decreaseSpeed(9);
        mySpeed = car3.currentSpeed();
        System.out.println(mySpeed);
        calculateCitations(car3);
        car3.multiplySpeed(12);
        mySpeed = car3.currentSpeed();
        System.out.println(mySpeed);

        car3.divideSpeed(15);
        mySpeed = car3.currentSpeed();
        System.out.println(mySpeed);

    }

    private static void calculateCitations(Car3 car3) {
        Citation citations = car3.calculateCitation();
        if (citations.getTicket() == true) {
            System.out.println("This ticket cost " + citations.getTicketCost());
        } else {
            System.out.println("No ticket. You're a good driver");
        }
    }
}
