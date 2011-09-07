package com.ocpsoft.logging.spi;

import com.ocpsoft.common.pattern.Weighted;
import com.ocpsoft.logging.Logger;

/**
 * SPI for custom logging adapters
 * 
 * @author Christian Kaltepoth <christian@kaltepoth.de>
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
