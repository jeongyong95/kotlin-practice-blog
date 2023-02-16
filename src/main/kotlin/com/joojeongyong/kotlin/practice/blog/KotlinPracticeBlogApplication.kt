package com.joojeongyong.kotlin.practice.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPracticeBlogApplication

fun main(args: Array<String>) {
    runApplication<KotlinPracticeBlogApplication>(*args)
}
