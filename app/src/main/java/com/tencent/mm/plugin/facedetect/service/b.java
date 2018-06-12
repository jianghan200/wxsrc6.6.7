package com.tencent.mm.plugin.facedetect.service;

import android.content.Intent;
import com.tencent.mm.plugin.facedetect.e.a.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends a
{
  long iNq = -1L;
  String mAppId = "";
  
  public final void C(Intent paramIntent)
  {
    this.iNq = paramIntent.getLongExtra("k_bio_id", -1L);
    this.mAppId = paramIntent.getStringExtra("key_app_id");
    x.i("MicroMsg.FaceDetectServiceControllerMp", "hy: got bioid: %d, appid: %s", new Object[] { Long.valueOf(this.iNq), this.mAppId });
    x.i("MicroMsg.FaceDetectServiceControllerMp", "hy: requesting release and send video");
    if ((com.tencent.mm.plugin.facedetect.e.a.aKA().iSn) && ((com.tencent.mm.plugin.facedetect.e.a.aKA().aKD() == a.a.iSP) || (com.tencent.mm.plugin.facedetect.e.a.aKA().aKD() == a.a.iSQ) || (com.tencent.mm.plugin.facedetect.e.a.aKA().aKD() == a.a.iSR)))
    {
      long l = bi.VG();
      com.tencent.mm.plugin.facedetect.e.a.aKA().a(new b.1(this, l));
      return;
    }
    x.i("MicroMsg.FaceDetectServiceControllerMp", "hy: not recording video");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/facedetect/service/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */