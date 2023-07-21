package refxy;

public class codemarkques {
	 static void minCost(int costs[][], int N)
	  {
	 
	    // Corner Case
	    if (N == 0)
	      return;
	 
	    // Auxiliary 2D dp array
	    int dp[][] = new int[N][3];
	 
	    // Base Case
	    dp[0][0] = costs[0][0];
	    dp[0][1] = costs[0][1];
	    dp[0][2] = costs[0][2];
	 
	    for (int i = 1; i < N; i++) {
	 
	      // If current house is colored
	      // with red the take min cost of
	      // previous houses colored with
	      // (blue and green)
	      dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2])
	        + costs[i][0];
	 
	      // If current house is colored
	      // with blue the take min cost of
	      // previous houses colored with
	      // (red and green)
	      dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2])
	        + costs[i][1];
	 
	      // If current house is colored
	      // with green the take min cost of
	      // previous houses colored with
	      // (red and blue)
	      dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1])
	        + costs[i][2];
	    }
	 
	    // Print the min cost of the
	    // last painted house
	    System.out.println(
	      Math.min(dp[N - 1][0],
	               Math.min(dp[N - 1][1], dp[N - 1][2])));
	  }
	 
	  // Driver code
	  public static void main(String[] args)
	  {
	 
	    int costs[][] = { { 17,2,17 },
	                     { 16,16,5 },
	                     {14,3,19  } };
	 
	    int N = costs.length;
	 
	    // Function Call
	    minCost(costs, N);
	  }
	}




