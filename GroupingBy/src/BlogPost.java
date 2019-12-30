package com.model.src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class BlogPost {
	
	
	public BlogPost(String title, String author, BlogPostType type, int likes) {
		super();
		this.title = title;
		this.author = author;
		this.type = type;
		this.likes = likes;
	}

	public String toString() {
		return "Blog Name: "+this.title+"\n Blog Author: "+this.author+"\n Blog Likes: "+this.likes;
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public BlogPostType getType() {
		return type;
	}


	public void setType(BlogPostType type) {
		this.type = type;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes = likes;
	}


	private String title;
	private String author;
	private BlogPostType type;
	int likes;
	
	
	public static void main(String [] args) {
		List<BlogPost> posts = Arrays.asList(new BlogPost("THE MONK", "RAM RAHEEM", BlogPostType.NEWS, 10),
				new BlogPost("Java 8 Recepies", "Rajesh", BlogPostType.REVIEW, 5),
				new BlogPost("The Complete Reference", "Lokesh", BlogPostType.GUIDE, 15),
				new BlogPost("Java 9 CookBook", "Omkar", BlogPostType.REVIEW, 8));
		
		// Simple grouping by Single Column
		//Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
			//	.collect(Collectors.groupingBy(BlogPost::getType));
				//.collect(Collectors.groupingBy(BlogPost::getType,Collectors.toList()));
		//System.out.println(postsPerType);
		
		// Grouping by Complex Map Key Type
		//Map<Tuple, List<BlogPost>> postsPerTypeAndAuthor = posts.stream()
		//		.collect(Collectors.groupingBy(post -> new Tuple(post.getType(), post.getAuthor())));
		//System.out.println(postsPerTypeAndAuthor);
		
		// Modify returned Map Value Type
		Map<BlogPostType,Set<BlogPost>> postsPerType1 = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.toSet()));
		//System.out.println(postsPerType1);
		
		// Grouping By Multiple Fields
		Map<String, Map<BlogPostType, List<BlogPost>>> map = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getAuthor, Collectors.groupingBy(BlogPost::getType)));
		//System.out.println(map);
		
		// Getting Average
		Map<BlogPostType, Double> avgLikesPerType = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.averagingInt(BlogPost::getLikes)));
		//System.out.println(avgLikesPerType);
		
		// Getting Sum
		Map<BlogPostType, Integer> sumlikesPerType = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.summingInt(BlogPost::getLikes)));
		//System.out.println(sumlikesPerType);
		
		// Getting Maximum & Minimum From Grouped Results
		Map<BlogPostType, Optional<BlogPost>> maxLikes = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType,
						Collectors.minBy(Comparator.comparingInt(BlogPost::getLikes))));
		System.out.println(maxLikes);
		
	
		
	}
	

}
