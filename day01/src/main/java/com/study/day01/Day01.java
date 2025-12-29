package com.study.day01;

import org.bukkit.plugin.java.JavaPlugin;

public final class Day01 extends JavaPlugin {

    // 서버가 시작하거나 플러그인이 로드 되었을 때 실행되는 메소드
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("플러그인이 성공적으로 활성화 되었습니다");
    }

    // 서버가 꺼지거나 플러그인이 언로드 되었을 때 실행되는 메소드
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인이 비활성화 되었습니다");
    }
}
