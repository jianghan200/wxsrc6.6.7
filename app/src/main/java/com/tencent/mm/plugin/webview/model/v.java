package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.biq;
import com.tencent.mm.protocal.c.bir;
import java.util.LinkedList;

public final class v
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e doG;
  
  public v(int paramInt, String paramString1, String paramString2, String paramString3, LinkedList<String> paramLinkedList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new biq();
    ((b.a)localObject).dIH = new bir();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize_confirm ";
    ((b.a)localObject).dIF = 1346;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (biq)this.diG.dID.dIL;
    ((biq)localObject).rZH = paramInt;
    ((biq)localObject).bPS = paramString1;
    ((biq)localObject).rZI = paramLinkedList;
    ((biq)localObject).state = paramString2;
    ((biq)localObject).sjf = paramString3;
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
    return 1346;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */