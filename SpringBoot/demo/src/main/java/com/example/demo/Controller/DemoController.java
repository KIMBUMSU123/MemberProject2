package com.example.demo.Controller;

import com.example.demo.Service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor // lombok이 주는 어노테이션  final이 가진 애들만 생성자를 만듬
public class DemoController {
    // 생성자 주입
//    private DemoService demoService;
//
//    // DemoService 객체를 매개변수로 하는 생성자
//    public DemoController(DemoService demoService){
//        this.demoService = demoService;
//    }

    // 생성자 주입 좀 더 편하게
    private final DemoService demoService; //생성자를 만들고 싶은면 앞에 final를 붙임
//    private  DemoService1 demoService1;
//    private DemoService2 demoService2;
//
//    public DemoController(DemoService demoService, DemoService1 demoService1, DemoService2 demoService2) {
//        this.demoService = demoService;
//        this.demoService1 = demoService1;
//        this.demoService2 = demoService2;
//    }





}
