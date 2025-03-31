public class PracticeProblem {
	//Create a method called selectionSortName(String[] names, int[] ages) that accepts two parallel arrays, one of Strings and one of ints. 
	//Sort the parallel arrays by their names. Ignore casing. Keep the arrays parallel.
	public static void selectionSortName(String[] names, int[] ages) {
		for (int i = 0; i < ages.length - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < ages.length; j++) {
				if (names[j].compareToIgnoreCase(names[smallestIndex]) < 0) {
					smallestIndex = j;
				}
			}
			//swap
			int temp = ages[i];
			ages[i] = ages[smallestIndex];
			ages[smallestIndex] = temp;
			String temp2 = names[i];
			names[i] = names[smallestIndex];
			names[smallestIndex] = temp2;
		}
	}

	//Create a method called selectionSortAge(String[] names, int[] ages) that accepts two parallel arrays, one of Strings and one of ints. 
	//Sort the parallel arrays by their ages. Ignore casing. Keep the arrays parallel.
	public static void selectionSortAge(String[] names, int[] ages) {
		for (int i = 0; i < ages.length - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < ages.length; j++) {
				if (ages[j] < ages[smallestIndex]) {
					smallestIndex = j;
				}
			}
			//swap
			int temp = ages[i];
			ages[i] = ages[smallestIndex];
			ages[smallestIndex] = temp;
			String temp2 = names[i];
			names[i] = names[smallestIndex];
			names[smallestIndex] = temp2;
		}
	}
}
