package com.esraturkan.designpatterns.builder;

public class Demo {
	
	public static void main(String[] args) {

		Student student = new Student.Builder().number(123).name("Esra Türkan").faculty("Bilgisayar Mühendisliği")
				.degree("Yüksek Lisans").build();

		System.out.println(student.toString());
	}
}
