package com.xworkz.libraryapp;

import java.util.Scanner;
import com.xworkz.libraryapp.library.implimant.Libraryimpl;
import com.xworkz.libraryapp.library.Library;
import com.xworkz.libraryapp.dto.BookDTO;

public class LibraryTester {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array the size");
		int size=sc.nextInt();
		
		Library library=new Libraryimpl(size);
		for (int i = 0; i < size; i++) {
			
		BookDTO dto=new BookDTO();
		System.out.println("enter the id");
		dto.setBookId(sc.nextInt());
		System.out.println("enter the title");
		dto.setTitle(sc.next());
		System.out.println("enter the author");
		dto.setAuthor(sc.next());
		System.out.println("enter the Publisher");
		dto.setPublisher(sc.next());
		System.out.println("enter the price");
		dto.setPrice(sc.nextFloat());
		System.out.println("enter the adition");
		dto.setEdition(sc.next());
		
		library.createLibraryDetails(dto);
		}
		
		library.getAllBookDetails();
		
		/*System.out.println("enter the new adition and title of the book");
		library.updateAditionByBookName(sc.next(),sc.next());
		
		System.out.println("enter the id");
		library.deleteBookById(sc.nextInt());*/
	

	String text=null;
	
	  do{
		 System.out.println("enter 1 to get the book details by id");
		 System.out.println("enter 2 to get all the book details ");
		 System.out.println("enter 3 to update the edition by title");
		 System.out.println("enter 4 to delete the book ");
		 System.out.println("enter 5 to get the book details by title");
		 System.out.println("enter 6 to get the book details by Auther");
		 System.out.println("enter 7 to get the book details by edition");
		 System.out.println("enter 8 to get the book title by id");
		 System.out.println("enter 9 to get the book id by title");
		 System.out.println("enter 10 to get the book edition by id");
		 System.out.println("enter 11 to get the book price by title");
		 System.out.println("enter 12 to get all the publishersby title");
		 System.out.println("enter 13 to get all Auther");
		 System.out.println("enter 14 to get all Edition");
		 System.out.println("Enter the choice");
		 int choice= sc.nextInt();
		 
		 switch(choice){
		 
		 case 1:
		 		 System.out.println("enter the id");
			 BookDTO	bookDTO=library.getBookById(sc.nextInt());
			 if(bookDTO !=null) {
			 System.out.println("book details are"+bookDTO);
			 }
			 else {
			 System.out.println("no book available with this id");
			 }
			 break;
		 case 2:
			 library.getAllBookDetails();
			 break;
			 
		 case 3:
			 System.out.println("enter new adition and book title");
			 library.updateEditionByBookTitle(sc.next(),sc.next());
			
			 break;
			 
		 case 4:
			 System.out.println("enter the id");
			 library.deleteBookById(sc.nextShort());
			
			 break;
			 
		 case 5:
			 System.out.println("enter the TITLE");
			 BookDTO DTO= library.getBookBytitle(sc.next());
			 System.out.println(DTO);
			 break;
			 
		 case 6:
			 System.out.println("enter the auther");
			 BookDTO dto= library.getBookByAuther(sc.next());
			 System.out.println(dto);
			 break;
			 
		 case 7:
			 System.out.println("enter the adition");
			 BookDTO dto1= library.getBookByEdition(sc.next());
			 System.out.println(dto1);
			 break;
			 
		 case 8:
			 System.out.println("enter the id");
			 String title= library.getTitleById(sc.nextInt());
			 System.out.println(title);
			 break;
			 
			 
		 case 9:
			 System.out.println("enter the title");
			 int id= library.getBookIdByTitle(sc.next());
			 System.out.println(id);
			 break;
			 
		 case 10:
			 System.out.println("enter the id");
			 String adition= library.getBookEditionById(sc.nextInt());
			 System.out.println(adition);
			 break;
			 
		 case 11:
			 System.out.println("enter the title");
			 float price= library.getPriceByTitle(sc.next());
			 System.out.println(price);
			 break;
			 
		 case 12:
			 System.out.println("enter the title");
			String[] publisher= library.getAllPublishersByTitle(sc.next());
			System.out.println(publisher);
			 break;
			
		 case 13:
			 library.getAllAuthers();
			 break;
			 
		 case 14:
			 library.getAllEdition();
			 break;
			 
		default:
			System.out.println("no choice Available.... enter valid number");
 
	  }
		 System.out.println("do you want to continue say yes/no");
		 text=sc.next();
		
	 }while(text.equalsIgnoreCase("YES"));
		 
}
}
