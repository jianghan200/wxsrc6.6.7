package com.tencent.mm.modelvoiceaddr.b;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class b
  implements e
{
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    g.DF().b(228, this);
    if ((paraml instanceof a)) {
      x.i("MicroMsg.NewVoiceInputReportManager", "onSceneEnd errType = %s, errCode = %s, errMsg = %s ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelvoiceaddr/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */