package com.tencent.mm.plugin.downloader.model;

import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Vector;

public final class b
{
  private static Vector<l> ibI = new Vector();
  private static l ibJ;
  
  public static void a(l paraml)
  {
    if ((paraml != null) && (!ibI.contains(paraml))) {
      ibI.add(paraml);
    }
  }
  
  public static void aCP()
  {
    ibJ = null;
  }
  
  public static void b(l paraml)
  {
    if (paraml != null) {
      ibI.remove(paraml);
    }
  }
  
  public static void c(l paraml)
  {
    ibJ = paraml;
  }
  
  public final void c(long paramLong, int paramInt, boolean paramBoolean)
  {
    x.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFailed: %d, errCode : %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    ah.A(new b.5(this, paramLong, paramInt, paramBoolean));
  }
  
  public final void c(long paramLong, String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFinished: %d", new Object[] { Long.valueOf(paramLong) });
    ah.A(new b.4(this, paramLong, paramString, paramBoolean));
  }
  
  public final void cp(long paramLong)
  {
    x.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskRemoved: %d", new Object[] { Long.valueOf(paramLong) });
    ah.A(new b.3(this, paramLong));
  }
  
  public final void cq(long paramLong)
  {
    x.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskPaused: %d", new Object[] { Long.valueOf(paramLong) });
    ah.A(new b.6(this, paramLong));
  }
  
  public final void cr(long paramLong)
  {
    ah.A(new b.7(this, paramLong));
  }
  
  public final void i(long paramLong, String paramString)
  {
    x.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskStarted: %d, %s", new Object[] { Long.valueOf(paramLong), paramString });
    ah.A(new b.1(this, paramLong, paramString));
  }
  
  public final void j(long paramLong, String paramString)
  {
    x.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskResumed: %d, %s", new Object[] { Long.valueOf(paramLong), paramString });
    ah.A(new b.2(this, paramLong, paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */