package com.lixinyu.guns.rest.modular.example;

import com.lixinyu.guns.rest.common.SimpleObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 常量控制器
 *
 * @author by 李新宇
 * @date 2020-04-06 08:56
 */
@Controller
@RequestMapping("/hello")
public class ExampleController {

	@RequestMapping("")
	public ResponseEntity hello(@RequestBody SimpleObject simpleObject) {
		System.out.println(simpleObject.getUser());
		return ResponseEntity.ok("请求成功");
	}


}
