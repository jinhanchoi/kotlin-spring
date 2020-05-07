package me.jinhan.main.service

import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.AsyncResult
import org.springframework.stereotype.Service
import java.util.concurrent.Future

@Service
class AsyncService {

    @Async
    fun callAsync(name: String) : Future<String>{
        println(name)
        println("complete")
        return AsyncResult<String>("Hi $name")
    }
}