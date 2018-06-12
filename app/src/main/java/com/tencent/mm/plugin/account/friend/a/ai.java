package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bky;
import com.tencent.mm.protocal.c.bkz;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ai
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ = null;
  
  public ai(String paramString, List<String> paramList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bky();
    ((b.a)localObject).dIH = new bkz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendsmstomfriend";
    ((b.a)localObject).dIF = 432;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bky)this.diG.dID.dIL;
    ((bky)localObject).rwj = paramString;
    ((bky)localObject).rTA = new LinkedList();
    ((bky)localObject).rTz = paramList.size();
    paramString = paramList.iterator();
    while (paramString.hasNext())
    {
      paramList = (String)paramString.next();
      if (!bi.oW(paramList)) {
        ((bky)localObject).rTA.add(new bhz().VO(paramList));
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 432;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */