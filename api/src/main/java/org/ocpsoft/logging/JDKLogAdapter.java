package org.ocpsoft.logging;

import java.util.logging.LogRecord;

/**
 * Implementation of a log adapter that delegates to the JDK 1.4 logging API.
 * 
 * @author Christian Kaltepoth
 */
public class JDKLogAdapter extends Logger
{
   private final java.util.logging.Logger delegate;

   private final String name;

   public JDKLogAdapter(final String name)
   {
      this.name = name;
      this.delegate = java.util.logging.Logger.getLogger(name);
   }

   @Override
   protected void log(final Level level, final String msg, final Throwable t)
   {
      LogRecord r = new LogRecord(getJdkLogLevel(level), msg);
      r.setSourceClassName(name);
      r.setSourceMethodName(null);
      r.setThrown(t);
      delegate.log(r);
   }

   @Override
   protected boolean isEnabled(final Level level)
   {
      return delegate.isLoggable(getJdkLogLevel(level));
   }

   /**
    * Translates the log level to JDK {@link java.util.logging.Level} class.
    *
    * @param level The internal log level
    * @return The JUL log level
    */
   protected final java.util.logging.Level getJdkLogLevel(final Level level)
   {
      switch (level)
      {
      case TRACE:
         return java.util.logging.Level.FINER;
      case DEBUG:
         return java.util.logging.Level.FINE;
      case INFO:
         return java.util.logging.Level.INFO;
      case WARN:
         return java.util.logging.Level.WARNING;
      case ERROR:
         return java.util.logging.Level.SEVERE;
      }
      throw new IllegalArgumentException("Unsupported log level: " + level);
   }

}
