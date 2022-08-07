package com.example.liteflowdemo.bussies;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@LiteflowComponent("a")
public class ACmp extends NodeComponent {

    @Override
    public void process() {
        String args = this.getRequestData();
        System.out.println("ACmp" + args);
    }
}