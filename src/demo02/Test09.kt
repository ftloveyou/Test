package demo02

import java.security.KeyFactory
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher
import org.apache.commons.codec.binary.Base64


object Test{
    fun encryptByPublicKey(data: ByteArray, key: String) : ByteArray{
//        val keyFactory = KeyFactory.getInstance("RSA")
//        val x509EncodedKeySpec = X509EncodedKeySpec(publicKey.toByteArray())
//        val pubKey = keyFactory.generatePublic(x509EncodedKeySpec)
//        val cipher = Cipher.getInstance(keyFactory.algorithm)
//        cipher.init(Cipher.ENCRYPT_MODE, pubKey)
//        return cipher.doFinal(data)

        val keyBytes = Base64.decodeBase64(key)
        //实例化密钥工厂
        val keyFactory = KeyFactory.getInstance("RSA")
        //初始化公钥
        //密钥材料转换
        val x509KeySpec = X509EncodedKeySpec(keyBytes)
        //产生公钥
        val pubKey = keyFactory.generatePublic(x509KeySpec)

        //数据加密
        val cipher = Cipher.getInstance(keyFactory.algorithm)
        cipher.init(Cipher.ENCRYPT_MODE, pubKey)
        return cipher.doFinal(data)

    }
}

fun main() {

    val publicKey: String = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALlt8R7t3P7SPp1gA8IvX23iNpQhB0T5jRG4q8NofZdT8ik1b32mYGfBgZzuDRO3gLKR9tjC8vZ90SHAXarR8sMCAwEAAQ=="
    val data: String = "woheni"
    println(String(Test.encryptByPublicKey(data = data.toByteArray(),key = publicKey)))
}
