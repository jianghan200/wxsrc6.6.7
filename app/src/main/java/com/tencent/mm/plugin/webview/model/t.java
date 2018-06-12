package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awj;
import com.tencent.mm.protocal.c.awk;
import java.util.LinkedList;

public final class t
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e doG;
  public Object tag;
  
  public t(String paramString, int paramInt, LinkedList<String> paramLinkedList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new awj();
    ((b.a)localObject).dIH = new awk();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
    ((b.a)localObject).dIF = 1373;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (awj)this.diG.dID.dIL;
    ((awj)localObject).rZG = paramString;
    ((awj)localObject).rZH = paramInt;
    ((awj)localObject).rZI = paramLinkedList;
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
    return 1373;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/model/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */