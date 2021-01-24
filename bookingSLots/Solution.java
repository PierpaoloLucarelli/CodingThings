import java.util.*;


public class Solution{
	

	public static String[][] findSlots(String[][] c1, String[][]  c2, String[] bounds1, String[] bounds2, int t){


		String[][] sol = null;
		System.out.println(Integer.valueOf(bounds1[0].split(":")[1]));

		int min = Math.max(Integer.valueOf(bounds1[0].split(":")[0]), Integer.valueOf(bounds2[0].split(":")[0]));
		int max = Math.min(Integer.valueOf(bounds1[1].split(":")[0]), Integer.valueOf(bounds2[1].split(":")[0]));


		int[] max = getSmallerTime(convertTime(bounds1), convertTime(bounds2));

		return sol;

	}

	public static int[] convertTime(String t){
		int[] sol = new int[2];
		sol[0] = Integer.valueOf(t.split(":")[0]);
		sol[1] = Integer.valueOf(t.split(":")[1]);
		return sol;
	}

	public static int[] getSmallerTime(int[] t1, int[] t2){
		if(t1[0] < t2[0])
			return t1;
		if(t1[0] = t2[0])
			return t1[1] < t2[1] ? t1 : t2;
		return t2;
	}


	public static void main(String[] args)	{


		String[][] c1 = new String[3][2];
		String[][] c2 = new String[4][2];


		c1[0] = new String[]{"9:00", "10:30"};
		c1[1] = new String[]{"12:00", "13:00"};
		c1[2] = new String[]{"16:00", "18:00"};

		String[] bounds1 = new String[]{"9:00", "20:00"};


		c2[0] = new String[]{"10:00", "11:30"};
		c2[1] = new String[]{"12:30", "14:30"};
		c2[2] = new String[]{"14:30", "15:00"};
		c2[3] = new String[]{"16:00", "17:00"};
		
		String[] bounds2 = new String[]{"10:00", "18:00"};

		int t = 30;
		String[][] slots = findSlots(c1,c2,bounds1,bounds2,t);



	}
}