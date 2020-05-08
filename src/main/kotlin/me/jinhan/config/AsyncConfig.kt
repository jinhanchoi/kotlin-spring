package me.jinhan.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
import java.util.concurrent.Executor

@EnableAsync
@Configuration
class AsyncConfig {

    @Bean
    fun executor() : Executor {
        var taskExecutor = ThreadPoolTaskExecutor()
        taskExecutor.corePoolSize = 10
        taskExecutor.maxPoolSize = 40
        taskExecutor.setQueueCapacity(200)
        taskExecutor.threadNamePrefix = "Test Executor : "
        taskExecutor.initialize()

        return taskExecutor

    }
}