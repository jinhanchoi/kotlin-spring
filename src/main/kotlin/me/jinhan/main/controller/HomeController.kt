package me.jinhan.main.controller

import me.jinhan.main.service.AsyncService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(private val asyncService: AsyncService) {

    @GetMapping("/name/{id}")
    fun whoisit(@PathVariable("id") id : Int): String{
        var resultFuture = asyncService.who_is_it(id)
        return resultFuture.get()
    }

    @PutMapping("/name/{name}/save")
    fun savePerson(@PathVariable("name") name : String) : Boolean{
        var resultFuture = asyncService.savePerson(name)
        return !resultFuture.get().isNullOrBlank()
    }

}