package com.example.liteflowdemo.bussies;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("a")
public class ACmp extends NodeComponent {

    @Override
    public void process() {
        //do your business
    }
}