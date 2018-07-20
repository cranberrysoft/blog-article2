package com.cranberrysoft.blog.article.problem1

import org.scalatest.Outcome

class SolSpec extends SolutionTest{
  override protected def withFixture(test: OneArgTest): Outcome = test(Sol())
}
