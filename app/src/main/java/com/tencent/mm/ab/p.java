package com.tencent.mm.ab;

import android.os.RemoteException;
import com.tencent.mm.network.c;
import com.tencent.mm.network.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class p
  implements c
{
  private final d dJI;
  
  public p(d paramd)
  {
    this.dJI = paramd;
  }
  
  private String getUsername()
  {
    try
    {
      String str = this.dJI.getUsername();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localRemoteException) });
    }
    return null;
  }
  
  public final byte[] DE()
  {
    try
    {
      byte[] arrayOfByte = this.dJI.DE();
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localRemoteException) });
    }
    return null;
  }
  
  public final int Df()
  {
    try
    {
      int i = this.dJI.Df();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localRemoteException) });
    }
    return 0;
  }
  
  public final int I(byte[] paramArrayOfByte)
  {
    try
    {
      int i = this.dJI.I(paramArrayOfByte);
      return i;
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("MicroMsg.RAccInfo", "AccInfoCacheInWorker parseBuf exception:%s", new Object[] { bi.i(paramArrayOfByte) });
    }
    return -6;
  }
  
  public final byte[] Lm()
  {
    try
    {
      byte[] arrayOfByte = this.dJI.Lm();
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localRemoteException) });
    }
    return null;
  }
  
  public final boolean Ln()
  {
    try
    {
      boolean bool = this.dJI.Ln();
      return bool;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localException) });
    }
    return false;
  }
  
  public final byte[] Lo()
  {
    try
    {
      byte[] arrayOfByte = this.dJI.Lo();
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localRemoteException) });
    }
    return null;
  }
  
  public final boolean Lp()
  {
    try
    {
      boolean bool = this.dJI.Lp();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localRemoteException) });
    }
    return true;
  }
  
  public final byte[] Lq()
  {
    try
    {
      byte[] arrayOfByte = this.dJI.Lq();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.RAccInfo", "AccInfoCacheInWorker getCacheBuffer exception:%s", new Object[] { bi.i(localException) });
    }
    return null;
  }
  
  public final void bB(boolean paramBoolean)
  {
    try
    {
      this.dJI.bB(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localRemoteException) });
    }
  }
  
  public final void eK(int paramInt)
  {
    try
    {
      this.dJI.eK(paramInt);
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void h(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      this.dJI.h(paramString, paramArrayOfByte);
      return;
    }
    catch (RemoteException paramString)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(paramString) });
    }
  }
  
  public final byte[] kf(String paramString)
  {
    try
    {
      paramString = this.dJI.kf(paramString);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(paramString) });
    }
    return null;
  }
  
  public final void reset()
  {
    try
    {
      this.dJI.reset();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(localRemoteException) });
    }
  }
  
  public final void setUsername(String paramString)
  {
    try
    {
      this.dJI.setUsername(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(paramString) });
    }
  }
  
  public final String toString()
  {
    String str = "RAccInfo:\n" + "|-uin     =" + Df() + "\n";
    str = str + "|-user    =" + getUsername() + "\n";
    str = str + "|-session =" + DE() + "\n";
    str = str + "|-ecdhkey =" + bi.bB(Lo()) + "\n";
    return str + "`-cookie  =" + bi.bB(Lm());
  }
  
  public final void x(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      this.dJI.x(paramArrayOfByte, paramInt);
      return;
    }
    catch (RemoteException paramArrayOfByte)
    {
      x.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bi.i(paramArrayOfByte) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ab/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */