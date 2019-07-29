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
public class Citation {

    private boolean ticket;
    private double ticketcost;

    public boolean getTicket() {
        return ticket;
    }

    public double getTicketCost() {
        return ticketcost;
    }

    public void calculateCitation(Speed speed) {
        if ((speed.getMph() <= 90) && (speed.getMph() >= 80)) {

            ticket = true;
            ticketcost = 100;
            System.out.println("This ticket will cost $" + ticketcost + ".");
        } else if ((speed.getMph() >= 90) && (speed.getMph() <= 100)) {
            ticket = true;
            ticketcost = 200;
            System.out.println("This ticket will cost $" + ticketcost + ".");
        } else if ((speed.getMph() >= 100) && (speed.getMph() <= 10000)) {
            ticket = true;
            ticketcost = 300;
            System.out.println("This ticket will cost $" + ticketcost + ".");

        } else {
            ticket = false;
            ticketcost = 0;
            System.out.println("You don't need a ticket so you have to pay $" + ticketcost + ". Nice!");
        }

    }
}
