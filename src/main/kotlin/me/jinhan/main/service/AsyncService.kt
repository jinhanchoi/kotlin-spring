package me.jinhan.main.service

import me.jinhan.main.entity.Person
import me.jinhan.main.infra.PersonRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.AsyncResult
import org.springframework.stereotype.Service
import java.util.concurrent.Future

@Service
class AsyncService(private val personRepo : PersonRepository) {
    companion object{
        val logger : Logger = LoggerFactory.getLogger(this.javaClass)
    }


    @Async
    fun callAsync(name: String) : Future<String>{
        println(name)
        println("complete")
        var result = personRepo.save(Person(name = "jinhan", age = 34))
        println(result.id)
        logger.info("Logging test : ${result.id}")
        return AsyncResult<String>("Hi $name")
    }
}