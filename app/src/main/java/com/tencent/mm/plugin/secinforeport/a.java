package com.tencent.mm.plugin.secinforeport;

import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.secinforeport.a.b;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.ph;
import com.tencent.mm.protocal.c.pi;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.charset.Charset;
import java.util.LinkedList;

public enum a
  implements b
{
  private a() {}
  
  public final void a(int paramInt1, String paramString, int paramInt2, byte[] paramArrayOfByte)
  {
    if (paramString == null) {
      x.w("MicroMsg.ClipBordReportImpl", "operationInfo isNullOrNil");
    }
    while (!com.tencent.mm.kernel.g.Eg().Dx()) {
      return;
    }
    ph localph = new ph();
    localph.rtD = paramInt1;
    localph.rtF = paramInt2;
    paramString = paramString.getBytes(Charset.forName("UTF-8"));
    localph.rtE = new bhy().bq(paramString);
    if (!bi.bC(paramArrayOfByte)) {
      localph.rtG = new bhy().bq(paramArrayOfByte);
    }
    paramString = new pi();
    paramString.rtI.add(localph);
    paramString.rtH = paramString.rtI.size();
    ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(211, paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/secinforeport/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */