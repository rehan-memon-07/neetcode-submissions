class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Character, Integer>[] arrmap = new HashMap[strs.length];
        boolean[] visited = new boolean[strs.length];

        
        for (int i = 0; i < strs.length; i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (char ch : strs[i].toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            arrmap[i] = map;
        }

        List<List<String>> ans = new ArrayList<>();

        for (int j = 0; j < arrmap.length; j++) {

            if (visited[j])
                continue;

            List<String> subl = new ArrayList<>();

            for (int k = j; k < arrmap.length; k++) {

                if (visited[k])
                    continue;

                if (arrmap[j].equals(arrmap[k])) {

                    subl.add(strs[k]);
                    visited[k] = true;
                }
            }

            ans.add(subl);
        }

        return ans;
    }
}