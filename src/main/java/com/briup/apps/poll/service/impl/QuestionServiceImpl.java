package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.bean.QuestionExample;
import com.briup.apps.poll.bean.extend.QuestionVM;
import com.briup.apps.poll.dao.QuestionMapper;
import com.briup.apps.poll.dao.extend.QuestionVMMapper;
import com.briup.apps.poll.service.IQuestionService;

import io.swagger.annotations.ApiOperation;

@Service
public class QuestionServiceImpl implements IQuestionService {
@Autowired
private QuestionMapper questionMapper;
	@Autowired
private QuestionVMMapper questionVMMapper;
	@Override
	public List<Question> findAll() throws Exception {
		// TODO Auto-generated method stub
		QuestionExample example =new QuestionExample();
		return questionMapper.selectByExample(example);
	}

	@Override
	public List<QuestionVM> findAllQuestionVM() throws Exception {
		// TODO Auto-generated method stub
		QuestionExample example =new QuestionExample();
		return questionVMMapper.selectAll();
	}

}
