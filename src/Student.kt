class Student(
    val name: String,
    protected val course: String,
    protected val mark: Double,
    protected val modules: MutableList<`Module`>,
    val id: String
)