package project;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("search by: ");
		System.out.println("title");
		System.out.println("author");
		System.out.println("genre");
		System.out.println("what do you want to search by: ");
		
		switch(input.next()){
		case "genre":
			System.out.println("here are the genres");
			break;
		case "title":
			System.out.println("here are the titles");
			break;
		case "author":
			System.out.println("here are the authors");
			break;
		}
	}

}
