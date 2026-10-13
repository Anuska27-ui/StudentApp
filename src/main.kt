fun main() {
    val students = mutableListOf<Student>()

    while (true) {
        println("Enter student ID (or 'quit' to exit):")
        val input = readln()

        if (input.lowercase() == "quit") {
            break
        }

        val id = input.toIntOrNull()

        if (id == null) {
            println("Invalid ID. Please enter a number.")
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
        println(student)
    }
}