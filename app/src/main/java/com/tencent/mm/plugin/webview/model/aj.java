package com.tencent.mm.plugin.webview.model;

import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.model.o;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONStringer;

public final class aj
{
  public static String Qr(String paramString)
  {
    Object localObject = new File(com.tencent.mm.compatible.util.e.dgl);
    if (!((File)localObject).mkdirs()) {
      x.i("MicroMsg.WebviewJSSDKUtil", "mkdirs failed.File is exist = " + ((File)localObject).exists());
    }
    if (!((File)localObject).exists()) {
      x.e("MicroMsg.WebviewJSSDKUtil", "camera storage path do not exist.(%s)", new Object[] { com.tencent.mm.compatible.util.e.dgl });
    }
    localObject = ((File)localObject).getAbsolutePath() + File.separator + paramString + ".jpg";
    x.i("MicroMsg.WebviewJSSDKUtil", "get file path from capture file name : %s == %s", new Object[] { paramString, localObject });
    return (String)localObject;
  }
  
  public static Intent Qs(String paramString)
  {
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    localIntent.putExtra("output", Uri.fromFile(new File(Qr(paramString))));
    return localIntent;
  }
  
  public static String Qt(String paramString)
  {
    x.i("MicroMsg.WebviewJSSDKUtil", "genLocalIdByFilePath, file path is ：%s", new Object[] { paramString });
    if (bi.oW(paramString)) {
      return null;
    }
    String str = "weixin://resourceid/" + ac.ce(paramString);
    x.i("MicroMsg.WebviewJSSDKUtil", "gen local id by filepath, filepath : %s, localid : %s", new Object[] { paramString, str });
    return str;
  }
  
  public static String Qu(String paramString)
  {
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.e.bUX().Qq(paramString);
    if (localWebViewJSSDKFileItem != null)
    {
      x.i("MicroMsg.WebviewJSSDKUtil", "get local thumb filepath from local id :%s", new Object[] { localWebViewJSSDKFileItem.fOs });
      return localWebViewJSSDKFileItem.fOs;
    }
    x.e("MicroMsg.WebviewJSSDKUtil", "fromLocalIdToFilePath, local map not contains the local id : %s", new Object[] { paramString });
    return null;
  }
  
  private static InputStream Qv(String paramString)
  {
    x.i("MicroMsg.WebviewJSSDKUtil", "getDataFromLocalId : %s", new Object[] { paramString });
    if (bi.oW(paramString)) {}
    while ((bi.oW(paramString)) || (!com.tencent.mm.a.e.cn(paramString))) {
      return null;
    }
    try
    {
      paramString = new FileInputStream(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.WebviewJSSDKUtil", "init file input stream error : %s", new Object[] { paramString.getMessage() });
    }
    return null;
  }
  
  public static InputStream Qw(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.WebviewJSSDKUtil", "local is is null or nil");
      return null;
    }
    return Qv(paramString);
  }
  
  public static String Qx(String paramString)
  {
    return "_USER_FOR_WEBVIEW_JSAPI" + o.l(paramString, bi.VF());
  }
  
  public static String U(ArrayList<String> paramArrayList)
  {
    if (paramArrayList.size() == 0)
    {
      x.e("MicroMsg.WebviewJSSDKUtil", "data is null");
      return null;
    }
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    while (i < paramArrayList.size())
    {
      localJSONArray.put((String)paramArrayList.get(i));
      i += 1;
    }
    return localJSONArray.toString();
  }
  
  public static String V(ArrayList<String> paramArrayList)
  {
    if (paramArrayList.size() == 0)
    {
      x.e("MicroMsg.WebviewJSSDKUtil", "data is null");
      return "";
    }
    JSONStringer localJSONStringer = new JSONStringer();
    try
    {
      localJSONStringer.array();
      localJSONStringer.object();
      int i = 0;
      while (i < paramArrayList.size())
      {
        String str = (String)paramArrayList.get(i);
        localJSONStringer.key("localId");
        localJSONStringer.value(str);
        i += 1;
      }
      localJSONStringer.endObject();
      localJSONStringer.endArray();
      paramArrayList = localJSONStringer.toString();
      return paramArrayList;
    }
    catch (Exception paramArrayList)
    {
      x.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", paramArrayList, "", new Object[0]);
    }
    return "";
  }
  
  public static Intent bUn()
  {
    return new Intent("android.media.action.VIDEO_CAPTURE");
  }
  
  public static Intent bUo()
  {
    return new Intent("android.provider.MediaStore.RECORD_SOUND");
  }
  
  public static String c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (bi.oW(paramString1))
    {
      x.e("MicroMsg.WebviewJSSDKUtil", "parseVideoItemToJson localId is null");
      return "";
    }
    JSONStringer localJSONStringer = new JSONStringer();
    try
    {
      localJSONStringer.array();
      localJSONStringer.object();
      localJSONStringer.key("localId");
      localJSONStringer.value(paramString1);
      localJSONStringer.key("thumbLocalId");
      localJSONStringer.value(paramString2);
      localJSONStringer.key("duration");
      localJSONStringer.value(String.valueOf(paramInt1));
      localJSONStringer.key("height");
      localJSONStringer.value(String.valueOf(paramInt2));
      localJSONStringer.key("width");
      localJSONStringer.value(String.valueOf(paramInt3));
      localJSONStringer.key("size");
      localJSONStringer.value(String.valueOf(paramInt4));
      localJSONStringer.endObject();
      localJSONStringer.endArray();
      paramString1 = localJSONStringer.toString();
      return paramString1;
    }
    catch (Exception paramString1)
    {
      x.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", paramString1, "", new Object[0]);
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/model/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */