package com.tencent.mm.plugin.game.gamewebview.c;

import android.net.Uri;
import com.tencent.mm.protocal.c.amu;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  public static String aAL;
  public static List<amu> jIh;
  public static String jIi = "";
  public static String jIj;
  public static Map<Integer, String> jIk = new HashMap();
  public static String uin;
  
  private static String Dk(String paramString)
  {
    if ((bi.oW(uin)) || (bi.oW(aAL)) || (bi.oW(jIj))) {
      return paramString;
    }
    Uri localUri = Uri.parse(paramString);
    Object localObject1 = localUri.getQuery();
    Object localObject3;
    if (bi.oW((String)localObject1))
    {
      localObject3 = "";
      localObject1 = localObject3;
      if (!bi.oW(uin)) {
        localObject1 = (String)localObject3 + "uin=" + uin + "&";
      }
      localObject3 = localObject1;
      if (!bi.oW(aAL)) {
        localObject3 = (String)localObject1 + "key=" + aAL + "&";
      }
      if (bi.oW(jIj)) {
        break label260;
      }
    }
    label260:
    Object localObject2;
    for (localObject1 = (String)localObject3 + "pass_ticket=" + jIj;; localObject2 = localObject3)
    {
      try
      {
        localObject1 = new URI(localUri.getScheme(), localUri.getAuthority(), localUri.getPath(), (String)localObject1, localUri.getFragment()).toString();
        paramString = (String)localObject1;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.GameWebViewRequest", localURISyntaxException, "", new Object[0]);
        }
      }
      x.d("MicroMsg.GameWebViewRequest", "url: " + paramString);
      return paramString;
      localObject3 = (String)localObject1 + "&";
      break;
    }
  }
  
  private static String a(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      paramString = (HttpURLConnection)new URL(Dk(c(paramString, paramJSONObject))).openConnection();
      paramString.setReadTimeout(5000);
      paramString.setConnectTimeout(5000);
      paramString.setUseCaches(false);
      paramString.setDoInput(true);
      paramString.setRequestMethod("GET");
      paramString.setDoOutput(false);
      h(paramString);
      int i = paramString.getResponseCode();
      x.i("MicroMsg.GameWebViewRequest", "GET, code = " + i);
      if (i == 200)
      {
        paramString = paramString.getInputStream();
        paramJSONObject = s(paramString);
        paramString.close();
        x.d("MicroMsg.GameWebViewRequest", paramJSONObject);
        return paramJSONObject;
      }
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.GameWebViewRequest", paramString.getMessage());
    }
    return null;
  }
  
  public static String b(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    if (jIk.containsKey(Integer.valueOf(paramString1.hashCode()))) {
      return (String)jIk.remove(Integer.valueOf(paramString1.hashCode()));
    }
    if (paramString2.equalsIgnoreCase("POST")) {
      return b(paramString1, paramJSONObject);
    }
    if (paramString2.equalsIgnoreCase("GET")) {
      return a(paramString1, paramJSONObject);
    }
    return null;
  }
  
  private static String b(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      paramString = (HttpURLConnection)new URL(paramString).openConnection();
      paramString.setReadTimeout(5000);
      paramString.setConnectTimeout(5000);
      paramString.setUseCaches(false);
      paramString.setDoInput(true);
      paramString.setRequestMethod("POST");
      paramString.setDoOutput(true);
      h(paramString);
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.toString();
        if (paramJSONObject != null)
        {
          OutputStream localOutputStream = paramString.getOutputStream();
          BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(localOutputStream, "utf-8"));
          localBufferedWriter.write(paramJSONObject);
          localBufferedWriter.flush();
          localBufferedWriter.close();
          localOutputStream.close();
        }
      }
      int i = paramString.getResponseCode();
      x.i("MicroMsg.GameWebViewRequest", "POST, code = " + i);
      if (i == 200)
      {
        paramString = paramString.getInputStream();
        paramJSONObject = s(paramString);
        paramString.close();
        x.d("MicroMsg.GameWebViewRequest", paramJSONObject);
        return paramJSONObject;
      }
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.GameWebViewRequest", paramString.getMessage());
    }
    return null;
  }
  
  private static String c(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return paramString;
    }
    Uri localUri = Uri.parse(paramString);
    String str1 = localUri.getQuery();
    Iterator localIterator = paramJSONObject.keys();
    if (bi.oW(str1)) {
      str1 = "";
    }
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      String str3 = paramJSONObject.optString(str2);
      str1 = str1 + str2 + "=" + str3 + "&";
      continue;
      str1 = str1 + "&";
    }
    paramJSONObject = str1.substring(0, str1.lastIndexOf("&"));
    try
    {
      paramJSONObject = new URI(localUri.getScheme(), localUri.getAuthority(), localUri.getPath(), paramJSONObject, localUri.getFragment()).toString();
      paramString = paramJSONObject;
    }
    catch (URISyntaxException paramJSONObject)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.GameWebViewRequest", paramJSONObject, "", new Object[0]);
      }
    }
    x.d("MicroMsg.GameWebViewRequest", "url: " + paramString);
    return paramString;
  }
  
  public static void c(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    paramString2 = b(paramString1, paramString2, paramJSONObject);
    jIk.put(Integer.valueOf(paramString1.hashCode()), paramString2);
  }
  
  private static void h(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
    paramHttpURLConnection.setRequestProperty("User-agent", jIi);
    Iterator localIterator = jIh.iterator();
    while (localIterator.hasNext())
    {
      amu localamu = (amu)localIterator.next();
      paramHttpURLConnection.setRequestProperty(localamu.riD, localamu.mEl);
    }
  }
  
  public static void k(String paramString, List<amu> paramList)
  {
    if (!bi.oW(paramString))
    {
      paramString = Uri.parse(paramString);
      uin = paramString.getQueryParameter("uin");
      aAL = paramString.getQueryParameter("key");
      jIj = paramString.getQueryParameter("pass_ticket");
    }
    jIh = paramList;
  }
  
  private static String s(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte['Ѐ'];
    try
    {
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte, 0, 1024);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      paramInputStream = new String(localByteArrayOutputStream.toByteArray(), "utf-8");
    }
    catch (Exception paramInputStream)
    {
      x.e("MicroMsg.GameWebViewRequest", "inputStream2Str: " + paramInputStream.getMessage());
      return "";
    }
    return paramInputStream;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */