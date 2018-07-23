package com.cranberrysoft.blog.article.problem1

object Sol {
  def apply(): Sol = new Sol()
}

class Sol extends Solution {

  override def differentTeams(skills: String): Int = {
    import com.cranberrysoft.blog.article.problem1.extra.Counter._
    findMaxNumberOfTeams(countCharacters(skills).values.toSeq)
  }

  private def findMaxNumberOfTeams: PartialFunction[Seq[Int], Int] = {
    case membersBySkills if membersBySkills.size == Solution.TEAM.length => membersBySkills.min
    case _ => 0
  }

}
