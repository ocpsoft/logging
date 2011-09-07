package com.ocpsoft.logging;

import com.ocpsoft.common.services.NonEnriching;
import com.ocpsoft.logging.spi.LogAdapterFactory;

/**
 * Implementation of {@link LogAdapterFactory} for the JDK 1.4 logging API.
 * 
 * @author Christian Kaltepoth <christian@kaltepoth.de>
 */
public class JDKLogAdapterFactory implements LogAdapterFactory, NonEnriching
{
   @Override
   public int priority()
   {
      return 10;
   }

   @Override
   public Logger createLogAdapter(final String logger)
   {
      return new JDKLogAdapter(logger);
   }
}
