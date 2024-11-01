package com.qiu.qoj.judge.codesandbox.model;

import lombok.Data;

import java.util.List;

@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（KB）
     */
    private Long time;

    private String compileErrorOutput;

    private List<String> runOutput;

    private List<String> inputList;

    private List<String> answers;

    private String runErrorOutput;
}