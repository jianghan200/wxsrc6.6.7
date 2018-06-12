package com.tencent.liteav.network;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class c
{
  public b a = null;
  public int b = 5;
  private final String c = "http://tcdns.myqcloud.com/queryip";
  private final String d = "forward_stream";
  private final String e = "forward_num";
  private final String f = "request_type";
  private final String g = "sdk_version";
  private Thread h = null;
  
  private a a(JSONObject paramJSONObject)
  {
    a locala = new a();
    try
    {
      locala.a = paramJSONObject.getString("ip");
      locala.b = paramJSONObject.getString("port");
      locala.d = 0;
      locala.c = false;
      if ((paramJSONObject.has("type")) && (paramJSONObject.getInt("type") == 2)) {
        locala.c = true;
      }
      return locala;
    }
    catch (JSONException paramJSONObject) {}
    return null;
  }
  
  private ArrayList<a> a(String paramString)
  {
    a locala = null;
    int k = 0;
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      int i;
      int j;
      try
      {
        paramString = new JSONObject(paramString);
        if (paramString.getInt("state") != 0) {
          return null;
        }
        JSONArray localJSONArray = paramString.getJSONObject("content").getJSONArray("list");
        paramString = locala;
        if (localJSONArray != null)
        {
          i = 0;
          j = k;
          if (i < localJSONArray.length())
          {
            paramString = a((JSONObject)localJSONArray.opt(i));
            if ((paramString == null) || (!paramString.c)) {
              break label235;
            }
            localArrayList.add(paramString);
            break label235;
          }
          if (j < localJSONArray.length())
          {
            paramString = a((JSONObject)localJSONArray.opt(j));
            if ((paramString == null) || (paramString.c)) {
              break label242;
            }
            localArrayList.add(paramString);
            break label242;
          }
          paramString = localArrayList.iterator();
          if (paramString.hasNext())
          {
            locala = (a)paramString.next();
            TXCLog.e("TXCIntelligentRoute", "Nearest IP: " + locala.a + " Port: " + locala.b + " Q Channel: " + locala.c);
            continue;
          }
        }
        return paramString;
      }
      catch (JSONException paramString)
      {
        paramString = localArrayList;
      }
      label235:
      i += 1;
      continue;
      label242:
      j += 1;
    }
  }
  
  private String b(String paramString, int paramInt)
  {
    localStringBuffer = new StringBuffer("");
    try
    {
      paramString = c(paramString, paramInt);
      if (paramString == null) {
        return "";
      }
      paramString = new BufferedReader(new InputStreamReader(paramString));
      for (;;)
      {
        String str = paramString.readLine();
        if (str == null) {
          break;
        }
        localStringBuffer.append(str);
      }
      return localStringBuffer.toString();
    }
    catch (IOException paramString) {}
  }
  
  private InputStream c(String paramString, int paramInt)
  {
    Object localObject = new URL("http://tcdns.myqcloud.com/queryip").openConnection();
    try
    {
      localObject = (HttpURLConnection)localObject;
      ((HttpURLConnection)localObject).setRequestMethod("GET");
      ((HttpURLConnection)localObject).setRequestProperty("forward_stream", paramString);
      ((HttpURLConnection)localObject).setRequestProperty("forward_num", "2");
      ((HttpURLConnection)localObject).setRequestProperty("sdk_version", TXCCommonUtil.getSDKVersionStr());
      if (paramInt == 1) {
        ((HttpURLConnection)localObject).setRequestProperty("request_type", "1");
      }
      for (;;)
      {
        if (this.b > 0)
        {
          ((HttpURLConnection)localObject).setConnectTimeout(this.b * 1000);
          ((HttpURLConnection)localObject).setReadTimeout(this.b * 1000);
        }
        ((HttpURLConnection)localObject).connect();
        if (((HttpURLConnection)localObject).getResponseCode() != 200) {
          break;
        }
        return ((HttpURLConnection)localObject).getInputStream();
        if (paramInt == 2) {
          ((HttpURLConnection)localObject).setRequestProperty("request_type", "2");
        } else {
          ((HttpURLConnection)localObject).setRequestProperty("request_type", "3");
        }
      }
      return null;
    }
    catch (Exception paramString) {}
  }
  
  public void a(String paramString, int paramInt)
  {
    this.h = new c.1(this, "TXCPushRoute", paramString, paramInt);
    this.h.start();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/liteav/network/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */