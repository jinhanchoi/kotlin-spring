package me.jinhan.controller

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup
import org.springframework.web.context.WebApplicationContext


@SpringBootTest
@RunWith(SpringRunner::class)
class WebLayerTest {

    @Autowired
    private lateinit var webApplicationContext: WebApplicationContext

    private lateinit var mockMvc : MockMvc

    @Before fun `ctrlCreate`(){
      mockMvc = webAppContextSetup(webApplicationContext).build()
    }

    @Test fun `homeController`(){
       mockMvc.perform(put("/person/{name}","jinhan"))
           .andExpect(status().isOk)

    }

    @Test fun `userQueryTest`(){
        mockMvc.perform(get("/person/{id}",1))
            .andExpect(status().isOk)
    }
}