class Lev{


	Lev(){

	}

	public int lev(String s1, String s2){

		System.out.println(s1 +  " : " + s2);
		if(s2.length() == 0)
			return s1.length();
		if(s1.length() == 0)
			return s2.length();
		if(s1.charAt(0) == s2.charAt(0))
			return lev(s1.substring(1), s2.substring(1));


		int dist = Math.min(lev(s1.substring(1), s2), lev(s1, s2.substring(1)));
		dist = Math.min(dist, lev(s1.substring(1), s2.substring(1)));
		return 1+dist;


	}

	public int optimisedLev(String s1, String s2){

		int[][] D = new int[s1.length()+1][s2.length()+1];

		for(int i = 1 ; i < s1.length()+1 ; i++){
			D[i][0] = i;
		}

		for(int j =  1 ; j < s2.length()+1 ; j++){
			D[0][j] = j;
		}


		for(int j = 1  ; j  <= s2.length() ; j++){
			for(int i = 1  ; i  <= s1.length() ; i++){
				int subCost = s1.charAt(i-1) == s2.charAt(j-1) ? 0 : 1;

				int minD = Math.min(D[i-1][j]+1, D[i][j-1]+1);
				D[i][j] = Math.min(D[i-1][j-1]+subCost, minD);
			}
		}

		return D[s1.length()][s2.length()];

	}

	public static void main(String[] args) {
		

		Lev lev = new Lev();


		String a = "Saturday";
		String b = "Sunday";

		// System.out.println(a.substring(1));

		System.out.println(lev.optimisedLev(a,b));

	}

}