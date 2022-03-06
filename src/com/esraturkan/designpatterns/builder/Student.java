package com.esraturkan.designpatterns.builder;

public class Student {

	private int number;
	private String name;
	private String faculty;
	private String degree;

	public static class Builder {
		private int number;
		private String name;
		private String faculty;
		private String degree;

		public Builder() {
		}

		public Builder number(int number) {
			this.number = number;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder faculty(String faculty) {
			this.faculty = faculty;
			return this;
		}

		public Builder degree(String degree) {
			this.degree = degree;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

	private Student(Builder builder) {
		number = builder.number;
		name = builder.name;
		faculty = builder.faculty;
		degree = builder.degree;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", faculty=" + faculty + ", degree=" + degree + "]";
	}
}
