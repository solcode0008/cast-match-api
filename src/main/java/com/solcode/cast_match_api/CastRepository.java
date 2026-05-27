package com.solcode.cast_match_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 🛡️ 魔法のお札：このクラスを「倉庫番（リポジトリ）」として雇う
public interface CastRepository extends JpaRepository<Cast, Long> {
    // 💡 中身はなんと「空っぽ」でOK！
}