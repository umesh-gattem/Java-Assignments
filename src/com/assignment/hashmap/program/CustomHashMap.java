package com.assignment.hashmap.program;

public class CustomHashMap<K, V> {

	@SuppressWarnings("unchecked")
	KeyValuePair<K, V> mapList[] = new KeyValuePair[100];

	public void pull(K key, V value) {
		int index = getHash(key);
		store(index, key, value);
	}

	private void store(int index, K key, V value) {
		KeyValuePair<K, V> list = mapList[index];
		boolean duplicate = false;
		if (list == null) {
			System.out.println("New key " + key + " and Value " + value + " are inserted at index " + index);
			mapList[index] = new KeyValuePair<K, V>(key, value);
			return;
		} else {
			while (list.next != null) {
				if (list.getKey().equals(key)) {
					System.out.println("Duplicate is found for the key " + key);
					list.setValue(value);
					duplicate = true;
					break;

				}
				list = list.next;
			}
			if (!duplicate) {
				list.next = new KeyValuePair<K, V>(key, value);
			}
		}
		System.out.println("New key " + key + " and Value " + value + " are inserted at index " + index);
	}

	private int getHash(K key) {
		int hash = key.hashCode();
		return hash % 100;
	}

	public V get(K key) {
		int index = getHash(key);
		KeyValuePair<K, V> list = mapList[index];
		while (list != null) {
			if (list.getKey().equals(key)) {
				System.out.println("Value for  key " + key + "  is " + list.getValue());
				return list.getValue();
			}
			list = list.next;
		}
		System.out.println("Entered key dont have any value.");
		return null;
	}

	public void remove(K key) {
		int index = getHash(key);
		KeyValuePair<K, V> list = mapList[index];
		if (list == null) {
			System.out.println("Key didn't find in the HashMap: ");
		}
		if (list.getKey().equals(key)) {
			if (list.next == null)
				mapList[index] = null;
			System.out.println("Key " + key + " is removed at the index " + index);
			return;
		}
		KeyValuePair<K, V> previous = null;
		do {
			if (list.getKey().equals(key)) {
				if (previous == null) {
					list = list.getNext();
				} else {
					previous.next = list.getNext();
				}
				System.out.println("Key " + key + "  is removed at index " + index);
				break;
			}
			list = list.next;
		} while (list != null);
		mapList[index] = list;
	}

	public int size() {
		int count = 0;
		for (int index = 1; index < mapList.length; index++) {
			if (mapList[index] != null) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

	public void keySet() {
		System.out.println("Keys present are");
		for (int index = 1; index < mapList.length; index++) {
			if (mapList[index] != null) {
				System.out.print("  "+mapList[index].getKey());
			}
		}
	}
}
