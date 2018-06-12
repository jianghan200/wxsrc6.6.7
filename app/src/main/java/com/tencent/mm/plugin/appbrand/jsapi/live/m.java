package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.TXLivePusher.ITXSnapshotListener;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.Iterator;
import java.util.Set;

public final class m
  implements ITXLivePushListener
{
  boolean dni = false;
  private boolean fRE = false;
  TXCloudVideoView fRV;
  private boolean fSA = false;
  private boolean fSB = false;
  private String fSc = "vertical";
  private boolean fSi = false;
  private TXLivePushConfig fSj;
  TXLivePusher fSk;
  ITXLivePushListener fSl;
  String fSm;
  private boolean fSn = false;
  private boolean fSo = false;
  TXLivePusher.ITXSnapshotListener fSp;
  boolean fSq = false;
  private int fSr = 2;
  private int fSs = -1;
  private int fSt = -1;
  private int fSu = 0;
  boolean fSv = true;
  private String fSw = "high";
  private int fSx = 5;
  private int fSy = 3;
  private String fSz = "";
  private Context mContext;
  private boolean mEnableZoom = true;
  private boolean mFrontCamera = true;
  private int mMode = 1;
  private boolean mMute = false;
  
  public m(Context paramContext)
  {
    this.mContext = paramContext;
    this.fSj = new TXLivePushConfig();
    this.fSk = new TXLivePusher(paramContext);
    this.fSk.setConfig(this.fSj);
    this.fSk.setPushListener(this);
  }
  
  static void d(String paramString, Bundle paramBundle)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.equalsIgnoreCase("pushUrl")) || (str.equalsIgnoreCase("orientation")) || (str.equalsIgnoreCase("backgroundImage")) || (str.equalsIgnoreCase("audioQuality"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getString(str);
      } else if ((str.equalsIgnoreCase("mode")) || (str.equalsIgnoreCase("focusMode")) || (str.equalsIgnoreCase("beauty")) || (str.equalsIgnoreCase("whiteness")) || (str.equalsIgnoreCase("aspect")) || (str.equalsIgnoreCase("minBitrate")) || (str.equalsIgnoreCase("maxBitrate"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getInt(str);
      } else if ((str.equalsIgnoreCase("hide")) || (str.equalsIgnoreCase("autopush")) || (str.equalsIgnoreCase("muted")) || (str.equalsIgnoreCase("enableCamera")) || (str.equalsIgnoreCase("backgroundMute")) || (str.equalsIgnoreCase("zoom")) || (str.equalsIgnoreCase("needEvent")) || (str.equalsIgnoreCase("debug"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getBoolean(str);
      }
    }
    x.i("TXLivePusherJSAdapter", paramString);
  }
  
  public final j ajf()
  {
    if (this.fSn)
    {
      if (this.fSo) {
        return tD("start");
      }
      return tD("resume");
    }
    return new j();
  }
  
  final void c(Bundle paramBundle, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramBundle.keySet().size() == 0)) {
      return;
    }
    int i1 = paramBundle.getInt("mode", this.mMode);
    if ((paramBoolean) || (i1 != this.mMode)) {}
    int k;
    int m;
    int j;
    int n;
    int i;
    switch (i1)
    {
    default: 
      k = this.fSs;
      m = this.fSt;
      j = paramBundle.getInt("minBitrate", -1);
      n = paramBundle.getInt("maxBitrate", -1);
      if ((j != -1) && (n != -1))
      {
        i = j;
        if (j < 200) {
          i = 200;
        }
        j = n;
        if (n > 1800) {
          j = 1800;
        }
        if (i <= j) {
          k = i;
        }
      }
      break;
    }
    for (;;)
    {
      n = paramBundle.getInt("aspect", this.fSr);
      String str1 = paramBundle.getString("audioQuality", this.fSw);
      label213:
      label271:
      int i2;
      Object localObject;
      label297:
      boolean bool2;
      if (i1 == 6)
      {
        if (n == 1)
        {
          this.fSj.setVideoResolution(13);
          if ((k != -1) && (j != -1) && (k <= j))
          {
            this.fSj.setMinVideoBitrate(k);
            this.fSj.setMaxVideoBitrate(j);
          }
          if (!str1.equalsIgnoreCase("low")) {
            break label999;
          }
          this.fSj.setAudioSampleRate(16000);
        }
      }
      else
      {
        i2 = paramBundle.getInt("focusMode", this.fSu);
        localObject = this.fSj;
        if (i2 == 0) {
          break label1022;
        }
        bool1 = true;
        ((TXLivePushConfig)localObject).setTouchFocus(bool1);
        bool2 = paramBundle.getBoolean("enableCamera", this.fSv);
        localObject = this.fSj;
        if (bool2) {
          break label1028;
        }
        bool1 = true;
        label330:
        ((TXLivePushConfig)localObject).enablePureAudioPush(bool1);
        if (i1 == 6) {
          break label1120;
        }
      }
      label383:
      label477:
      label999:
      label1022:
      label1028:
      label1057:
      label1068:
      label1079:
      label1120:
      for (boolean bool1 = true;; bool1 = bool2)
      {
        localObject = paramBundle.getString("orientation", this.fSc);
        i = 0;
        int i3;
        int i4;
        String str2;
        boolean bool3;
        if (((String)localObject).equalsIgnoreCase("horizontal"))
        {
          this.fSj.setHomeOrientation(0);
          i = 90;
          i3 = paramBundle.getInt("beauty", this.fSx);
          i4 = paramBundle.getInt("whiteness", this.fSy);
          this.fSj.setBeautyFilter(i3, i4, 5);
          str2 = paramBundle.getString("backgroundImage", this.fSz);
          Bitmap localBitmap = BitmapFactory.decodeFile(str2);
          if (localBitmap != null) {
            this.fSj.setPauseImg(localBitmap);
          }
          bool2 = paramBundle.getBoolean("backgroundMute", this.fSA);
          if (!bool2) {
            break label1057;
          }
          this.fSj.setPauseFlag(3);
          bool3 = paramBundle.getBoolean("zoom", this.mEnableZoom);
          this.fSj.setEnableZoom(bool3);
          m = 0;
          if ((n != this.fSr) || (k != this.fSs) || (j != this.fSt) || (i2 != this.fSu) || (bool1 != this.fSv) || (i3 != this.fSx) || (i4 != this.fSy) || (bool2 != this.fSA) || (bool3 != this.mEnableZoom) || (!str2.equalsIgnoreCase(this.fSz)) || (!((String)localObject).equalsIgnoreCase(this.fSc)) || (!str1.equalsIgnoreCase(this.fSw))) {
            m = 1;
          }
          if ((paramBoolean) || (m != 0))
          {
            this.fSk.setConfig(this.fSj);
            this.fSk.setRenderRotation(i);
            this.fSk.setBeautyFilter(0, i3, i4, 2);
          }
          if (this.fSk.isPushing())
          {
            if (bool1 == this.fSv) {
              break label1079;
            }
            if (!bool1) {
              break label1068;
            }
            this.fSk.stopCameraPreview(true);
            this.fSk.startCameraPreview(this.fRV);
          }
        }
        for (;;)
        {
          this.mMode = i1;
          this.fSr = n;
          this.fSu = i2;
          this.fSv = bool1;
          this.fSc = ((String)localObject);
          this.fSx = i3;
          this.fSy = i4;
          this.fSA = bool2;
          this.fSz = str2;
          this.fSs = k;
          this.fSt = j;
          this.fSw = str1;
          this.mEnableZoom = bool3;
          this.fRE = paramBundle.getBoolean("needEvent", this.fRE);
          bool1 = paramBundle.getBoolean("muted", this.mMute);
          if ((paramBoolean) || (bool1 != this.mMute)) {
            this.fSk.setMute(bool1);
          }
          this.mMute = bool1;
          bool1 = paramBundle.getBoolean("debug", this.fSi);
          if ((paramBoolean) || (bool1 != this.fSi)) {
            this.fRV.showLog(bool1);
          }
          this.fSi = bool1;
          return;
          this.fSk.setVideoQuality(1, false, false);
          this.fSj.setVideoEncodeGop(5);
          break;
          this.fSk.setVideoQuality(2, true, false);
          this.fSj.setVideoEncodeGop(5);
          break;
          this.fSk.setVideoQuality(3, true, false);
          this.fSj.setVideoEncodeGop(5);
          break;
          this.fSk.setVideoQuality(4, true, false);
          break;
          this.fSk.setVideoQuality(5, true, false);
          break;
          this.fSk.setVideoQuality(6, false, false);
          break;
          if (n != 2) {
            break label213;
          }
          this.fSj.setVideoResolution(0);
          break label213;
          if (!str1.equalsIgnoreCase("high")) {
            break label271;
          }
          this.fSj.setAudioSampleRate(48000);
          break label271;
          bool1 = false;
          break label297;
          bool1 = false;
          break label330;
          if (!((String)localObject).equalsIgnoreCase("vertical")) {
            break label383;
          }
          this.fSj.setHomeOrientation(1);
          i = 0;
          break label383;
          this.fSj.setPauseFlag(1);
          break label477;
          this.fSk.stopCameraPreview(true);
          continue;
          if ((this.fSv) && (!((String)localObject).equalsIgnoreCase(this.fSc)))
          {
            this.fSk.stopCameraPreview(true);
            this.fSk.startCameraPreview(this.fRV);
          }
        }
      }
      j = m;
    }
  }
  
  public final j cQ(boolean paramBoolean)
  {
    this.fSn = this.fSk.isPushing();
    if (this.fSn)
    {
      if (paramBoolean)
      {
        this.fSo = paramBoolean;
        if ((this.fRE) && (this.fSl != null)) {
          this.fSl.onPushEvent(5000, new Bundle());
        }
        return tD("stop");
      }
      return tD("pause");
    }
    return new j();
  }
  
  public final void onNetStatus(Bundle paramBundle)
  {
    if (this.fSl != null) {
      this.fSl.onNetStatus(paramBundle);
    }
  }
  
  public final void onPushEvent(int paramInt, Bundle paramBundle)
  {
    if (paramInt == 64229) {
      tD("stop");
    }
    for (;;)
    {
      if ((this.fRE) && (this.fSl != null)) {
        this.fSl.onPushEvent(paramInt, paramBundle);
      }
      return;
      if ((paramInt == 1003) && (this.fSB)) {
        this.fSk.turnOnFlashLight(this.fSB);
      }
    }
  }
  
  public final j tD(String paramString)
  {
    boolean bool2 = true;
    int i = 0;
    if (paramString == null) {
      return new j(-1, "invalid params");
    }
    x.i("TXLivePusherJSAdapter", "operateLivePusher: " + paramString);
    if (paramString.equalsIgnoreCase("switchCamera")) {
      if (this.mFrontCamera) {
        break label98;
      }
    }
    label98:
    for (boolean bool1 = true;; bool1 = false)
    {
      this.mFrontCamera = bool1;
      this.fSj.setFrontCamera(this.mFrontCamera);
      if (this.dni) {
        break;
      }
      return new j(-3, "uninited livePusher");
    }
    if (paramString.equalsIgnoreCase("start")) {
      if ((this.fSm != null) && (!this.fSm.isEmpty()) && (!this.fSk.isPushing()))
      {
        this.fRV.setVisibility(0);
        if (this.fSv) {
          this.fSk.startCameraPreview(this.fRV);
        }
        this.fSk.startPusher(this.fSm);
      }
    }
    for (;;)
    {
      return new j();
      if (paramString.equalsIgnoreCase("stop"))
      {
        this.fSB = false;
        this.fSk.stopCameraPreview(true);
        this.fSk.stopPusher();
      }
      else if (paramString.equalsIgnoreCase("pause"))
      {
        if ((this.fSB) && (this.fSk.isPushing())) {
          this.fSk.turnOnFlashLight(false);
        }
        this.fSk.pausePusher();
      }
      else if (paramString.equalsIgnoreCase("resume"))
      {
        this.fSk.resumePusher();
      }
      else if (paramString.equalsIgnoreCase("switchCamera"))
      {
        this.fSB = false;
        this.fSk.switchCamera();
      }
      else
      {
        if (!paramString.equalsIgnoreCase("snapshot")) {
          break;
        }
        paramString = this.fSp;
        if ((this.fSk != null) && (this.fSk.isPushing())) {
          this.fSk.snapshot(paramString);
        }
      }
    }
    if (paramString.equalsIgnoreCase("toggleTorch"))
    {
      if (this.fSk.isPushing())
      {
        if (!this.fSB)
        {
          bool1 = bool2;
          bool2 = this.fSk.turnOnFlashLight(bool1);
          if (!bool2) {
            break label430;
          }
          label396:
          this.fSB = bool1;
          if (!bool2) {
            break label438;
          }
          label406:
          if (!bool2) {
            break label443;
          }
        }
        label430:
        label438:
        label443:
        for (paramString = "Success";; paramString = "Failed")
        {
          return new j(i, paramString);
          bool1 = false;
          break;
          bool1 = this.fSB;
          break label396;
          i = -1;
          break label406;
        }
      }
      return new j(-1, "fail");
    }
    return new j(-4, "invalid operate command");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */