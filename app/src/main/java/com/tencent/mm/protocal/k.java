package com.tencent.mm.protocal;

import com.tencent.mm.bk.b;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.fk;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.sdk.platformtools.x;

public final class k
{
  public static fk a(d paramd)
  {
    fk localfk = new fk();
    localfk.rgt = paramd.qWt;
    localfk.otY = paramd.qWw;
    localfk.iwE = paramd.qWs;
    localfk.rgs = b.bi(paramd.qWv.getBytes());
    if (localfk.rgs.lR.length >= 16) {
      localfk.rgs = localfk.rgs.Cz(16);
    }
    localfk.rgu = b.bi(paramd.qWu.getBytes());
    if (localfk.rgu.lR.length >= 132) {
      localfk.rgu = localfk.rgu.Cz(132);
    }
    localfk.rgr = b.bi(paramd.bjP);
    if (localfk.rgr.lR.length >= 36) {
      localfk.rgr = localfk.rgr.Cz(36);
    }
    return localfk;
  }
  
  public static void a(e parame, fl paramfl)
  {
    if (paramfl.rgv != null)
    {
      parame.qWD = paramfl.rgv.siM;
      return;
    }
    parame.qWD = "";
    x.e("MicroMsg.MMBase", "ErrMsg is Null!!!!!!");
  }
  
  public static abstract interface a
  {
    public abstract boolean a(PByteArray paramPByteArray, int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2);
  }
  
  public static abstract interface b
  {
    public abstract byte[] Ie();
    
    public abstract int If();
    
    public abstract boolean cgo();
  }
  
  public static abstract interface c
  {
    public abstract int G(byte[] paramArrayOfByte);
    
    public abstract boolean cgo();
  }
  
  public static class d
  {
    public byte[] bjP = new byte[0];
    public long bufferSize = 0L;
    public y qWA = new y("", "", 0);
    public int qWs = 0;
    public int qWt = 0;
    public String qWu = "";
    public String qWv = "";
    public int qWw = 0;
    public boolean qWx = true;
    public k.a qWy;
    public byte[] qWz;
    
    public boolean LB()
    {
      return this.qWx;
    }
    
    public boolean cgo()
    {
      return false;
    }
    
    public void eK(int paramInt)
    {
      this.qWs = paramInt;
    }
    
    public int getCmdId()
    {
      return 0;
    }
  }
  
  public static class e
  {
    public long bufferSize = 0L;
    public int qWB = -99;
    public int qWC = 255;
    public String qWD = "";
    
    public boolean cgo()
    {
      return false;
    }
    
    public int getCmdId()
    {
      return 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */