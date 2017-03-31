package com.pguardiola.morpheustest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class RemoveStaticBlockTest {

  @Test
  public void checksRemovingStaticBlockWithinATest() throws Exception {
    Evil evil = mock(Evil.class);
    //Evil evil = new Evil();

    // The idea is to attach morpheus task only when
    // building tests and remove the static block
    // only when testing

    // If you execute the test you'll see
    // ---This message should NOT appear
    // in the console and shouldn't
    // Note that
    // ---Evil created
    // message won't appear because we're mocking it
    assertTrue(true);
  }
}