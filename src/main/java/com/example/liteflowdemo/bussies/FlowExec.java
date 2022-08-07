package com.example.liteflowdemo.bussies;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import com.yomahub.liteflow.slot.DefaultContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class FlowExec {
    @Resource
    private FlowExecutor flowExecutor;

    @PostConstruct
    public void testConfig(){
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", "arg");

        System.out.println((String)response.getContextBean(DefaultContext.class).getData("arg"));
    }
}
