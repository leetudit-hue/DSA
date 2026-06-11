class Solution {
    public boolean consecutiveSetBits(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder temp = new StringBuilder();
        int count = 0;
        for(int i = 0 ; i < binary.length() ; i++){
            temp.append(binary.charAt(i));
            String tem = temp.toString();
            if(tem.contains("11")){
                count++;
                temp.delete(0,temp.length()-1);
            }
            if(count > 1) return false;
        }
        if(count == 1) return true;
        return false;
        
    }
}