package com.github.acnxo.ylmf.open;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * {@link YlmfOpenSdk} 单元测试。
 */
class YlmfOpenSdkTest {

    @Test
    void versionShouldMatchPom() {
        assertEquals("0.0.1-SNAPSHOT", YlmfOpenSdk.VERSION);
    }
}
