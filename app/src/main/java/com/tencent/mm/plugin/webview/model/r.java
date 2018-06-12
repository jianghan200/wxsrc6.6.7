package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.arz;
import com.tencent.mm.protocal.c.asa;
import com.tencent.mm.sdk.platformtools.x;

public final class r
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e doG;
  public String pRp;
  public String pRq;
  public String pRr;
  public int pRs;
  public String sign;
  
  public r(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new arz();
    ((b.a)localObject).dIH = new asa();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_getuseropenid";
    ((b.a)localObject).dIF = 1177;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (arz)this.diG.dID.dIL;
    ((arz)localObject).hva = paramString1;
    ((arz)localObject).rFf = paramString2;
    ((arz)localObject).hyG = paramString3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMMBizGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (asa)this.diG.dIE.dIL;
      this.pRp = paramq.pRp;
      this.sign = paramq.sign;
      this.pRq = paramq.pRq;
      this.pRr = paramq.pRr;
      this.pRs = paramq.pRs;
      x.d("MicroMsg.NetSceneMMBizGetUserOpenId", "openid:%s, sign:%s, head_img_url:%s, nick_name:%s, friend_relation:%d", new Object[] { this.pRp, this.sign, this.pRq, this.pRr, Integer.valueOf(this.pRs) });
    }
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1177;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */