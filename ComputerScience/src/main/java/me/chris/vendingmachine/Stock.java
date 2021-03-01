package me.chris.vendingmachine;

public class Stock {

	String symbol;
	String name;
	double previousClosingPrice, currentPrice;

	Stock(String symbol, String name) {

		this.symbol = symbol;
		this.name = name;

	}

	double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	double getCurrentPrice() {
		return currentPrice;
	}

	void setPreviousClosingPrice(double price) {

		previousClosingPrice = price;

	}

	void setCurrentPrice(double price) {

		currentPrice = price;
	}

	public double getPercentChange() {

		double percent;

		percent = (currentPrice - previousClosingPrice) / previousClosingPrice * 100;

		return percent;

	}

}
