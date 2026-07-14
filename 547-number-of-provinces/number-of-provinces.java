class Solution {
    public static void bfs(int i , int[][]adjM , boolean[]vis){
        int n = adjM.length;
        Queue<Integer>q = new LinkedList<>();
        q.add(i);
        while(q.size() > 0){
            int val = q.remove();
            for(int j = 0 ; j < n ; j++){
                if(adjM[val][j] == 1 && vis[j] == false){
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] adjM) {
        int n = adjM.length;
        boolean[]vis = new boolean[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(vis[i] == false){
                bfs(i , adjM , vis);
                count++;
            }
        }
        return count;
    }
}