package com.gmdiias.linguagem.logicalthinking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmdiias.basic.BasicController;

@RestController
@RequestMapping("api/logicalthinking")
public class LogicalThinkingController extends BasicController<LogicalThinking, LogicalThinkingRepository, LogicalThinkingService> {

}
