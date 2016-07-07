package com.assignment.hashmap.program;

public class MainCustomHashMap {

	public static void main(String[] args) {

		CustomHashMap<Integer, Integer> hashMap = new CustomHashMap<Integer, Integer>();
		hashMap.pull(1, 34);
		hashMap.pull(2, 110);
		hashMap.pull(3, 36);
		hashMap.pull(16, 06);
		hashMap.get(3);
		hashMap.pull(99, 106);
		hashMap.pull(45, 36);
		hashMap.pull(145, 15);
		hashMap.pull(146, 54);
		hashMap.remove(3);
		hashMap.get(1);
		hashMap.get(3);
		hashMap.size();
		hashMap.keySet();
	}

}
