package com.blog.BJ_Blog.test.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @RequestMapping(value = ["/test"], method = [RequestMethod.GET])
    fun index() : ResponseEntity<String> {
        val hello = "Hello world"
        return ResponseEntity.ok(hello);
    }
}