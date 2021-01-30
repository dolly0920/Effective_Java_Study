package com.example.sypark9646.item04;

public class Dog extends Animal implements CanMakeNoise {

	@Override
	public void jump() {
		System.out.println("dog jumps");
	}

	@Override
	public void makeNoise() {
		System.out.println("dog noise");
	}
}
