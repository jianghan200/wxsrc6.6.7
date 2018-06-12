package com.tencent.mm.ak.a;

import android.graphics.Bitmap;
import com.tencent.mm.ak.a.c.a;
import com.tencent.mm.ak.a.c.h;
import com.tencent.mm.ak.a.c.m;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class b
{
  public com.tencent.mm.ak.a.a.b dWS;
  h dWT;
  Executor dWU;
  public final Map<Integer, String> dWV = Collections.synchronizedMap(new HashMap());
  public HashMap<Integer, com.tencent.mm.ak.a.f.b> dWW = new HashMap();
  
  public b(com.tencent.mm.ak.a.a.b paramb)
  {
    this.dWS = paramb;
    this.dWT = paramb.dXs;
    this.dWU = paramb.dXt;
    this.dWS.dXm.a(this.dWS.dXo);
  }
  
  public final void a(c paramc)
  {
    this.dWV.remove(Integer.valueOf(paramc.Pr()));
    x.d("MicroMsg.imageloader.ImageLoaderManager", "[cpan] remove image weak holder size:%d viewcode:%s", new Object[] { Integer.valueOf(this.dWV.size()), Integer.valueOf(paramc.Pr()) });
  }
  
  public final Bitmap ma(String paramString)
  {
    if (this.dWS != null) {
      return this.dWS.dXl.jz(paramString);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ak/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */