package com.la.summer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ExternalApiTest {

    @Autowired
    private ExternalApi externalApi;

    @Test
    public void writingConfigPropViaValue() {
        externalApi.printingConfigValues();
    }

    @Test
    public void writingConfigPropViaConfigClass() {
        externalApi.printingConfigValues();
    }

    @Test
    public void writingConfigPropViaEnvHelper() {
        externalApi.printingConfigValues();
    }

}