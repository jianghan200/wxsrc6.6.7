package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.b.m;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends a
{
  String appId;
  private String bVc;
  boolean hUE = false;
  private String iMV;
  private String iMW;
  String iNc;
  
  d(Context paramContext, e parame, int paramInt, Bundle paramBundle)
  {
    super(paramContext, parame, paramInt);
    this.iMS = true;
    this.appId = paramBundle.getString("k_app_id", null);
    this.bVc = paramBundle.getString("request_verify_pre_info", null);
    this.iNc = paramBundle.getString("key_feedback_url", null);
  }
  
  private void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean, Bundle paramBundle)
  {
    b(paramInt1, paramInt2, paramString, paramBundle);
    Context localContext = ad.getContext();
    if (paramString == null) {}
    for (String str1 = localContext.getString(a.h.face_compare_fail);; str1 = paramString)
    {
      int i = a.d.face_err_icon;
      String str2;
      if (paramBoolean)
      {
        str2 = localContext.getString(a.h.face_try_again);
        if (!paramBoolean) {
          break label150;
        }
      }
      label150:
      for (String str3 = localContext.getString(a.h.app_cancel);; str3 = null)
      {
        paramString = com.tencent.mm.plugin.facedetect.ui.a.b(i, str1, str2, str3, new d.2(this, paramBoolean, paramInt1, paramInt2, paramString, paramBundle), new d.3(this, paramInt1, paramInt2, paramString, paramBundle));
        com.tencent.mm.plugin.facedetect.ui.a.a(paramString, localContext.getString(a.h.face_detect_feedback), new d.4(this, paramBundle, paramInt2, localContext));
        a(true, false, paramString);
        return;
        str2 = localContext.getString(a.h.face_severe_error_main_btn);
        break;
      }
    }
  }
  
  public final l aJy()
  {
    return new m(aJw(), this.appId, this.bVc, this.iMV, this.iMW);
  }
  
  public final Bundle aJz()
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("k_bio_id", aJw());
    localBundle.putString("key_app_id", this.appId);
    return localBundle;
  }
  
  public final void ac(int paramInt, String paramString)
  {
    x.i("MicroMsg.FaceDetectMpController", "alvinluo onCancel, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (!FaceDetectReporter.aJU().iOd) {
      FaceDetectReporter.aJU().a(this.iMP, this.hUE, 2, 1, paramInt);
    }
    a(1, paramInt, paramString, null);
  }
  
  public final boolean b(int paramInt, String paramString, Bundle paramBundle)
  {
    x.i("MicroMsg.FaceDetectMpController", "alvinluo onUploadEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0), paramString });
    if (paramInt != 0)
    {
      FaceDetectReporter.aJU().a(this.iMP, this.hUE, 1, 2, 90012);
      a(paramInt, 0, paramString, false, null);
      return true;
    }
    if ((paramBundle == null) || (bi.oW(paramBundle.getString("key_pic_cdn_id"))))
    {
      x.e("MicroMsg.FaceDetectMpController", "hy: not return cdn id!");
      a(4, 6, "not return cdn id", false, null);
      return true;
    }
    this.iMV = paramBundle.getString("key_pic_cdn_id");
    this.iMW = paramBundle.getString("key_cdn_aes_key");
    x.v("MicroMsg.FaceDetectMpController", "hy: start upload: picCdnId: %s, aes key: %s", new Object[] { this.iMV, this.iMW });
    return false;
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    x.i("MicroMsg.FaceDetectMpController", "alvinluo onError errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!FaceDetectReporter.aJU().iOd) {
      FaceDetectReporter.aJU().a(this.iMP, this.hUE, 3, paramInt1, paramInt2);
    }
    if (paramBundle != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("verify_result", paramBundle.getString("verify_result"));
      a(paramInt1, paramInt2, paramString, localBundle);
      return;
    }
    a(paramInt1, paramInt2, paramString, null);
  }
  
  public final void i(int paramInt1, int paramInt2, String paramString)
  {
    x.v("MicroMsg.FaceDetectMpController", "alvinluo onCollectEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
  }
  
  public final void i(final int paramInt1, final int paramInt2, final String paramString, l paraml)
  {
    x.i("MicroMsg.FaceDetectMpController", "alvinluo onVerifyEnd sceneType: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    final Bundle localBundle;
    if ((paraml instanceof m))
    {
      localBundle = new Bundle();
      localBundle.putString("verify_result", ((m)paraml).iMB);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label196;
      }
      paraml = FaceDetectReporter.aJU();
      j = this.iMP;
      bool = this.hUE;
      if (this.iMR == null) {
        break label190;
      }
    }
    label190:
    for (int i = this.iMR.iMg;; i = 0)
    {
      paraml.a(j, bool, 0, paramInt1, paramInt2, i);
      FaceDetectReporter.aJU().iOk = true;
      paraml = com.tencent.mm.plugin.facedetect.ui.a.pC(a.d.face_tick);
      paraml.iQs = true;
      paraml.iQA = ad.getResources().getString(a.h.jsapi_success);
      a(false, true, paraml);
      ah.i(new Runnable()
      {
        public final void run()
        {
          d.this.a(paramInt1, paramInt2, paramString, localBundle);
        }
      }, 1500L);
      return;
    }
    label196:
    FaceDetectReporter localFaceDetectReporter = FaceDetectReporter.aJU();
    int j = this.iMP;
    boolean bool = this.hUE;
    if (this.iMR != null) {}
    for (i = this.iMR.iMg;; i = 0)
    {
      localFaceDetectReporter.a(j, bool, 1, paramInt1, paramInt2, i);
      a(paramInt1, paramInt2, paramString, ((m)paraml).iMC, localBundle);
      return;
    }
  }
  
  public final void onRelease()
  {
    if (!FaceDetectReporter.aJU().iOd) {
      FaceDetectReporter.aJU().a(this.iMP, this.hUE, 2, 1, 90006);
    }
  }
  
  public final void onStart()
  {
    x.i("MicroMsg.FaceDetectMpController", "alvinluo onStart and create report session");
    if (this.hUE) {
      FaceDetectReporter.aJU().aJV();
    }
    FaceDetectReporter.aJU().I(this.iMP, this.hUE);
    FaceDetectReporter localFaceDetectReporter = FaceDetectReporter.aJU();
    localFaceDetectReporter.iOj += 1;
    x.v("MicroMsg.FaceDetectReporter", "alvinluo addFaceDetectCount: %d", new Object[] { Integer.valueOf(localFaceDetectReporter.iOj) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/facedetect/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */