package main;
import java.util.InputMismatchException;

import controller.Controller;
import model.data_structures.noExisteObjetoException;

public class Main {
	
	public static void main(String[] args) throws  noExisteObjetoException 
	{
		Controller controler = new Controller();
		controler.run();
	}
}
