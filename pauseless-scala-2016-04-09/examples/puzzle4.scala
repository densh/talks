package scalaua
import offheap._

object Puzzle4 extends App {
  implicit val props =
    Region.Props(Pool(pageSize = 512000,
                      chunkSize = 512000))

  def workload()(implicit r: Region) = {
    val arr = offheap.Array.fill(100500)(999999)

    arr.map(_ + 1).map(_ * 3)
  }

  while (true)
    Region { implicit r =>
      println(workload().length)
    }
}
