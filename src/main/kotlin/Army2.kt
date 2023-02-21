open class Army2 (val vid: String, val kolvo: Double, val ball: Double) {
    open fun q(kolvo: Double, ball: Double): Double {
        var q = (0.3 * kolvo) / (0.7 * ball)
        return q
    }
    open fun vivod(){
        println("Вид войск: $vid \nЧисленность армии (тыс.): $kolvo \nВооруженность (балл - число): $ball \nФункция Q: ${q(kolvo, ball)}")
    }
}