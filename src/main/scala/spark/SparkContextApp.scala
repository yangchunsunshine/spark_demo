package spark

import org.apache.spark.{SparkConf, SparkContext}

object SparkContextApp {
  def main(args: Array[String]): Unit = {
    val sparkConf=new SparkConf().setAppName("SparkContextApp").setMaster("local[2]")
    val sc=new  SparkContext(sparkConf)
    sc.stop()
  }

}


trait Logg{
  def log(message:String): Unit ={
    println("hcy")
  }

  def zidongyi(name:String,age:Int):Int={
    0
  }

  class Person(val name:String){
      println("jjj")
  }

}
