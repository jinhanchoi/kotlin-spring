package me.jinhan.service

import me.jinhan.entity.Person
import me.jinhan.infra.PersonRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.AsyncResult
import org.springframework.stereotype.Service
import org.springframework.util.ClassUtils.isPresent
import java.util.concurrent.Future

@Service
class AsyncService(private val personRepo : PersonRepository) {
    companion object{
        val logger : Logger = LoggerFactory.getLogger(this.javaClass)
    }

    @Async
    fun who_is_it(id : Int) : Future<String>{
        var result = personRepo.findById(id)
        var name = result?.let{ person -> person.get().name } ?: "No Results"
        return AsyncResult<String>(name)
    }

    @Async
    fun savePerson(name: String) : Future<String>{
        var result = personRepo.save(Person(name = "jinhan", age = 34))
        logger.info("Logging test : ${result.howOldAreYou()}")
        return AsyncResult<String>("Hi $name")
    }
}