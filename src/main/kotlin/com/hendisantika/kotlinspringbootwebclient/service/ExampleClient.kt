package com.hendisantika.kotlinspringbootwebclient.service

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-spring-boot-webclient
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/09/20
 * Time: 06.10
 */
@Component
class ExampleClient(private val webClient: WebClient)