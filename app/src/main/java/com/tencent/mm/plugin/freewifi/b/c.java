package com.tencent.mm.plugin.freewifi.b;

import android.database.MatrixCursor;
import com.tencent.mm.g.a.ez;
import com.tencent.mm.g.a.ez.a;
import com.tencent.mm.plugin.freewifi.d.j;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.asv;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  private static final String[] jjk = { "ssid", "bssid", "rssi", "isWechatWifi", "wechatShopName", "maxApCount", "intervalSeconds" };
  private static final String[] jjl = { "errcode", "errmsg", "maxApCount", "intervalSeconds" };
  private int jjm = 200;
  private int jjn = 180;
  private long jjo = 0L;
  
  private void a(ez paramez, int paramInt, String paramString)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "FreeWifiManufacturerGetWifiListHelper setErrorResult. errorcode=%d, errmsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    label122:
    do
    {
      try
      {
        localMatrixCursor = new MatrixCursor(jjl);
        if (localMatrixCursor == null) {
          break label122;
        }
      }
      catch (Exception paramString)
      {
        try
        {
          localMatrixCursor.addRow(new Object[] { Integer.valueOf(paramInt), paramString, Integer.valueOf(aOo()), Integer.valueOf(aOp()) });
          paramez.bNa.bNc = localMatrixCursor;
          paramez.bNa.bMG = 1;
          if (paramez.bJX != null) {
            paramez.bJX.run();
          }
          return;
        }
        catch (Exception paramString)
        {
          MatrixCursor localMatrixCursor;
          for (;;) {}
        }
        paramString = paramString;
        localMatrixCursor = null;
      }
      localMatrixCursor.close();
      x.e("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "exception in getWifiList syncTaskCur.", new Object[] { paramString });
      paramez.bNa.bNc = null;
      paramez.bNa.bMG = 1;
    } while (paramez.bJX == null);
    paramez.bJX.run();
  }
  
  public static c aOn()
  {
    return a.aOr();
  }
  
  private long aOq()
  {
    try
    {
      long l = this.jjo;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(ez paramez)
  {
    int j = 0;
    for (;;)
    {
      Object localObject;
      try
      {
        x.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "method getWifiList called. reqMaxApCount=" + aOo() + "; reqIntervalSeconds=" + aOp());
        localObject = paramez.bMZ.bNb;
        if ((localObject != null) && (localObject.length != 0)) {
          continue;
        }
        a(paramez, 1101, "Args is empty.");
      }
      finally
      {
        try
        {
          StringBuilder localStringBuilder;
          i = Integer.valueOf(localObject[0]).intValue();
          if (i != 1) {
            break label641;
          }
          if (localObject.length == 3) {
            break label234;
          }
          a(paramez, 1104, "Args.length should be 3, but now it is " + localObject.length + ".");
        }
        catch (Exception localException1)
        {
          a(paramez, 1102, "Args[0] is not an integer.");
        }
        paramez = finally;
      }
      return;
      localStringBuilder = new StringBuilder();
      int i = 0;
      if (i < localObject.length)
      {
        localStringBuilder.append("args[" + i + "] = " + localObject[i]);
        i += 1;
      }
      else
      {
        x.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "args: " + localStringBuilder.toString());
        continue;
        label234:
        int k;
        try
        {
          k = Integer.valueOf(localObject[2]).intValue();
          if ((k == 1) || (k == 2)) {
            break label286;
          }
          a(paramez, 1106, "Args[2] should be integer 1 (from setting) or integer 2 (from background).");
        }
        catch (Exception localException2)
        {
          a(paramez, 1107, "Args[2] is not a valid int value.");
        }
        continue;
        label286:
        if ((aOq() != 0L) && (System.currentTimeMillis() - aOq() < aOp()) && (k == 2))
        {
          a(paramez, 1109, "Request frequence is out of limit. The time btween two background request should be more than  " + this.jjn + " seconds.");
        }
        else if (m.isEmpty(localObject[1]))
        {
          a(paramez, 1105, "Args[1] should be an ap list json string, but now it is empty.");
        }
        else
        {
          LinkedList localLinkedList = new LinkedList();
          try
          {
            localObject = new JSONArray(localObject[1]);
            if (((JSONArray)localObject).length() <= aOo()) {
              break label473;
            }
            a(paramez, 1110, "jsonArray.length()=" + ((JSONArray)localObject).length() + ". Too many ap. The number of ap requested per time should be between 1 and " + aOo() + ".");
          }
          catch (Exception localException3)
          {
            a(paramez, 1105, "Args[1] is not a valid json array value and it should be a string like  [  {    \"ssid\": \"SSID_NAME\",    \"bssid\": \"0e:00:00:00:00:00\",    \"rssi\": -45  }].");
          }
          continue;
          label473:
          i = j;
          if (((JSONArray)localObject).length() == 0)
          {
            a(paramez, 1110, "jsonArray.length()=" + ((JSONArray)localObject).length() + ". Too many ap. The number of ap requested per time should be between 1 and " + aOo() + ".");
          }
          else
          {
            while (i < ((JSONArray)localObject).length())
            {
              JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
              asv localasv = new asv();
              localasv.ssid = m.BQ(localJSONObject.getString("ssid"));
              localasv.bssid = localJSONObject.getString("bssid");
              localasv.bMF = localJSONObject.getInt("rssi");
              localException3.add(localasv);
              i += 1;
            }
            new j(localException3, k).b(new c.1(this, localException3, k, paramez));
            continue;
            label641:
            a(paramez, 1103, "Wechant installed currently only supports version 1.");
          }
        }
      }
    }
  }
  
  public final int aOo()
  {
    try
    {
      x.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "getReqMaxApCount() returns " + this.jjm);
      int i = this.jjm;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int aOp()
  {
    try
    {
      int i = this.jjn;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void dF(long paramLong)
  {
    try
    {
      this.jjo = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void pX(int paramInt)
  {
    try
    {
      x.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "setReqMaxApCount() param reqMaxApCount = " + paramInt);
      this.jjm = paramInt;
      x.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "setReqMaxApCount() this.reqMaxApCount = " + this.jjm);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void pY(int paramInt)
  {
    try
    {
      this.jjn = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static final class a
  {
    private static c jjt = new c((byte)0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/freewifi/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */