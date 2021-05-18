package com.zarinoishi.womensafetyapp;

import junit.framework.TestCase;

public class UserTest extends TestCase {
    User user = new User();
    public UserTest() {
        user.registration("tasnimzarin423@gmail.com","Zarin Tasnim","zarionoishi");
    }
    public void testRegistration() {
        User arman = new User();
        boolean output = arman.registration("abcd@gmail.com","Abcd Khan","abcd");
        assertTrue(output);
    }
    public void testLogin() {
        assertTrue(user.login("tasnimzarin423@gmail.com","zarionoishi"));
    }
    public void testgetStatus() {
        assertTrue(user.getStatus());
    }
    public void testchangeStatus() {
        assertEquals(false,user.changeStatus());
    }
}
