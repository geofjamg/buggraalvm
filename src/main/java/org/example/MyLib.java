package org.example;

import org.graalvm.nativeimage.IsolateThread;
import org.graalvm.nativeimage.c.CContext;
import org.graalvm.nativeimage.c.function.CEntryPoint;

@CContext(Directives.class)
public class MyLib {

    private MyLib() {
    }

    @CEntryPoint(name = "hello")
    public static void hello(IsolateThread thread) {
        System.out.println("HELLO");
    }
}
