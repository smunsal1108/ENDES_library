package com.endes.library;

import com.endes.library.BookItem;

public interface Search {
	   BookItem searchByTitle(String title);
	   BookItem searchByAuthor(String author);
}
		