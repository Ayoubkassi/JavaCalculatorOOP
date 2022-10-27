/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.raven.java.streams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ryota
 */
public class JavaStreamsTest {
    
    public JavaStreamsTest() {
    }

    @Test
    public void testAdd() {
        assertEquals(2,JavaStreams.add(1,1));
    }
    
}
