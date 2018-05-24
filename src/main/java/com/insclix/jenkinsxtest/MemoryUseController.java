package com.insclix.jenkinsxtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoryUseController {

    public static final String NEW_LINE = "    ";
    private static float CAP = 0.8f;  // 80%
    private static int ONE_MB = 1024 * 1024;

    @GetMapping("/memory")
    public String hello() {
        StringBuilder sb = new StringBuilder();
        // Get current size of heap in bytes
        long heapSize = Runtime.getRuntime().totalMemory();

        // Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
        long heapMaxSize = Runtime.getRuntime().maxMemory();

        // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
        long heapFreeSize = Runtime.getRuntime().freeMemory();

        sb.append("Heap Size: " + heapSize / ONE_MB + "MB");
        sb.append(NEW_LINE);
        sb.append("Max Heap Size: " + heapMaxSize / ONE_MB + "MB");
        sb.append(NEW_LINE);
        sb.append("Free Heap Size: " + heapFreeSize / ONE_MB + "MB");
        sb.append(NEW_LINE);

        return sb.toString();
    }
}
