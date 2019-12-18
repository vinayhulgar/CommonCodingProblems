package com.streams.src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/**
 * @author Vinay.G01
 * Problem: Class StateCountryVO{
String country;
String state;
// Getters and Setters
// Constructor
}

// Method retruns list of VO objects with random Order
List<StateCountryVO> method1() 

// To print the list objects as below

Country1			State1
					State2
Country2			State1
Country3			State1
					State2
 *
 */
public class StateCountryVO{
	private String strCountry;
	private String strState;
	
	
	public StateCountryVO(String c, String s) {
		strCountry = c;
		strState = s;
	}
	
	
	/*private static StateCountryVO createStateCountry(String country , String state){
		StateCountryVO objStateCountryVO = new StateCountryVO();
		objStateCountryVO.setStrCountry(country);
		objStateCountryVO.setStrState(state);
		return objStateCountryVO;
	}*/
	public String getStrCountry() {
		return strCountry;
	}
	public void setStrCountry(String strCountry) {
		this.strCountry = strCountry;
	}
	public String getStrState() {
		return strState;
	}
	public void setStrState(String strState) {
		this.strState = strState;
	}
	/*public static void main(String[] args) {
		List<StateCountryVO> statecountrylist = new ArrayList<>();
		StateCountryVO scvo1 = createStateCountry("India", "Karnataka");
		statecountrylist.add(scvo1);
		StateCountryVO scvo2 = createStateCountry("India", "Goa");
		statecountrylist.add(scvo2);
		StateCountryVO scvo3 = createStateCountry("India", "Kerala");
		statecountrylist.add(scvo3);
		StateCountryVO scvo4 = createStateCountry("USA", "California");
		statecountrylist.add(scvo4);
		StateCountryVO scvo5 = createStateCountry("USA", "Nevada");
		statecountrylist.add(scvo5);
		printStateCountry(statecountrylist);
				
	}
	private static void printStateCountry(List<StateCountryVO> statecountrylist) {
		Set<String> countrySet = new HashSet<>();
		Map<String,String> stcntrymap = new HashMap<>();
		for(StateCountryVO obj:statecountrylist){
			String country = obj.getStrCountry();
			String state = obj.getStrState();
			countrySet.add(country);
			stcntrymap.put(state,country);
		}
		for(String s: countrySet){
			System.out.println(s+"           "+getvalues(stcntrymap,s));
		}
	}
	private static Set<String> getvalues(Map<String, String> stcntrymap, String s) {
		 Set<String> keys = new HashSet<>();
		    for (Map.Entry<String, String> entry : stcntrymap.entrySet()) {
		        if (Objects.equals(s, entry.getValue())) {
		            keys.add(entry.getKey());
		        }
		    }
		    return keys;
		
		
	}*/
	
}