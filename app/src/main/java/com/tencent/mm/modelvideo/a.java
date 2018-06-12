package com.tencent.mm.modelvideo;

import com.tencent.mm.plugin.a.b;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static void a(r paramr, int paramInt)
  {
    if (paramr == null)
    {
      x.w("MicroMsg.AtomStatUtil", "report moov location, but video info is null.");
      return;
    }
    long l3 = bi.VG();
    o.Ta();
    String str = s.nK(paramr.getFileName());
    long l2 = 0L;
    long l1 = 0L;
    int i;
    if (c.oZ(str))
    {
      i = 1;
      b localb = new b();
      l2 = localb.oY(str);
      if (localb.eyA != null) {
        l1 = localb.eyA.eyw;
      }
    }
    for (;;)
    {
      long l4 = paramr.bYu;
      str = r.nH(paramr.Tm());
      long l5 = paramr.dHI;
      paramr = new StringBuilder();
      paramr.append(l4).append(";").append(str).append(";");
      paramr.append(l5).append(";");
      paramr.append(i).append(";").append(l2).append(";");
      paramr.append(l1).append(";").append(paramInt);
      paramr = paramr.toString();
      x.d("MicroMsg.AtomStatUtil", "report moov content : " + paramr + " cost time: " + bi.bI(l3));
      h.mEJ.h(11098, new Object[] { Integer.valueOf(8000), paramr });
      return;
      l1 = 0L;
      continue;
      x.i("MicroMsg.AtomStatUtil", "download video finish, but it is not mp4 file.");
      i = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvideo/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */