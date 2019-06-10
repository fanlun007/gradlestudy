package com.fanlun.service;

import com.fanlun.bean.Apple;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AService {

    public static void main(String[] args){
        Apple apple = new Apple();
        apple.setName("mac");
        System.out.println(apple.toString());
        log.info("{}", apple.toString());
    }

}
