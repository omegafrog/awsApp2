package com.think.back250417.global.initData

import com.think.back250417.domain.post.post.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationRunner
import org.springframework.cache.annotation.Cacheable
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import org.springframework.transaction.annotation.Transactional

@Configuration
class BaseInitData(
    private val postService: PostService
) {
    @Autowired
    @Lazy
    private lateinit var self: BaseInitData

    @Bean
    fun baseInitDataApplicationRunner(): ApplicationRunner {
        return ApplicationRunner {
            self.work1()
        }
    }

    @Transactional
    fun work1() {

        self.onePlusOne()
        self.onePlusOne()
        self.onePlusOne()


        if ( postService.count() > 0 ) return

    }

    @Cacheable("getOnePlusOne")
    fun onePlusOne():Int{
        println("run")
        return 1+1
    }
}