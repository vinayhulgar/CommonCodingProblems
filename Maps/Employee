package com.maps.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String name) {
		this.firstname = name;
	}

	private String firstname;
	private String lastname;
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String toString() {
		
		return "Employee: "+firstname+" "+lastname+" with id"+getId()+"\n";
	}
	private static Map<String,Employee> map1 = new HashMap<>();
	private static Map<String,Employee> map2 = new HashMap<>();
	
	Employee(Long id, String fname, String lname){
		this.id = id;
		this.firstname = fname;
		this.lastname = lname;
	}
	
	public static void main(String[] args) {
		List<Employee> temp = usingThenComparing();
		System.out.println(temp);
		/*// Sorted map
		TreeMap<String, Double> tm = new TreeMap<>();
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahanaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));
		Set set = tm.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry<String, Double> me = (Map.Entry<String, Double>)i.next();
			System.out.println(me.getKey()+": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 in Zara's account
		double balance = ((Double)tm.get("Zara")).doubleValue();
		tm.put("Zara", new Double(balance+1000));
		System.out.println("Zara's new balance:"+tm.get("Zara"));*/
		
		
		// Merge
		/*Employee emp1 = new Employee(1L, "Henry");
		map1.put(emp1.getName(), emp1);
		Employee emp2 = new Employee(22L, "Annie");
		map1.put(emp2.getName(), emp2);
		Employee emp3 = new Employee(8L, "John");
		map1.put(emp3.getName(), emp3);
		
		Employee emp4 = new Employee(2L, "George");
		map2.put(emp4.getName(), emp4);
		Employee emp5 = new Employee(3L, "Henry");
		map2.put(emp5.getName(), emp5);
		
		Map<String, Employee> map3 = new HashMap<>();
		
		map2.forEach((key, value) -> map3.merge(key, value, (v1, v2) -> new Employee(v1.getId(),v2.getName())));

		Stream.of(map3.keySet().toArray()).
		forEach(System.out :: println);
		Stream.of(map3.values()).
		forEach(System.out :: println);*/
		
	}

	/**
	 * @return 
	 * 
	 */
	public static List<Employee> usingThenComparing() {
		// Sorting
		ArrayList<Employee> employees = getUnsortedEmployeeList();
		// compare by first name and then last name
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getLastname);
		return employees.stream().sorted(compareByName)
				.collect(Collectors.toList());
	}

	private static ArrayList<Employee> getUnsortedEmployeeList() {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(2L, "Lokesh", "Gupta"));
		list.add(new Employee(1L, "Alex", "Gussin"));
		list.add(new Employee(4L, "Brain", "Sux"));
		list.add(new Employee(5L, "Neon", "Piper"));
		list.add(new Employee(3L, "David", "Beckham"));
		list.add(new Employee(7L, "Alex", "Beckham"));
		list.add(new Employee(6L, "Brain", "Suxena"));
		return list;
	}

}
