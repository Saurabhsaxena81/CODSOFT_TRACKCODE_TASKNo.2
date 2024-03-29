import java.util.Scanner;

/**
 * StudentGradeCalculator
 * 
 * Input:Take input of marks obtained (out of 100) in each subject
 * 
 * CalculateTotalMarks:Sum of all the marks obtained in all the subjects
 * 
 * Calculate AveragePercentage: Divide the total marksby the total number of subjects to get the verage percentage
 * 
 * Grade Calculation:Assign grade based on the average percentage achieved
 * 
 * Display result: Show the total marks ,average percentage and the corresponding grade to the user 
 * 
 */
public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Total Number of Subjects ");
        int num= input.nextInt();
        double[] arr = new double[num];
        for(int i=0;i<num;i++){
            System.out.println("Input marks of the "+(i+1)+"st subject:");
            double marks=input.nextDouble();
            if(marks>=0 && marks<=100){
                arr[i]=marks;
            }
            else{
                System.out.println("Please enter a valid number ");
                arr[i]=input.nextDouble();
            }
           
        }
        // for(int i=0;i<num;i++){
        //     System.out.println(arr[i]);
        // }
        double sum=0;
        sum = sumOfMarks(arr);
        System.out.println("Total marks: "+sumOfMarks(arr));
        double avg=0;
        avg = AveragePercentageCalculation(arr,sum);
        System.out.println("Average percentage: "+avg+"%");
        System.out.println("Grade of You :"+gradeCalculation(avg));

    }
    public static double AveragePercentageCalculation(double[] arr,double sum){
        double grade =0;
        grade = sum/arr.length;
        return grade;
    }
    public static String gradeCalculation(double avg){
        String grade="";
        if(avg>=90 && avg <=100){
            grade="A+";
        }
        else  if(avg>=85 && avg <=89){
            grade="A";
        }
        else  if(avg>=80 && avg <=84){
            grade="A-";
        }
        else  if(avg>=75 && avg <=79){
            grade="B+";
        }
        else  if(avg>=70 && avg <=74){
            grade="B";
        }
        else  if(avg>=65 && avg <=69){
            grade="C+";
        }
        else  if(avg>=60 && avg <=64){
            grade="C";
        }
        else  if(avg>=54 && avg <=59){
            grade="D+";
        }

        else  if(avg>=50 && avg <=54){
            grade="D";
        }
        else  if(avg>=40 && avg <=49){
            grade="E";
        }
        else  if(avg>=0 && avg <=39){
            grade="F";
        }
        return grade;
    }
    public static double sumOfMarks(double[] arr){
        double sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}