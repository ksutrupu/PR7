open class Exam2 (val discipline: String, val students: Double, val time: Double){
    open fun q(students: Double, time: Double): Double{
        val q = students/time
        return q
    }
    open fun vivod(){
        println("Дисциплина: $discipline \nКол-во студентов: $students \nПродолжительность экзамена: $time \nФункция Q: ${q(students, time)}")
    }
}