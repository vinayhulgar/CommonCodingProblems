package com.streams.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoStateCountry {

	public static void main(String[] args) {
		
		// List of StateCountry
		ArrayList<StateCountryVO> myList = new ArrayList<>();
		myList.add(new StateCountryVO("India", "Karnataka"));
		myList.add(new StateCountryVO("India", "Goa"));
		myList.add(new StateCountryVO("India", "Kerala"));
		myList.add(new StateCountryVO("USA", "California"));
		myList.add(new StateCountryVO("USA", "Nevada"));
		
		
		Map<String, String> tempMap = new HashMap<String, String>();
		tempMap.put("Karnataka","India");
		tempMap.put("Goa","India");
		tempMap.put("Kerala","India");
		tempMap.put("California","USA");
		tempMap.put("Nevada","USA");
		
		
	//	Stream<Country> myCtrstream = myList.stream().map((a)-> new Country(a.getStrCountry()));
		//Stream<State> myStstream = myList.stream().map((a)-> new State(a.getStrState()));
		
		Map<String, List<String>> result =  tempMap.entrySet().stream().collect(Collectors.groupingBy(
				Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		
		
		System.out.println(result);
		
		/*myCtrstream.forEach((a)->
			System.out.println(a.country+printstate(a, myStstream))
			
		);*/
		
	}

	/*private static String printstate(Country a, Stream<State> myStstream) {
		//myStstream.forEach(arg0);
		return null;
	}*/

}
