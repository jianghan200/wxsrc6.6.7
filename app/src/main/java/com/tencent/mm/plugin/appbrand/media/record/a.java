package com.tencent.mm.plugin.appbrand.media.record;

import android.media.MediaRecorder;
import com.tencent.mm.compatible.b.b.a;
import com.tencent.mm.e.b.b;
import com.tencent.mm.e.b.b.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private static b ghX = null;
  private static String ghY = null;
  private static a ghZ = null;
  private static al gia = null;
  
  private static void SO()
  {
    if (gia != null) {
      gia.SO();
    }
    gia = null;
  }
  
  public static boolean a(String paramString, a parama, int paramInt)
  {
    x.i("MicroMsg.Record.AudioRecorder", "startRecord");
    lg(1);
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.Record.AudioRecorder", "startRecord, path is null or nil");
      return false;
    }
    b localb = new b(b.a.daN);
    ghX = localb;
    if (localb.bDq == b.a.daM) {
      if (localb.bDo != null) {
        localb.bDo.reset();
      }
    }
    for (;;)
    {
      ghX.wh();
      ghX.wi();
      ghX.wg();
      ghX.setOutputFile(paramString);
      ghX.a(new a.2());
      try
      {
        ghX.prepare();
        ghX.start();
        ghZ = parama;
        ghY = paramString;
        long l = paramInt;
        SO();
        paramString = new al(new al.a()
        {
          public final boolean vD()
          {
            a.lg(1);
            return false;
          }
        }, false);
        gia = paramString;
        paramString.J(l, l);
        return true;
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.Record.AudioRecorder", "record prepare, exp = %s", new Object[] { bi.i(paramString) });
      }
      if (localb.bDr != b.b.bDC)
      {
        localb.release();
        localb.wj();
      }
    }
    return false;
  }
  
  public static void lg(int paramInt)
  {
    x.i("MicroMsg.Record.AudioRecorder", "stopRecord what:%d", new Object[] { Integer.valueOf(paramInt) });
    if (bi.oW(ghY)) {
      return;
    }
    if (ghX == null)
    {
      x.i("MicroMsg.Record.AudioRecorder", "sRecorder is null,err");
      return;
    }
    ghX.wk();
    ghX.release();
    ghX = null;
    SO();
    ghY = null;
    if (ghZ != null) {
      ghZ.kz(paramInt);
    }
    ghZ = null;
  }
  
  public static abstract interface a
  {
    public abstract void kz(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */