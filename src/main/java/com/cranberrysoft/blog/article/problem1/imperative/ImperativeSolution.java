package com.cranberrysoft.blog.article.problem1.imperative;

import com.cranberrysoft.blog.article.problem1.Solution;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ImperativeSolution implements Solution {

    @Override
    public int differentTeams(String skills) {
        final Map<String,Integer> teams = new HashMap<>();
        for( char c : skills.toCharArray()){
            teams.compute(String.valueOf(c), (k,v) -> v == null ? 1: v+1);
        }
        if (teams.size() == Solution.TEAM.length()){
            final LinkedList<Integer> values = new LinkedList(teams.values());
            Collections.sort(values, Comparator.reverseOrder());
            return values.getLast();
        }else {
            return 0;
        }
    }
}
