package com.zarinoishi.womensafetyapp;

import android.content.Intent;

import junit.framework.TestCase;

public class BgServiceTest extends TestCase {
    public Intent intent;
    public void testonBind() {
        BgService b = new BgService();
        assertEquals(null, b.onBind(intent));
    }

}
