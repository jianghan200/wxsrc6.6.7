package com.tencent.mm.ak.a.b;

import com.tencent.mm.a.g;
import com.tencent.mm.ak.a.c.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  implements f
{
  public final String mc(String paramString)
  {
    String str = null;
    if (!bi.oW(paramString))
    {
      str = g.u(paramString.getBytes());
      x.d("MicroMsg.imageloader.DefaultImageFileNameCreator", "[cpan] create image file name :%s", new Object[] { str });
    }
    return str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ak/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */