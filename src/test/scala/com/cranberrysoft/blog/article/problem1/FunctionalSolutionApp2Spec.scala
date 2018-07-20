package com.cranberrysoft.blog.article.problem1

import com.cranberrysoft.blog.article.problem1.functional.FunctionalSolutionApp2
import org.scalatest.Outcome

class FunctionalSolutionApp2Spec extends SolutionTest {
  override protected def withFixture(test: OneArgTest): Outcome = test(new FunctionalSolutionApp2())
}

