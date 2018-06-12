package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.protocal.c.bzz;
import com.tencent.mm.protocal.c.caa;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends n<bzz, caa>
{
  public e(int paramInt, long paramLong, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bzz();
    ((b.a)localObject).dIH = new caa();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipgetroominfo";
    ((b.a)localObject).dIF = 303;
    ((b.a)localObject).dII = 119;
    ((b.a)localObject).dIJ = 1000000119;
    this.diG = ((b.a)localObject).KT();
    localObject = (bzz)this.diG.dID.dIL;
    ((bzz)localObject).rxG = paramInt;
    ((bzz)localObject).rxH = paramLong;
    ((bzz)localObject).svS = paramString;
    ((bzz)localObject).hcE = 1;
    ((bzz)localObject).suO = System.currentTimeMillis();
  }
  
  public final com.tencent.mm.ab.e bLm()
  {
    return new e.1(this);
  }
  
  public final void dP(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      caa localcaa = (caa)bLq();
      if (localcaa != null) {
        x.i("MicroMsg.Voip.GetRoomInfo", "roomId:%d, roomKey:%s, memberCount:%d, inviteType:%d", new Object[] { Integer.valueOf(localcaa.rxG), Long.valueOf(localcaa.rxH), Integer.valueOf(localcaa.hLg), Integer.valueOf(localcaa.svK) });
      }
      return;
    }
    x.i("MicroMsg.Voip.GetRoomInfo", "Get RoomInfo error");
  }
  
  public final int getType()
  {
    return 303;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */