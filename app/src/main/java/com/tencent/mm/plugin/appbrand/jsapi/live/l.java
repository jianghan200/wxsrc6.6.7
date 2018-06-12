package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.Iterator;
import java.util.Set;

public final class l
  implements ITXLivePlayListener
{
  boolean dni = false;
  boolean fRE = false;
  TXCloudVideoView fRV;
  private TXLivePlayConfig fRW;
  TXLivePlayer fRX;
  ITXLivePlayListener fRY;
  String fRZ = "";
  int fSa = 0;
  boolean fSb = false;
  private String fSc = "vertical";
  private String fSd = "fillCrop";
  private String fSe = "speaker";
  private float fSf = 1.0F;
  private float fSg = 3.0F;
  boolean fSh = true;
  private boolean fSi = false;
  boolean mAutoPlay = false;
  private Context mContext;
  private int mMode = 1;
  private boolean mMute = false;
  
  public l(Context paramContext)
  {
    this.mContext = paramContext;
    this.fRW = new TXLivePlayConfig();
    this.fRX = new TXLivePlayer(this.mContext);
    this.fRX.setConfig(this.fRW);
    this.fRX.setPlayListener(this);
    this.fRX.enableHardwareDecode(true);
  }
  
  static void d(String paramString, Bundle paramBundle)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.equalsIgnoreCase("playUrl")) || (str.equalsIgnoreCase("orientation")) || (str.equalsIgnoreCase("objectFit")) || (str.equalsIgnoreCase("soundMode"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getString(str);
      } else if ((str.equalsIgnoreCase("mode")) || (str.equalsIgnoreCase("playType"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getInt(str);
      } else if ((str.equalsIgnoreCase("minCache")) || (str.equalsIgnoreCase("maxCache"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getFloat(str);
      } else if ((str.equalsIgnoreCase("hide")) || (str.equalsIgnoreCase("autoplay")) || (str.equalsIgnoreCase("muted")) || (str.equalsIgnoreCase("backgroundMute")) || (str.equalsIgnoreCase("needEvent")) || (str.equalsIgnoreCase("debug"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getBoolean(str);
      }
    }
    x.i("TXLivePlayerJSAdapter", paramString);
  }
  
  public final void onNetStatus(Bundle paramBundle)
  {
    if (this.fRY != null) {
      this.fRY.onNetStatus(paramBundle);
    }
  }
  
  public final void onPlayEvent(int paramInt, Bundle paramBundle)
  {
    if ((paramInt == 2006) || (paramInt == 63235)) {
      tC("stop");
    }
    if ((this.fRE) && (this.fRY != null)) {
      this.fRY.onPlayEvent(paramInt, paramBundle);
    }
  }
  
  public final j tC(String paramString)
  {
    boolean bool = true;
    if (paramString == null) {
      return new j(-1, "invalid params");
    }
    x.i("TXLivePlayerJSAdapter", "operateLivePlayer: " + paramString);
    if (!this.dni) {
      return new j(-3, "uninited livePlayer");
    }
    if (paramString.equalsIgnoreCase("play")) {
      this.fRX.startPlay(this.fRZ, this.fSa);
    }
    for (;;)
    {
      return new j();
      if (paramString.equalsIgnoreCase("stop"))
      {
        this.fRX.stopPlay(true);
      }
      else if (paramString.equalsIgnoreCase("pause"))
      {
        this.fRX.pause();
      }
      else
      {
        if (!paramString.equalsIgnoreCase("resume")) {
          break;
        }
        this.fRX.resume();
      }
    }
    if (paramString.equalsIgnoreCase("mute"))
    {
      if (!this.mMute) {}
      for (;;)
      {
        this.mMute = bool;
        this.fRX.setMute(this.mMute);
        break;
        bool = false;
      }
    }
    return new j(-4, "invalid operate command");
  }
  
  final int v(Bundle paramBundle)
  {
    this.mMode = paramBundle.getInt("mode", this.mMode);
    if (this.mMode == 1)
    {
      if (this.fRZ == null) {}
      while ((this.fRZ == null) || ((!this.fRZ.startsWith("http://")) && (!this.fRZ.startsWith("https://"))) || (!this.fRZ.contains(".flv"))) {
        return 0;
      }
      return 1;
    }
    return 5;
  }
  
  final void w(Bundle paramBundle)
  {
    this.mMute = paramBundle.getBoolean("muted", this.mMute);
    this.fRX.setMute(this.mMute);
    this.fSc = paramBundle.getString("orientation", this.fSc);
    if (this.fSc.equalsIgnoreCase("horizontal"))
    {
      this.fRX.setRenderRotation(270);
      this.fSd = paramBundle.getString("objectFit", this.fSd);
      if (!this.fSd.equalsIgnoreCase("fillCrop")) {
        break label273;
      }
      this.fRX.setRenderMode(0);
      label96:
      this.fSe = paramBundle.getString("soundMode", this.fSe);
      if (!this.fSe.equalsIgnoreCase("speaker")) {
        break label297;
      }
      this.fRX.setAudioRoute(0);
    }
    for (;;)
    {
      this.fSf = paramBundle.getFloat("minCache", this.fSf);
      this.fSg = paramBundle.getFloat("maxCache", this.fSg);
      this.fRW.setAutoAdjustCacheTime(true);
      this.fRW.setCacheTime(this.fSf);
      this.fRW.setMinAutoAdjustCacheTime(this.fSf);
      this.fRW.setMaxAutoAdjustCacheTime(this.fSg);
      this.fRX.setConfig(this.fRW);
      this.fRE = paramBundle.getBoolean("needEvent", this.fRE);
      this.fSi = paramBundle.getBoolean("debug", this.fSi);
      this.fRV.showLog(this.fSi);
      return;
      if (!this.fSc.equalsIgnoreCase("vertical")) {
        break;
      }
      this.fRX.setRenderRotation(0);
      break;
      label273:
      if (!this.fSd.equalsIgnoreCase("contain")) {
        break label96;
      }
      this.fRX.setRenderMode(1);
      break label96;
      label297:
      if (this.fSe.equalsIgnoreCase("ear")) {
        this.fRX.setAudioRoute(1);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */