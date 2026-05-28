package com.solcode.cast_match_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table; // ← これを追加！

@Entity
@Table(name = "cast_member") // これが魔法の回避策です！
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CastMember {

    @Id // 🛡️ 魔法のお札：これがデータの背番号（主キー：一意のID）になる！
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 背番号を1, 2, 3...と自動で連番にする設定
    private Long id; // 🆕 データベース管理用に、背番号（ID）を新設！

    private String name;
    private int age;
    private String type;
    
    // 5つの手配師ステータス
    private int acting;
    private int action;
    private int stability;
    private int flexibility;
    private int visual;
}