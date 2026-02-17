public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive(String str, char c){
		//initiate counter and increase counter if charat x = c
		int x = 0;
		int count = 0;
		while(x < str.length()){
			
			if(str.charAt(x) == c){
				count++;
			}

			x++;
			//return if c occurs 5 times
			if(count >=5){
				return x;
			}
		}
		//return -1 if 5 instances of c doesn't occur
		return -1;
	}

	public static int countLetter(String str, char c){
		//initiate counter
		int count = 0;
		//for loop for length str.length
		for(int i = 0; i < str.length();i++){
			if (str.charAt(i) == c){
				count+= 1;
			}
		}

		return count;
	}

	public static int oddSum(int x, int y){
		//initiate counter and add to it for every odd number from min to max of x and y
		int count = 0;
		for(int i = Math.min(x,y); i <= Math.max(x,y); i++){
			if(i%2 == 1){
				count += i;
			}
		}

		return count;
	}

}
