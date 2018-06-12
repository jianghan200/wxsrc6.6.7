package com.tencent.mm.plugin.messenger.foundation.a.a;

import com.tencent.mm.bk.a;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public abstract interface h
{
  public static final class a
    extends h.b
  {
    private int cmdId;
    
    public a(int paramInt, a parama)
    {
      super();
      this.cmdId = paramInt;
      this.lcH = parama;
    }
    
    public final int getCmdId()
    {
      return this.cmdId;
    }
  }
  
  public static class b
  {
    public int bWA = -1;
    public byte[] buffer;
    public int cmdId;
    public long dSH;
    public int id;
    public int lcD;
    public long lcE;
    public String lcF;
    public String lcG;
    public a lcH;
    
    public b(int paramInt)
    {
      this.cmdId = paramInt;
    }
    
    public final byte[] getBuffer()
    {
      if ((this.buffer == null) && (this.lcH != null)) {}
      try
      {
        this.buffer = this.lcH.toByteArray();
        return this.buffer;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          x.e("MicroMsg.OpLog.Operation", "summeroplog Operation toByteArray err: " + localIOException.getMessage());
        }
      }
    }
    
    public int getCmdId()
    {
      return this.cmdId;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/messenger/foundation/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */