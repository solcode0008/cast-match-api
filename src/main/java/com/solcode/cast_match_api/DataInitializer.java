package com.solcode.cast_match_api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // 起動時に自動で実行される「起動用のお札」
public class DataInitializer implements CommandLineRunner {

    private final CastRepository castRepository;
    public DataInitializer(CastRepository castRepository) { this.castRepository = castRepository; }

    @Override
    public void run(String... args) {
        // 起動するたびに、この3人をDBに保存（まだ無ければ）
        castRepository.save(new CastMember(null, "アリス", 20, "王道系", 75, 90, 70, 65, 95));
        castRepository.save(new CastMember(null, "ルナ", 22, "クール系", 95, 60, 90, 80, 85));
        castRepository.save(new CastMember(null, "ひなた", 19, "癒やし系", 70, 50, 85, 95, 80));
    }
}