package com.example.jetpack_compose_assignment_1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_assignment_1.model.Course

@Composable
fun CourseListScreen(courseList: List<Course>) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Course List",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .padding(top = 24.dp, start = 16.dp, bottom = 8.dp)
                .align(Alignment.Start)
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            items(courseList) { course ->
                CourseCard(course = course)
            }
        }
    }
}
