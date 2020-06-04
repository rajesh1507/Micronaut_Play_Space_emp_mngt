package com.play.space;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import java.util.Arrays;
import java.util.List;


@Controller("/resources")
public class ResourceController {

    @Get("/")
    List<Resource> index() {
        Resource r1 = new Resource("emp1274","Full Stack Developer");
        Resource r2 = new Resource("emp1023","DevOps Engineer");
        Resource r3 = new Resource("emp1081","DevOps Engineer");

        return Arrays.asList(r1,r2,r3);
    }
}