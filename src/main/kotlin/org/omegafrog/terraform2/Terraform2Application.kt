package org.omegafrog.terraform2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Terraform2Application

fun main(args: Array<String>) {
    runApplication<Terraform2Application>(*args)
}
