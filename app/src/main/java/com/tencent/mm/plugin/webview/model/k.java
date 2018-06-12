package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aha;
import com.tencent.mm.protocal.c.ahb;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  public final b diG;
  private com.tencent.mm.ab.e doG;
  public Object tag;
  
  public k(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    x.d("MicroMsg.NetSceneGetReadingModeInfoProxy", "NetSceneSetOAuthScope doScene url[%s], userAgent[%s], width[%d], height[%d]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aha();
    ((b.a)localObject).dIH = new ahb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getreadingmodeinfo";
    ((b.a)localObject).dIF = 673;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aha)this.diG.dID.dIL;
    ((aha)localObject).URL = paramString1;
    ((aha)localObject).rKq = paramString2;
    ((aha)localObject).Width = paramInt1;
    ((aha)localObject).Height = paramInt2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "doScene");
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.doG.a(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      x.e("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    }
  }
  
  public final int getType()
  {
    return 673;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */