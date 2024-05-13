import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Boolean continueProgram = true;
        
        while (continueProgram){
            System.out.println("welcome to -{(# College System #)}- how can I help you?");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Choose one of the following options by typing the number you want :-");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1) Student");
            System.out.println("2) Professor");
            System.out.println("3) Assistant professor");
            System.out.println("4) Exit the program.");
            System.out.println("------------------------------------------------------------------------");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int selection = input.nextInt();
            input.nextLine();
            
            switch(selection){
                case 1:
                    Boolean continueStudent = true;
                    while (continueStudent){

                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("Choose one of the following options by typing the number you want :-");
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("1) Register ,Get ID, and Get Email");
                        System.out.println("2) Calculate your GPA");
                        System.out.println("3) Return to main menu");
                        System.out.println("------------------------------------------------------------------------");

                        System.out.print("Enter your choice: ");
                        int studentSelection = input.nextInt();
                        input.nextLine();

                        switch(studentSelection){
                            case 1:
                                System.out.print("Enter your name: ");
                                String name = input.nextLine();
            
                                System.out.print("Enter the year you were born in: ");
                                int year_test = input.nextInt();
                                input.nextLine();
                    
                                if (year_test <= 1990){
                                    System.out.println("You entered an invalid year, please register again with correct info");
                                }
                                else{
                                    int year = year_test;
            
                                    System.out.print("Enter the college you are in (cs - bus - masscom - eng): ");
                                    String college_test = input.nextLine().toLowerCase();
                                    if (college_test.equals("cs") || college_test.equals("bus") || college_test.equals("masscom") || college_test.equals("eng")){
                                        String college = college_test;
                                        Student student1 = new Student(name, year, college);
                                        System.out.println("You have been registered");
                                        System.out.println("Your student ID is: " + student1.CollegeID());
                                        System.out.println("Your student email is: " + student1.CollegeEmail());
                                    }
                                    else{
                                        System.out.println("You entered an invalid year, please register again with correct info");
                                    }
                                }
                                break;
            
                            case 2:
                                System.out.println("Enter your grades (out of 100) and credit hours (out of 4):");
                                System.out.println("Enter x to calculate GPA");
                                System.out.println("------------------------------------------------------------------------");
                                
                                java.text.DecimalFormat dfm = new java.text.DecimalFormat("0.00");
    
                                double grade = 0;
                                double total = 0;
                                int sum = 0;
                                int[] course = {1,2,3,4,5,6};
                                int[] creditHours = new int[6];
                                String[] userGrade = new String[6];
                                
                                for(int i=0; i<6;i++){
                                    System.out.print("Enter A or B+ or B or C+ or C or D+ or D");
                                    System.out.print("course " + course[i] + " Grade" + ": ");
                                    userGrade[i] = input.nextLine();
                                    System.out.print("Enter course " + course[i] + " number of credit hours: ");
                                    creditHours[i] = input.nextInt();
                                    input.nextLine();

                                    if(userGrade[i].equalsIgnoreCase("A")){
                                        grade = 4;
                                    }else if(userGrade[i].equalsIgnoreCase("B+")){
                                        grade = 3.5;
                                    }else if(userGrade[i].equalsIgnoreCase("B")){
                                        grade = 3;
                                    }else if(userGrade[i].equalsIgnoreCase("C+")){
                                        grade = 2.5;
                                    }else if(userGrade[i].equalsIgnoreCase("C")){
                                        grade = 2;
                                    }else if(userGrade[i].equalsIgnoreCase("D+")){
                                        grade = 1.5;
                                    }else if(userGrade[i].equalsIgnoreCase("D")){
                                        grade = 1;
                                    }else{
                                        grade = 0;
                                    }		
                                    total = total + (grade * creditHours[i]);
                                    sum = sum+=creditHours[i];	
                                }
                                    System.out.println("Your GPA : " + dfm.format(total/sum));
                                                            
                                    break;
                                
                            case 3:
                                continueStudent = false;
                            break;
                        }
                    }
                break;
                
                case 2:
                    Boolean continueProfessor = true;
                    while (continueProfessor){

                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("Choose one of the following options by typing the number you want :-");
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("1) Register ,Get ID, and Get Email");
                        System.out.println("2) Calculate class pass percentage");
                        System.out.println("3) Return to main menu");
                        System.out.println("------------------------------------------------------------------------");

                        System.out.print("Enter your choice: ");
                        int professorSelection = input.nextInt();
                        input.nextLine();

                        switch (professorSelection){
                            case 1:
                                System.out.print("Enter your name: ");
                                String name = input.nextLine();
            
                                System.out.print("Enter the year you were born in: ");
                                int year_test = input.nextInt();
                                input.nextLine();
                    
                                if (year_test <= 1920){
                                    System.out.println("You entered an invalid year, please register again with correct info");
                                }
                                else{
                                    int year = year_test;
            
                                    System.out.print("Enter the college you are in (cs - bus - masscom - eng): ");
                                    String college_test = input.nextLine().toLowerCase();
                                    if (college_test.equals("cs") || college_test.equals("bus") || college_test.equals("masscom") || college_test.equals("eng")){
                                        String college = college_test;

                                        System.out.print("Enter your expertise : ");
                                        String expertise = input.nextLine();

                                        Professor professor1 = new Professor(name, year, college, expertise);
                                        System.out.println("You have been registered");
                                        System.out.println("Your college ID is: " + professor1.CollegeID());
                                        System.out.println("Your college email is: " + professor1.CollegeEmail());
                                    }
                                    else{
                                        System.out.println("You entered an invalid year, please register again with correct info");
                                    }
                                }
                            break;
                            
                            case 2:
                                double[] studentGrades = new double[1000];
                                double total = 0;
                                int courseStudentNumber = 0;
                                System.out.print("Enter number of students in course: ");
                                courseStudentNumber = input.nextInt();
                                input.nextLine();

                                for (int i=0; i<courseStudentNumber; i++){
                                    System.out.print("Enter student grade:");
                                    studentGrades[i] = input.nextDouble();
                                    input.nextLine();
                                    total += studentGrades[i];
                                }

                                System.out.println("Class pass percentage: "+ (total/courseStudentNumber) + "%");
                            break;

                            case 3:
                                continueProfessor = false;
                            break;
                        }   
                    }
                break;

                case 3:
                    Boolean continueAssistantProfessor = true;
                    while (continueAssistantProfessor){
                        System.out.println();
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("Choose one of the following options by typing the number you want :-");
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("1) Register ,Get ID, and Get Email");
                        System.out.println("2) Send announcement to students");
                        System.out.println("3) Return to main menu");
                        System.out.println("------------------------------------------------------------------------");

                        System.out.print("Enter your choice: ");
                        int professorAssistantSelection = input.nextInt();
                        input.nextLine();

                        switch (professorAssistantSelection){
                            case 1:
                                System.out.print("Enter your name: ");
                                String name = input.nextLine();
            
                                System.out.print("Enter the year you were born in: ");
                                int year_test = input.nextInt();
                                input.nextLine();
                    
                                if (year_test <= 1920){
                                    System.out.println("You entered an invalid year, please register again with correct info");
                                }
                                else{
                                    int year = year_test;
        
                                    System.out.print("Enter the college you are in (cs - bus - masscom - eng): ");
                                    String college_test = input.nextLine().toLowerCase();
                                    if (college_test.equals("cs") || college_test.equals("bus") || college_test.equals("masscom") || college_test.equals("eng")){
                                        String college = college_test;

                                        System.out.print("Enter your field of expertise: ");
                                        String field = input.nextLine();

                                        System.out.print("Enter your main Professor: ");
                                        String mainProf = input.nextLine();

                                        AssistantProfessor assistantProfessor1 = new AssistantProfessor(name, year, college, field, mainProf);
                                        System.out.println("You have been registered");
                                        System.out.println("Your college ID is: " + assistantProfessor1.CollegeID());
                                        System.out.println("Your college email is: " + assistantProfessor1.CollegeEmail());
                                    }
                                }
                            break;    

                            case 2:
                                System.out.println("Type the announcement below: ");
                                System.out.print("message: ");
                                String message = input.nextLine();
                                System.out.println("------------------------------------------------------------------------");
                                System.out.println("Choose one of the following options: ");
                                System.out.println("1) Delete announcement.");
                                System.out.println("2) Send announcement.");
                                System.out.print("Choice: ");
                                int choice = input.nextInt();
                                input.nextLine();

                                System.out.println("------------------------------------------------------------------------");

                                if (choice == 1){
                                    System.out.println("Announcement has been deleted");
                                }
                                else if (choice == 2){
                                    System.out.println("Announcement has been sent");
                                }
                                else{
                                    System.out.println("invalid choice");
                                }

                            break;

                            case 3:
                                continueAssistantProfessor = false;
                            break;

                        }
                    }    
                break;
                
                case 4:
                    continueProgram = false;
                break;
                
            }
        }  
    }
}
    