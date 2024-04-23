package com.endes.library;

import java.util.HashSet;
import java.util.Set;

public class Catalog implements Manage,Search{

	Set<String> records = new HashSet<>();

	@Override
	public BookItem searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookItem searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createBookItem(BookItem bookItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookItem(BookItem bookItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBookItem(String ISBN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookItem getBookItem(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
