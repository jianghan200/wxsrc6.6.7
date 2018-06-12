package com.d.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.util.Base64;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private final WifiManager bgP;
  private final LocationManager bgQ;
  final SensorManager bgR;
  final PackageManager bgS;
  PackageInfo bgT;
  String bgU;
  String bgV;
  String bgW;
  private int bgX = 0;
  private int bgY = 0;
  int bgZ = 0;
  int bha = 0;
  int bhb = 0;
  int bhc = 0;
  private String bhd = "203";
  String imei;
  final Context mContext;
  private String version = "2.0.1";
  String versionName;
  
  public f(Context paramContext)
  {
    this.mContext = paramContext;
    this.bgP = ((WifiManager)this.mContext.getSystemService("wifi"));
    this.bgQ = ((LocationManager)this.mContext.getSystemService("location"));
    this.bgR = ((SensorManager)this.mContext.getSystemService("sensor"));
    this.bgS = this.mContext.getPackageManager();
    this.bgT = new PackageInfo();
    try
    {
      this.bgT = this.bgS.getPackageInfo(this.mContext.getPackageName(), 0);
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
  }
  
  private static String bI(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private boolean sw()
  {
    try
    {
      boolean bool = this.bgQ.isProviderEnabled("gps");
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  @SuppressLint({"NewApi"})
  private boolean sx()
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.bgP != null)
    {
      bool2 = this.bgP.isWifiEnabled();
      bool1 = bool2;
      if (!bool2) {
        bool1 = bool2;
      }
    }
    try
    {
      if (Build.VERSION.SDK_INT >= 18) {
        bool1 = this.bgP.isScanAlwaysAvailable();
      }
      return bool1;
    }
    catch (Error localError)
    {
      return bool2;
    }
    catch (Exception localException) {}
    return bool2;
  }
  
  public final String q(byte[] paramArrayOfByte)
  {
    int j = 1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("version", this.version);
    localHashMap.put("app_name", bI(this.versionName));
    if (this.bgU != null)
    {
      localHashMap.put("app_label", bI(Base64.encodeToString(this.bgU.getBytes(), 0)));
      if (!sw()) {
        break label301;
      }
      i = 1;
      label76:
      this.bgY = i;
      if ((this.bgP == null) || (!this.bgP.isWifiEnabled())) {
        break label306;
      }
      i = 1;
      label100:
      if ((i | sx()) == 0) {
        break label311;
      }
    }
    label301:
    label306:
    label311:
    for (int i = j;; i = 0)
    {
      this.bgX = i;
      localHashMap.put("chips", Integer.toBinaryString(this.bhc | 0x0 | this.bhb << 1 | this.bha << 2 | this.bgZ << 3 | this.bgY << 4 | this.bgX << 5));
      localHashMap.put("source", this.bhd);
      localHashMap.put("query", new String(paramArrayOfByte));
      try
      {
        paramArrayOfByte = new JSONObject(localHashMap);
        localHashMap = new HashMap();
        localHashMap.put("model", bI(Base64.encodeToString(this.bgV.getBytes(), 0)));
        localHashMap.put("version", bI(this.bgW));
        localHashMap.put("imei", bI(this.imei));
        paramArrayOfByte = paramArrayOfByte.put("attribute", new JSONObject(localHashMap)).toString();
        return paramArrayOfByte;
      }
      catch (JSONException paramArrayOfByte) {}
      localHashMap.put("app_label", "");
      break;
      i = 0;
      break label76;
      i = 0;
      break label100;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/d/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */