class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Step 1: Count the preferences of the students
        Map<Integer, Integer> studentsPref = new HashMap<>();
        studentsPref.put(0, 0);
        studentsPref.put(1, 0);

        for (int preference : students) {
            studentsPref.put(preference, studentsPref.get(preference) + 1);
        }

        // Step 2: Go through the sandwiches stack in order
        for (int sandwich : sandwiches) {
            // If there is a student who wants this sandwich, they take it
            if (studentsPref.get(sandwich) > 0) {
                studentsPref.put(sandwich, studentsPref.get(sandwich) - 1);
            } else {
                // No remaining students want this type of sandwich, so stop
                break;
            }
        }

        // Step 3: Anyone left in the map couldn't eat
        return studentsPref.get(0) + studentsPref.get(1);
    }
}