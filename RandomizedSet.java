// Platform Leetcode https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150
// Day #32 of 100 Days_Of_code

class RandomizedSet {
    private List<Integer> mylist;       // List to store the elements
    private Map<Integer, Integer> mymap; // Map to store the element-to-index mapping

    public RandomizedSet() {
        mylist = new ArrayList<Integer>(); // Initialize the list
        mymap = new HashMap<Integer, Integer>(); // Initialize the map
    }

    // Inserts a value into the data structure.
    public boolean insert(int val) {
        if (mymap.containsKey(val)) return false; // If value already exists, return false.
        mymap.put(val, mylist.size()); // Map the value to its index in the list.
        mylist.add(val); // Add the value to the end of the list.
        return true; // Return true to indicate a successful insertion.
    }

    // Removes a value from the data structure.
    public boolean remove(int val) {
        if (!mymap.containsKey(val)) return false; // If value doesn't exist, return false.
        int index = mymap.get(val); // Get the index of the value to be removed.
        int last = mylist.get(mylist.size() - 1); // Get the last element in the list.
        mylist.set(index, last); // Replace the element at 'index' with the 'last' element.
        mymap.put(last, index); // Update the index of 'last' element in the map.
        mymap.remove(val); // Remove the value from the map.
        mylist.remove(mylist.size() - 1); // Remove the last element from the list.
        return true; // Return true to indicate a successful removal.
    }

    // Returns a random element from the data structure.
    public int getRandom() {
        int rand = (int) (Math.random() * mylist.size()); // Generate a random index.
        return mylist.get(rand); // Return the element at the random index.
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

// Average Space and Time complexity is : O(1)
