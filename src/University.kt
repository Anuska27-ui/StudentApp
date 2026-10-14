class University(
    private val modules: MutableList<Module>,
    private val students: MutableList<Student>
) {
    fun findStudentById(id: String): Student? {
        for (student in students) {
            if (student.id == id) {
                return student
            }
        }
        return null
    }

    fun enrolStudent(student: Student) {
        students.add(student)
    }

    fun findStudentsByName(name: String): MutableList<Student> {
        val matchingStudents = mutableListOf<Student>()

        for (student in students) {
            if (student.name == name) {
                matchingStudents.add(student)
            }
        }

        return matchingStudents
    }
}