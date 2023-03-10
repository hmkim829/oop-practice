package org.example.grade;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(course -> course.multiplyCreditAndCourseGrade())
                .sum();
    }

    public int calculateTotalCompletedredit() {
        return this.courses.stream()
                .mapToInt(course -> course.getCredit())
                .sum();
    }
}
