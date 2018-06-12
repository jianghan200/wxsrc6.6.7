package com.tencent.tinker.c.b;

import java.io.Closeable;
import java.util.zip.ZipFile;

public final class a
{
  public static void ar(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return;
      try
      {
        if ((paramObject instanceof Closeable))
        {
          ((Closeable)paramObject).close();
          return;
        }
        if ((paramObject instanceof AutoCloseable))
        {
          ((AutoCloseable)paramObject).close();
          return;
        }
        if ((paramObject instanceof ZipFile))
        {
          ((ZipFile)paramObject).close();
          return;
        }
      }
      catch (Throwable paramObject) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tinker/c/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */