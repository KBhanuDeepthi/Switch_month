import java.util.Scanner;

class Switch_month {

	public static void main(String[] args) {
		int month;
		String monthname;
		System.out.println("Enter the month:");
		Scanner sc=new Scanner(System.in);
		month=sc.nextInt();
		switch(month) {
		case 1: monthname="January";
		        break;
		case 2: monthname="February";
		        break;
		case 3: monthname="March";
                break;
        case 4: monthname="April";
                break;
        case 5: monthname="May";
                break;
        case 6: monthname="June";
                break;
        case 7: monthname="July";
                break;
        case 8: monthname="August";
                break;
        case 9: monthname="September";
                break;
        case 10: monthname="October";
                break;
        case 11: monthname="November";
                break;
        case 12: monthname="December";
                break;
        default: monthname="Invalid month";
                break;
		
		}
		System.out.println("monthname is:" +monthname);


	}

}
