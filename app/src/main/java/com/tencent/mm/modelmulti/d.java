package com.tencent.mm.modelmulti;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.aaf;
import com.tencent.mm.protocal.c.aag;
import com.tencent.mm.protocal.c.ane;
import com.tencent.mm.protocal.c.ang;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends l
  implements k
{
  public final b dZf;
  private com.tencent.mm.ab.e diJ;
  
  public d(List<ane> paramList, long paramLong, ang paramang)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aaf();
    ((b.a)localObject).dIH = new aag();
    ((b.a)localObject).uri = "/cgi-bin/mmo2o-bin/getbeaconspushmessage";
    ((b.a)localObject).dIF = 1708;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.dZf = ((b.a)localObject).KT();
    localObject = (aaf)this.dZf.dID.dIL;
    ((aaf)localObject).rFH.addAll(paramList);
    ((aaf)localObject).rFK = paramLong;
    ((aaf)localObject).rFJ = paramang;
    x.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma]getBeaconsPushMessageReq.beacons.size:%d", new Object[] { Integer.valueOf(((aaf)localObject).rFH.size()) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    Object localObject = (aaf)this.dZf.dID.dIL;
    paramString = ((aaf)localObject).rFH;
    paramArrayOfByte = (ane)paramString.get(0);
    localObject = ((aaf)localObject).rFJ;
    paramq = (aag)((b)paramq).dIE.dIL;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      if (paramq.result != 0) {
        h.mEJ.h(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramString.size()), paramArrayOfByte.fMk, Integer.valueOf(paramArrayOfByte.major), Integer.valueOf(paramArrayOfByte.minor), String.valueOf(((ang)localObject).latitude), String.valueOf(((ang)localObject).longitude), Integer.valueOf(2), Integer.valueOf(paramq.result) });
      }
      x.d("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:net end ok");
      return;
    }
    h.mEJ.h(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramString.size()), paramArrayOfByte.fMk, Integer.valueOf(paramArrayOfByte.major), Integer.valueOf(paramArrayOfByte.minor), String.valueOf(((ang)localObject).latitude), String.valueOf(((ang)localObject).longitude), Integer.valueOf(1), Integer.valueOf(paramq.result) });
    x.d("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:net end not ok");
  }
  
  public final int getType()
  {
    return 1708;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelmulti/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */