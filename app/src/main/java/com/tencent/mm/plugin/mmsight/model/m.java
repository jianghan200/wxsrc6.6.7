package com.tencent.mm.plugin.mmsight.model;

import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.v;
import com.tencent.mm.plugin.mmsight.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  implements v
{
  public final void ob(String paramString)
  {
    final r localr = o.Ta().nI(paramString);
    if (localr == null) {}
    aso localaso;
    label278:
    label283:
    do
    {
      return;
      o.Ta();
      final String str = s.nK(paramString);
      localaso = localr.enW;
      VideoTransPara localVideoTransPara = com.tencent.mm.modelcontrol.d.NP().NQ();
      if (localaso != null)
      {
        x.i("MicroMsg.MMSightVideoMsgSendCallback", "beforeVideoSend count %d filename %s filePath %s", new Object[] { Integer.valueOf(localaso.rUQ), paramString, str });
        if (localaso.rUQ > 1)
        {
          t.nP(paramString);
          return;
        }
      }
      boolean bool2 = l.a(str, localVideoTransPara, localaso, new d()
      {
        public final boolean bcM()
        {
          x.i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile1 %s", new Object[] { str });
          int i = s.nM(str);
          localr.dHI = i;
          localr.bWA = 32;
          o.Ta().b(localr);
          return true;
        }
      });
      if (localaso != null)
      {
        x.i("MicroMsg.MMSightVideoMsgSendCallback", "filename: %s need ret: %s", new Object[] { paramString, Boolean.valueOf(bool2) });
        if (bool2) {
          break label278;
        }
      }
      for (boolean bool1 = true;; bool1 = false)
      {
        localaso.rUT = bool1;
        localr.enW = localaso;
        localr.bWA = 536870912;
        o.Ta().b(localr);
        if (!bool2) {
          break;
        }
        if (localaso != null)
        {
          localaso.rUQ += 1;
          localr.enW = localaso;
        }
        localr.bWA = 536870912;
        o.Ta().b(localr);
        c.sI(localr.enN);
        if (l.b(str, localVideoTransPara, localaso, new m.2(this, localr, str)) >= 0) {
          break label283;
        }
        x.i("MicroMsg.MMSightRecorderIDKeyStat", "mark720CapturePostCompressFailed");
        h.mEJ.a(440L, 45L, 1L, false);
        t.nP(paramString);
        return;
      }
    } while (localaso == null);
    localaso.rUT = true;
    localr.enW = localaso;
    localr.bWA = 536870912;
    o.Ta().b(localr);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */