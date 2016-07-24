package org.ocpsoft.logging.spi;

import org.ocpsoft.common.pattern.Weighted;
import org.ocpsoft.logging.Logger;


/**
 * SPI for custom logging adapters
 * 
 * @author Christian Kaltepoth
 */
public interface LogAdapterFactory extends Weighted
{

   /**
    * Create a new log adapter for the given logger name.
    * 
    * @param logger The name of the logger
    * @return A log adapter extending {@link Logger}
    */
   Logger createLogAdapter(String logger);

}
