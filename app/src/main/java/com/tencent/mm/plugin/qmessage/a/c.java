package com.tencent.mm.plugin.qmessage.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ael;
import com.tencent.mm.protocal.c.aem;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  public final b ejL;
  private com.tencent.mm.ab.e mbu;
  
  public c()
  {
    b.a locala = new b.a();
    locala.dIG = new ael();
    locala.dIH = new aem();
    locala.uri = "/cgi-bin/micromsg-bin/getimunreadmsgcount";
    locala.dIF = 630;
    locala.dII = 0;
    locala.dIJ = 0;
    this.ejL = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneGetImUnreadMsgCount", "get im unread msg count");
    this.mbu = parame1;
    return a(parame, this.ejL, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetImUnreadMsgCount", "end get im unread msg count, errType: %d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mbu.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 630;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */