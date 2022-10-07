package com.bela;

import org.jboss.byteman.rule.Rule;
import org.jboss.byteman.rule.helper.Helper;
import org.jgroups.Message;
import org.jgroups.stack.Protocol;

/**
 * @author Bela Ban
 * @since x.y
 */
public class TestHelper extends Helper {

    protected TestHelper(Rule rule) {
        super(rule);
    }


    @SuppressWarnings("MethodMayBeStatic")
    public void downTime(Message msg, Protocol prot) {
        System.out.printf("msg: %s, prot: %s\n", msg, prot);
    }
}
