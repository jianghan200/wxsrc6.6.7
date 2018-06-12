package com.tencent.mm.u.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aot;
import com.tencent.mm.protocal.c.aou;
import com.tencent.mm.protocal.c.chf;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class a
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e doG;
  private a<a> doH;
  
  private a(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.webview.NetSceneJSAuthorize", "NetSceneJSLogin doScene appId [%s], versionType [%d], extScene[%d]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aot();
    ((b.a)localObject).dIH = new aou();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize";
    ((b.a)localObject).dIF = 1157;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aot)this.diG.dID.dIL;
    if (paramInt2 > 0)
    {
      ((aot)localObject).rRc = new chf();
      ((aot)localObject).rRc.scene = paramInt2;
    }
    ((aot)localObject).jQb = paramString;
    ((aot)localObject).rQZ = paramLinkedList;
    ((aot)localObject).rRb = paramInt1;
  }
  
  public a(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2, a<a> parama)
  {
    this(paramString, paramLinkedList, paramInt1, paramInt2);
    this.doH = parama;
  }
  
  public a(String paramString, LinkedList<String> paramLinkedList, a<a> parama)
  {
    this(paramString, paramLinkedList, 0, -1, parama);
  }
  
  public final aou CU()
  {
    return (aou)this.diG.dIE.dIL;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.webview.NetSceneJSAuthorize", "doScene");
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.webview.NetSceneJSAuthorize", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.doG != null) {
      this.doG.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.doH != null) {
      this.doH.b(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1157;
  }
  
  public static abstract interface a<T extends l>
  {
    public abstract void b(int paramInt1, int paramInt2, String paramString, T paramT);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/u/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */