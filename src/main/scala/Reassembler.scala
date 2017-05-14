package fragment.submissions

object Reassembler {

  def reassemble(fragments: String): String = {
    ""
  }

  def getOverlap(left: String, right: String): Int = {
    val overlap = calcOverlap(left, right)
    if (overlap > 0) overlap else calcOverlap(right, left)
  }

  def calcOverlap(left: String, right: String): Int = left.drop(left.length - right.length)
      .tails.find(right.contains)
      .get.length
}
