package com.joojeongyong.kotlin.practice.blog.presentation.hello

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping(path = ["/", "/hello"])
    fun hello(model: Model): String {
        model["title"] = "kotlin-practice-blog"
        return "hello"
    }
}