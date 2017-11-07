object List_Eamples {

  def main(args: Array[String]): Unit = {

  val fruit = List("apples", "oranges", "pears")
  val nums = List(1, 2, 3, 4)
  val diags = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
  val numsTimes = nums.map(x => x * 2)

  println(fruit)
  println(nums)
  println(diags)
  println(numsTimes)

 }

}
