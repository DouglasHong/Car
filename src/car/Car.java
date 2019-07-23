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
public class Car {

    private String manufacturer;
    private Year[] years;
    private Model[] models;

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the years
     */
    public Year[] getYears() {
        return years;
    }

    /**
     * @param years the years to set
     */
    public void setYears(Year[] years) {
        this.years = years;
    }

    /**
     * @return the models
     */
    public Model[] getModels() {
        return models;
    }

    /**
     * @param models the models to set
     */
    public void setModels(Model[] models) {
        this.models = models;
    }
}
