package me.unjar.beehold;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class ConstantValuesTest {
    @Test
    public void visionApiUrlNotEmpty() {
        assertNotEquals("", Constants.CLOUD_VISION_API_BASE_URL);
    }
}