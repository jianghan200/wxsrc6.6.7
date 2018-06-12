package com.tencent.wcdb.support;

import android.util.Printer;

public class PrefixPrinter
  implements Printer
{
  private final String mPrefix;
  private final Printer mPrinter;
  
  private PrefixPrinter(Printer paramPrinter, String paramString)
  {
    this.mPrinter = paramPrinter;
    this.mPrefix = paramString;
  }
  
  public static Printer create(Printer paramPrinter, String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return paramPrinter;
    }
    return new PrefixPrinter(paramPrinter, paramString);
  }
  
  public void println(String paramString)
  {
    this.mPrinter.println(this.mPrefix + paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/wcdb/support/PrefixPrinter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */