package com.yohwan.multimodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ["com.yohwan"])
@SpringBootApplication
class MultiModuleApplication

fun main(args: Array<String>) {
	runApplication<MultiModuleApplication>(*args)
}
