package com.tencent.mm.modelstat;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class h
{
  long beginTime;
  long btT;
  boolean ceW;
  long ejJ;
  long ejK;
  long endTime;
  int rtType;
  
  public h() {}
  
  public h(int paramInt, boolean paramBoolean, long paramLong)
  {
    this.rtType = paramInt;
    this.ceW = paramBoolean;
    this.ejJ = paramLong;
    this.ejK = 0L;
  }
  
  public final void Sa()
  {
    if (this.ejK == 0L)
    {
      this.beginTime = bi.VF();
      this.btT = bi.VG();
    }
    this.ejK += 1L;
  }
  
  public final void bz(long paramLong)
  {
    if (this.ejJ == 0L) {
      this.ejJ = paramLong;
    }
    this.btT = (bi.VG() - this.btT);
    this.endTime = bi.VF();
    x.d("MicroMsg.MultiSceneStat", "FIN: TIME:" + (this.endTime - this.beginTime) + " datalen:" + this.ejJ + " Count:" + this.ejK + " type:" + this.rtType);
    WatchDogPushReceiver.a(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelstat/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */