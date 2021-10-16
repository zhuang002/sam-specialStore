import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static HashMap<Grid, Integer> grids = new HashMap<>();
	static int R,C,W,L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		R=sc.nextInt();
		C=sc.nextInt();
		W=sc.nextInt();
		L=sc.nextInt();
		
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y=sc.nextInt();
			if (increaseCounts(x,y)) {
				System.out.println("Special store was found on:"+(i+1));
				return;
			}
		}
		
		System.out.println("Special store was not located");
		

	}
	
	private static boolean increaseCounts(int x, int y) {
		// TODO Auto-generated method stub
		ArrayList<Grid> grids = getAllGridsContainsXY(x,y);
		for (Grid grid:grids) {
			if (increaseCount(grid)) {
				return true;
			}
		}
		
		return false;
	}

	private static boolean increaseCount(Grid grid) {
		// TODO Auto-generated method stub
		return false;
	}

	private static ArrayList<Grid> getAllGridsContainsXY(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}

class Grid {
	int x,y;
	
	public Grid(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grid other = (Grid) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
