package com.model.src;

public class Tuple {
	BlogPostType type;
	public Tuple(BlogPostType type, String author) {
		super();
		this.type = type;
		this.author = author;
	}
	String author;

	public String toString() {
		return "Blog Type: "+this.type+"\n Blog Author: "+this.author;
	}
}
