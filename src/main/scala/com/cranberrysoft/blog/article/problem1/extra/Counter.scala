package com.cranberrysoft.blog.article.problem1.extra

object Counter {
  def countCharacters(skills: String) = skills.toCharArray.groupBy(identity).mapValues(_.size)
}
