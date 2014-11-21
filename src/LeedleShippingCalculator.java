/**
 * Temperature Conversion Program
 * Converts between celsius and Fahrenheit
 * @author heerl532
 *
 */
import javax.swing.*;

import java.text.*;
public class LeedleShippingCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean invalidInput = false;
		double potatoShip, potato, cakeShip, cake, rockShip, rock, treeShip, tree, tankShip, tank, total;
		String name, shipType, quit, potatoInput, cakeInput, rockInput, treeInput, tankInput;
		DecimalFormat df = new DecimalFormat("#.##");
		// Initialize Item Variables
		potatoInput = "";
		rockInput = "";
		cakeInput = "";
		treeInput = "";
		tankInput = "";
		// Get user's name
		name = JOptionPane.showInputDialog(null,
				"What's your name?",
				"Name",
				JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, 
				"Welcome " + name,
				"Welcome",
				JOptionPane.PLAIN_MESSAGE);
		// Create an array of user options
				String[] userOptions = 
					{"Standard Shipping",
						"Advanced Shipping",
						"Ludicrous Shipping",
						"I Quit"};
				String[] quitOptions =
					{"Continue",
						"Quit"
					};
				shipType = "Initialize";
				// Enter Loop For Inputs
				while (shipType != "I Quit"){
					// set/reset variables
					potato = 1000;
					rock = 5000;
					cake = 10000;
					tree = 3000;
					tank = 1220000;
					// Potatoes
					while (potato >= 1000){
						invalidInput = false;
						while (!invalidInput) {
							try {
								potatoInput = JOptionPane.showInputDialog(null,
									"How Many Potatoes Do You Want?",
									"Potatoes?",
									JOptionPane.QUESTION_MESSAGE);
								if (potatoInput.isEmpty()){
									JOptionPane.showMessageDialog(null,
											"Please Enter A Number",
											"Lack of Input",
											JOptionPane.PLAIN_MESSAGE);
									continue;
								}
								potato = Double.parseDouble(potatoInput);
								invalidInput = true;
							} catch (Exception e){
								JOptionPane.showMessageDialog(null,
										"Please Enter A Number",
										"Failure to Enter a Number",
										JOptionPane.PLAIN_MESSAGE);
							}
						}
						potato = Math.abs(Double.parseDouble(df.format(potato)));
						if (potato >= 1000){
							JOptionPane.showMessageDialog(null, 
								"You can't order more than 999 Potatoes", 
								"Too Many Potatoes",
								JOptionPane.PLAIN_MESSAGE);
						}
					}
					// Rocks
					while (rock >= 5000){
						invalidInput = false;
						while (!invalidInput) {
							try {
								rockInput = JOptionPane.showInputDialog(null,
									"How Many Rocks Do You Want?",
									"Rocks?",
									JOptionPane.QUESTION_MESSAGE);
								if (rockInput.isEmpty()){
									JOptionPane.showMessageDialog(null,
											"Please Enter A Number",
											"Lack of Input",
											JOptionPane.PLAIN_MESSAGE);
									continue;
								}
								rock = Double.parseDouble(rockInput) * 5;
								invalidInput = true;
							} catch (Exception e){
								JOptionPane.showMessageDialog(null,
										"Please Enter A Number",
										"Failure to Enter a Number",
										JOptionPane.PLAIN_MESSAGE);
							}
						}
						rock = Math.abs(Double.parseDouble(df.format(rock)));
						if (rock >= 5000){
							JOptionPane.showMessageDialog(null, 
									"You can't order more than 999 Rocks", 
									"Too Many Rocks",
									JOptionPane.PLAIN_MESSAGE);
						}
					}
					// cakes
					while (cake >= 10000){
						invalidInput = false;
						while (!invalidInput) {
							try {
								cakeInput = JOptionPane.showInputDialog(null,
									"How Many Cakes Do You Want?",
									"Cakes?",
									JOptionPane.QUESTION_MESSAGE);
								if (cakeInput.isEmpty()){
									JOptionPane.showMessageDialog(null,
											"Please Enter A Number",
											"Lack of Input",
											JOptionPane.PLAIN_MESSAGE);
									continue;
								}
								cake = Double.parseDouble(cakeInput) * 10;
								invalidInput = true;
							}  catch (Exception e){
								JOptionPane.showMessageDialog(null,
										"Please Enter A Number",
										"Failure to Enter a Number",
										JOptionPane.PLAIN_MESSAGE);
							}
						}
						cake = Math.abs(Double.parseDouble(df.format(cake)));
						if (cake >= 10000){
							JOptionPane.showMessageDialog(null, 
									"You can't order more than 999 Cakes", 
									"Too Many Cakes",
									JOptionPane.PLAIN_MESSAGE);
						}
					}
					// trees
					while (tree >= 3000){
						invalidInput = false;
						while (!invalidInput) {
							try {
								treeInput = JOptionPane.showInputDialog(null,
									"How Many Trees Do You Want?",
									"Trees?",
									JOptionPane.QUESTION_MESSAGE);
								if (treeInput.isEmpty()){
									JOptionPane.showMessageDialog(null,
											"Please Enter A Number",
											"Lack of Input",
											JOptionPane.PLAIN_MESSAGE);
									continue;
								}
								tree = Double.parseDouble(treeInput) * 30;
								invalidInput = true;
							} catch (Exception e){
								JOptionPane.showMessageDialog(null,
										"Please Enter A Number",
										"Failure to Enter a Number",
										JOptionPane.PLAIN_MESSAGE);
							}
						}
						tree = Math.abs(Double.parseDouble(df.format(tree)));
						if (tree >= 3000){
							JOptionPane.showMessageDialog(null, 
									"You can't order more than 99 Trees", 
									"Too Many Trees",
									JOptionPane.PLAIN_MESSAGE);
						}
					}
					// tanks
					while (tank >= 1220000){
						invalidInput = false;
						while (!invalidInput) {
							try {
								tankInput = JOptionPane.showInputDialog(null,
									"How Many Millitary Tanks Do You Want?",
									"Tanks?",
									JOptionPane.QUESTION_MESSAGE);
								if (tankInput.isEmpty()){
									JOptionPane.showMessageDialog(null,
											"Please Enter A Number",
											"Lack of Input",
											JOptionPane.PLAIN_MESSAGE);
									continue;
								}
								tank = Double.parseDouble(tankInput) * 122000;
								invalidInput = true;
							} catch (Exception e){
								JOptionPane.showMessageDialog(null,
										"Please Enter A Number",
										"Failure to Enter a Number",
										JOptionPane.PLAIN_MESSAGE);
							}
						}
						tank = Math.abs(Double.parseDouble(df.format(tank)));
						if (tank >= 1220000){ 
							JOptionPane.showMessageDialog(null, 
									"You can't order more than 9 Tanks",
									"Too Many Tanks",
									JOptionPane.PLAIN_MESSAGE);
						}
					}
					
					// Get shipping type
					shipType = (String) JOptionPane.showInputDialog(null,
							"Choose a Shipping Option", "Shipping Selection",
							JOptionPane.INFORMATION_MESSAGE, null,
							userOptions, userOptions[0]);

					// Standard Shipping
					if (shipType.startsWith("S")) {
						potatoShip = (potato * .05);
						rockShip = (rock * .05);
						cakeShip = (cake * .05);
						treeShip = (tree * .05);
						tankShip = (tank * .05);
						total = Double.parseDouble(df.format(potato + potatoShip + rock + rockShip + cake + cakeShip + tree + treeShip + tank + tankShip));
						JOptionPane.showMessageDialog(null, 
								"Your "+ potatoInput + " Potatoe(s) will cost $" + potato + " with $" + potatoShip + " shipping cost for a total of $" + (potato+potatoShip) + 
								"\nYour " + rockInput + " Rock(s) will cost $" + rock + " with $" + rockShip + " shipping cost for a total of $" + (rock+rockShip) +
								"\nYour " + cakeInput + " Cake(s) will cost $" + cake + " with $" + cakeShip + " shipping cost for a total of $" + (cake+cakeShip) +
								"\nYour " + treeInput + " Tree(s) will cost $" + tree + " with $" + treeShip + " shipping cost for a total of $" + (tree+treeShip) +
								"\nYour " + tankInput + " Tank(s) will cost $" + tank + " with $" + tankShip + " shipping cost for a total of $" + (tank+tankShip),
								"Final Costs",
								JOptionPane.PLAIN_MESSAGE);
						JOptionPane.showMessageDialog(null, 
								"Your Final Cost Is $" + total, "Total Cost",
								JOptionPane.PLAIN_MESSAGE);
						quit = (String) JOptionPane.showInputDialog(null,
								"What Would You Like to do Next?", "Continue?",
								JOptionPane.INFORMATION_MESSAGE, null,
								quitOptions, quitOptions[0]);
						if (quit.startsWith("Q")) {
							JOptionPane.showMessageDialog(null, 
									"Have a Nice Day", "Goodbye",
									JOptionPane.PLAIN_MESSAGE);
							System.exit(0);
						}
					}
					// Advanced Shipping
					else if (shipType.startsWith("A")) {
						potatoShip = (potato * .10);
						rockShip = (rock * .10);
						cakeShip = (cake * .10);
						treeShip = (tree * .10);
						tankShip = (tank * .10);
						total = Double.parseDouble(df.format(potato + potatoShip + rock + rockShip + cake + cakeShip + tree + treeShip + tank + tankShip));
						JOptionPane.showMessageDialog(null, 
								"Your "+ potatoInput + " Potatoe(s) will cost $" + potato + " with $" + potatoShip + " shipping cost for a total of $" + (potato+potatoShip) + 
								"\nYour " + rockInput + " Rock(s) will cost $" + rock + " with $" + rockShip + " shipping cost for a total of $" + (rock+rockShip) +
								"\nYour " + cakeInput + " Cake(s) will cost $" + cake + " with $" + cakeShip + " shipping cost for a total of $" + (cake+cakeShip) +
								"\nYour " + treeInput + " Tree(s) will cost $" + tree + " with $" + treeShip + " shipping cost for a total of $" + (tree+treeShip) +
								"\nYour " + tankInput + " Tank(s) will cost $" + tank + " with $" + tankShip + " shipping cost for a total of $" + (tank+tankShip),
								"Final Costs",
								JOptionPane.PLAIN_MESSAGE);
						JOptionPane.showMessageDialog(null, 
								"Your Final Cost Is $" + total, "Total Cost",
								JOptionPane.PLAIN_MESSAGE);
						quit = (String) JOptionPane.showInputDialog(null,
								"What Would You Like to do Next?", "Continue?",
								JOptionPane.INFORMATION_MESSAGE, null,
								quitOptions, quitOptions[0]);
						if (quit.startsWith("Q")) {
							JOptionPane.showMessageDialog(null, 
									"Have a Nice Day", "Goodbye",
									JOptionPane.PLAIN_MESSAGE);
							System.exit(0);
						}
					}
					// Ludicrous Shipping
					else if (shipType.startsWith("L")) {
						potatoShip = (potato * .50);
						rockShip = (rock * .50);
						cakeShip = (cake * .50);
						treeShip = (tree * .50);
						tankShip = (tank * .50);
						total = Double.parseDouble(df.format(potato + potatoShip + rock + rockShip + cake + cakeShip + tree + treeShip + tank + tankShip));
						JOptionPane.showMessageDialog(null, 
								
								"Your "+ potatoInput + " Potatoe(s) will cost $" + potato + " with $" + potatoShip + " shipping cost for a total of $" + (potato+potatoShip) + 
								"\nYour " + rockInput + " Rock(s) will cost $" + rock + " with $" + rockShip + " shipping cost for a total of $" + (rock+rockShip) +
								"\nYour " + cakeInput + " Cake(s) will cost $" + cake + " with $" + cakeShip + " shipping cost for a total of $" + (cake+cakeShip) +
								"\nYour " + treeInput + " Tree(s) will cost $" + tree + " with $" + treeShip + " shipping cost for a total of $" + (tree+treeShip) +
								"\nYour " + tankInput + " Tank(s) will cost $" + tank + " with $" + tankShip + " shipping cost for a total of $" + (tank+tankShip),
								"Final Costs",
								JOptionPane.PLAIN_MESSAGE);
						JOptionPane.showMessageDialog(null, 
								"Your Final Cost Is $" + total, "Total Cost",
								JOptionPane.PLAIN_MESSAGE);
						quit = (String) JOptionPane.showInputDialog(null,
								"What Would You Like to do Next?", "Continue?",
								JOptionPane.INFORMATION_MESSAGE, null,
								quitOptions, quitOptions[0]);
						if (quit.startsWith("Q")) {
							JOptionPane.showMessageDialog(null, 
									"Have a Nice Day", "Goodbye",
									JOptionPane.PLAIN_MESSAGE);
							System.exit(0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, 
								"Have a nice day", "Goodbye",
								JOptionPane.PLAIN_MESSAGE);
					}
				}

	}

}
