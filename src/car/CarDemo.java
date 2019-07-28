/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Douglas
 */
public class CarDemo {

    public static void main(String A[]) {
        Car[] cars = createcars();
        printCars(cars);
    }

    public static void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {

            Year[] years = cars[i].getYears();

            Model[] models = cars[i].getModels();

            System.out.println("This car's manufacturer is " + cars[i].getManufacturer());
            System.out.println("And was made in the year(s): ");
            for (int y = 0; y < years.length; y++) {
                System.out.println(years[y].getYear());
            }
            System.out.println("The model name(s) is(are): ");
            for (int m = 0; m < models.length; m++) {
                System.out.println(models[m].getType());
            }
        }
    }

    public static Car[] createcars() {
        Car[] cars = new Car[5];

        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();

            car.setManufacturer("Toyota" + i);
            Year[] years = new Year[3];
            for (int c = 2000; c < years.length + 2000; c++) {
                Year year = new Year();
                year.setYear(c);

                years[c - 2000] = year;
            }
            Model[] models = new Model[4];
            for (int m = 0; m < models.length; m++) {
                Model model = new Model();
                model.setType("Camry" + m);
                models[m] = model;
            }

            car.setYears(years);
            car.setModels(models);
            cars[i] = car;

        }

        return cars;
    }
}
