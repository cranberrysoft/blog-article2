package com.cranberrysoft.blog.article.problem1
import com.cranberrysoft.blog.article.problem1.imperative.ImperativeSolution
import org.scalatest.Outcome

class ImperativeSolutionSpec extends SolutionTest{
  override protected def withFixture(test: OneArgTest): Outcome = test(new ImperativeSolution())
}