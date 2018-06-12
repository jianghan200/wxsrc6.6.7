package com.tencent.mm.network;

import android.os.RemoteCallbackList;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class ac
  extends i.a
{
  private al dHa = new al(new ac.1(this), false);
  private long etA;
  private int etB = 0;
  private final RemoteCallbackList<n> etC = new RemoteCallbackList();
  private int etz = 4;
  
  public final int UA()
  {
    if (0L > bi.bG(this.etA)) {}
    for (int i = 5;; i = this.etz)
    {
      x.i("MicroMsg.NetworkEvent", "getNowStatus = %d", new Object[] { Integer.valueOf(i) });
      return i;
    }
  }
  
  public final void UB()
  {
    this.etC.kill();
  }
  
  public final long UC()
  {
    return this.etA;
  }
  
  public final boolean c(n paramn)
  {
    try
    {
      this.etC.register(paramn);
      return true;
    }
    catch (Exception paramn)
    {
      x.e("MicroMsg.NetworkEvent", "addListener %s", new Object[] { paramn });
      x.e("MicroMsg.NetworkEvent", "exception:%s", new Object[] { bi.i(paramn) });
    }
    return true;
  }
  
  public final boolean d(n paramn)
  {
    try
    {
      boolean bool = this.etC.unregister(paramn);
      return bool;
    }
    catch (Exception paramn)
    {
      x.e("MicroMsg.NetworkEvent", "removeListener %s", new Object[] { paramn });
      x.e("MicroMsg.NetworkEvent", "exception:%s", new Object[] { bi.i(paramn) });
    }
    return false;
  }
  
  public final void iO(int paramInt)
  {
    int j = 0;
    x.i("MicroMsg.NetworkEvent", "networkChange : %d", new Object[] { Integer.valueOf(paramInt) });
    int i;
    if (paramInt == this.etz)
    {
      i = j;
      if (i != 0) {
        break label141;
      }
    }
    label131:
    label141:
    while ((paramInt != 0) && (paramInt != 4) && (paramInt != 6))
    {
      return;
      if (3 == paramInt)
      {
        i = j;
        if (this.etz != 2) {
          break;
        }
        this.etz = paramInt;
        i = 1;
        break;
      }
      if (2 == paramInt)
      {
        i = j;
        if (this.etz == 0) {
          break;
        }
        i = j;
        if (this.etz == 1) {
          break;
        }
        this.etB += 1;
        if (this.etB <= 0) {
          break label131;
        }
        this.etz = 2;
        i = 1;
        break;
      }
      if (4 == paramInt)
      {
        this.etB = 0;
        this.etz = 4;
        i = 1;
        break;
      }
      this.etz = paramInt;
      i = 1;
      break;
    }
    this.dHa.J(1000L, 1000L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/network/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */