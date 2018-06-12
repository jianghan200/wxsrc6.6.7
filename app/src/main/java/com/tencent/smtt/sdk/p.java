package com.tencent.smtt.sdk;

import android.database.sqlite.SQLiteException;

public class p
  implements Thread.UncaughtExceptionHandler
{
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if ((paramThrowable instanceof SQLiteException)) {
      return;
    }
    throw new RuntimeException(paramThrowable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/smtt/sdk/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */