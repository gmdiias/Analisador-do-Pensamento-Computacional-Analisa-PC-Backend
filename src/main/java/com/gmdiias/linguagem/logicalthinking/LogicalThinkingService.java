package com.gmdiias.linguagem.logicalthinking;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gmdiias.basic.BasicService;

@Service
@Transactional
public class LogicalThinkingService extends BasicService<LogicalThinking, LogicalThinkingRepository> {

}
