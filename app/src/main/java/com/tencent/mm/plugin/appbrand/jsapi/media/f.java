package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;

public final class f
  extends a
{
  public static final int CTRL_INDEX = 216;
  public static final String NAME = "saveVideoToPhotosAlbum";
  
  final boolean tG(String paramString)
  {
    return bi.oV(paramString).toLowerCase().contains("video");
  }
  
  final String tH(String paramString)
  {
    return r.oN("mp4");
  }
  
  final void tI(String paramString)
  {
    ah.A(new f.1(this, paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/media/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */