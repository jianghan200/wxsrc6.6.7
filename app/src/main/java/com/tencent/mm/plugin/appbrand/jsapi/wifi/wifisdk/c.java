package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class c
{
  public String fHW = "ok";
  public List<b> gdB = null;
  
  public final JSONArray aku()
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = this.gdB.iterator();
    while (localIterator.hasNext()) {
      localJSONArray.put(((b)localIterator.next()).tR());
    }
    return localJSONArray;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("mErrorMsg:");
    localStringBuilder.append(this.fHW);
    localStringBuilder.append(" mWifiList:");
    Iterator localIterator;
    if ((this.gdB != null) && (this.gdB.size() > 0)) {
      localIterator = this.gdB.iterator();
    }
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      localStringBuilder.append(" WiFiItem:");
      localStringBuilder.append(localb);
      continue;
      localStringBuilder.append("null:");
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */