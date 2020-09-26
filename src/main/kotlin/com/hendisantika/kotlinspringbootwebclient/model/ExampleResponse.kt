package com.hendisantika.kotlinspringbootwebclient.model

import java.time.LocalDateTime

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-spring-boot-webclient
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/09/20
 * Time: 06.10
 */
data class ExampleResponse(
        val message: String,
        val timestamp: LocalDateTime
)