package com.tencent.mm.pluginsdk.g.a.b;

import java.io.IOException;

public final class f
  extends IOException
{
  public final int httpStatusCode;
  public final IOException qCQ;
  
  public f(int paramInt, IOException paramIOException)
  {
    this.httpStatusCode = paramInt;
    this.qCQ = paramIOException;
  }
  
  public final String toString()
  {
    return "UnknownConnectionError{httpStatusCode=" + this.httpStatusCode + ", realException=" + this.qCQ + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */