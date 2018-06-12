package com.tencent.mm.booter;

import com.tencent.mm.a.h;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.x;

public final class l
{
  public static void run()
  {
    int i = g.AT().getInt("EnableMMBitmapFactoryProb", 0);
    au.HU();
    int j = h.aM(c.Df(), 100);
    if ((b.chp()) || ((i > 0) && (j >= 0) && (j <= i))) {}
    for (boolean bool = true;; bool = false)
    {
      MMBitmapFactory.setUseMMBitmapFactory(bool);
      x.i("MicroMsg.PostTaskUpdateMMImgDecSwitch", "Update MMImgDecSwitch, userHash:%d, prob:%d, enabled: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool) });
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/booter/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */