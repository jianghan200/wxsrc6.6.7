package com.tencent.mm.plugin.bottle.a;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.protocal.c.bau;
import com.tencent.mm.protocal.c.bav;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.Map;

public final class f
  extends l
  implements com.tencent.mm.network.k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  boolean hjY = false;
  
  public f()
  {
    b.a locala = new b.a();
    locala.dIG = new bau();
    locala.dIH = new bav();
    locala.uri = "/cgi-bin/micromsg-bin/pickbottle";
    locala.dIF = 155;
    locala.dII = 54;
    locala.dIJ = 1000000054;
    this.diG = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetScenePickBottle", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3);
    if ((paramInt2 == 4) && ((paramInt3 == 63534) || (paramInt3 == -56)))
    {
      c.ng(0);
      c.nh(0);
    }
    paramArrayOfByte = (bav)this.diG.dIE.dIL;
    if (paramInt2 == 4) {
      switch (paramInt3)
      {
      default: 
        c.nh(paramArrayOfByte.rGd);
        c.ng(paramArrayOfByte.rGc);
      }
    }
    String str;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.hjY = true;
      x.d("MicroMsg.NetScenePickBottle", "bottle pack:pack:" + paramArrayOfByte.rGd + " throw:" + paramArrayOfByte.rGc);
      paramq = null;
      if (paramArrayOfByte.say != null) {
        paramq = paramArrayOfByte.say.split(":");
      }
      ab localab;
      if ((paramq != null) && (paramq.length >= 2))
      {
        str = paramq[0];
        au.HU();
        paramq = com.tencent.mm.model.c.FR().Yg(str);
        if ((paramq == null) || (!paramq.field_username.equals(str)))
        {
          localab = new ab();
          localab.setUsername(str);
          if (paramArrayOfByte.hcS != null) {
            break label836;
          }
          paramq = "";
          localab.dx(paramq);
          localab.eI(3);
          paramq = new j();
          paramq.username = str;
          paramq.csA = 3;
          paramq.by(true);
          paramq.bWA = -1;
        }
      }
      try
      {
        Map localMap = bl.z(paramArrayOfByte.rIk, "userinfo");
        if (localMap != null)
        {
          localab.eJ(bi.getInt((String)localMap.get(".userinfo.$sex"), 0));
          localab.dM((String)localMap.get(".userinfo.$signature"));
          localab.dS(RegionCodeDecoder.aq((String)localMap.get(".userinfo.$country"), (String)localMap.get(".userinfo.$province"), (String)localMap.get(".userinfo.$city")));
          x.d("MicroMsg.NetScenePickBottle", "user:" + str + " sig:" + localab.signature + " sex" + localab.sex + " city:" + localab.getCity() + " prov:" + localab.getProvince());
          paramq.dHR = ((String)localMap.get(".userinfo.$bigheadimgurl"));
          paramq.dHQ = ((String)localMap.get(".userinfo.$smallheadimgurl"));
          paramq.bWA = -1;
          x.d("MicroMsg.NetScenePickBottle", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { str, paramq.Kx(), paramq.Ky() });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.NetScenePickBottle", "Set Contact failed " + localException.getMessage() + " user:" + str);
        }
      }
      au.HU();
      com.tencent.mm.model.c.FR().R(localab);
      com.tencent.mm.aa.q.KH().a(paramq);
      x.d("MicroMsg.NetScenePickBottle", "getBottleType " + paramArrayOfByte.sde);
      x.d("MicroMsg.NetScenePickBottle", "getMsgType " + paramArrayOfByte.jQd);
      x.d("MicroMsg.NetScenePickBottle", "getBottleInfo " + paramArrayOfByte.say);
      x.d("MicroMsg.NetScenePickBottle", "getUserInfo " + paramArrayOfByte.rIk);
      x.d("MicroMsg.NetScenePickBottle", "getNickName " + paramArrayOfByte.hcS);
      x.d("MicroMsg.NetScenePickBottle", "getUserStatus " + paramArrayOfByte.sdf);
      x.d("MicroMsg.NetScenePickBottle", "getThrowCount " + paramArrayOfByte.rGc);
      x.d("MicroMsg.NetScenePickBottle", "getPickCount " + paramArrayOfByte.rGd);
      x.d("MicroMsg.NetScenePickBottle", "getDistance " + paramArrayOfByte.sdg);
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label836:
      paramq = paramArrayOfByte.hcS;
      break;
      if (paramInt3 == -56)
      {
        c.nh(paramArrayOfByte.rGd);
        c.nh(paramArrayOfByte.rGc);
      }
    }
  }
  
  final bav auh()
  {
    return (bav)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 155;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */