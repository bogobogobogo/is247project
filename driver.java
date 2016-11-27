package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class driver {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		Book book1 = new Book("101 Stews", "Ghayas Akbar", "Cookbook", true);
		Book book2 = new Book("Burger Flippin' Fun", "Ghayas Akbar", "Cookbook", true);
		Book book3 = new Book("The Curry Cure", "Ghayas Akbar", "Cookbook", true);
		Book book4 = new Book("The Frycook's Last Love", "Simon Bradford", "Romance", true);
		Book book5 = new Book("The History of Cars", "Simon Bradford", "History", true);
		Book book6 = new Book("Dead in Dubai", "Simon Bradford", "Suspense", true);
		Book book7 = new Book("How to Overcome Your Fear of Rollercoaster", "James Jameson", "Guide", true);
		Book book8 = new Book("Tips To Being the Best Hedgehog Pet Owner", "James Jameson", "Guide", true);
		Book book9 = new Book("Living Life To Its Fullest", "James Jameson", "Guide", true);
		Book book10 = new Book("The Big Book of Broken Ankles", "Mohammed Ya", "History", true);
		Book book11 = new Book("Yoshi's Last Stand", "Mohammed Ya", "Suspense", true);
		Book book12 = new Book("The Power of Love", "Mohammed Ya", "Romance", true);
		Book book13 = new Book("Exchange", "Robert Young", "Romance", true);
		Book book14 = new Book("Broken Hearts", "Robert Young", "Romance", true);
		Book book15 = new Book("The Eye of The Beholder", "Robert Young", "Suspense", false);
		
		System.out.println("-----------");
		System.out.print("1: ");
		System.out.println(book1.bookTitle);
		System.out.println("Author: " + book1.author);
		System.out.println("Genre: " + book1.genre);
		System.out.println("is book available: " + book1.availability);
		System.out.println(" ");
		System.out.print("2: ");
		System.out.println(book2.bookTitle);
		System.out.println("Author: " + book2.author);
		System.out.println("Genre: " + book2.genre);
		System.out.println("is book available: " + book2.availability);
		System.out.println(" ");
		System.out.print("3: ");
		System.out.println(book3.bookTitle);
		System.out.println("Author: " + book3.author);
		System.out.println("Genre: " + book3.genre);
		System.out.println("is book available: " + book3.availability);
		System.out.println(" ");
		System.out.print("4: ");
		System.out.println(book4.bookTitle);
		System.out.println("Author: " + book4.author);
		System.out.println("Genre: " + book4.genre);
		System.out.println("is book available: " + book4.availability);
		System.out.println(" ");
		System.out.print("5: ");
		System.out.println(book5.bookTitle);
		System.out.println("Author: " + book5.author);
		System.out.println("Genre: " + book5.genre);
		System.out.println("is book available: " + book5.availability);
		System.out.println(" ");
		System.out.print("6: ");
		System.out.println(book6.bookTitle);
		System.out.println("Author: " + book6.author);
		System.out.println("Genre: " + book6.genre);
		System.out.println("is book available: " + book6.availability);
		System.out.println(" ");
		System.out.print("7: ");
		System.out.println(book7.bookTitle);
		System.out.println("Author: " + book7.author);
		System.out.println("Genre: " + book7.genre);
		System.out.println("is book available: " + book7.availability);
		System.out.println(" ");
		System.out.print("8: ");
		System.out.println(book8.bookTitle);
		System.out.println("Author: " + book8.author);
		System.out.println("Genre: " + book8.genre);
		System.out.println("is book available: " + book8.availability);
		System.out.println(" ");
		System.out.print("9: ");
		System.out.println(book9.bookTitle);
		System.out.println("Author: " + book9.author);
		System.out.println("Genre: " + book9.genre);
		System.out.println("is book available: " + book9.availability);
		System.out.println(" ");
		System.out.print("10: ");
		System.out.println(book10.bookTitle);
		System.out.println("Author: " + book10.author);
		System.out.println("Genre: " + book10.genre);
		System.out.println("is book available: " + book10.availability);
		System.out.println(" ");
		System.out.print("11: ");
		System.out.println(book11.bookTitle);
		System.out.println("Author: " + book11.author);
		System.out.println("Genre: " + book11.genre);
		System.out.println("is book available: " + book11.availability);
		System.out.println(" ");
		System.out.print("12: ");
		System.out.println(book12.bookTitle);
		System.out.println("Author: " + book12.author);
		System.out.println("Genre: " + book12.genre);
		System.out.println("is book available: " + book12.availability);
		System.out.println(" ");
		System.out.print("13: ");
		System.out.println(book13.bookTitle);
		System.out.println("Author: " + book13.author);
		System.out.println("Genre: " + book13.genre);
		System.out.println("is book available: " + book13.availability);
		System.out.println(" ");
		System.out.print("14: ");
		System.out.println(book14.bookTitle);
		System.out.println("Author: " + book14.author);
		System.out.println("Genre: " + book14.genre);
		System.out.println("is book available: " + book14.availability);
		System.out.println(" ");
		System.out.print("15: ");
		System.out.println(book15.bookTitle);
		System.out.println("Author: " + book15.author);
		System.out.println("Genre: " + book15.genre);
		System.out.println("is book available: " + book15.availability);
		System.out.println("-----------");
		System.out.print("Please input the number of the book you are interested in: ");
		
		try{
			switch(input.nextInt()){
			case 1: 
				if(book1.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book1.bookTitle);
				System.out.println("Author: " + book1.author);
				System.out.println("Genre: " + book1.genre);
				System.out.println("is book available: " + book1.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 2: 
				if(book2.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book2.bookTitle);
				System.out.println("Author: " + book2.author);
				System.out.println("Genre: " + book2.genre);
				System.out.println("is book available: " + book2.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 3: 
				if(book3.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book3.bookTitle);
				System.out.println("Author: " + book3.author);
				System.out.println("Genre: " + book3.genre);
				System.out.println("is book available: " + book3.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 4: 
				if(book4.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book4.bookTitle);
				System.out.println("Author: " + book4.author);
				System.out.println("Genre: " + book4.genre);
				System.out.println("is book available: " + book4.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 5: 
				if(book5.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book5.bookTitle);
				System.out.println("Author: " + book5.author);
				System.out.println("Genre: " + book5.genre);
				System.out.println("is book available: " + book5.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 6: 
				if(book6.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book6.bookTitle);
				System.out.println("Author: " + book6.author);
				System.out.println("Genre: " + book6.genre);
				System.out.println("is book available: " + book6.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 7: 
				if(book7.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book7.bookTitle);
				System.out.println("Author: " + book7.author);
				System.out.println("Genre: " + book7.genre);
				System.out.println("is book available: " + book7.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 8: 
				if(book8.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book8.bookTitle);
				System.out.println("Author: " + book8.author);
				System.out.println("Genre: " + book8.genre);
				System.out.println("is book available: " + book8.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 9: 
				if(book9.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book9.bookTitle);
				System.out.println("Author: " + book9.author);
				System.out.println("Genre: " + book9.genre);
				System.out.println("is book available: " + book9.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 10: 
				if(book10.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book10.bookTitle);
				System.out.println("Author: " + book10.author);
				System.out.println("Genre: " + book10.genre);
				System.out.println("is book available: " + book10.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 11: 
				if(book11.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book11.bookTitle);
				System.out.println("Author: " + book11.author);
				System.out.println("Genre: " + book11.genre);
				System.out.println("is book available: " + book11.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 12: 
				if(book12.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book12.bookTitle);
				System.out.println("Author: " + book12.author);
				System.out.println("Genre: " + book12.genre);
				System.out.println("is book available: " + book12.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 13: 
				if(book13.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book13.bookTitle);
				System.out.println("Author: " + book13.author);
				System.out.println("Genre: " + book13.genre);
				System.out.println("is book available: " + book13.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			case 14: 
				if(book14.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book14.bookTitle);
				System.out.println("Author: " + book14.author);
				System.out.println("Genre: " + book14.genre);
				System.out.println("is book available: " + book14.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
					//loops back
				}
				break;
			case 15: 
				if(book15.availability == false){
					System.out.println("Sorry, this book is currently unavailable.");
					Thread.sleep(5000);
					//method for library
				}
				System.out.println("You selected: " + book15.bookTitle);
				System.out.println("Author: " + book15.author);
				System.out.println("Genre: " + book15.genre);
				System.out.println("is book available: " + book15.availability);
				System.out.println("-----------");
				System.out.println("Options:");
				System.out.println("1: Check out");
				System.out.println("2: Back to Library");
				System.out.println("3: Back to menu");
				System.out.print("Please input the number of the desired option to exectue: ");
				switch(input.nextInt()){
				case 1:
					//method for checkout
				case 2:
					//method for library
				case 3:
					//method for menu
				default:
					System.out.println("Invalid option.");
				}
				break;
			default: 
				System.out.println("Does not exist. There is no book in slot");
				break;
			}
		}catch(InputMismatchException e){
			System.out.println("InputMismatchException: You tried inputing something other than and integer.");
			//e.printStackTrace();
			//loops back to book selection
			}
		}
	
	
	
	
	
	
}

