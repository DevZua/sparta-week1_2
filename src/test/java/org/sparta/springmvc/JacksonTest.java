package org.sparta.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.springmvc.response.Star;

public class JacksonTest {

    @Test
    @DisplayName("Object To JSON : get Method 필요")
    void test1() throws JsonProcessingException {
        // given
        Star star = new Star("zua", 94);

        // when
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(star);

        // then
        System.out.println("json = " + json);

    }
}
