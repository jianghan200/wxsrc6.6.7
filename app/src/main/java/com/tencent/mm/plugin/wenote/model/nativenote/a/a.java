package com.tencent.mm.plugin.wenote.model.nativenote.a;

import android.text.Html;
import android.text.Spanned;
import android.text.style.ParagraphStyle;
import com.tencent.mm.a.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  private static String TAG = "MicroMsg.ConvertHtmlToSpanned";
  private static f<String, Spanned> qpx = new f(30);
  public static Spanned qpy = null;
  
  public static Spanned Sk(String paramString)
  {
    Object localObject = paramString;
    if (paramString == null) {
      localObject = "";
    }
    paramString = Pattern.compile("\n", 2).matcher((CharSequence)localObject).replaceAll("<br/>");
    localObject = fromHtml(paramString);
    qpx.put(paramString, localObject);
    return (Spanned)localObject;
  }
  
  private static Spanned fromHtml(String paramString)
  {
    String str = paramString;
    if (!paramString.startsWith("<html>")) {
      str = "<html>" + paramString;
    }
    paramString = str;
    if (!str.endsWith("</html>")) {
      paramString = str + "</html>";
    }
    try
    {
      qpy = null;
      paramString = Html.fromHtml(paramString, null, new c());
      if (paramString == null) {
        return null;
      }
    }
    catch (Throwable paramString)
    {
      for (;;)
      {
        if (qpy != null)
        {
          paramString = qpy;
          continue;
          int i = paramString.toString().length();
          if ((i > 1) && (paramString.toString().endsWith("\n")))
          {
            if (paramString.getSpans(i, i, ParagraphStyle.class).length > 0) {
              return (Spanned)paramString.subSequence(0, i - 1);
            }
            return paramString;
          }
          return paramString;
        }
        else
        {
          paramString = null;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */