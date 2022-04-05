package com.xworkz.libraryapp;

import java.util.Scanner;
import com.xworkz.libraryapp.library.Library;
import com.xworkz.libraryapp.dto.BookDTO;

public class LibraryTester {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array the size");
		int size=sc.nextInt();
		
		Library library=new Library(size);
		for (int i = 0; i < size; i++) {
			
		BookDTO dto=new BookDTO();
		System.out.println("enter the id");
		dto.setBookId(sc.nextInt());
		System.out.println("enter the title");
		dto.setTitle(sc.next());
		System.out.println("enter the author");
		dto.setAuthor(sc.next());
		System.out.println("enter the price");
		dto.setPrice(sc.nextFloat());
		System.out.println("enter the adition");
		dto.setAdition(sc.next());
		
		library.createLibraryDetails(dto);
		}
		
		library.getAllBookDetails();
		System.out.println("enter the new adition and title of the book");
		library.updateAditionByBookName(sc.next(),sc.next());
		
		System.out.println("enter the id");
		library.deleteBookById(sc.nextInt());
	}
		

}
