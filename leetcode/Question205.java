package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Question205 {
    /**
     * 同构字符串
     * 已解答
     * 给定两个字符串 s 和 t ，判断它们是否是同构的。
     *
     * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
     *
     * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，
     * 相同字符只能映射到同一个字符上，字符可以映射到自己本身。
     */
      public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1 = new HashMap<>();
         Map<Character,Character> map2 = new HashMap<>();
         for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            char y = t.charAt(i);
        if( (map1.containsKey(x) && map1.get(x)!=y)
        ||   (map2.containsKey(y) && map2.get(y)!=x)  ){
            return false;
        }
        map1.put(x,y);
        map2.put(y,x);
        }
        return true;
    }
}
