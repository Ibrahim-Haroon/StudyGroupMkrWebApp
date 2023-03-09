package com.StudyGroup.StudyGroupCreate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
class StudyGroupCreateApplication

fun main(args: Array<String>) {
	runApplication<StudyGroupCreateApplication>(*args)
}