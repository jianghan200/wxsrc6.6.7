package c.t.m.g;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.map.geolocation.TencentLocationManager;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

final class cq
{
  private static SimpleDateFormat a = null;
  private static String b = null;
  private static String c = null;
  private static String d = null;
  
  private static String a(long paramLong, String paramString)
  {
    String str = paramString;
    for (;;)
    {
      try
      {
        if (TextUtils.isEmpty(paramString)) {
          str = "yyyy-MM-dd HH:mm:ss";
        }
        long l;
        if (a == null)
        {
          a = new SimpleDateFormat(str, Locale.CHINA);
          l = paramLong;
          if (paramLong <= 0L) {
            l = System.currentTimeMillis();
          }
          if (a == null)
          {
            paramString = "NULL";
            return paramString;
          }
        }
        else
        {
          a.applyPattern(str);
          continue;
        }
        paramString = a.format(Long.valueOf(l));
      }
      finally {}
    }
  }
  
  private static String a(Context paramContext)
  {
    if (d == null) {}
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).applicationInfo.labelRes;
      d = paramContext.getResources().getString(i).replaceAll("[_| ]", "");
      if (d == null) {
        return "";
      }
      return d;
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
  }
  
  private static String a(ct paramct)
  {
    paramct = ej.c(paramct);
    if (paramct != null) {
      try
      {
        Object localObject = new JSONObject(paramct);
        paramct = ((JSONObject)localObject).optString("mac").replace(":", "").toLowerCase();
        String str = ((JSONObject)localObject).optString("ssid");
        localObject = ((JSONObject)localObject).optString("rssi");
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramct).append("&").append(str).append("&").append((String)localObject);
        paramct = localStringBuilder.toString();
        return paramct;
      }
      catch (Throwable paramct) {}
    }
    return "";
  }
  
  public static String a(ct paramct, Location paramLocation, List<ScanResult> paramList, List<dp> paramList1)
  {
    Object localObject2 = paramct.b;
    String str1 = a(System.currentTimeMillis(), "");
    String str2 = ((cu)localObject2).f();
    String str3 = TencentLocationManager.getInstance(paramct.a).getVersion();
    Object localObject1 = new StringBuilder();
    Object localObject3 = new DecimalFormat("#.######");
    String str4 = ((DecimalFormat)localObject3).format(paramLocation.getLatitude());
    localObject3 = ((DecimalFormat)localObject3).format(paramLocation.getLongitude());
    ((StringBuilder)localObject1).append(0).append(",").append(str4).append(",").append((String)localObject3).append(",").append((int)paramLocation.getAltitude()).append(",").append((int)paramLocation.getAccuracy()).append(",").append((int)paramLocation.getBearing()).append(",").append(String.format("%.1f", new Object[] { Float.valueOf(paramLocation.getSpeed()) })).append(",").append(paramLocation.getTime());
    localObject1 = ((StringBuilder)localObject1).toString();
    paramLocation = new StringBuilder();
    int i;
    if ((paramList1 != null) && (paramList1.size() > 0))
    {
      i = 0;
      while (i < paramList1.size())
      {
        paramLocation.append(((dp)paramList1.get(i)).b).append(",").append(((dp)paramList1.get(i)).c).append(",").append(((dp)paramList1.get(i)).d).append(",").append(((dp)paramList1.get(i)).e).append(",").append(((dp)paramList1.get(i)).f);
        if (i < paramList1.size() - 1) {
          paramLocation.append(";");
        }
        i += 1;
      }
    }
    paramList1 = paramLocation.toString();
    paramLocation = new StringBuilder();
    if ((paramList != null) && (paramList.size() > 0))
    {
      i = 0;
      while (i < paramList.size())
      {
        paramLocation.append(((ScanResult)paramList.get(i)).BSSID.replace(":", "")).append("&").append(((ScanResult)paramList.get(i)).level);
        if (i < paramList.size() - 1) {
          paramLocation.append("&");
        }
        i += 1;
      }
    }
    str4 = paramLocation.toString();
    paramList = a(paramct);
    paramLocation = paramList;
    if (paramList.equals("&&")) {
      paramLocation = "";
    }
    paramct = a(paramct.a);
    paramList = ((cu)localObject2).h;
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(paramct).append("_").append(paramList);
    localObject2 = ((StringBuilder)localObject2).toString();
    if (b == null) {
      b = Build.MANUFACTURER.replaceAll("|", "").replaceAll(" ", "");
    }
    if (b == null)
    {
      paramct = "";
      if (c == null) {
        c = Build.MODEL.replaceAll("|", "").replaceAll(" ", "");
      }
      if (c != null) {
        break label821;
      }
    }
    label821:
    for (paramList = "";; paramList = c)
    {
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append(paramct).append("_").append(paramList);
      paramct = ((StringBuilder)localObject3).toString();
      paramList = new StringBuilder();
      paramList.append("[").append(str1).append("]:").append(str3).append("|").append("209").append("|").append(str2).append("|||||||||").append((String)localObject1).append("|").append("").append("|").append(paramList1).append("|").append(str4).append("||||||||||||||||").append("tx_sdk").append("||||").append(paramLocation).append("||").append("").append("|").append((String)localObject2).append("|||").append(paramct);
      return paramList.toString();
      paramct = b;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */