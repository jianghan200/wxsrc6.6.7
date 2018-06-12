package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aat;
import com.tencent.mm.protocal.c.aau;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class j
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public j(String paramString1, String paramString2, Map<String, Object> paramMap)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aat();
    ((b.a)localObject).dIH = new aau();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizjsapiredirecturl";
    ((b.a)localObject).dIF = 1393;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aat)this.diG.dID.dIL;
    ((aat)localObject).ruF = paramString1;
    ((aat)localObject).rki = paramString2;
    ((aat)localObject).rFZ = ((String)paramMap.get("groupId"));
    ((aat)localObject).pnl = ((String)paramMap.get("timestamp"));
    ((aat)localObject).hFm = ((String)paramMap.get("nonceStr"));
    ((aat)localObject).signature = ((String)paramMap.get("signature"));
    ((aat)localObject).rGa = paramMap.get("params").toString();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneGetBizJsApiRedirectUrl", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetBizJsApiRedirectUrl", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final aau bTX()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (aau)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final int getType()
  {
    return 1393;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */