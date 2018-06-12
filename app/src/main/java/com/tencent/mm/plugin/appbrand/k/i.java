package com.tencent.mm.plugin.appbrand.k;

import android.net.Uri;
import android.util.Log;
import com.tencent.mm.bk.b;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.a.c;
import com.tencent.mm.protocal.c.asn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.json.JSONException;
import org.json.JSONObject;

public enum i
{
  private static Boolean gll;
  
  public static int a(AppBrandSysConfig paramAppBrandSysConfig, com.tencent.mm.plugin.appbrand.config.a parama, int paramInt)
  {
    int k = 0;
    int j;
    switch (paramInt)
    {
    default: 
      i = 0;
      paramInt = 0;
      if ((paramInt > 0) && (i <= 0))
      {
        j = paramInt;
        return j;
      }
      break;
    case 0: 
      label51:
      paramInt = parama.foQ.cez;
      if ((paramAppBrandSysConfig.frn == null) || (paramAppBrandSysConfig.frn.fpK == null)) {}
      break;
    }
    for (int i = paramAppBrandSysConfig.frn.fpK.fqe;; i = 0)
    {
      x.i("MicroMsg.AppBrandNetworkUtil", "request apptimeout %d, systimeout %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      break;
      paramInt = parama.foQ.foX;
      if ((paramAppBrandSysConfig.frn != null) && (paramAppBrandSysConfig.frn.fpK != null)) {}
      for (i = paramAppBrandSysConfig.frn.fpK.fqe;; i = 0)
      {
        x.i("MicroMsg.AppBrandNetworkUtil", "socket apptimeout %d, systimeout %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        break;
        paramInt = parama.foQ.foZ;
        if ((paramAppBrandSysConfig.frn != null) && (paramAppBrandSysConfig.frn.fpK != null)) {}
        for (i = paramAppBrandSysConfig.frn.fpK.fqg;; i = 0)
        {
          x.i("MicroMsg.AppBrandNetworkUtil", "download apptimeout %d, systimeout %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
          break;
          paramInt = parama.foQ.foY;
          if ((paramAppBrandSysConfig.frn != null) && (paramAppBrandSysConfig.frn.fpK != null)) {}
          for (i = paramAppBrandSysConfig.frn.fpK.fqf;; i = 0)
          {
            x.i("MicroMsg.AppBrandNetworkUtil", "upload apptimeout %d, systimeout %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
            break;
            if ((paramInt <= 0) && (i > 0)) {
              return i;
            }
            j = k;
            if (paramInt <= 0) {
              break label51;
            }
            j = k;
            if (i <= 0) {
              break label51;
            }
            return Math.min(paramInt, i);
          }
        }
      }
    }
  }
  
  public static Map<String, String> a(JSONObject paramJSONObject, AppBrandSysConfig paramAppBrandSysConfig)
  {
    paramJSONObject = x(paramJSONObject);
    Object localObject1 = paramJSONObject;
    Object localObject2;
    if (paramAppBrandSysConfig.frn != null)
    {
      localObject2 = paramAppBrandSysConfig.frn.fpK;
      localObject1 = paramJSONObject;
      if (localObject2 != null)
      {
        if (((AppBrandGlobalSystemConfig.HttpSetting)localObject2).mode != 1) {
          break label277;
        }
        localObject1 = paramJSONObject;
        if (((AppBrandGlobalSystemConfig.HttpSetting)localObject2).fqc != null)
        {
          localObject1 = ((AppBrandGlobalSystemConfig.HttpSetting)localObject2).fqc;
          if ((localObject1 != null) && (!((ArrayList)localObject1).isEmpty())) {
            break label204;
          }
          x.e("MicroMsg.AppBrandNetworkUtil", "filterHttpHeaderBlackList fail, headerMap is null or blacklist is null or nil.");
        }
      }
    }
    for (;;)
    {
      localObject1 = paramJSONObject;
      label204:
      String str1;
      label277:
      do
      {
        do
        {
          ((Map)localObject1).remove("referer");
          localObject2 = "";
          paramJSONObject = (JSONObject)localObject2;
          if (paramAppBrandSysConfig.frn != null)
          {
            paramJSONObject = (JSONObject)localObject2;
            if (paramAppBrandSysConfig.frn.fpK != null) {
              paramJSONObject = paramAppBrandSysConfig.frn.fpK.fqi;
            }
          }
          localObject2 = paramJSONObject;
          if (bi.oW(paramJSONObject)) {
            localObject2 = "servicewechat.com";
          }
          paramJSONObject = new StringBuilder();
          paramJSONObject.append("https://");
          paramJSONObject.append((String)localObject2);
          paramJSONObject.append("/");
          paramJSONObject.append(paramAppBrandSysConfig.appId);
          paramJSONObject.append("/");
          paramJSONObject.append(paramAppBrandSysConfig.frm.fii);
          paramJSONObject.append("/page-frame.html");
          ((Map)localObject1).put("referer", paramJSONObject.toString());
          return (Map<String, String>)localObject1;
          localObject1 = ((ArrayList)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            if (localObject2 != null)
            {
              localObject2 = ((String)localObject2).toLowerCase();
              str1 = (String)paramJSONObject.remove(localObject2);
              if (str1 != null) {
                x.v("MicroMsg.AppBrandNetworkUtil", "remove key %s value %s", new Object[] { localObject2, str1 });
              }
            }
          }
          break;
          localObject1 = paramJSONObject;
        } while (((AppBrandGlobalSystemConfig.HttpSetting)localObject2).mode != 2);
        localObject1 = paramJSONObject;
      } while (((AppBrandGlobalSystemConfig.HttpSetting)localObject2).fqd == null);
      localObject2 = ((AppBrandGlobalSystemConfig.HttpSetting)localObject2).fqd;
      if (localObject2 == null)
      {
        x.e("MicroMsg.AppBrandNetworkUtil", "filterHttpHeaderWhiteList fail");
      }
      else
      {
        localObject1 = new HashMap();
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          str1 = (String)((Iterator)localObject2).next();
          if (str1 != null)
          {
            str1 = str1.toLowerCase();
            String str2 = (String)paramJSONObject.get(str1);
            if (str2 != null)
            {
              x.v("MicroMsg.AppBrandNetworkUtil", "add item, key(%s), value(%s)", new Object[] { str1, str2 });
              ((Map)localObject1).put(str1, str2);
            }
          }
        }
        paramJSONObject = (JSONObject)localObject1;
      }
    }
  }
  
  public static void a(HttpURLConnection paramHttpURLConnection, ArrayList<String> paramArrayList)
  {
    if (paramHttpURLConnection == null) {
      return;
    }
    HostnameVerifier localHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
    ((HttpsURLConnection)paramHttpURLConnection).setHostnameVerifier(new i.1(localHostnameVerifier, paramArrayList));
  }
  
  public static boolean a(AppBrandSysConfig paramAppBrandSysConfig, boolean paramBoolean)
  {
    if (paramBoolean) {
      x.v("MicroMsg.AppBrandNetworkUtil", "skipCheck Domains");
    }
    int i;
    label62:
    do
    {
      return false;
      if ((paramAppBrandSysConfig.frm.fih == 1) || (paramAppBrandSysConfig.frm.fih == 2)) {}
      for (i = 1;; i = 0)
      {
        if (!paramAppBrandSysConfig.fqw) {
          break label62;
        }
        if ((i != 0) && (paramAppBrandSysConfig.fqO)) {
          break;
        }
        return true;
      }
    } while ((i != 0) && (paramAppBrandSysConfig.fqL));
    return true;
  }
  
  public static boolean a(ArrayList<String> paramArrayList, String paramString, boolean paramBoolean)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    x.i("MicroMsg.AppBrandNetworkUtil", "url " + paramString);
    x.i("MicroMsg.AppBrandNetworkUtil", "configUrl size " + paramArrayList.size());
    Object localObject1 = uO(paramString);
    paramString = (String)((HashMap)localObject1).get("host");
    String str1 = (String)((HashMap)localObject1).get("scheme");
    localObject1 = (String)((HashMap)localObject1).get("port");
    if ((bi.oW(paramString)) || (bi.oW(str1))) {
      return false;
    }
    x.i("MicroMsg.AppBrandNetworkUtil", "host %s  scheme %s port %s skipPortCheck %s", new Object[] { paramString, str1, localObject1, Boolean.valueOf(paramBoolean) });
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str2 = (String)paramArrayList.next();
      x.i("MicroMsg.AppBrandNetworkUtil", "configUrl " + str2);
      Object localObject2 = uO(str2);
      str2 = (String)((HashMap)localObject2).get("host");
      String str3 = (String)((HashMap)localObject2).get("scheme");
      localObject2 = (String)((HashMap)localObject2).get("port");
      x.i("MicroMsg.AppBrandNetworkUtil", "confighost %s  configscheme %s configport %s", new Object[] { str2, str3, localObject2 });
      if ((paramString.equalsIgnoreCase(str2)) && (str1.equalsIgnoreCase(str3)) && ((paramBoolean) || (((String)localObject1).equalsIgnoreCase((String)localObject2))))
      {
        x.i("MicroMsg.AppBrandNetworkUtil", "match!!");
        return true;
      }
    }
    return false;
  }
  
  public static boolean b(ArrayList<String> paramArrayList, String paramString)
  {
    return a(paramArrayList, paramString, false);
  }
  
  public static int bR(long paramLong)
  {
    return g(paramLong, -1);
  }
  
  public static boolean c(AppBrandInitConfig paramAppBrandInitConfig)
  {
    boolean bool;
    if (gll != null)
    {
      bool = gll.booleanValue();
      if (!bool) {
        break label121;
      }
    }
    label121:
    while ((paramAppBrandInitConfig.aeb()) || (paramAppBrandInitConfig.aaq()))
    {
      return true;
      Object localObject = a.b.dnp;
      localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.fJ("100386");
      if (localObject == null)
      {
        localObject = Boolean.valueOf(false);
        gll = (Boolean)localObject;
        bool = ((Boolean)localObject).booleanValue();
        break;
      }
      if ((((c)localObject).isValid()) && ("1".equals(((c)localObject).ckq().get("openSkipDomainCheck")))) {}
      for (bool = true;; bool = false)
      {
        gll = Boolean.valueOf(bool);
        x.i("MicroMsg.AppBrandNetworkUtil", "openSkipDomainCheck %b", new Object[] { gll });
        bool = gll.booleanValue();
        break;
      }
    }
    return false;
  }
  
  public static String d(HttpURLConnection paramHttpURLConnection)
  {
    if (paramHttpURLConnection == null) {
      return "";
    }
    URL localURL = paramHttpURLConnection.getURL();
    if (localURL == null) {
      return "";
    }
    String str2 = paramHttpURLConnection.getHeaderField("Location");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramHttpURLConnection.getHeaderField("location");
    }
    if (str1 == null) {
      return null;
    }
    try
    {
      paramHttpURLConnection = localURL.toURI().resolve(str1).toString();
      return paramHttpURLConnection;
    }
    catch (URISyntaxException paramHttpURLConnection)
    {
      x.e("MicroMsg.AppBrandNetworkUtil", "resolve url error %s", new Object[] { paramHttpURLConnection.getMessage() });
    }
    return str1;
  }
  
  public static JSONObject e(HttpURLConnection paramHttpURLConnection)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramHttpURLConnection == null) {
      return localJSONObject;
    }
    paramHttpURLConnection = paramHttpURLConnection.getHeaderFields();
    if (paramHttpURLConnection == null) {
      return localJSONObject;
    }
    paramHttpURLConnection = paramHttpURLConnection.entrySet().iterator();
    while (paramHttpURLConnection.hasNext())
    {
      Object localObject = (Map.Entry)paramHttpURLConnection.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (List)((Map.Entry)localObject).getValue();
      if ((!bi.oW(str)) && (localObject != null) && (!((List)localObject).isEmpty()))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append((String)((List)localObject).get(0));
        int i = 1;
        while (i < ((List)localObject).size())
        {
          localStringBuilder.append(",");
          localStringBuilder.append((String)((List)localObject).get(i));
          i += 1;
        }
        try
        {
          localJSONObject.put(str, localStringBuilder.toString());
        }
        catch (JSONException localJSONException)
        {
          x.e("MicroMsg.AppBrandNetworkUtil", "put header error : %s", new Object[] { Log.getStackTraceString(localJSONException) });
        }
      }
    }
    return localJSONObject;
  }
  
  public static JSONObject f(HttpURLConnection paramHttpURLConnection)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("__AppBrandRemoteDebugRequestHeader__", true);
      if (paramHttpURLConnection == null) {
        return localJSONObject;
      }
    }
    catch (JSONException localJSONException1)
    {
      for (;;)
      {
        x.e("MicroMsg.AppBrandNetworkUtil", "put header error");
      }
      paramHttpURLConnection = paramHttpURLConnection.getRequestProperties();
      if (paramHttpURLConnection == null) {
        return localJSONObject;
      }
      paramHttpURLConnection = paramHttpURLConnection.entrySet().iterator();
      while (paramHttpURLConnection.hasNext())
      {
        Object localObject = (Map.Entry)paramHttpURLConnection.next();
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = (List)((Map.Entry)localObject).getValue();
        if ((!bi.oW(str)) && (localObject != null) && (!((List)localObject).isEmpty()))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append((String)((List)localObject).get(0));
          int i = 1;
          while (i < ((List)localObject).size())
          {
            localStringBuilder.append(",");
            localStringBuilder.append((String)((List)localObject).get(i));
            i += 1;
          }
          try
          {
            localJSONObject.put(str, localStringBuilder.toString());
          }
          catch (JSONException localJSONException2)
          {
            x.e("MicroMsg.AppBrandNetworkUtil", "put header error : %s", new Object[] { Log.getStackTraceString(localJSONException2) });
          }
        }
      }
    }
    return localJSONObject;
  }
  
  public static int g(long paramLong, int paramInt)
  {
    x.i("MicroMsg.AppBrandNetworkUtil", "hy: total size is %d, expectMaxRounds is %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    if (paramLong <= 0L) {
      paramInt = 8192;
    }
    int i;
    do
    {
      return paramInt;
      i = paramInt;
      if (paramInt <= 0) {
        i = 3;
      }
      i = (int)(paramLong / i);
      if (i > 524288) {
        break;
      }
      paramInt = i;
    } while (i >= 1024);
    if (i < 1024) {
      return 1024;
    }
    return 524288;
  }
  
  public static boolean lm(int paramInt)
  {
    return (paramInt == 302) || (paramInt == 301);
  }
  
  private static HashMap<String, String> uO(String paramString)
  {
    String str3 = "";
    Object localObject2 = "";
    str2 = "";
    Object localObject1 = localObject2;
    String str1 = str3;
    try
    {
      Uri localUri = Uri.parse(paramString);
      localObject1 = localObject2;
      str1 = str3;
      paramString = localUri.getHost();
      localObject1 = localObject2;
      str1 = paramString;
      localObject2 = localUri.getScheme();
      localObject1 = localObject2;
      str1 = paramString;
      int i = localUri.getPort();
      str2 = String.valueOf(i);
      str1 = paramString;
      localObject1 = localObject2;
      paramString = str2;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.AppBrandNetworkUtil", "message %s", new Object[] { paramString.getMessage() });
        paramString = str2;
      }
    }
    localObject2 = new HashMap();
    ((HashMap)localObject2).put("host", str1);
    ((HashMap)localObject2).put("scheme", localObject1);
    ((HashMap)localObject2).put("port", paramString);
    return (HashMap<String, String>)localObject2;
  }
  
  public static SSLContext uP(String paramString)
  {
    paramString = uQ(paramString);
    if (paramString == null) {
      return null;
    }
    try
    {
      SSLContext localSSLContext = SSLContext.getInstance("TLS");
      localSSLContext.init(null, new TrustManager[] { paramString }, null);
      return localSSLContext;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.AppBrandNetworkUtil", "SSLContext init error: " + paramString);
    }
    return null;
  }
  
  /* Error */
  public static l uQ(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 508	com/tencent/mm/plugin/appbrand/k/i:uR	(Ljava/lang/String;)Ljava/util/LinkedList;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual 511	java/util/LinkedList:isEmpty	()Z
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: new 513	com/tencent/mm/plugin/appbrand/k/l
    //   17: dup
    //   18: invokespecial 514	com/tencent/mm/plugin/appbrand/k/l:<init>	()V
    //   21: astore_0
    //   22: aload_1
    //   23: invokevirtual 515	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   26: astore_1
    //   27: aload_1
    //   28: invokeinterface 183 1 0
    //   33: ifeq +114 -> 147
    //   36: aload_1
    //   37: invokeinterface 187 1 0
    //   42: checkcast 517	java/io/InputStream
    //   45: astore_2
    //   46: aload_0
    //   47: getfield 521	com/tencent/mm/plugin/appbrand/k/l:glx	Ljava/security/KeyStore;
    //   50: ifnonnull +15 -> 65
    //   53: ldc_w 523
    //   56: ldc_w 525
    //   59: invokestatic 114	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   62: goto -35 -> 27
    //   65: ldc_w 527
    //   68: invokestatic 532	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   71: astore_3
    //   72: aload_3
    //   73: aload_2
    //   74: invokevirtual 536	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   77: astore_3
    //   78: aload_2
    //   79: invokevirtual 539	java/io/InputStream:close	()V
    //   82: aload_0
    //   83: getfield 521	com/tencent/mm/plugin/appbrand/k/l:glx	Ljava/security/KeyStore;
    //   86: new 138	java/lang/StringBuilder
    //   89: dup
    //   90: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   93: aload_3
    //   94: checkcast 541	java/security/cert/X509Certificate
    //   97: invokevirtual 545	java/security/cert/X509Certificate:getSubjectDN	()Ljava/security/Principal;
    //   100: invokevirtual 504	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: aload_3
    //   107: invokevirtual 551	java/security/KeyStore:setCertificateEntry	(Ljava/lang/String;Ljava/security/cert/Certificate;)V
    //   110: goto -83 -> 27
    //   113: astore_2
    //   114: ldc_w 523
    //   117: new 138	java/lang/StringBuilder
    //   120: dup
    //   121: ldc_w 553
    //   124: invokespecial 253	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   127: aload_2
    //   128: invokevirtual 504	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 114	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: goto -110 -> 27
    //   140: astore_3
    //   141: aload_2
    //   142: invokevirtual 539	java/io/InputStream:close	()V
    //   145: aload_3
    //   146: athrow
    //   147: aload_0
    //   148: invokevirtual 555	com/tencent/mm/plugin/appbrand/k/l:init	()V
    //   151: aload_0
    //   152: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	paramString	String
    //   4	33	1	localObject1	Object
    //   45	34	2	localInputStream	InputStream
    //   113	29	2	localException	Exception
    //   71	36	3	localObject2	Object
    //   140	6	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   65	72	113	java/lang/Exception
    //   78	110	113	java/lang/Exception
    //   141	147	113	java/lang/Exception
    //   72	78	140	finally
  }
  
  private static LinkedList<InputStream> uR(String paramString)
  {
    localLinkedList = new LinkedList();
    paramString = ao.e(com.tencent.mm.plugin.appbrand.a.pY(paramString), "cer");
    if (paramString == null) {
      return localLinkedList;
    }
    try
    {
      asn localasn = new asn();
      localasn.aG(paramString);
      if (localasn.rUN == null) {
        return localLinkedList;
      }
      paramString = localasn.rUN.iterator();
      while (paramString.hasNext()) {
        localLinkedList.add(new ByteArrayInputStream(((b)paramString.next()).lR));
      }
      return localLinkedList;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.AppBrandNetworkUtil", "parse error: " + paramString);
    }
  }
  
  private static Map<String, String> x(JSONObject paramJSONObject)
  {
    localHashMap = new HashMap();
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("header");
      if (paramJSONObject != null)
      {
        Iterator localIterator = paramJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (str != null) {
            localHashMap.put(str.toLowerCase(), paramJSONObject.getString(str));
          }
        }
      }
      return localHashMap;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.AppBrandNetworkUtil", "get header error, exception : %s", new Object[] { paramJSONObject });
    }
  }
  
  public static Map<String, String> y(JSONObject paramJSONObject)
  {
    localHashMap = new HashMap();
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("formData");
      if (paramJSONObject != null)
      {
        Iterator localIterator = paramJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localHashMap.put(str, paramJSONObject.getString(str));
        }
      }
      return localHashMap;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.AppBrandNetworkUtil", "get form error, exception : %s", new Object[] { paramJSONObject });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/k/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */