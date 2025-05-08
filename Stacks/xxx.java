//import java.util.*;
import java.util.Stack;
public class xxx{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(5);
        st.push(20);
        st.push(12);
        System.out.println(st.isEmpty());
        st.push(28);
        st.push(45);
        st.push(18);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is: "+st.size());

        while (st.size()>1) {//for first element print
            st.pop();
        }
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
    }
}


//1st q
// import java.util.*;
// public class solution {
//     public static void main(String[] args) {
//         final int NoOfSubjects = 5; 
//         double[] marks = new double[NoOfSubjects];
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter marks for Subjects:");
//         for (int i = 0; i < NoOfSubjects; i++) {
//             System.out.print("Subject " + (i + 1) + ": ");
//             marks[i] = scanner.nextDouble();
//         }

//         double totalMarks = 0;
//         for (int i = 0; i < NoOfSubjects; i++) {
//             totalMarks += marks[i];
//         }

//         double averageMarks = totalMarks / NoOfSubjects;
//         System.out.println("The average marks of the student: " + averageMarks);

//         scanner.close();
//     }
// }


//2nd q
// import java.util.*;
// public class solution {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         ArrayList<Integer> expenditures = new ArrayList<>();
        
//         System.out.println("Enter the number of days you want to record expenses for:");
//         int days = scanner.nextInt();
        
//         // Input daily expenditures
//         System.out.println("Enter your daily expenditures:");
//         for (int i = 1; i <= days; i++) {
//             System.out.print("Day " + i + ": ");
//             int expense = scanner.nextInt();
//             expenditures.add(expense);
//         }
        
//         // Calculate total expenditure
//         int totalExpenditure = 0;
//         for (int expense : expenditures) {
//             totalExpenditure += expense;
//         }
        
//         // Display result
//         System.out.println("Total Expenditure for " + days + " days: " + totalExpenditure);
        
//         scanner.close();
//     }
// }


