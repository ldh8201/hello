package hello;

public class IfExample {
	public static void main(String[] args) {
	int a = 96;
	if(a>50 && a>100) {  //&& (and) || (or)
		System.out.println("50 이상.");
		System.out.println("좋은 점수네요.");
	}
	if(a>100) {
		System.out.println("만점이네요.");
	}
	if(a>90) {
		System.out.println("A");
	}	else if(a>80) {
		System.out.println("B");
	}else if(a>70) {
		System.out.println("C");
	}else {
		System.out.println("F");
		}
	}
}