package de.embl.cmci {
  import ij._
  import ij.plugin._

  object Hi { 
    def main(args: Array[String]) {
      println("Hi! from scala")
      IJ.log("test from ij")
      IJ.log(IJ.getVersion())
      var imp = IJ.openImage("http://imagej.nih.gov/ij/images/blobs.gif")
        imp.show()
        IJ.wait(2000)
        imp.close()
    }
  }

  object Hallo {
    def aline = IJ.log("scala test plugin")
  }
  class Hi_ extends PlugIn {
    def run(arg: String) = {
      Hallo.aline 
    }
  }
}
