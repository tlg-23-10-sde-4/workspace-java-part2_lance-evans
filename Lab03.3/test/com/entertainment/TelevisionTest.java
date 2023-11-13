package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {

    Television t;
    Television t2;
    @Before
    public void setup(){
        t = new Television("Sony", 0, DisplayType.LED);
        t2 = new Television("Sony", 100, DisplayType.LED);
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_upperBound() throws InvalidChannelException {
        t.changeChannel(1000);
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_lowerBound() throws InvalidChannelException {
        t.changeChannel(0);
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_upperBound() throws InvalidChannelException {
        t.changeChannel(999);
        assertEquals(999, t.getCurrentChannel());
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_lowerBound() throws InvalidChannelException{
        t.changeChannel(1);
        assertEquals(1, t.getCurrentChannel());
    }

    @Test
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_upperBound() {
        try {
            t.setVolume(101); //Should trigger exception
            fail("Should have thrown IllegalArgumentException");
        }
        catch (IllegalArgumentException e){
            String expected = "Invalid volume: 101. Allowed range: [0,100].";
            assertEquals(expected, e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_lowerBound() {
        t.setVolume(-1);
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_upperBound() {
        assertEquals(100, t2.getVolume());
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_lowerBound(){
        assertEquals(0, t.getVolume());
    }


    @Test
    public void testChangeChannel() {
    }

    @Test
    public void testCompareTo() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testEquals() {
    }
}