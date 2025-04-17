package org.omegafrog.terraform2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class Terraform2Application

fun main(args: Array<String>) {
    runApplication<Terraform2Application>(*args)
}
