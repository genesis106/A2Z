package A2Z.Graphs.DfsBfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder1 {
    private static boolean check(String s1, String s2) {
        int n = s1.length(), diff = 0;
        for (int i = 0; i < n; i++) {
            int c1 = s1.charAt(i), c2 = s2.charAt(i);
            if (c1 != c2) {
                if (diff == 1) {
                    return false;
                }
                ++diff;
            }
        }
        return diff == 1;
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Queue<String> que = new LinkedList<>();
        int seqLen = 1;
        int m = wordList.size();
        que.add(beginWord);
        HashSet<String> visited = new HashSet<>();
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                String s = que.poll();
                if (!visited.contains(s)) {
                    visited.add(s);
                    for (int j = 0; j < m; j++) {
                        String word=wordList.get(j);
                        if (!visited.contains(word) && check(s, word)) {
                            if (word.equals(endWord)) {
                                return seqLen + 1;
                            }
                            que.add(word);
                        }
                    }
                }
            }
            ++seqLen;
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        System.out.println(ladderLength("hit", "cog", list));
    }
}
