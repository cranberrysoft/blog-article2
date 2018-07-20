package com.cranberrysoft.blog.article.problem1

import com.cranberrysoft.blog.article.problem1.functional.FunctionalSolution
import org.scalatest.Outcome

class FunctionalSolutionSpec extends SolutionTest{
  override protected def withFixture(test: OneArgTest): Outcome = test(new FunctionalSolution())
}
