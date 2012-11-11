package emblcmci.test 

import ij._
import ij.plugin._

object Hallo {
  def aline = IJ.log("using Hallo object")
}
class HiScala extends PlugIn {
  def run(arg: String) = {
    Hallo.aline 
    IJ.log("test from maven scala")
    IJ.log("another line")
  }
}

