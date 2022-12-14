package com.example.qiniutest

import com.example.qiniutest.service.QiniuCloudService
import com.example.qiniutest.service.QiniuCloudServiceImpl
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.io.File

@SpringBootTest
class QiniuTestApplicationTests {
    @Autowired
    lateinit var qiniuCloudService: QiniuCloudServiceImpl

    @Test
    fun testUpload() {
        val ret: String = qiniuCloudService.uploadFile(
            File("C:\\Users\\13980\\Desktop\\ipad\\panda.JPG"),
            "panda.JPG"
        )
        println("访问地址$ret")
    }

    @Test
    fun testRemove() {
        val ret: String = qiniuCloudService.remove(
            "panda.JPG"
        )
        println("操作结果$ret")
    }


}
