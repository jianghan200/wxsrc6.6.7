package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  public volatile ah pQX = new ah("WebviewWorkerThread");
  ak pQY;
  
  public b(ak paramak)
  {
    this.pQY = paramak;
  }
  
  public final ah Em()
  {
    if (this.pQX == null) {
      this.pQX = new ah("WebviewWorkerThread");
    }
    return this.pQX;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */