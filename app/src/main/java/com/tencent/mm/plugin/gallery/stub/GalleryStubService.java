package com.tencent.mm.plugin.gallery.stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.mm.sdk.platformtools.x;

public class GalleryStubService
  extends Service
{
  private a.a jBv = new GalleryStubService.1(this);
  
  public IBinder onBind(Intent paramIntent)
  {
    x.d("MicroMsg.GalleryStubService", "on bind, intent[%s]", new Object[] { paramIntent });
    return this.jBv;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gallery/stub/GalleryStubService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */