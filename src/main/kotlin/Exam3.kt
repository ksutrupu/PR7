class Exam3(var p: Double): Exam2( "Математика",10.0, 4.0){
    fun qp(p: Double): Double{
        val qp = q(10.0, 4.0 )*((100-p)/100)
        return qp
    }
    override fun vivod(){
        println("Функция QP: ${qp(p)}")
    }
}