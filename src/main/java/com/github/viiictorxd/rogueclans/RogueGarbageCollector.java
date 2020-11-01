package com.github.viiictorxd.rogueclans;

import java.lang.management.ManagementFactory;

public class RogueGarbageCollector {

    public static void garbageClear() {
        System.out.println("[RogueClans Heap Before] " + ManagementFactory.getMemoryMXBean().getHeapMemoryUsage());
        System.out.println("[RogueClans Non-heap Before] " + ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage());

        System.gc();

        System.out.println("[RogueClans Heap After] " + ManagementFactory.getMemoryMXBean().getHeapMemoryUsage());
        System.out.println("[RogueClans Non-heap After] " + ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage());
    }
}
