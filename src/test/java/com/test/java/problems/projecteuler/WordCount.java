package com.test.java.problems.projecteuler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

import org.testng.annotations.Test;

public class WordCount {

	@Test
	public void test() {
		wordCount();
	}

	public void wordCount() {

		String str = "In ancient manuscripts, another means to divide sentences in into paragraphs was a line break (newline) followed by an initial at the beginning of the next paragraph. An initial is an oversize capital letter, sometimes outdented beyond the margin of text. This style can be seen, for example, in the original Old English manuscript of Beowulf. Outdenting is still used in English typography, though not commonly.[4] Initials and rubrication were used in the Gutenberg Bible, the first major book to be printed rather than hand-written.";

		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		StringTokenizer tmp = new StringTokenizer(str, " ");

		while (tmp.hasMoreTokens()) {
			String word = tmp.nextToken().toLowerCase();
			if (wordCount.containsKey(word))
				wordCount.put(word, wordCount.get(word) + 1);
			else
				wordCount.put(word, 1);

		}

		
		List<Entry<String, Integer>> list = sortByValue(wordCount);
		
		for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }

	}
	
	
	public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap){
        Set<Entry<String, Integer>> set = wordMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        return list;
    }


}
