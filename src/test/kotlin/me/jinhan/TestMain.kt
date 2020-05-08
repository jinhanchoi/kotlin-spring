package me.jinhan

import me.jinhan.controller.HomeController
import me.jinhan.service.AsyncService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import kotlin.test.assertNotNull

@RunWith(SpringRunner::class)
@SpringBootTest
class TestMain {

    @Autowired
    lateinit var homeController: HomeController

    @Test fun `contextLoads`(){
        assertNotNull(homeController)
    }

}