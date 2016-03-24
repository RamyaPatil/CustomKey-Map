package test;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class test4 {
	static Map<customKey, Record> recordsMap = new HashMap<>();

	public static void insertRecord(Record record){
		recordsMap.put(new customKey(record.getName(), record.getScore()), record);
	}
	
	public static void printMap(Map<customKey, Record> map){
		for(Entry<customKey, Record> record: map.entrySet()){
			Record student = record.getValue();
			System.out.println("{"+student.getSlno()+","+student.getName()+","+student.getScore()+"}");
		}
	}
	
	public static void bindToObject(String line){
		String[] str = line.split(",");
		Record studRecord = new Record(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]));
		insertRecord(studRecord);
	}
	
	public static void main(String[] args) {		
		BufferedReader br = null;
		try {
			String currentLine;
			br = new BufferedReader(new FileReader("/Users/ramyapatil/Documents/Files/StudentRecords.txt"));
			while ((currentLine = br.readLine()) != null) {
				bindToObject(currentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		Map<customKey, Record> sortedMap = new TreeMap<customKey, Record>(recordsMap);
		printMap(sortedMap);
		
	}
}
