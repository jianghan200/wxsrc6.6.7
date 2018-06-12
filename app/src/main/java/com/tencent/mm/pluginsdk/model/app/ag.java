package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.art;
import com.tencent.mm.protocal.c.aru;
import com.tencent.mm.sdk.platformtools.x;

public final class ag
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public ag(int paramInt, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new art();
    ((b.a)localObject).dIH = new aru();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/getserviceapplist";
    ((b.a)localObject).dIF = 1060;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (art)this.diG.dID.dIL;
    ((art)localObject).offset = paramInt;
    ((art)localObject).limit = 20;
    ((art)localObject).lang = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneGetServiceAppList", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetServiceAppList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1060;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */