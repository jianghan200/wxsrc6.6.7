package com.tencent.mm.plugin.gallery.model;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  private ag dvh;
  HandlerThread jAK;
  HandlerThread jAL;
  HandlerThread jAM;
  ag jAN;
  ag jAO;
  ag jAP;
  
  public e()
  {
    x.d("MicroMsg.GalleryHandlerThread", "galleryhandlerthread init");
    this.jAK = new HandlerThread("galleryDecodeHanlderThread", 10);
    this.jAN = null;
    this.jAK.start();
    this.jAL = new HandlerThread("galleryQueryHandlerThread", 1);
    this.jAO = null;
    this.jAL.start();
    this.jAM = new HandlerThread("galleryAfterTakePicThreadThread", 0);
    this.jAP = null;
    this.jAM.start();
  }
  
  public final void A(Runnable paramRunnable)
  {
    aRu().post(paramRunnable);
  }
  
  public final ag aRs()
  {
    if ((this.jAN == null) && (this.jAK != null)) {
      this.jAN = new ag(this.jAK.getLooper());
    }
    return this.jAN;
  }
  
  public final ag aRt()
  {
    if (this.jAO == null) {
      this.jAO = new ag(this.jAL.getLooper());
    }
    return this.jAO;
  }
  
  public final ag aRu()
  {
    if (this.dvh == null) {
      this.dvh = new ag(Looper.getMainLooper());
    }
    return this.dvh;
  }
  
  public final void aRv()
  {
    ag localag = aRs();
    if (localag == null)
    {
      x.e("MicroMsg.GalleryHandlerThread", "remove all work handler callbacks, but decode handler is null");
      return;
    }
    localag.removeCallbacksAndMessages(null);
  }
  
  public final void qs(int paramInt)
  {
    try
    {
      Process.setThreadPriority(this.jAM.getThreadId(), paramInt);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.GalleryHandlerThread", localException, "", new Object[0]);
    }
  }
  
  public final void z(Runnable paramRunnable)
  {
    ag localag = aRs();
    if (localag == null)
    {
      x.e("MicroMsg.GalleryHandlerThread", "post to decode worker, but decode handler is null");
      return;
    }
    localag.post(paramRunnable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */