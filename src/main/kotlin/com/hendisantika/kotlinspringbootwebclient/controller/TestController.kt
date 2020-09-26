package com.hendisantika.kotlinspringbootwebclient.controller

import com.hendisantika.kotlinspringbootwebclient.model.ExampleResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-spring-boot-webclient
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/09/20
 * Time: 06.13
 */
@RestController
@RequestMapping("/api")
class TestController {
    @GetMapping("/hello")
    fun getExampleResponse() = ExampleResponse(
            message = "Hello world",
            timestamp = LocalDateTime.now()
    )

    @GetMapping("/hello-list")
    fun getExampleResponseList() = listOf(
            ExampleResponse(
                    message = "Hello world #1",
                    timestamp = LocalDateTime.now()
            ),
            ExampleResponse(
                    message = "Hello world #2",
                    timestamp = LocalDateTime.now()
            )
    )
}