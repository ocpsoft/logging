package org.ocpsoft.logging;

import org.ocpsoft.common.services.NonEnriching;
import org.ocpsoft.logging.spi.LogAdapterFactory;


/**
 * Implementation of {@link LogAdapterFactory} for the JDK 1.4 logging API.
 * 
 * @author Christian Kaltepoth
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
