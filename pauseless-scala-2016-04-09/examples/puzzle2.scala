package scalaua

object Puzzle2 extends App {
  def workload() = {
    val arr = Array.fill(100500)(999999)

    arr.map(_ + 1).map(_ * 3)
  }

  while (true) {
    println(workload().length)
  }
}
