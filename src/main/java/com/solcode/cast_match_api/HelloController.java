package com.solcode.cast_match_api;

import org.springframework.beans.factory.annotation.Autowired; // 🆕 倉庫番を自動で雇う魔法
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {

    @Autowired // 🛡️ 魔法：倉庫番（CastRepository）を自動的にここに配置（DI）してくれる！
    private CastRepository castRepository;

    @GetMapping("/api/casts")
    public List<Cast> getCasts() {
        // 🆕 これまで自分で作っていたリストをやめて、倉庫番にDBから全件取ってこさせる！
        return castRepository.findAll();
    }
}