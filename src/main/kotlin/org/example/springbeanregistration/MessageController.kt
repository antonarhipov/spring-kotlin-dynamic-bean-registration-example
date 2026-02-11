package org.example.springbeanregistration

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/messages")
class MessageController(val messageService: MessageService) {

    @GetMapping("")
    fun sendMessage(): ResponseEntity<MessageResponse> {
        return ResponseEntity.ok(MessageResponse(messageService.getMessage() + ": " + messageService.getServiceType()))
    }


    data class MessageResponse(val message: String)

}