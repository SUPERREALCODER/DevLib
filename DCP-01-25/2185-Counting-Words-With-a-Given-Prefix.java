class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
                if(words[i].length()>= pref.length() && pref.compareTo(words[i].substring(0,pref.length())) == 0)
                c=c+1;
        }
        return c;
    }
}