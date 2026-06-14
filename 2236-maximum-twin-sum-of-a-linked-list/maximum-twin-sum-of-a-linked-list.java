
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer>arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int i = 0;
        int j = arr.size()-1;
        int max = Integer.MIN_VALUE;
        while(i < j){
            int sum =  arr.get(i) + arr.get(j); 
            max = Math.max(sum,max);
            i++;
            j--;
        }
        return max;
    }
}