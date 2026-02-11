package org.example.springbeanregistration

import java.time.LocalTime

class SmsMessageService : MessageService {
    override fun getMessage(): String {
        return "You have SMS! "  + LocalTime.now()
    }

    override fun getServiceType(): String {
        return "SMS"
    }
}