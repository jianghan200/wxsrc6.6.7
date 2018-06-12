package com.tencent.mm.plugin.wenote.b;

import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  public static ArrayList<String> So(String paramString)
  {
    if ((bi.oW(paramString)) || (paramString.length() == 0)) {
      return null;
    }
    paramString = Pattern.compile("<div><object[^>]*></object></div>", 2).matcher(paramString).replaceAll("<object>");
    paramString = Pattern.compile("<object[^>]*>", 2).matcher(paramString).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#");
    paramString = Pattern.compile("<hr[^>]*>", 2).matcher(paramString).replaceAll("#WNNoteNode#<ThisisNoteNodeHrObj>#WNNoteNode#");
    paramString = Pattern.compile("</object>", 2).matcher(paramString).replaceAll("");
    paramString = Pattern.compile("<div></div>", 2).matcher(paramString).replaceAll("");
    String[] arrayOfString = Pattern.compile("\n", 2).matcher(paramString).replaceAll("").replaceAll("<br>", "<br/>").trim().split("#WNNoteNode#");
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < arrayOfString.length)
    {
      paramString = arrayOfString[i];
      if (paramString.length() > 0)
      {
        String str = paramString.replace("</div>", "<div>");
        int j = -1;
        if (str.endsWith("<div>")) {
          j = str.lastIndexOf("<div>");
        }
        paramString = str;
        if (j > 0) {
          paramString = str.substring(0, j);
        }
        localArrayList.add(paramString.replace("<div><br/>", "<div>"));
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public static String Sp(String paramString)
  {
    if ((bi.oW(paramString)) || (paramString.length() == 0)) {
      return paramString;
    }
    paramString = Pattern.compile("<br[^>]*>", 2).matcher(paramString).replaceAll("\n");
    paramString = Pattern.compile("<div>", 2).matcher(paramString).replaceAll("");
    paramString = Pattern.compile("</wx-li>", 2).matcher(paramString).replaceAll("\n");
    paramString = Pattern.compile("</wx-todo>", 2).matcher(paramString).replaceAll("\n");
    paramString = Pattern.compile("<hr[^>]*>", 2).matcher(paramString).replaceAll("\n");
    paramString = Pattern.compile("<p [^>]*>", 2).matcher(paramString).replaceAll("");
    paramString = Pattern.compile("</p>", 2).matcher(paramString).replaceAll("");
    paramString = Pattern.compile("<[^>]*>", 2).matcher(paramString).replaceAll("");
    return Pattern.compile("&nbsp;", 2).matcher(paramString).replaceAll(" ");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wenote/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */