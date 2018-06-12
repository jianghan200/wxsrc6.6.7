package com.tencent.mm.pluginsdk.g.a.b;

import java.io.IOException;

public final class b
  extends IOException
{
  private final long cfA;
  private final long qCP;
  
  public b()
  {
    this(0L, 0L);
  }
  
  public b(long paramLong1, long paramLong2)
  {
    super(String.format("contentLength: %d, requestRange:%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) }));
    this.cfA = paramLong1;
    this.qCP = paramLong2;
  }
  
  public final String toString()
  {
    return "FileSizeOutOfRangeException{contentLength=" + this.cfA + ", requestRange=" + this.qCP + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */