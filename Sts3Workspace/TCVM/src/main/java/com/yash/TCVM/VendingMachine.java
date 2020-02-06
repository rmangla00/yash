package com.yash.TCVM;

import java.util.logging.Logger;

import com.yash.Model.DrinksType;
import com.yash.Util.IntergerScanner;
import com.yash.Util.VendingMachineException;

public class VendingMachine {

	// private static final
	Logger logger = Logger.getLogger(VendingMachine.class.getName());

	VendingMachineOperations vendingMachineOperations = new VendingMachineOperations();
	IntergerScanner intScanner = new IntergerScanner();

	public void displayMenu() {

		System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%6$s%n\u001B[30m");
		Integer inputChoice;

		do {
			logger.info("\n******* Tea Coffee Vending Machine *******\n");
			logger.info("Press 1 for Tea\t\t Rs : 10");
			logger.info("Press 2 for Black Tea\t Rs : 5");
			logger.info("Press 3 for Coffee\t Rs : 15");
			logger.info("Press 4 for Black Coffee Rs : 10");
			logger.info("Press 5 to Refill Container");
			logger.info("Press 6 to Check Sale Report");
			logger.info("Press 7 to Check Container Status");
			logger.info("Press 8 to Reset Container");
			logger.info("Press 0 to Exit Vending Machine");
			logger.info("\n******************************************\n");
			inputChoice = intScanner.getNextInteger();
			Integer quantity = 0;

			try {
				switch (inputChoice) {
				case 1:
					logger.info("You have selected Tea");
					logger.info("How much tea you want ?");
					quantity = intScanner.getNextInteger();
					vendingMachineOperations.makeDrink(DrinksType.TEA, quantity);
					logger.info("Your Tea is prepared");
					break;
				case 2:
					logger.info("You have selected Black Tea");
					logger.info("How much black tea you want ?");
					quantity = intScanner.getNextInteger();
					vendingMachineOperations.makeDrink(DrinksType.BLACK_TEA, quantity);
					logger.info("Your Black Tea is prepared");
					break;
				case 3:
					logger.info("You have selected Coffee");
					logger.info("How much coffee you want ?");
					quantity = intScanner.getNextInteger();
					vendingMachineOperations.makeDrink(DrinksType.COFFEE, quantity);
					logger.info("Your Coffee is prepared");
					break;
				case 4:
					logger.info("You have selected Black Coffee");
					logger.info("How much black coffee you want ?");
					quantity = intScanner.getNextInteger();
					vendingMachineOperations.makeDrink(DrinksType.BLACK_COFFEE, quantity);
					logger.info("Your Black Coffee is prepared");
					break;
				case 5:
					boolean isContinue = false;
					do {
						logger.info("\nWhich container do you want to refill ?" + "\nPress 1 for Tea Container "
								+ "\nPress 2 for Coffee Container " + "\nPress 3 for Sugar Container "
								+ "\nPress 4 for Water Container " + "\nPress 5 for Milk Container ");
						quantity = intScanner.getNextInteger();
						vendingMachineOperations.refillContainer(quantity);
						logger.info("Do you want to continue refilling ? (press 1 for yes else 0) ");
						isContinue = intScanner.getNextInteger() == 1 ? true : false;
					} while (isContinue);
					vendingMachineOperations.containerStatus();
					break;
				case 6:
					vendingMachineOperations.drinkSaleReport();
					break;
				case 7:
					vendingMachineOperations.containerStatus();
					break;
				case 8:
					vendingMachineOperations.resetContainer();
					vendingMachineOperations.containerStatus();
					logger.info("Vending Machine Successfully Reset");
					break;
				case 0:
					logger.info("Exiting Vending Machine...");
					break;
				default:
					logger.info("You have entered wrong input...");
					break;
				}
			} catch (VendingMachineException exception) {
				logger.info("Exception occurred: " + exception.getMessage());
			}

		} while (inputChoice != 0);

	}
}
