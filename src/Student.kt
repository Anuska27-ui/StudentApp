class Student(
    nameIn: String,
    protected val course: String,
    protected val mark: Double,
    protected val modules: MutableList<Module>,
    val id: String
) {
    var name = nameIn
        protected set
}