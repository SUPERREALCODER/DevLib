class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()<=words[j].length() && i!=j ){
                    if(isPrefixAndSuffix(words[i],words[j]) == true){
                            c=c+1;
                    }
                }
            }
        }
        return c;
    }
    static boolean isPrefixAndSuffix(String str1,String str2){
            if(str1.compareTo(str2.substring(0,str1.length()))==0 && str1.compareTo(str2.substring(str2.length()-str1.length(),str2.length()))==0){
                return true;
            }
            else 
            return false;
    }
}