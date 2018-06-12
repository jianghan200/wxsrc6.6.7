package com.tencent.mm.pluginsdk.model.app;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;

final class s
  implements Runnable
{
  private String appId = null;
  private int efG = 0;
  private ag handler = null;
  private String url = null;
  
  public s(ag paramag, String paramString1, int paramInt, String paramString2)
  {
    this.handler = paramag;
    this.appId = paramString1;
    this.efG = paramInt;
    this.url = paramString2;
  }
  
  public final void run()
  {
    if ((this.appId == null) || (this.appId.length() == 0) || (this.url == null) || (this.url.length() == 0)) {
      return;
    }
    Object localObject = bi.WY(this.url);
    localObject = new v(this.appId, this.efG, (byte[])localObject);
    Message localMessage = Message.obtain();
    localMessage.obj = localObject;
    this.handler.sendMessage(localMessage);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */