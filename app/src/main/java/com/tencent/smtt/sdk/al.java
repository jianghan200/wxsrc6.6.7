package com.tencent.smtt.sdk;

import android.os.HandlerThread;

class al
  extends HandlerThread
{
  private static al a;
  
  public al(String paramString)
  {
    super(paramString);
  }
  
  public static al a()
  {
    try
    {
      if (a == null)
      {
        localal = new al("TbsHandlerThread");
        a = localal;
        localal.start();
      }
      al localal = a;
      return localal;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/smtt/sdk/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */