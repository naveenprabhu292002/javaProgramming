package refxy;

//public class challenge3 {
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.*;
	public class challenge3 {
	    public static void main(String args[] ) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String[] temp = br.readLine().trim().split("\\s+");
	        int n = Integer.parseInt(temp[0]);
	        int m = Integer.parseInt(temp[1]);
	        int count = 0;
	        char[][] mat = new char[n][m];
	        for(int i=0;i<n;i++){
	            mat[i]=br.readLine().trim().toCharArray();
	        }
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(j+3<=m-1){
	                   if(mat[i][j]=='s'
	                   && mat[i][j+1]=='a'
	                   && mat[i][j+2]=='b'
	                   && mat[i][j+3]=='a'){
	                       count++;
	                   }
	               }
	                if(i+3<=n-1){
	                   if(mat[i][j]=='s'
	                   && mat[i+1][j]=='a'
	                   && mat[i+2][j]=='b'
	                   && mat[i+3][j]=='a'){
	                       count++;
	                   }
	               }
	               if(i+3<=n-1 && j+3<=m-1){
	                   if(mat[i][j]=='s'
	                   && mat[i+1][j+1]=='a'
	                   && mat[i+2][j+2]=='b'
	                   && mat[i+3][j+3]=='a'){
	                       count++;
	                   }
	               }
	                if(i-3>=0 && j+3<=m-1){
	                   if(mat[i][j]=='s'
	                   && mat[i-1][j+1]=='a'
	                   && mat[i-2][j+2]=='b'
	                   && mat[i-3][j+3]=='a'){
	                       count++;
	                    }
	                }
	            }
	        }
	        System.out.println(count);
	    }
	}


