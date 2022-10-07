package com.bela;

import org.jgroups.Message;
import org.jgroups.ObjectMessage;
import org.jgroups.stack.Protocol;

/**
 * @author Bela Ban
 * @since x.y
 */
public class Test {

    public static void main(String[] args) {
        MDisp md=new MDisp();
        md.send(new ObjectMessage(null, "hello"));
    }


    protected static class MDisp {
        protected final ProtAd pa=new ProtAd();
        void send(Message msg) {
            pa.down(msg);
        }


        class ProtAd extends Protocol {
            public Object down(Message m) {
                System.out.println("**** down(" + m + ")");
                return null;
            }
        }

    }

}
