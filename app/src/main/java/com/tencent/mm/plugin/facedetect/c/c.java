package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.b.n;
import com.tencent.mm.plugin.facedetect.b.o;
import com.tencent.mm.plugin.facedetect.b.s;
import com.tencent.mm.plugin.facedetect.b.t;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.ui.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends a
{
  boolean hUE = false;
  private String iMV;
  private String iMW;
  private int iMX;
  
  c(Context paramContext, e parame, int paramInt)
  {
    super(paramContext, parame, paramInt);
    this.iMS = true;
    this.iMX = paramInt;
  }
  
  private void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean, Bundle paramBundle)
  {
    b(paramInt1, paramInt2, paramString, paramBundle);
    Object localObject = ad.getContext();
    if (paramString == null) {}
    for (String str1 = ((Context)localObject).getString(a.h.face_compare_fail);; str1 = paramString)
    {
      int i = a.d.face_err_icon;
      String str2;
      if (paramBoolean)
      {
        str2 = ((Context)localObject).getString(a.h.face_try_again);
        if (!paramBoolean) {
          break label122;
        }
      }
      label122:
      for (localObject = ((Context)localObject).getString(a.h.app_cancel);; localObject = null)
      {
        a(true, false, com.tencent.mm.plugin.facedetect.ui.a.b(i, str1, str2, (String)localObject, new c.2(this, paramBoolean, paramInt1, paramInt2, paramString, paramBundle), new c.3(this, paramInt1, paramInt2, paramString, paramBundle)));
        return;
        str2 = ((Context)localObject).getString(a.h.face_severe_error_main_btn);
        break;
      }
    }
  }
  
  private String getResultKey()
  {
    switch (this.iMX)
    {
    case 2: 
    default: 
      return "verify_result";
    case 0: 
    case 3: 
      return "faceregister_ticket";
    }
    return "faceverify_ticket";
  }
  
  public final l aJy()
  {
    long l = aJw();
    String str1 = this.iMV;
    String str2 = this.iMW;
    switch (this.iMX)
    {
    case 2: 
    default: 
      return null;
    case 0: 
      return new n(l, str1, str2);
    case 1: 
      return new s(l, str1, str2);
    case 3: 
      return new o(l, str1, str2);
    }
    return new t(l, str1, str2);
  }
  
  public final Bundle aJz()
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("k_bio_id", aJw());
    return localBundle;
  }
  
  public final void ac(int paramInt, String paramString)
  {
    x.i("MicroMsg.FaceDetectLoginController", "alvinluo onCancel, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (!FaceDetectReporter.aJU().iOd) {
      FaceDetectReporter.aJU().a(FaceDetectReporter.pw(this.iMX), this.hUE, 2, 1, paramInt);
    }
    a(1, paramInt, paramString, null);
  }
  
  public final boolean b(int paramInt, String paramString, Bundle paramBundle)
  {
    x.i("MicroMsg.FaceDetectLoginController", "alvinluo onUploadEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0), paramString });
    if (paramInt != 0)
    {
      FaceDetectReporter.aJU().a(FaceDetectReporter.pw(this.iMX), this.hUE, 1, 2, 90012);
      a(paramInt, 0, paramString, false, null);
      return true;
    }
    if ((paramBundle == null) || (bi.oW(paramBundle.getString("key_pic_cdn_id"))))
    {
      x.e("MicroMsg.FaceDetectLoginController", "hy: not return cdn id!");
      a(4, 6, "not return cdn id", false, null);
      return true;
    }
    this.iMV = paramBundle.getString("key_pic_cdn_id");
    this.iMW = paramBundle.getString("key_cdn_aes_key");
    x.v("MicroMsg.FaceDetectLoginController", "hy: start upload: picCdnId: %s, aes key: %s", new Object[] { this.iMV, this.iMW });
    return false;
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    x.i("MicroMsg.FaceDetectLoginController", "alvinluo onError errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!FaceDetectReporter.aJU().iOd) {
      FaceDetectReporter.aJU().a(FaceDetectReporter.pw(this.iMX), this.hUE, 3, paramInt1, paramInt2);
    }
    if (paramBundle != null)
    {
      Bundle localBundle = new Bundle();
      paramBundle = paramBundle.getString(getResultKey());
      localBundle.putString(getResultKey(), paramBundle);
      a(paramInt1, paramInt2, paramString, localBundle);
      return;
    }
    a(paramInt1, paramInt2, paramString, null);
  }
  
  public final void i(int paramInt1, int paramInt2, String paramString)
  {
    x.v("MicroMsg.FaceDetectLoginController", "alvinluo onCollectEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
  }
  
  public final void i(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.FaceDetectLoginController", "alvinluo onVerifyEnd sceneType: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    Object localObject;
    if ((paraml instanceof com.tencent.mm.plugin.facedetect.b.e))
    {
      localObject = (com.tencent.mm.plugin.facedetect.b.e)paraml;
      paraml = new Bundle();
      paraml.putString(getResultKey(), ((com.tencent.mm.plugin.facedetect.b.e)localObject).aJs());
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label200;
      }
      localFaceDetectReporter = FaceDetectReporter.aJU();
      j = this.iMP;
      bool = ((com.tencent.mm.plugin.facedetect.b.e)localObject).aJr();
      if (this.iMR == null) {
        break label194;
      }
    }
    label194:
    for (int i = this.iMR.iMg;; i = 0)
    {
      localFaceDetectReporter.a(j, bool, 0, paramInt1, paramInt2, i);
      localObject = com.tencent.mm.plugin.facedetect.ui.a.pC(a.d.face_tick);
      ((a.b)localObject).iQs = true;
      ((a.b)localObject).iQA = ad.getResources().getString(a.h.jsapi_success);
      a(false, true, (a.b)localObject);
      ah.i(new c.1(this, paramInt1, paramInt2, paramString, paraml), 1500L);
      return;
    }
    label200:
    FaceDetectReporter localFaceDetectReporter = FaceDetectReporter.aJU();
    int j = this.iMP;
    boolean bool = ((com.tencent.mm.plugin.facedetect.b.e)localObject).aJr();
    if (this.iMR != null) {}
    for (i = this.iMR.iMg;; i = 0)
    {
      localFaceDetectReporter.a(j, bool, 1, paramInt1, paramInt2, i);
      a(paramInt1, paramInt2, paramString, ((com.tencent.mm.plugin.facedetect.b.e)localObject).aJr(), paraml);
      return;
    }
  }
  
  public final void onRelease()
  {
    if (!FaceDetectReporter.aJU().iOd) {
      FaceDetectReporter.aJU().a(FaceDetectReporter.pw(this.iMX), this.hUE, 2, 1, 90006);
    }
  }
  
  public final void onStart()
  {
    x.i("MicroMsg.FaceDetectLoginController", "alvinluo onStart and create report session");
    if (this.hUE)
    {
      FaceDetectReporter.aJU().aJV();
      FaceDetectReporter.aJU().I(FaceDetectReporter.pw(this.iMX), this.hUE);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/facedetect/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */