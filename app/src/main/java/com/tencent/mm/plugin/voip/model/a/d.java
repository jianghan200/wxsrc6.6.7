package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bzx;
import com.tencent.mm.protocal.c.bzy;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends n<bzx, bzy>
{
  public d(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte, int paramInt7)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bzx();
    ((b.a)localObject).dIH = new bzy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipDoubleLinkSwitch";
    ((b.a)localObject).dIF = 249;
    ((b.a)localObject).dII = 249;
    ((b.a)localObject).dIJ = 1000000249;
    this.diG = ((b.a)localObject).KT();
    localObject = (bzx)this.diG.dID.dIL;
    ((bzx)localObject).rxG = paramInt1;
    ((bzx)localObject).rxH = paramLong;
    ((bzx)localObject).seq = paramInt2;
    ((bzx)localObject).svM = paramInt3;
    ((bzx)localObject).svN = paramInt4;
    ((bzx)localObject).svO = paramInt5;
    ((bzx)localObject).svP = paramInt6;
    ((bzx)localObject).svQ = 1;
    ((bzx)localObject).rfy = new bhy().S(paramArrayOfByte, paramInt7);
  }
  
  public final e bLm()
  {
    return new d.1(this);
  }
  
  public final void dP(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bzy localbzy = (bzy)bLq();
      if (localbzy != null) {
        x.i("MicroMsg.Voip.DoubleLinkSwitch", "roomId:%d, roomKey:%s, member:%d", new Object[] { Integer.valueOf(localbzy.rxG), Long.valueOf(localbzy.rxH), Integer.valueOf(localbzy.seq) });
      }
      return;
    }
    x.i("MicroMsg.Voip.DoubleLinkSwitch", "double link switch error");
  }
  
  public final int getType()
  {
    return 249;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */