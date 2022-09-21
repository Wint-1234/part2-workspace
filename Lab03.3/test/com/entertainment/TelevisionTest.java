package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionTest {

  Television tv1 = new Television("Sony", 55, DisplayType.LED);
  Television tv2 = new Television("Sony", 35, DisplayType.LED);

  @Test
  public void testSetVolume() {
    tv1.setVolume(75);
    assertEquals(75, tv1.getVolume());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testSetVolumeIllegalArgumentException() {
    tv1.setVolume(-5);
  }

  @Test
  public void testChangeChannel() throws InvalidChannelException {
    tv1.changeChannel(78);
    assertEquals(78, tv1.getCurrentChannel());
  }

  @Test (expected = InvalidChannelException.class)
  public void testChangeChannelInvalidChannelException() throws InvalidChannelException {
    tv1.changeChannel(-2);
  }

  @Test
  public void testCompareTo() {
    assertEquals(0, tv2.compareTo(tv1));
  }

  @Test
  public void testHashCode() {
    assertNotEquals(tv1.hashCode(), tv2.hashCode());
  }

  @Test
  public void testEquals() {
    assertFalse(tv1.equals(tv2));
  }
}