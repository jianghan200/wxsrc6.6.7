package com.tencent.mm.au;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.appbrand.q.n;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  public static int a(JSONObject paramJSONObject, String paramString, Context paramContext)
  {
    if (paramJSONObject == null) {}
    for (int i = 0;; i = paramJSONObject.optInt("businessType"))
    {
      int j = i;
      if (i == 0)
      {
        if (!paramString.equals(paramContext.getString(R.l.search_education_article))) {
          break;
        }
        j = 2;
      }
      return j;
    }
    if (paramString.equals(paramContext.getString(R.l.search_education_timeline))) {
      return 8;
    }
    if (paramString.equals(paramContext.getString(R.l.search_education_biz_contact))) {
      return 1;
    }
    x.i("MicroMsg.FTS.FTSExportLogic", "option " + paramString + " no type");
    return i;
  }
  
  public static boolean at(String paramString1, String paramString2)
  {
    int i = 0;
    boolean bool = false;
    if (paramString1 == paramString2) {
      bool = true;
    }
    while (TextUtils.isEmpty(paramString1)) {
      return bool;
    }
    if (paramString1.startsWith(paramString2)) {
      return true;
    }
    if (TextUtils.isEmpty(paramString1)) {}
    StringBuilder localStringBuilder;
    for (paramString1 = "";; paramString1 = localStringBuilder.toString())
    {
      return paramString1.startsWith(paramString2);
      localStringBuilder = new StringBuilder(paramString1.length());
      while (i < paramString1.length())
      {
        localStringBuilder.append(SpellMap.g(paramString1.charAt(i)));
        i += 1;
      }
    }
  }
  
  public static Drawable b(int paramInt, Context paramContext)
  {
    int i = R.k.sos_search_icon;
    switch (paramInt)
    {
    default: 
      paramInt = i;
    }
    for (;;)
    {
      return paramContext.getResources().getDrawable(paramInt);
      paramInt = R.k.sos_offical_icon;
      continue;
      paramInt = R.k.sos_moments_icon;
      continue;
      paramInt = R.k.sos_article_icon;
      continue;
      paramInt = R.k.sos_mini_program_icon;
      continue;
      paramInt = R.k.sos_emoji_icon;
      continue;
      paramInt = R.k.sos_music_icon;
      continue;
      paramInt = R.k.sos_novel_icon;
      continue;
      paramInt = R.k.sos_video_icon;
      continue;
      paramInt = R.k.sos_wiki_icon;
      continue;
      paramInt = R.k.sos_question_icon;
    }
  }
  
  public static String b(int paramInt, Map<String, String> paramMap)
  {
    switch (paramInt)
    {
    default: 
      return p.v(paramMap);
    case 201: 
      return n.v(paramMap);
    }
    return p.c(paramMap, 1);
  }
  
  public static Map<String, String> bn(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return p.b(paramInt1, false, paramInt2);
    }
    return n.b(paramInt1, false, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/au/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */