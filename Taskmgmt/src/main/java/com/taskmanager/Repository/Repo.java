package com.taskmanager.Repository;

import com.taskmanager.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Student,Long> {
}
