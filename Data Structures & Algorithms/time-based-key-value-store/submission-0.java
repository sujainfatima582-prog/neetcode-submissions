class TimeMap {

    HashMap<String,List<Integer>> times;
    HashMap<String,List<String>> values;

    public TimeMap() {

        times = new HashMap<>();
        values = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!times.containsKey(key)){
            times.put(key,new ArrayList<>());
            values.put(key,new ArrayList<>());
        }
        times.get(key).add(timestamp);
        values.get(key).add(value);
        
    }
    
    public String get(String key, int timestamp) {
        if(!times.containsKey(key)){
            return "";
        }
        List<Integer> t = times.get(key);
        List<String> v = values.get(key);

        int low = 0;
        int high = t.size()-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(t.get(mid) <= timestamp){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(ans == -1){
            return "";
        }
        return v.get(ans);
        
    }
}
