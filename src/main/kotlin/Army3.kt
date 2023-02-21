class Army3(var p: Double): Army2( "ВДВ",50.0, 65.0){
    fun qp(p: Double): Double{
        val qp = q(50.0, 65.0 )*(p+1)
        return qp
    }
    override fun vivod(){
        println("Функция QP: ${qp(p)}")
    }
}