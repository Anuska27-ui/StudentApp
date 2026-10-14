fun main() {
    val students = mutableListOf<Student>()

    while (true) {
        print("Enter student ID (or 'quit' to exit): ")
        val input = readln()

        if (input.lowercase() == "quit") {
            break
        }

        val id = input.toIntOrNull()

        if (id == null) {
            println("Invalid ID.")
            continue
        }

        print("Enter student name: ")
        val name = readln()

        print("Enter student course: ")
        val course = readln()

        print("Enter student mark: ")
        val mark = readln().toDoubleOrNull()

        if (mark == null) {
            println("Invalid mark. Please enter a number.")
            continue
        }

        val student = Student(id, name, course, mark)
        students.add(student)

        println("Student added successfully!")
        println()
    }

    println("Student Records:")

    for (student in students) {
        println("ID: ${student.id}")
        println("Name: ${student.name}")
        println("Course: ${student.course}")
        println("Mark: ${student.mark}")
        println("Grade: ${student.getGrade()}")
        println("Passed: ${student.didPass()}")
        println()
    }
}