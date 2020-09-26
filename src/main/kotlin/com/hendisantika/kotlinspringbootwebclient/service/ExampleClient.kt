package com.hendisantika.kotlinspringbootwebclient.service

import com.hendisantika.kotlinspringbootwebclient.model.ExampleResponse
import org.springframework.http.ResponseEntity
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
class ExampleClient(private val webClient: WebClient) {
    fun retrieveExampleResponse(): ExampleResponse? =
            webClient.get()
                    .uri { it.pathSegment("api", "hello").build() }
                    .retrieve()
                    .bodyToMono(ExampleResponse::class.java)
                    .block()

    fun exchangeExampleResponse(): ResponseEntity<ExampleResponse>? =
            webClient.get()
                    .uri { it.pathSegment("api", "hello").build() }
                    .exchange()
                    .flatMap {
                        println("Raw status code: ${it.rawStatusCode()}")
                        it.toEntity(ExampleResponse::class.java)
                    }
                    .block()

    fun retrieveExampleResponseList(): List<ExampleResponse>? =
            webClient.get()
                    .uri { it.pathSegment("api", "hello-list").build() }
                    .retrieve()
                    .bodyToMono(typeReference<List<ExampleResponse>>())
                    .block()
}