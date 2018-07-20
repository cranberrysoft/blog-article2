package com.cranberrysoft.blog.article.problem1


import org.scalatest.{GivenWhenThen, fixture}

trait SolutionTest extends fixture.FlatSpec with GivenWhenThen  {

  override type FixtureParam = Solution

  "differentTeams" should "return 2 teams" in { (sol: Solution) =>
    Given("two teams")
    var skills = "pcmbzpcmbz"

    When("calling method")
    var differentTeams = sol.differentTeams(skills)

    Then("return two different teams")
    assert(differentTeams === 2)

    Given("two teams unordered")
    skills = "zccbzpmmbp"

    When("calling method")
    differentTeams = sol.differentTeams(skills)

    Then("return two different teams")
    assert(differentTeams === 2)


    Given("rwo teams unordered with duplicates for some chracters")
    skills = "zccbzpmmmbbpp"

    When("calling method")
    differentTeams = sol.differentTeams(skills)

    Then("return two different teams")
    assert(differentTeams === 2)

  }

  it should  "not return any team" in { (sol: Solution) =>
    Given("no team")
    var skills = "pcmb"

    When("calling method")
    var differentTeams: Int = sol.differentTeams(skills)

    Then("return 0 teams")
    assert(differentTeams === 0)

    Given("empty team")
    skills = ""

    When("calling method")
    differentTeams = sol.differentTeams(skills)

    Then("return 0 teams")
    assert(differentTeams === 0)
  }

}
