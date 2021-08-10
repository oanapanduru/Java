package homeExercises;

import java.util.HashMap;

public class AdsReport {

	// given a 2D matrix with ads results
	// columns: platform, ad type, campaign, clicks
	// calculate click results grouping by platform and inside each platform by ad
	// type

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String[][] myArray = new String[][] { { "Facebook", "Search", "C1", "17" }, { "Google", "Search", "C2", "199" },
				{ "Google", "Display", "C3", "18" }, { "Google", "Search", "C1", "14" },
				{ "Google", "Display", "C5", "3" }, { "Google", "Search", "C3", "15" },
				{ "Facebook", "Display", "C1", "16" }, };
		HashMap<String, HashMap<String, Integer>> map = new HashMap<String, HashMap<String, Integer>>();
		for (int i = 0; i < myArray.length; i++) {
			String platform = myArray[i][0];
			String type =  myArray[i][1];
			int clicks =  Integer.parseInt(myArray[i][3]);
			if(map.containsKey(platform)) {
				HashMap<String, Integer> little = map.get(platform);
				if(little.containsKey(type)) { 
					little.put(type, little.get(type)+ clicks);
				}
				else {
					little.put(type, clicks);
				}
			}
			else {
				HashMap<String, Integer> little = new HashMap<String, Integer>();
				little.put(type, clicks);
				map.put(platform, little);	
			}
		}
		for(String platform : map.keySet()) {
			//HashMap<String, Integer> little = map.get(platform);
			for(String key: map.get(platform).keySet()) {
				System.out.println(platform + " " + key+ " " + map.get(platform).get(key));
			}
		}
		
	}
}
