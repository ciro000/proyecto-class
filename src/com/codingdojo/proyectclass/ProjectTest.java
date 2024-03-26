package com.codingdojo.proyectclass;

public class ProjectTest {

	public static void main(String[] args) {
		 Project project1 = new Project("Bicicleta", "dos ruedas y frenos");
	     Project project2 = new Project("Nueva oficina", "cinco escritorios y computadores", 10850);

	     System.out.println(project1.elevatorPitch());
	     System.out.println(project2.elevatorPitch());
	}
}
