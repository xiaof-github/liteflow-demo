package com.example.liteflowdemo.bussies;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class FlowExec {
    @Resource
    private FlowExecutor flowExecutor;

    public void testConfig(){
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", "arg");
    }
}
