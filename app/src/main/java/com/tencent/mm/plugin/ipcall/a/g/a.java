package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class a
{
  private static String TAG = "MicroMsg.IPCallActivityMsgInfo";
  public String bHD = "";
  public int hcE = 0;
  public String jOS = "";
  public String ksv = "";
  public String ksw = "";
  
  public static a EN(String paramString)
  {
    x.d(TAG, "getIPCallActivityMsgInfoFromXML:" + paramString);
    a locala = new a();
    int i = paramString.indexOf("<ActivityInfo");
    if (i == -1)
    {
      x.e(TAG, "msgContent not start with <ActivityInfo");
      return locala;
    }
    Map localMap = bl.z(paramString.substring(i), "ActivityInfo");
    if (localMap == null)
    {
      x.e(TAG, "XmlParser values is null, xml %s", new Object[] { paramString });
      return null;
    }
    if (localMap.containsKey(".ActivityInfo.Title")) {
      locala.bHD = ((String)localMap.get(".ActivityInfo.Title"));
    }
    if (localMap.containsKey(".ActivityInfo.Desc")) {
      locala.jOS = ((String)localMap.get(".ActivityInfo.Desc"));
    }
    if (localMap.containsKey(".ActivityInfo.ImgUrl")) {
      locala.ksv = ((String)localMap.get(".ActivityInfo.ImgUrl"));
    }
    if (localMap.containsKey(".ActivityInfo.StartBtnText")) {
      locala.ksw = ((String)localMap.get(".ActivityInfo.StartBtnText"));
    }
    if (localMap.containsKey(".ActivityInfo.ActivityType")) {
      locala.hcE = bi.getInt((String)localMap.get(".ActivityInfo.ActivityType"), 0);
    }
    x.d(TAG, "msgInfo:", new Object[] { locala.toString() });
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */