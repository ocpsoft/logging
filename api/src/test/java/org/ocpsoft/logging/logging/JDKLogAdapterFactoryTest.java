package org.ocpsoft.logging.logging;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import org.ocpsoft.logging.JDKLogAdapter;
import org.ocpsoft.logging.JDKLogAdapterFactory;
import org.ocpsoft.logging.Logger;


public class JDKLogAdapterFactoryTest
{

   @Test
   public void testJDKCreateLogAdapter()
   {
      Logger log = new JDKLogAdapterFactory().createLogAdapter(JDKLogAdapterFactoryTest.class.getName());
      assertEquals(JDKLogAdapter.class, log.getClass());
   }

   @Test
   public void testJDKGetLogAdapterFromLogger()
   {
      Logger log = Logger.getLogger(this.getClass());
      assertEquals(JDKLogAdapter.class, log.getClass());
   }

}
