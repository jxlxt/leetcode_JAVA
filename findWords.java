package edu.ucsc;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode Number: 500
 * Problem Name: Keyboard Row
 *
 * @author: Created by Xiaotong Li 
 * @time: 7/3/18:2018-07-03 09:07.
 */
public class findWords {
    public String[] findWords(String[] words){
//        1-line shortest answer
////       return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
//        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i = 0; i<strs.length; i++){
//            for(char c: strs[i].toCharArray()){
//                map.put(c, i);//put <char, rowIndex> pair into the map
//            }
//        }
//        List<String> res = new LinkedList<>();
//        for(String w: words){
//            if(w.equals("")) continue;
//            int index = map.get(w.toUpperCase().charAt(0));
//            for(char c: w.toUpperCase().toCharArray()){
//                if(map.get(c)!=index){
//                    index = -1; //don't need a boolean flag.
//                    break;
//                }
//            }
//            if(index!=-1) res.add(w);//if index != -1, this is a valid string
//        }
//        return res.toArray(new String[0]);
        return null;
    }
}
