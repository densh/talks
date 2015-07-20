package scalaua

object Puzzle3 extends App {
  def workload() = {
    val arr = List.fill(100500)(999999)

    arr.map(_ + 1).map(_ * 3)
  }

  while (true) {
    println(workload().length)
  }
}
