package project;

import java.util.ArrayList;
import java.util.List;

public class Book {
		String bookTitle;
		String author;
		String genre;
		boolean availability;
		
		List<String> titles = new ArrayList<>();
		List<String> authors = new ArrayList<>();
		List<String> ghayasBooks = new ArrayList<>();
		List<String> simonBooks = new ArrayList<>();
		List<String> jamesBooks = new ArrayList<>();
		List<String> mohammedBooks = new ArrayList<>();
		List<String> robertBooks = new ArrayList<>();
		List<String> genres = new ArrayList<>();
		List<Object> availabilities = new ArrayList<Object>();
		
	Book(){
		
	}
	
	Book(String bookTitle, String author, String genre, boolean availability){
		this.bookTitle = bookTitle;
		this.author = author;
		this.genre = genre;
		this.availability = availability;
	}
	
}
