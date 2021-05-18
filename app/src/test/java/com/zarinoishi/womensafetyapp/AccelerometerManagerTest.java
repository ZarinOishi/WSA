package com.zarinoishi.womensafetyapp;

import android.content.Context;

import junit.framework.TestCase;

public class AccelerometerManagerTest extends TestCase {
    private Context context;
    public void testisListening() {
        AccelerometerManager a = new AccelerometerManager();
        assertEquals(false, a.isListening());
    }
    public void testisSupported() {
        AccelerometerManager a = new AccelerometerManager();

        assertEquals(false, a.isSupported(context));

    }
}

