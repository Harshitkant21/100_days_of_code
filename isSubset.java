// Platform GFG https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1 
// Day #13 of 100 Days_Of_code

// 1) Using double hashmaps
class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        // Create HashMaps to store the frequency of elements in a1 and a2
        HashMap<Long, Long> a = new HashMap<Long, Long>();
        HashMap<Long, Long> b = new HashMap<Long, Long>();
        
        // Count the frequency of elements in a1
        for (long i : a1) {
            a.put(i, a.getOrDefault(i, 0L) + 1);
        }
        
        // Count the frequency of elements in a2
        for (long i : a2) {
            b.put(i, b.getOrDefault(i, 0L) + 1);
        }
        
        // Check if all elements in a2 are present in a1 with the correct frequency
        for (long num : a2) {
            if (!a.containsKey(num) || a.get(num) < b.get(num)) {
                return "No"; // If any element in a2 is not found in a1 or has a higher frequency, it's not a subset
            }
        }
        
        return "Yes"; // If all elements in a2 are found in a1 with the correct frequency, it's a subset
    }
}

// Time Complexity : O(n+m)
// Space Complexity : O(n+m)

// MORE OPTIMIZED
// 2) Using single hashmap

class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        // Create a HashMap to store the frequency of elements in a1
        HashMap<Long, Long> frequencyMap = new HashMap<Long, Long>();

        // Count the frequency of elements in a1
        for (long num : a1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0L) + 1);
        }

        // Check if all elements in a2 are present in a1 with the correct frequency
        for (long num : a2) {
            Long count = frequencyMap.get(num);
            if (count == null || count <= 0) {
                return "No"; // If any element in a2 is not found in a1 or has a higher frequency, it's not a subset
            } else {
                frequencyMap.put(num, count - 1);
            }
        }

        return "Yes"; // If all elements in a2 are found in a1 with the correct frequency, it's a subset
    }
}

// Time Complexity : O(max(n,m))
// Space Complexity : O(n)
