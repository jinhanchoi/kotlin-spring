package me.jinhan.main.controller

import me.jinhan.main.service.AsyncService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(private val asyncService: AsyncService) {

    @GetMapping("/")
    fun whoisit(): String{
        var resultFuture = asyncService.callAsync("jinhan")
        return resultFuture.get()
    }


}