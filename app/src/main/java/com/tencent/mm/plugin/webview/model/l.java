package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aoi;
import com.tencent.mm.protocal.c.aoj;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e doG;
  
  public l(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aoi();
    ((b.a)localObject).dIH = new aoj();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibggetuseropenid";
    ((b.a)localObject).dIF = 1566;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aoi)this.diG.dID.dIL;
    ((aoi)localObject).hbL = paramString2;
    ((aoi)localObject).jQb = paramString1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.NetSceneGetUserOpenId", "doScene");
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1566;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */