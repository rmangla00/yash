package com.yash.TCVM;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.yash.Model.BlackCoffee;
import com.yash.Model.BlackTea;
import com.yash.Model.Coffee;
import com.yash.Model.Container;
import com.yash.Model.DrinksType;
import com.yash.Model.Tea;
import com.yash.Util.VendingMachineException;

public class VendingMachineOperations {

	// private static final
	Logger logger = Logger.getLogger(VendingMachineOperations.class.getName());
	private Integer teaConsumeptionAndWaste = 0;
	private Integer coffeeConsumptionAndWaste = 0;
	private Integer milkConsumptionAndWaste = 0;
	private Integer waterConsumptionAndWaste = 0;
	private Integer sugarConsumptionAndWaste = 0;

	private Container container = new Container();
	private Map<DrinksType, Integer> drinkTypeAndQuantity = new HashMap<DrinksType, Integer>();
	private Integer refillCounter = 0;

	public VendingMachineOperations() {
		System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%6$s%n\u001B[30m");
	}

	public void makeDrink(DrinksType drinksType, int quantity) throws VendingMachineException {
		if (quantity > 0) {
			calculateTotalConsumeptionAndWaste(drinksType, quantity);
			checkContainerUnderFlowStatus();
			container.setTeaContainer(container.getTeaContainer() - teaConsumeptionAndWaste);
			container.setCoffeeContainer(container.getCoffeeContainer() - coffeeConsumptionAndWaste);
			container.setWaterContainer(container.getWaterContainer() - waterConsumptionAndWaste);
			container.setMilkContainer(container.getMilkContainer() - milkConsumptionAndWaste);
			container.setSugerContainer(container.getSugerContainer() - sugarConsumptionAndWaste);

			if (drinkTypeAndQuantity.containsKey(drinksType)) {
				drinkTypeAndQuantity.put(drinksType, drinkTypeAndQuantity.get(drinksType) + quantity);
			} else {
				drinkTypeAndQuantity.put(drinksType, quantity);
			}
			logger.info("Preparing " + quantity + " cup of " + drinksType + "    Cost : "
					+ drinksType.getDrinkCost() * quantity);
		} else {
			logger.info("Please enter quantity greater then 0");
		}
	}

	public void calculateTotalConsumeptionAndWaste(DrinksType drinksType, int quantity) {
		if (drinksType.equals(DrinksType.TEA)) {
			teaConsumeptionAndWaste = quantity * (Tea.TEA_CONSUME + Tea.TEA_WASTE);
			waterConsumptionAndWaste = quantity * (Tea.WATER_CONSUME + Tea.WATER_WASTE);
			milkConsumptionAndWaste = quantity * (Tea.MILK_CONSUME + Tea.MILK_WASTE);
			sugarConsumptionAndWaste = quantity * (Tea.SUGER_CONSUME + Tea.SUGER_WASTE);
		} else if (drinksType.equals(DrinksType.BLACK_TEA)) {
			teaConsumeptionAndWaste = quantity * (BlackTea.TEA_CONSUME + BlackTea.TEA_WASTE);
			waterConsumptionAndWaste = quantity * (BlackTea.WATER_CONSUME + BlackTea.WATER_WASTE);
			sugarConsumptionAndWaste = quantity * (BlackTea.SUGER_CONSUME + BlackTea.SUGER_WASTE);

		} else if (drinksType.equals(DrinksType.COFFEE)) {
			coffeeConsumptionAndWaste = quantity * (Coffee.COFFEE_CONSUME + Coffee.COFFEE_WASTE);
			waterConsumptionAndWaste = quantity * (Coffee.WATER_CONSUME + Coffee.WATER_WASTE);
			milkConsumptionAndWaste = quantity * (Coffee.MILK_CONSUME + Coffee.MILK_WASTE);
			sugarConsumptionAndWaste = quantity * (Coffee.SUGER_CONSUME + Coffee.SUGER_WASTE);

		} else {
			coffeeConsumptionAndWaste = quantity * (BlackCoffee.COFFEE_CONSUME + BlackCoffee.COFFEE_WASTE);
			waterConsumptionAndWaste = quantity * (BlackCoffee.WATER_CONSUME + BlackCoffee.WATER_WASTE);
			sugarConsumptionAndWaste = quantity * (BlackCoffee.SUGER_CONSUME + BlackCoffee.SUGER_WASTE);
		}
	}

	public void checkContainerUnderFlowStatus() throws VendingMachineException {
		if (container.getWaterContainer() < waterConsumptionAndWaste)
			throw new VendingMachineException("Insufficient water in Container please fill the container");

		if (container.getSugerContainer() < sugarConsumptionAndWaste)
			throw new VendingMachineException("Insufficient suger in Container please fill the container");

		if (container.getTeaContainer() < teaConsumeptionAndWaste)
			throw new VendingMachineException("Insufficient tea in Container please fill the container");

		if (container.getCoffeeContainer() < coffeeConsumptionAndWaste)
			throw new VendingMachineException("Insufficient coffee in Container please fill the container");

		if (container.getMilkContainer() < milkConsumptionAndWaste)
			throw new VendingMachineException("Insufficient milk in Container please fill the container");
	}

	public void containerStatus() {

		logger.info("---------------------------------------------------");
		logger.info("Container \t\tQuantity");
		logger.info("---------------------------------------------------");
		logger.info("Tea Capacity\t\t" + container.getTeaContainer());
		logger.info("Coffee Capacity\t\t" + container.getCoffeeContainer());
		logger.info("Sugar Capacity\t\t" + container.getSugerContainer());
		logger.info("water Capacity\t\t" + container.getWaterContainer());
		logger.info("Milk Capacity\t\t" + container.getMilkContainer());
		logger.info("---------------------------------------------------");
		logger.info("Container Refill Times \t:    " + refillCounter);
		logger.info("---------------------------------------------------");
	}

	public void drinkSaleReport() {
		Integer totalDrinkSale = drinkTypeAndQuantity.entrySet().stream()
				.collect(Collectors.summingInt(entry -> entry.getValue()));
		Integer totalCost = drinkTypeAndQuantity.entrySet().stream()
				.collect(Collectors.summingInt(entry -> entry.getValue() * entry.getKey().getDrinkCost()));

		logger.info("---------------------------------------------------");
		logger.info("Drink Type\t\t" + "Quantity\t" + "Cost");
		logger.info("---------------------------------------------------");
		drinkTypeAndQuantity.entrySet().stream().forEach(entry -> logger.info("" + entry.getKey() + "\t\t"
				+ entry.getValue() + "\t\t" + entry.getKey().getDrinkCost() * entry.getValue()));
		logger.info("---------------------------------------------------");
		logger.info("TOTAL\t\t" + totalDrinkSale + "\t\t" + totalCost);
		logger.info("---------------------------------------------------");
	}

	public void resetContainer() {
		container = new Container();
		drinkTypeAndQuantity.clear();
		refillCounter = 0;
		logger.info("Vending Machine Reseted Successfully");
	}

	public void refillContainer(Integer choice) {
		switch (choice) {
		case 1:
			container.setTeaContainer(2000);
			refillCounter += 1;
			logger.info("Tea container succeessfully refilled");
			break;
		case 2:
			container.setCoffeeContainer(2000);
			refillCounter += 1;
			logger.info("Coffee container succeessfully refilled");
			break;
		case 3:
			container.setSugerContainer(8000);
			refillCounter += 1;
			logger.info("Suger container succeessfully refilled");
			break;
		case 4:
			container.setWaterContainer(15000);
			refillCounter += 1;
			logger.info("Water container succeessfully refilled");
			break;
		case 5:
			container.setMilkContainer(10000);
			refillCounter += 1;
			logger.info("Milk container succeessfully refilled");
			break;
		default:
			logger.info("Plase enter a valid input..");
			break;
		}

	}

}
