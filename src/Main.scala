
import math._

object Main {

  def main(args: Array[String]): Unit = {
    println("\nResultado: "+calcularRaizCuadrada(2, 1, 0) )
  }

  def calcularRaizCuadrada(numero:Double, estimacion:Double, limite:Double) : Double = {
    //while(math.abs(numero - limite) > 0.0050/*limite != sqrt(numero)*/) {

    val prom = BigDecimal(sqrt(numero)).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble

    if(limite != prom) {
      var cociente = numero/estimacion;
      cociente = BigDecimal(cociente).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble

      print("Cociente: "+cociente+" - ")

      var promedio = (cociente + estimacion) / 2;
      promedio = BigDecimal(promedio).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble

      println("Promedio: "+promedio)

      calcularRaizCuadrada(numero, promedio, promedio)
    } else {
      return limite;
    }

  }

}
