class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer>q = new LinkedList<>();
        for(int i = 1 ; i < 10 ; i++){
            q.add(i);
        }
        ArrayList<Integer>ans = new ArrayList<>();
        while(q.size() != 0){
            int num = q.remove();
            if(num >= low && num <= high){
                ans.add(num);
            }
            int ld = (num % 10);
            if(ld != 9){
                num = num * 10;
                num = num + ld + 1;
                if(!(num > high)){
                    q.add(num);
                }
            }
        }
        return ans;
    }
}