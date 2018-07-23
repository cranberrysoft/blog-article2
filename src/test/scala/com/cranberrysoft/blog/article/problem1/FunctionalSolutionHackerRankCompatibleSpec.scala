package com.cranberrysoft.blog.article.problem1

import com.cranberrysoft.blog.article.problem1.functional.FunctionalSolutionHackerRankCompatible
import org.scalatest.Outcome

class FunctionalSolutionHackerRankCompatibleSpec extends SolutionTest {
  override protected def withFixture(test: OneArgTest): Outcome = test(new FunctionalSolutionHackerRankCompatible())
}

