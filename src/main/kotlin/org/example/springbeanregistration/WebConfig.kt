package org.example.springbeanregistration

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(MessageServiceRegistrar::class)
class WebConfig {

    init {
        println("WebConfig initialized")
    }

}