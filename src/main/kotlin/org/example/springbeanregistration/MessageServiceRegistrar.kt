package org.example.springbeanregistration

import org.springframework.beans.factory.BeanRegistrar
import org.springframework.beans.factory.BeanRegistry
import org.springframework.core.env.Environment

class MessageServiceRegistrar : BeanRegistrar {
    override fun register(
        registry: BeanRegistry,
        env: Environment
    ) {
        val property = env.getProperty("app.message-type", "email")
        when (property.lowercase()) {
            "email" -> registry.registerBean("emailService", EmailMessageService::class.java) {
                it.description("Email message service registered via the BeanRegistrar")
            }
            "sms" -> registry.registerBean("smsService", SmsMessageService::class.java) {
                it.description("SMS message service registered via the BeanRegistrar")
            }
        }
    }
}