package com.desarrollos.entde;

import java.util.Arrays;
import java.awt.Color;
/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */
public class Car
{
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels                           
    
    Garage theGarage=null;

    
    /**
     * Constructor of a car specifying the garage object
     */
    public Car (Garage g){
    	theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
    	//He añadido car. delante de los metodos en los que faltaba.
        car.accelerate();
        car.slowDown();
        car.moveDown();
        car.accelerate();
        // A printGarage le he creado un metodo para que funcione.
        car.printGarage();
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

    private void printGarage() {
		// TODO Auto-generated method stub
		
	}
	/**
     * Accelerate the car
     * @throws InterruptedException 
     */
    public void accelerate() throws InterruptedException{
    	//Los Strings estaban escritos con la primera en minuscula y tiene que ser mayuscula
        String c = new String("*");
        String space = new String(" ");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
    /**
     * Slow down the car
     * @throws InterruptedException 
     */
    public void slowDown() throws InterruptedException{
    	//Los Strings estaban escritos con la primera en minuscula y tiene que ser mayuscula y 
    	//habia un parentesis de mas al final
    	String c = new String("     *");
    	//Habían puesto comas simples en el for en vez de punto y coma
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
    /**
     * Move the car downwards
     * @throws InterruptedException 
     */    
    public void moveDown() throws InterruptedException{
    	String c = new String("\t\t\t\t  *");
    	for(int i=0; i<5; i++)
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(1000);
        }
    }
    
}
