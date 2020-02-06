package com.yash.TCVM;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.yash.Model.Container;
import com.yash.Model.DrinksType;
import com.yash.Util.VendingMachineException;

@RunWith(MockitoJUnitRunner.class)
public class VendingMachineOperationsTest {

	@InjectMocks
	VendingMachineOperations machine;

	@Mock
	Container container;

	@Mock
	Logger logger;

	@Test
	public void returnContainerStatusWhenCalled() {
		machine.containerStatus();
		verify(logger).info("Container \t\tQuantity");
		verify(logger).info("Container Refill Times \t:    " + 0);
	}

	@Test
	public void prepareTeaWhenAllRequiredContainersHaveSufficientMaterial() {
		int quantity = 2;
		DrinksType drinksType = DrinksType.TEA;

		when(container.getTeaContainer()).thenReturn(2000);
		when(container.getMilkContainer()).thenReturn(15000);
		when(container.getSugerContainer()).thenReturn(8000);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(drinksType, quantity);

		verify(container, times(2)).getTeaContainer();
		verify(container, times(2)).getWaterContainer();
		verify(container, times(2)).getSugerContainer();
		verify(container, times(2)).getMilkContainer();

		verify(logger).info("Preparing " + quantity + " cup of " + drinksType + "    Cost : "
				+ drinksType.getDrinkCost() * quantity);
	}

	@Test
	public void prepareBlackTeaWhenAllRequiredContainersHaveSufficientMaterial() {
		int quantity = 2;
		DrinksType drinksType = DrinksType.BLACK_TEA;

		when(container.getTeaContainer()).thenReturn(2000);
		when(container.getSugerContainer()).thenReturn(8000);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(drinksType, quantity);

		verify(container, times(2)).getTeaContainer();
		verify(container, times(2)).getWaterContainer();
		verify(container, times(2)).getSugerContainer();

		verify(logger).info("Preparing " + quantity + " cup of " + drinksType + "    Cost : "
				+ drinksType.getDrinkCost() * quantity);
	}

	@Test
	public void prepareCoffeeWhenAllRequiredContainersHaveSufficientMaterial() {
		int quantity = 2;
		DrinksType drinksType = DrinksType.COFFEE;

		when(container.getCoffeeContainer()).thenReturn(2000);
		when(container.getMilkContainer()).thenReturn(15000);
		when(container.getSugerContainer()).thenReturn(8000);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(drinksType, quantity);

		verify(container, times(2)).getCoffeeContainer();
		verify(container, times(2)).getWaterContainer();
		verify(container, times(2)).getSugerContainer();
		verify(container, times(2)).getMilkContainer();

		verify(logger).info("Preparing " + quantity + " cup of " + drinksType + "    Cost : "
				+ drinksType.getDrinkCost() * quantity);
	}

	@Test
	public void prepareBlackCoffeeWhenAllRequiredContainersHaveSufficientMaterial() {
		int quantity = 2;
		DrinksType drinksType = DrinksType.BLACK_COFFEE;

		when(container.getCoffeeContainer()).thenReturn(2000);
		when(container.getSugerContainer()).thenReturn(8000);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(drinksType, quantity);

		verify(container, times(2)).getCoffeeContainer();
		verify(container, times(2)).getWaterContainer();
		verify(container, times(2)).getSugerContainer();

		verify(logger).info("Preparing " + quantity + " cup of " + drinksType + "    Cost : "
				+ drinksType.getDrinkCost() * quantity);
	}

	@Test(expected = VendingMachineException.class)
	public void shouldThrowExceptionInsufficientWaterWhenWaterIsLessThanRequired() {
		when(container.getWaterContainer()).thenReturn(2);

		machine.makeDrink(DrinksType.TEA, 2);
	}

	@Test(expected = VendingMachineException.class)
	public void shouldThrowExceptionInsufficientMilkWhenMilkIsLessThanRequired() {
		when(container.getTeaContainer()).thenReturn(2000);
		when(container.getMilkContainer()).thenReturn(2);
		when(container.getSugerContainer()).thenReturn(8000);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(DrinksType.TEA, 2);
	}

	@Test(expected = VendingMachineException.class)
	public void shouldThrowExceptionInsufficientSugarWhenSugarIsLessThanRequired() {
		when(container.getSugerContainer()).thenReturn(2);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(DrinksType.TEA, 2);
	}

	@Test(expected = VendingMachineException.class)
	public void shouldThrowExceptionInsufficientTeaWhenTeaIsLessThanRequired() {
		when(container.getTeaContainer()).thenReturn(2);
		when(container.getSugerContainer()).thenReturn(8000);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(DrinksType.TEA, 2);
	}

	@Test(expected = VendingMachineException.class)
	public void shouldThrowExceptionInsufficientCoffeeWhenCoffeeIsLessThanRequired() {
		when(container.getCoffeeContainer()).thenReturn(2);
		when(container.getSugerContainer()).thenReturn(8000);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(DrinksType.COFFEE, 2);
	}

	@Test
	public void shouldPrintInvalidQuantityWhenInputQuantityNumberIsNegative() {
		machine.makeDrink(DrinksType.COFFEE, -2);
		verify(logger).info("Please enter quantity greater then 0");
	}

	@Test
	public void shouldAddEntryInSaleReportWhenAddSameDrinkTypeOrderedAgain() {
		when(container.getTeaContainer()).thenReturn(2000);
		when(container.getCoffeeContainer()).thenReturn(2000);
		when(container.getMilkContainer()).thenReturn(15000);
		when(container.getSugerContainer()).thenReturn(8000);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(DrinksType.TEA, 2);
		machine.makeDrink(DrinksType.TEA, 1);
	}

	@Test
	public void shouldPrintTotalDrinkSaleReportWhenCalled() {

		when(container.getTeaContainer()).thenReturn(2000);
		when(container.getCoffeeContainer()).thenReturn(2000);
		when(container.getMilkContainer()).thenReturn(15000);
		when(container.getSugerContainer()).thenReturn(8000);
		when(container.getWaterContainer()).thenReturn(15000);

		machine.makeDrink(DrinksType.TEA, 2);
		machine.makeDrink(DrinksType.COFFEE, 1);
		machine.makeDrink(DrinksType.TEA, 1);

		machine.drinkSaleReport();

		verify(logger).info("Drink Type\t\t" + "Quantity\t" + "Cost");
		verify(logger).info("TOTAL\t\t" + 4 + "\t\t" + 45);
	}

	@Test
	public void sholudResetContainerWhenFuctionCalled() {
		machine.resetContainer();
		verify(logger).info("Vending Machine Reseted Successfully");
	}

	@Test
	public void shouldRefillTeaContainerWhenSelected() {

		machine.refillContainer(1);
		verify(logger).info("Tea container succeessfully refilled");
	}

	@Test
	public void shouldRefillCoffeContainerWhenSelected() {

		machine.refillContainer(2);
		verify(logger).info("Coffee container succeessfully refilled");
	}

	@Test
	public void shouldRefillSugarContainerWhenSelected() {
		machine.refillContainer(3);
		verify(logger).info("Suger container succeessfully refilled");
	}

	@Test
	public void shouldRefillWaterContainerWhenSelected() {
		machine.refillContainer(4);
		verify(logger).info("Water container succeessfully refilled");
	}

	@Test
	public void shouldRefillMilkContainerWhenSelected() {
		machine.refillContainer(5);
		verify(logger).info("Milk container succeessfully refilled");
	}

	@Test
	public void shouldNotRefillAnyContainerWhenInputChoiceIsInvalid() {
		machine.refillContainer(7);
		verify(logger).info("Plase enter a valid input..");
	}

}
