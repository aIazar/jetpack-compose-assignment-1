package com.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpack_compose_assignment_1.model.Course
import com.example.jetpack_compose_assignment_1.ui.CourseListScreen
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpackcomposeassignment1Theme {
                val courseList = listOf(
                    Course("Fundamentals of AI", "SECT-3151", 2, "Introduction to the core concepts of Artificial Intelligence including search algorithms, logic, reasoning, and intelligent agents.", "None"),
                    Course("Cybersecurity", "SECT-3141", 3, "Covers basic cybersecurity principles such as threats, vulnerabilities, encryption, firewalls, and risk management.", "SECT-2171"),
                    Course("Operating Systems", "SECT-3082", 4, "In-depth study of operating system principles including process management, memory handling, scheduling, and file systems.", "SECT-3122"),
                    Course("Mobile Application", "SECT-3113", 4, "Covers development of mobile apps using modern frameworks with a focus on UI design, user interaction, and backend integration.", "None"),
                    Course("Computer Graphics", "SECT-3132", 2, "Introduction to the fundamentals of computer graphics including rendering, transformations, modeling, and OpenGL basics.", "None")
                )

                CourseListScreen(courseList = courseList)
            }
        }
    }
}
