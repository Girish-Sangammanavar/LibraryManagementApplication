package com.library.main;

import com.library.entity.Author;
import com.library.entity.Book;
import com.library.entity.Category;
import com.library.entity.Publisher;
import com.library.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService){
		return(args)->{
			Book book1 = new Book("ISBN-ABC", "My First Book","This is the first book that I have written.");
			Author author1 = new Author("John", "John is the great poet form Canada");
			Category category1 = new Category("A True Love Story.");
			Publisher publisher1 = new Publisher("First Publisher");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);


			Book book2 = new Book("ISBN-ABC", "My First Book","This is the first book that I have written.");
			Author author2 = new Author("John", "John is the great poet form Canada");
			Category category2 = new Category("A True Love Story.");
			Publisher publisher2 = new Publisher("First Publisher");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);
		};
	}
}
