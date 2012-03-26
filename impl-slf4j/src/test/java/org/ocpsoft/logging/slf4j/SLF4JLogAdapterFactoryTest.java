package org.ocpsoft.logging.slf4j;

import static junit.framework.Assert.assertTrue;

import org.junit.Test;
import org.ocpsoft.logging.Logger;
import org.ocpsoft.logging.slf4j.SLF4JLogAdapter;


public class SLF4JLogAdapterFactoryTest
{

   @Test
   public void testSLF4JAdapterPreferedOverJDKLogger()
   {
      Logger log = Logger.getLogger(this.getClass());
      assertTrue(log instanceof SLF4JLogAdapter);
   }

}
