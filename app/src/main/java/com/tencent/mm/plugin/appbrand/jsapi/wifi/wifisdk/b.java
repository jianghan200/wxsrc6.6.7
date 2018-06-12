package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import org.json.JSONObject;

public final class b
{
  public boolean gdA = false;
  public String gdv = "";
  public String gdw = "";
  public int gdx;
  public boolean gdy = false;
  public boolean gdz = false;
  
  public final JSONObject tR()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("SSID", this.gdv);
    localJSONObject.put("BSSID", this.gdw);
    localJSONObject.put("secure", this.gdy);
    localJSONObject.put("signalStrength", this.gdx);
    return localJSONObject;
  }
  
  public final String toString()
  {
    return "WiFiItem{mSsid='" + this.gdv + '\'' + ", mBssid='" + this.gdw + '\'' + ", mSignalStrength=" + this.gdx + ", mSecurity=" + this.gdy + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */