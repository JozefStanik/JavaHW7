package com.hw7.library;

public class ScientificBook extends Book{
	
	private String scientificArea;
	
	public ScientificBook(String nameOfBook, String authorOfBook, int numberOfPages, String scientificArea) {
		super(nameOfBook, authorOfBook, numberOfPages);
		this.setScientificArea(scientificArea);
	}

	public String getScientificArea() {
		return scientificArea;
	}

	public void setScientificArea(String scientificArea) {
		this.scientificArea = scientificArea;
	}

}
