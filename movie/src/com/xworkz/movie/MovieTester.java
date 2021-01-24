package com.xworkz.movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.xworkz.movie.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {
		MovieDTO dto1=new MovieDTO("KGF2",5,3,"Action");
		MovieDTO dto2=new MovieDTO("om",5,2.5,"Drama");
		MovieDTO dto3=new MovieDTO("Bahubhali",4.5,2.39,"Action/War");
		MovieDTO dto4=new MovieDTO("Andhra",5,3,"Action");
		MovieDTO dto5=new MovieDTO("Tarle nan maga",3,5,"Comedy");
		
		MovieDTO dto6=new MovieDTO();
		dto6.setGenre("Comedy");
		
		Collection<MovieDTO> movieDTOs=new ArrayList();
		movieDTOs.add(dto1);
		movieDTOs.add(dto2);
		movieDTOs.add(dto3);
		movieDTOs.add(dto4);
		movieDTOs.add(dto5);
		//ArrayList ----decompiler
		Iterator<MovieDTO> iterator=movieDTOs.iterator();
		
		while(iterator.hasNext())//cursor----top of the elem,hasNext-->next element
		{
			MovieDTO movie=iterator.next();
			System.out.println(movie);
			if(movie.getGenre().equals("Action")) {
				iterator.remove();
				movie.setGenre(null);
				movieDTOs.remove(movie);
			}
			
		}
		System.out.println("movie after removing comedy "+movieDTOs.size());
		
		for(MovieDTO dto:movieDTOs)
		{
			System.out.println(dto);
		}
			
		

		
	}

}
