package c.t.m.g;

import android.location.Location;
import android.net.wifi.ScanResult;
import android.telephony.NeighboringCellInfo;
import com.tencent.map.geolocation.TencentLocationManagerOptions;
import com.tencent.tencentmap.lbssdk.service.e;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ei
{
  private static final byte[] a = new byte[0];
  
  private static double a(double paramDouble)
  {
    return 3.141592653589793D * paramDouble / 180.0D;
  }
  
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    paramDouble1 = a(paramDouble1);
    paramDouble3 = a(paramDouble3);
    paramDouble2 = a(paramDouble2);
    paramDouble4 = a(paramDouble4);
    double d = Math.pow(Math.sin((paramDouble1 - paramDouble3) / 2.0D), 2.0D);
    return Math.round(Math.asin(Math.sqrt(Math.cos(paramDouble1) * Math.cos(paramDouble3) * Math.pow(Math.sin((paramDouble2 - paramDouble4) / 2.0D), 2.0D) + d)) * 2.0D * 6378.137D * 10000.0D) / 10000.0D * 1000.0D;
  }
  
  private static double a(double paramDouble, int paramInt)
  {
    try
    {
      if (Double.isNaN(paramDouble)) {
        return 0.0D;
      }
      paramDouble = BigDecimal.valueOf(paramDouble).setScale(paramInt, RoundingMode.HALF_DOWN).doubleValue();
      return paramDouble;
    }
    catch (Exception localException) {}
    return 0.0D;
  }
  
  private static int a(char paramChar)
  {
    int j = 256;
    int i = j;
    if (paramChar >= 'A')
    {
      i = j;
      if (paramChar <= 'Z') {
        i = paramChar - 'A';
      }
    }
    j = i;
    if (paramChar >= 'a')
    {
      j = i;
      if (paramChar <= 'z') {
        j = paramChar - 'a' + 64;
      }
    }
    i = j;
    if (paramChar >= '0')
    {
      i = j;
      if (paramChar <= '9') {
        i = paramChar + '' - 48;
      }
    }
    return i;
  }
  
  public static String a(dp paramdp, boolean paramBoolean)
  {
    if (paramdp == null) {
      return "[]";
    }
    int j = paramdp.b;
    int k = paramdp.c;
    int m = paramdp.a.ordinal();
    Object localObject1 = new ArrayList();
    Object localObject2 = paramdp.a();
    int i;
    int n;
    int i1;
    if (ec.a(m, j, k, paramdp.d, paramdp.e))
    {
      i = paramdp.d;
      int i2 = paramdp.e;
      int i3 = paramdp.f;
      n = paramdp.g;
      i1 = paramdp.h;
      paramdp = new StringBuilder();
      paramdp.append("{");
      paramdp.append("\"mcc\":");
      paramdp.append(j);
      paramdp.append(",\"mnc\":");
      paramdp.append(k);
      paramdp.append(",\"lac\":");
      paramdp.append(i);
      paramdp.append(",\"cellid\":");
      paramdp.append(i2);
      paramdp.append(",\"rss\":");
      paramdp.append(i3);
      paramdp.append(",\"seed\":");
      if (paramBoolean)
      {
        i = 1;
        paramdp.append(i);
        paramdp.append(",\"networktype\":");
        paramdp.append(m);
        if ((n != Integer.MAX_VALUE) && (i1 != Integer.MAX_VALUE))
        {
          paramdp.append(",\"stationLat\":");
          paramdp.append(String.format("%.6f", new Object[] { Float.valueOf(n / 14400.0F) }));
          paramdp.append(",\"stationLng\":");
          paramdp.append(String.format("%.6f", new Object[] { Float.valueOf(i1 / 14400.0F) }));
        }
        paramdp.append("}");
        ((ArrayList)localObject1).add(paramdp.toString());
      }
    }
    for (;;)
    {
      try
      {
        paramdp = ((List)localObject2).iterator();
        if (paramdp.hasNext())
        {
          localObject2 = (NeighboringCellInfo)paramdp.next();
          i = ((NeighboringCellInfo)localObject2).getLac();
          n = ((NeighboringCellInfo)localObject2).getCid();
          if (!ec.a(m, j, k, i, n)) {
            break label578;
          }
          i1 = ((NeighboringCellInfo)localObject2).getRssi();
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("{");
          ((StringBuilder)localObject2).append("\"mcc\":");
          ((StringBuilder)localObject2).append(j);
          ((StringBuilder)localObject2).append(",\"mnc\":");
          ((StringBuilder)localObject2).append(k);
          ((StringBuilder)localObject2).append(",\"lac\":");
          ((StringBuilder)localObject2).append(i);
          ((StringBuilder)localObject2).append(",\"cellid\":");
          ((StringBuilder)localObject2).append(n);
          ((StringBuilder)localObject2).append(",\"rss\":");
          ((StringBuilder)localObject2).append((i1 << 1) - 113);
          ((StringBuilder)localObject2).append("}");
          ((ArrayList)localObject1).add(((StringBuilder)localObject2).toString());
          continue;
        }
        i = 0;
      }
      catch (Exception paramdp)
      {
        paramdp = new StringBuilder("[");
        localObject2 = new ef(",");
        localObject1 = ((Iterable)localObject1).iterator();
        paramdp.append(((ef)localObject2).a(new StringBuilder(), (Iterator)localObject1).toString());
        paramdp.append("]");
        return paramdp.toString();
      }
      break;
      a("illeagal main cell! ", j, k, m, paramdp.d, paramdp.e);
      continue;
      label578:
      a("illeagal neighboringCell! ", j, k, m, i, n);
    }
  }
  
  public static String a(dq paramdq)
  {
    if (paramdq == null) {
      return "{}";
    }
    Location localLocation = paramdq.a;
    StringBuilder localStringBuilder = new StringBuilder();
    double d1 = a(localLocation.getLatitude(), 6);
    double d2 = a(localLocation.getLongitude(), 6);
    double d3 = a(localLocation.getAltitude(), 1);
    double d4 = a(localLocation.getAccuracy(), 1);
    double d5 = a(localLocation.getBearing(), 1);
    double d6 = a(localLocation.getSpeed(), 1);
    localStringBuilder.append("{");
    localStringBuilder.append("\"latitude\":");
    localStringBuilder.append(d1);
    localStringBuilder.append(",\"longitude\":");
    localStringBuilder.append(d2);
    localStringBuilder.append(",\"additional\":");
    localStringBuilder.append("\"" + d3 + "," + d4 + "," + d5 + "," + d6 + "," + paramdq.b + "\"");
    localStringBuilder.append(",\"source\":");
    localStringBuilder.append(paramdq.d - 1);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static String a(dt paramdt)
  {
    if ((paramdt == null) || (Collections.unmodifiableList(paramdt.b) == null)) {
      return "[]";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    if ((Collections.unmodifiableList(paramdt.b) == null) || (Collections.unmodifiableList(paramdt.b).size() <= 0))
    {
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
    paramdt = Collections.unmodifiableList(paramdt.b);
    Iterator localIterator = paramdt.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      ScanResult localScanResult = (ScanResult)localIterator.next();
      paramdt.size();
      if (i > 0) {
        localStringBuilder.append(",");
      }
      localStringBuilder.append("{\"mac\":\"").append(localScanResult.BSSID.replace(":", "")).append("\",");
      localStringBuilder.append("\"rssi\":").append(localScanResult.level).append("}");
      i += 1;
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  private static void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    boolean bool = true;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("getCellInfoWithJsonFormat: ");
    localStringBuilder.append(paramString);
    paramString = localStringBuilder.append("isGsm=");
    if (paramInt3 == 1) {}
    for (;;)
    {
      paramString.append(bool);
      localStringBuilder.append(", mcc,mnc=").append(paramInt1).append(",").append(paramInt2);
      localStringBuilder.append(", lac,cid=").append(paramInt4).append(",").append(paramInt5);
      return;
      bool = false;
    }
  }
  
  public static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static boolean a(Location paramLocation, double[] paramArrayOfDouble)
  {
    int k = (int)(paramLocation.getLatitude() * 1000000.0D);
    int m = (int)(paramLocation.getLongitude() * 1000000.0D);
    paramLocation = j.c("tencent_loc_lib");
    int i = 0;
    int j = 0;
    while (i < paramLocation.length())
    {
      j += a(paramLocation.charAt(i));
      i += 1;
    }
    paramLocation = new double[2];
    try
    {
      e.b(k ^ j, j ^ m, paramLocation);
      paramArrayOfDouble[0] = paramLocation[0];
      paramArrayOfDouble[1] = paramLocation[1];
      return true;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      for (;;) {}
    }
  }
  
  public static boolean a(String paramString)
  {
    do
    {
      JSONObject localJSONObject;
      do
      {
        try
        {
          localJSONObject = new JSONObject(paramString);
          if (paramString.contains("latitude")) {
            return true;
          }
        }
        catch (Exception paramString)
        {
          return false;
        }
        paramString = localJSONObject.optJSONArray("cells");
      } while ((paramString != null) && (paramString.length() > 0));
      paramString = localJSONObject.optJSONArray("wifis");
    } while ((paramString != null) && (paramString.length() > 0));
    return false;
  }
  
  public static boolean a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    if (TencentLocationManagerOptions.isLoadLibraryEnabled()) {}
    int k;
    int m;
    int j;
    try
    {
      System.loadLibrary("tencentloc");
      k = (int)(paramArrayOfDouble1[0] * 1000000.0D);
      m = (int)(paramArrayOfDouble1[1] * 1000000.0D);
      paramArrayOfDouble1 = j.c("tencent_loc_lib");
      int i = 0;
      j = 0;
      while (i < paramArrayOfDouble1.length())
      {
        j += a(paramArrayOfDouble1.charAt(i));
        i += 1;
      }
      paramArrayOfDouble1 = new double[2];
    }
    catch (Throwable paramArrayOfDouble1)
    {
      new StringBuilder("LOAD:").append(paramArrayOfDouble1.toString());
      return false;
    }
    try
    {
      e.b(k ^ j, j ^ m, paramArrayOfDouble1);
      paramArrayOfDouble2[0] = paramArrayOfDouble1[0];
      paramArrayOfDouble2[1] = paramArrayOfDouble1[1];
      return true;
    }
    catch (Throwable paramArrayOfDouble1)
    {
      new StringBuilder("E.B:").append(paramArrayOfDouble1.toString());
    }
    return false;
  }
  
  public static byte[] a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = a(paramString1.getBytes("GBK"));
      paramString1 = ee.a(paramString1, paramString2);
      if ((paramString1 == null) || (paramString1.length == 0)) {
        return a;
      }
    }
    catch (Throwable paramString1)
    {
      paramString1.toString();
      return a;
    }
    paramString2 = new byte[paramString1.length + 2];
    int j = paramString1.length;
    byte[] arrayOfByte = new byte[2];
    int i = 0;
    while (i < 2)
    {
      arrayOfByte[i] = Integer.valueOf(j & 0xFF).byteValue();
      j >>= 8;
      i += 1;
    }
    System.arraycopy(arrayOfByte, 0, paramString2, 0, 2);
    System.arraycopy(paramString1, 0, paramString2, 2, paramString1.length);
    return paramString2;
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length);
      localObject1 = localObject2;
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
      localObject1 = localObject2;
      localGZIPOutputStream.write(paramArrayOfByte);
      localObject1 = localObject2;
      localGZIPOutputStream.close();
      localObject1 = localObject2;
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      localObject1 = paramArrayOfByte;
      localByteArrayOutputStream.close();
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte) {}
    return (byte[])localObject1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */