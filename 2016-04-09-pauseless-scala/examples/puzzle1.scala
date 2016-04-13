package scalaua

object Puzzle1 extends App {
  def workload() = {
    val arr = Array.fill(100500)(9)

    arr.map(_ + 1).map(_ * 3)
  }

  while (true) {
    println(workload().length)
  }
}
