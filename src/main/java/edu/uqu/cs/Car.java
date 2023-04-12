package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Car{

    /************ Part 1 **************/
    /**
     * Decalre all instance variables 
     * model of type String
     * inOutGarage of type boolean
     * Make sure they are all private
     * Syntax:
     * private dataType name;
     *
     */

    /************ Part 2 **************/
    /**
     * Define a default constructor and set 
     * all instance variables to their default values
     * model ="";
     * inOutGarage =false;
     * Syntax:
     * public className (){
     *      //body
     * }
     */

    /************ Part 3 **************/
    /**
     * Define all getter methods below
     * for each instance variable
     * Syntax:
     * public dataType getInstanceVariableName (){
     *      return this.InstanceVariableName;
     * }
     */


    /************ Part 4 **************/
    /**
     * Define all setter methods below
     * for each instance variable
     * public void setInstanceVariableName (parameter){
     *      this.InstanceVariableName= parameter;
     * }
     *
     */


    /************ Part 5 **************/
    /**
     * Implement the following two methods
     * moveCarOut() to set the inOutGarage flag to false;
     * moveCarIn() to set the inOutGarage flag to true;
     *
     */
     private String model;
    private boolean inOutGarage;

     public Car(){
     model="";
     inOutGarage=false;
    }

     public String getModel() {
        return this.model;
    }
    public boolean getInOutGarage() {
        return this.inOutGarage;
    }

     public void setModel(String model) {
        this.model = model;
    }
    public void setInOutGarage(boolean inOutGarage) {
        this.inOutGarage = inOutGarage;
    }

     public void moveCarOut(){
       this.inOutGarage=false; 
       
    }
    
    public void moveCarIn(){
        this.inOutGarage=true;
    }




}