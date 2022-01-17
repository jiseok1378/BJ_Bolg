package com.blog.BJ_Blog.test.controller

import com.blog.BJ_Blog.test.dto.testDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/test"])
class TestController {
    /*
    postman
    https://planetary-trinity-168024.postman.co/workspace/My-Workspace~448a4eaa-eab1-42a9-8b21-724487078110/request/15356998-a0d4d589-02b8-43bd-8171-91e054dd170b
    https://thinking-face.tistory.com/entry/Kotlin-%EB%8D%B0%EC%9D%B4%ED%84%B0-%ED%81%B4%EB%9E%98%EC%8A%A4


    * */
    @GetMapping() //데이터 가져올 때
    fun testGet() :  ResponseEntity<testDto> {
        val hello = "Hello world get"
        var test =testDto(
        title=""
        ,content=""
        );
        test.title = "hello"
        test.content= "hello i am get"
        var cptest = test.copy(title="change Hello")
        println(cptest);
        return ResponseEntity.ok(test);
    }

    @PostMapping() //데이터 입력
    fun testPost() : ResponseEntity<String> {
        val hello = "Hello world post"
        return ResponseEntity.ok(hello);
    }

    @PutMapping() //(단일) 데이터 수정
    fun testPut() : ResponseEntity<String> {
        val hello = "Hello world put"
        return ResponseEntity.ok(hello);
    }

    @DeleteMapping() //데이터 삭제
    fun testDelete() : ResponseEntity<String> {
        val hello = "Hello world delete"
        return ResponseEntity.ok(hello);
    }
}