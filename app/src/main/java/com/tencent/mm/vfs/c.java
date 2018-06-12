package com.tencent.mm.vfs;

import java.io.FilterInputStream;

public final class c
  extends FilterInputStream
{
  public c(String paramString)
  {
    super(d.openRead(paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vfs/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */