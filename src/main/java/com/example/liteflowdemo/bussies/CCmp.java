package com.example.liteflowdemo.bussies;

import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.slot.DefaultContext;
import org.springframework.stereotype.Component;

@Component("c")
public class CCmp extends NodeComponent {

    @Override
    public void process() {
        String req = this.getRequestData();
        DefaultContext context = this.getContextBean(DefaultContext.class);
        context.setData("arg", req);
        System.out.println("CCmp");
    }
}