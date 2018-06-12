package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awl;
import com.tencent.mm.protocal.c.awm;

public final class s
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e doG;
  public String pRt;
  public Object tag;
  
  public s(String paramString1, String paramString2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new awl();
    ((b.a)localObject).dIH = new awm();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_authorize";
    ((b.a)localObject).dIF = 1254;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.pRt = paramString1;
    this.diG = ((b.a)localObject).KT();
    localObject = (awl)this.diG.dID.dIL;
    ((awl)localObject).rZG = paramString1;
    ((awl)localObject).rjm = paramString2;
    ((awl)localObject).scene = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1254;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */