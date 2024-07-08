public class Solution {
    public int findTheWinner(int n, int k) {
        int i  = 1;
        int count = n;
        boolean[] vis = new boolean[n + 1];
        vis[0] = true;
        while(count != 1) {
            int c = k;
            while(c != 1) {
                if(!vis[i]) {
                    c--;
                }
                i++;
                if(i > n) {
                    i = 1;
                }
            }
            while(vis[i]) {
                i++;
                if(i > n){
                    i = 1;
                }
            }
            vis[i] = true;
            count--;
        }

        for(int j = 1; j <= n; j++ ) {
            if(!vis[j]) {
                return j;
            }
        }

        return - 1;
    }
}

