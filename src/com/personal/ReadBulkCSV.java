package com.personal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadBulkCSV {
 
	public static void main(String[] args) throws FileNotFoundException {
		Set<String> listOfTNs = getListOfTNs();
		//System.out.println(listOfTNs.stream().sorted().collect(Collectors.toSet()));
		List<Integer> sortedList = listOfTNs.stream().mapToInt(ele -> Integer.valueOf(ele)).sorted().boxed().collect(Collectors.toList());
		System.out.println("List of TNs: " + sortedList);
		
		
		Set<String> numberingPlanList = getNumberPlanList();
		List<Integer> sortedList2 = numberingPlanList.stream().mapToInt(ele -> Integer.valueOf(ele)).sorted().boxed().collect(Collectors.toList());
		System.out.println("List from numbaring plan: " + sortedList2);
		
		List<String> unavailableDataList = listOfTNs.stream()
                                                    .filter(e -> (numberingPlanList.stream()
                                                                                   .filter(d -> d.equals(e))
                                                                                   .count())<1)
                                                    .collect(Collectors.toList());
		
		
		System.out.println("unavailable List: " + unavailableDataList);
		
	}

	private static Set<String> getNumberPlanList() throws FileNotFoundException {
		InputStream is2 = new FileInputStream(new File("E:\\Neustar\\GDI\\Italy\\csvs\\sorted_italy_block.csv"));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
		
		Set<String> numberingPlanList = br2.lines()
                .parallel()
                .collect(Collectors.toSet());
		return numberingPlanList;
	}

	private static Set<String> getListOfTNs() throws FileNotFoundException {
		InputStream is = new FileInputStream(new File("E:\\Neustar\\GDI\\Italy\\old\\sorted_Italy_June2017_all_TNs.csv"));
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		Set<String> listOfTNs = br.lines()
				                 .parallel()
				                 .map(val -> val.substring(0, 3))
				                 //.map(ele -> "0"+ele)
				                 .collect(Collectors.toSet());
		return listOfTNs;
	}
	
}
