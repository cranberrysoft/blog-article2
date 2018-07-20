package com.cranberrysoft.blog.article.problem1

object Sol {
  def apply(): Sol = new Sol()
}

class Sol extends Solution {

  override def differentTeams(skills: String): Int = {
    findMaxNumberOfTeams(countCharacters(skills).values.toSeq)
  }

  private def findMaxNumberOfTeams: PartialFunction[Seq[Int], Int] = {
    case membersBySkills if membersBySkills.size == Solution.TEAM.length => membersBySkills.min
    case _ => 0
  }
  private def countCharacters(skills: String) = skills.toCharArray.groupBy(identity).mapValues(_.size)
}
