package com.tencent.mm.plugin.freewifi.model;

import android.os.HandlerThread;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;

public final class c
{
  private HandlerThread jjI;
  private ag jjJ;
  
  public final ag aOv()
  {
    if (this.jjI == null)
    {
      this.jjI = e.Xs("FreeWifiHandlerThread_handlerThread");
      this.jjI.start();
    }
    if (this.jjJ == null) {
      this.jjJ = new ag(this.jjI.getLooper());
    }
    return this.jjJ;
  }
  
  public final void release()
  {
    if (this.jjI != null)
    {
      this.jjI.quit();
      this.jjI = null;
    }
    this.jjJ = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */