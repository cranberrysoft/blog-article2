package com.cranberrysoft.blog.article.problem1.functional;

import com.cranberrysoft.blog.article.problem1.Solution;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FunctionalSolutionApp2 implements Solution {

    @Override
    public int differentTeams(String skills) {
        return  Stream.of(membersBySkills.apply(skills))
                .filter(doWeHaveEnoughPlayers) //filter teams which have enough team players
                .map(findMaxNumberOfTeams) //find  number of teams
                .flatMap(Optional::stream).findFirst().orElse(0L).intValue();
    }
    private Predicate<Map<Integer,Long>> doWeHaveEnoughPlayers = team -> team.size() == TEAM.length();

    private Function<Map<Integer,Long>, Optional<Long>> findMaxNumberOfTeams = team -> team.values().stream().min(Long::compareTo);

    private Function<String, Map<Integer,Long>> membersBySkills = skills ->  skills.chars().boxed()
            .collect(groupingBy(Function.identity(),counting()));

}
