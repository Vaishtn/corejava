package com.xworkz.celebration;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class TesterSupriya {

	public static void main(String[] args) {
		
		Map<String, String> map=new TreeMap<String, String>((a,b)->b.compareTo(a));
		map.put("Jai ho", "Vijay Praksh");
		map.put("Kabira", "Arijith singh");
		map.put("Kali quarter bottle", "Vijay Prakash");
		map.put("Perfect", "Ed Shreeran");
		map.put("Happy Agide", "All Ok");
		
		Set<Entry<String,String>> entrySet=map.entrySet();
		entrySet.forEach(entry->System.out.println("Song is: "+entry.getKey()+"String is:"+entry.getValue()));
		
		map.forEach((k,v)->System.out.println(k+" "+v));
		
		Properties properties=new Properties();
		properties.setProperty("Name", "Email");
		properties.getProperty("Name");
	}

}
