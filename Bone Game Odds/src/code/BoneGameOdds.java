package code;

public class BoneGameOdds {

	public static void main(String[] args) {
		
		int score = 0;
		int target = 7;
		int count = 0;
		
		for (int rectangles = 0; rectangles < 2; rectangles++)
			for( int squares = 0; squares < 2; squares++)
				for( int triangles = 0; triangles < 2; triangles++)
					for( int circles = 0; circles < 2; circles++)
						for( int diamonds = 0; diamonds < 2; diamonds++)
						{
							System.out.println("R: " + rectangles);
							System.out.println("S: " + squares);
							System.out.println("T: " + triangles);
							System.out.println("C: " + circles);
							System.out.println("D: " + diamonds);
							score = rectangles + squares + triangles*2 + circles*3 + diamonds*4;
							System.out.println("Score: " + score);
							System.out.println("==================");
							if(score >= target)
								count++;
						}
				
		System.out.println( count / 32.0 ); //chance as a decimal get the same or higher 
	}
}
	


