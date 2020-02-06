package com.yash.TCVM;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.yash.Model.DrinksType;
import com.yash.Util.IntergerScanner;

@RunWith(MockitoJUnitRunner.class)
public class VendingMachineTest {

	@InjectMocks
	VendingMachine vendingMachine;

	@Mock
	VendingMachineOperations vendingMachineOperations;

	@Mock
	IntergerScanner intScanner;

	@Mock
	Logger logger;

	@Test
	public void shouldRunTeaChoiceInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(1, 2, 0);

		doNothing().when(vendingMachineOperations).makeDrink(DrinksType.TEA, 2);

		vendingMachine.displayMenu();

		verify(vendingMachineOperations).makeDrink(DrinksType.TEA, 2);

		verify(logger).info("Your Tea is prepared");
	}

	@Test
	public void shouldRunBlackTeaChoiceInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(2, 2, 0);

		doNothing().when(vendingMachineOperations).makeDrink(DrinksType.BLACK_TEA, 2);

		vendingMachine.displayMenu();

		verify(vendingMachineOperations).makeDrink(DrinksType.BLACK_TEA, 2);

		verify(logger).info("Your Black Tea is prepared");
	}

	@Test
	public void shouldRunCoffeeChoiceInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(3, 2, 0);

		doNothing().when(vendingMachineOperations).makeDrink(DrinksType.COFFEE, 2);

		vendingMachine.displayMenu();

		verify(vendingMachineOperations).makeDrink(DrinksType.COFFEE, 2);

		verify(logger).info("Your Coffee is prepared");
	}

	@Test
	public void shouldRunBlackCoffeeChoiceInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(4, 2, 0);

		doNothing().when(vendingMachineOperations).makeDrink(DrinksType.BLACK_COFFEE, 2);

		vendingMachine.displayMenu();

		verify(vendingMachineOperations).makeDrink(DrinksType.BLACK_COFFEE, 2);

		verify(logger).info("Your Black Coffee is prepared");
	}

	@Test
	public void shouldRunCheckSaleReportChoiceInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(6, 0);

		doNothing().when(vendingMachineOperations).drinkSaleReport();

		vendingMachine.displayMenu();

		verify(vendingMachineOperations).drinkSaleReport();
	}

	@Test
	public void shouldRunCheckContainerStatusChoiceInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(7, 0);

		doNothing().when(vendingMachineOperations).containerStatus();

		vendingMachine.displayMenu();

		verify(vendingMachineOperations).containerStatus();
	}

	@Test
	public void shouldRunResetContainerChoiceInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(8, 0);

		doNothing().when(vendingMachineOperations).resetContainer();

		vendingMachine.displayMenu();

		verify(vendingMachineOperations).resetContainer();

		verify(logger).info("Vending Machine Successfully Reset");
	}

	@Test
	public void shouldExitVendingMachineInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(0);

		vendingMachine.displayMenu();
	}

	@Test
	public void shouldReqestForValidEntryInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(12, 0);

		vendingMachine.displayMenu();

		verify(logger).info("You have entered wrong input...");
	}

	@Test
	public void shouldRunRefillContainerChoiceInSwitchBlock() {

		when(intScanner.getNextInteger()).thenReturn(5, 2, 1, 10, 0);

		doNothing().when(vendingMachineOperations).refillContainer(2);

		vendingMachine.displayMenu();

		verify(vendingMachineOperations).refillContainer(2);

	}

}
