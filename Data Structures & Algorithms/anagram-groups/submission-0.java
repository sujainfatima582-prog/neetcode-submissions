class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charArray = s.toCharArray();

            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            
            if(!map.containsKey(sortedS)){
            map.put(sortedS, new ArrayList<String>());
            }
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
