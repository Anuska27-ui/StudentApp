fun main() {
    val university = University()

    var choice = ""

    while (choice != "4") {
        println("1. Add a student")
        println("2. Search for student by ID")
        println("3. Search for students by name")
        println("4. Quit")

        print("Enter your choice: ")
        choice = readln()

        when (choice) {
            "1" -> {
                print("Enter student ID: ")
                val id = readln()

                print("Enter student name: ")
                val name = readln()

                print("Enter student course: ")
                val course = readln()

                print("Enter student mark: ")
                val mark = readln().toDouble()

                val student = Student(
                    name,
                    course,
                    mark,
                    mutableListOf(),
                    id
                )

                university.enrolStudent(student)
                println("Student added successfully!")
            }

            "2" -> {
                print("Enter student ID to search: ")
                val id = readln()

                val student = university.findStudentById(id)

                if (student != null) {
                    println("Student found:")
                    println("ID: ${student.id}")
                    println("Name: ${student.name}")
                } else {
                    println("Student not found.")
                }
            }

            "3" -> {
                print("Enter student name to search: ")
                val name = readln()

                val students = university.findStudentsByName(name)

                if (students.isEmpty()) {
                    println("No students found.")
                } else {
                    for (student in students) {
                        println("ID: ${student.id}")
                        println("Name: ${student.name}")
                    }
                }
            }

            "4" -> {
                println("Goodbye!")
            }

            else -> {
                println("Invalid choice.")
            }
        }

        println()
    }
}