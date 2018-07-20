package com.cranberrysoft.blog.article.problem1;

public interface Solution {

     String TEAM = "pcmbz";

    /**
     * Calculate how many times sequence {@link #TEAM} occurred in the given string taking into account that we do not consider
     * the order of occurrence of single characters in the given string.
     * e.g pcmbzpcmbz  returns 2 since we have two matching strings pcmbz and pcmbz
     * e.g pcmbzpcmbzzbmcp returns 3 since we have three matching strings pcmbz and pcmbz and zbmcp
     * e.g pcmbzpcmbp returns 3 since we can form only one pcmbz sequence
     * @param skills
     * @return total number of occurrences
     */
    int differentTeams(String skills);
}
