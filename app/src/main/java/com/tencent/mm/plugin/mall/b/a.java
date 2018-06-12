package com.tencent.mm.plugin.mall.b;

import android.widget.ImageView;
import com.tencent.mm.a.g;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.a.ri;
import com.tencent.mm.sdk.platformtools.bi;
import java.text.SimpleDateFormat;

public final class a
{
  private static SimpleDateFormat hIH = null;
  private static SimpleDateFormat hII = null;
  private static final String lag = e.bnE + "wallet/mall";
  
  public static void bcf()
  {
    ri localri = new ri();
    localri.ccb.ccc = false;
    com.tencent.mm.sdk.b.a.sFg.m(localri);
  }
  
  public static void f(ImageView paramImageView, String paramString, int paramInt)
  {
    Object localObject = null;
    if (paramImageView == null) {}
    do
    {
      return;
      paramImageView.setImageBitmap(null);
      if (!bi.oW(paramString))
      {
        c.a locala = new c.a();
        if (bi.oW(paramString)) {}
        for (;;)
        {
          locala.dXB = ((String)localObject);
          locala.dXy = true;
          locala.dXV = true;
          locala.dXW = false;
          if (paramInt != 0) {
            locala.dXN = paramInt;
          }
          localObject = locala.Pt();
          o.Pj().a(paramString, paramImageView, (c)localObject);
          return;
          localObject = String.format("%s/%s", new Object[] { lag, g.u(paramString.getBytes()) });
        }
      }
    } while (paramInt == 0);
    paramImageView.setImageResource(paramInt);
  }
  
  public static void j(ImageView paramImageView, String paramString)
  {
    f(paramImageView, paramString, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/mall/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */