package com.zensar;

abstract class DessertItem{
	abstract void getCost();
}

class Candy extends DessertItem{
	@Override
	void getCost() {
		int price = 60;
	}
}

class Cookie extends DessertItem{
	@Override
	void getCost() {
		int price = 70;
	}
}

class IceCream extends DessertItem{
	@Override
	void getCost() {
		int price = 100;
	}
}

public class DessertShop {

}
