import java.util.Scanner;
import java.text.DecimalFormat;
public class BaseballStats {

	public static void main(String[] args) {
		DecimalFormat decFor = new DecimalFormat("0.000");
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Player's Name");
		String PlayerName = input.nextLine();
		System.out.println("How many at bats did the player have?");
		double AtBats = input.nextInt();
		System.out.println("How many hits did the player have?");
		double hits = input.nextInt();
		System.out.println("How many doubles did the player have?");
		double doubles = input.nextInt();
		System.out.println("How many triples did the player have?");
		double triples = input.nextInt();
		System.out.println("How many home runs did the player have?");
		double homers = input.nextInt();
		System.out.println("How many runs did the player have?");
		double runs = input.nextInt();
		System.out.println("How many walks did the player have?");
		double walks = input.nextInt();
		double BattingAverage = (hits/AtBats);
		double OnBasePercent = ((hits + walks) / (AtBats + walks));
		double TotalBases = ((hits - doubles - triples - homers)+(doubles * 2)+(triples * 3)+(homers*4));
		double SluggingPercent = (TotalBases / AtBats);
		double OPS = OnBasePercent + SluggingPercent;
		System.out.println(PlayerName);
		System.out.println("Batting Average is " + decFor.format(BattingAverage));
		System.out.println("On Base Percentage is " + decFor.format(OnBasePercent));
		System.out.println("Slugging Percentage is " + decFor.format(SluggingPercent));
		System.out.println("OPS is " + decFor.format(OPS));
		System.out.println("Total Bases is " + TotalBases);
		
	}

}
