
class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        ArrayList<Integer>arr = new ArrayList<>();
        ListNode temp = h1;
        while(temp!= null){
            arr.add(temp.val);
            temp = temp.next;
        }
        temp = h2;
        while(temp!= null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int[]arrr = new int[arr.size()];
        int idx = 0;
        for(int n : arr){
            arrr[idx++] = n;
        }
        Arrays.sort(arrr);
        ListNode head = new ListNode(arrr[0]);
        temp = head;
        for(int i = 1; i < arrr.length ; i++){
            ListNode next = new ListNode(arrr[i]);
            temp.next = next;
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}