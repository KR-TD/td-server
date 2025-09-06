package server.tdserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TdServerApplication

fun main(args: Array<String>) {
	runApplication<TdServerApplication>(*args)
}
