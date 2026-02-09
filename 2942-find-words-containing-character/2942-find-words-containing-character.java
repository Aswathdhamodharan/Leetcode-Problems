class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int length=words.length;
        ArrayList<Integer> lst=new ArrayList<>();
       for(int i=0;i<length;i++){
        if(words[i].contains(String.valueOf(x))){
            lst.add(i);
        }
       }
       return lst;
    }
}