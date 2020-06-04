package com.play.space;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest
public class ResourceControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void testIndex() throws Exception {
        HttpRequest request = HttpRequest.GET("/resources");
        List resources = client.toBlocking().retrieve(request, Argument.listOf(Resource.class));
        assertEquals(3, resources.size());
        assertTrue(resources.contains(new Resource("emp1274", "Full Stack Developer")));
        assertTrue(resources.contains(new Resource("emp1023", "DevOps Engineer")));
    }
}
