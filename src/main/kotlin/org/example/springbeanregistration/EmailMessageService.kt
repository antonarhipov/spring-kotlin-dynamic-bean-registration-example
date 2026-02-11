package org.example.springbeanregistration

import java.time.LocalTime

class EmailMessageService : MessageService {
    override fun getMessage(): String {
        return "You have e-mail! " + LocalTime.now()
    }

    override fun getServiceType(): String {
        return "EMAIL"
    }
}
