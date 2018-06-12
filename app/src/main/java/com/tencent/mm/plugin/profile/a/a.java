package com.tencent.mm.plugin.profile.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akh;
import com.tencent.mm.protocal.c.aki;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String lUe;
  
  public a(String paramString1, String paramString2)
  {
    this.lUe = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new akh();
    ((b.a)localObject).dIH = new aki();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getwburl";
    ((b.a)localObject).dIF = 205;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (akh)this.diG.dID.dIL;
    ((akh)localObject).hbL = paramString2;
    au.HU();
    paramString2 = bi.oV((String)c.DT().get(46, null));
    ((akh)localObject).reB = new bhy().bq(bi.WP(paramString2));
    au.HU();
    String str = bi.oV((String)c.DT().get(72, null));
    ((akh)localObject).rEu = new bhy().bq(bi.WP(str));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetWeiboURL", "dkwt get weibo url with id=" + paramString1 + ", a2=" + paramString2 + " , newa2:" + str);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetWeiboURL", "dkwt onGYNetEnd:[%d,%d] get weibo url result:[%s] ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), getURL() });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 205;
  }
  
  public final String getURL()
  {
    return ((aki)this.diG.dIE.dIL).URL;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/profile/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */