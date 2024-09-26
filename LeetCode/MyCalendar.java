package LeetCode;
import java.util.Map;
import java.util.TreeMap;

class MyCalendar {
    // TreeMap to store the booked events with end time as key and start time as value
    TreeMap<Integer, Integer> calender = new TreeMap<>();
    
    // Constructor to initialize the calendar
    public MyCalendar() {
        // Placeholder entry to avoid null checks (acts as an infinite end time event)
        calender.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
    
    // Method to book an event in the calendar
    public boolean book(int start, int end) {
        // Find the first event that starts after the 'start' time of the new event
        Map.Entry<Integer, Integer> pair = calender.higherEntry(start);
        // Check if the end time of the new event is before the next event's start time
        boolean res = end <= pair.getValue();
        if (res) {
            // If there's no overlap, store the new event in the calendar
            calender.put(end, start);
        }
        return res;
    }
    
    // Main function to demonstrate the working of the MyCalendar class
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();

        // Example of booking events
        System.out.println(myCalendar.book(10, 20));  // Output: true (booked successfully)
        System.out.println(myCalendar.book(15, 25));  // Output: false (overlap with 10, 20)
        System.out.println(myCalendar.book(20, 30));  // Output: true (booked successfully)
        System.out.println(myCalendar.book(25, 35));  // Output: false (overlap with 20, 30)
        System.out.println(myCalendar.book(30, 40));  // Output: true (booked successfully)
    }
}
