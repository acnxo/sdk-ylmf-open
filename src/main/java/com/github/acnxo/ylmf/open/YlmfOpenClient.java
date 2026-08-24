package com.github.acnxo.ylmf.open;

/**
 * 115网盘开放平台 OpenAPI SDK 客户端。
 *
 * <p>作为 SDK 的基础入口，后续 SDK 客户端能力（如认证、文件操作等）均以
 * {@code com.github.acnxo.ylmf.open} 为根包进行扩展。</p>
 *
 * @author acnxo
 * @since 0.0.1
 */
public final class YlmfOpenClient {

    /**
     * SDK 版本号，与 pom.xml 中 {@code <version>} 保持一致。
     */
    public static final String VERSION = "0.0.1-SNAPSHOT";

    /**
     * 私有构造器，工具类不允许实例化。
     */
    private YlmfOpenClient() {
    }
}
