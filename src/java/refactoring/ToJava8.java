package refactoring;

import util.Person;

import java.util.*;

public class ToJava8 {
	
	private final List<String> stringArray = new ArrayList<>();
	
	public int replaceWithSimpleCount() {
		int count = 0;
		for (String s : stringArray) {
			count++;
		}
		return count;
	}
	
	public int replaceWithSum() {
		int sum = 0;
		for (String word : stringArray) {
			sum += word.length();
		}
		return sum;
	}
	
	public List<String> replaceWithCollect() {
		List<String> result = new ArrayList<>();
		
		for (String line : stringArray) {
			if (line != null) {
				for (String word : line.split("\\s")) {
					result.add(word);
				}
			}
		}
		
		return result;
	}
	
	public boolean hasEmptyString(String[][] data){
		for (String[] row : data) {
			for (String str : row) {
				if (str.isEmpty()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String[] replaceWithToArray(List<String> data) {
		List<String> result = new ArrayList<>();
		for (String str : data){
			if (!str.isEmpty()) {
				result.add(str);
			}
		}
		return result.toArray(new String[0]);
	}
	
	public List<String> getSortedListOfNames(List<Person> people){
		List<String> names = new ArrayList<>();
		for (Person person : people) {
			names.add(person.getName());
		}
		names.sort(String::compareToIgnoreCase);
		return names;
	}
	
	
}
