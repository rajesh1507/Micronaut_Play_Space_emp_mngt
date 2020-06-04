package com.playspace

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/api")
class ResourceInventoryController {

    @Produces(MediaType.TEXT_PLAIN)
    @Get("/resourceInventory/{isbn}")
    fun index(expertise: String): HttpResponse<Int> {
        return when (expertise) {
            "DevOps Engineer" -> HttpResponse.ok(2)
            else -> HttpResponse.notFound()
        }
    }
}