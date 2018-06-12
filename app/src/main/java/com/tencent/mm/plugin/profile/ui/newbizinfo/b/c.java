package com.tencent.mm.plugin.profile.ui.newbizinfo.b;

import com.tencent.mm.g.c.df;
import com.tencent.mm.protocal.c.ih;
import com.tencent.mm.protocal.c.ii;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends df
{
  public static c.a dzU;
  private List<b> juC;
  private List<d> lYV;
  private List<a> lZl;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[12];
    locala.columns = new String[13];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.sKA.put("username", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" username TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "username";
    locala.columns[1] = "originalArticleCount";
    locala.sKA.put("originalArticleCount", "INTEGER default '1' ");
    localStringBuilder.append(" originalArticleCount INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "friendSubscribeCount";
    locala.sKA.put("friendSubscribeCount", "INTEGER default '1' ");
    localStringBuilder.append(" friendSubscribeCount INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "allArticleWording";
    locala.sKA.put("allArticleWording", "TEXT");
    localStringBuilder.append(" allArticleWording TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "historyArticlesUrl";
    locala.sKA.put("historyArticlesUrl", "TEXT");
    localStringBuilder.append(" historyArticlesUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "userRole";
    locala.sKA.put("userRole", "INTEGER default '1' ");
    localStringBuilder.append(" userRole INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "banReason";
    locala.sKA.put("banReason", "TEXT");
    localStringBuilder.append(" banReason TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "showRecommendArticle";
    locala.sKA.put("showRecommendArticle", "INTEGER default '0' ");
    localStringBuilder.append(" showRecommendArticle INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "showService";
    locala.sKA.put("showService", "INTEGER default '0' ");
    localStringBuilder.append(" showService INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "messageListStr";
    locala.sKA.put("messageListStr", "TEXT");
    localStringBuilder.append(" messageListStr TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "serviceInfoListStr";
    locala.sKA.put("serviceInfoListStr", "TEXT");
    localStringBuilder.append(" serviceInfoListStr TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "bizAccountListStr";
    locala.sKA.put("bizAccountListStr", "TEXT");
    localStringBuilder.append(" bizAccountListStr TEXT");
    locala.columns[12] = "rowid";
    locala.sql = localStringBuilder.toString();
    dzU = locala;
  }
  
  private static List<d> JJ(String paramString)
  {
    localArrayList = new ArrayList();
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return localArrayList;
      try
      {
        paramString = new JSONArray(new JSONObject(paramString).optString("button_list"));
        int i = 0;
        while (i < paramString.length())
        {
          d locald = d.Y(paramString.getJSONObject(i));
          if (locald != null) {
            localArrayList.add(locald);
          }
          i += 1;
        }
        return localArrayList;
      }
      catch (JSONException paramString)
      {
        x.k("MicroMsg.ProfileInfo", "", new Object[] { paramString });
      }
    }
  }
  
  private static List<a> JK(String paramString)
  {
    localArrayList = new ArrayList();
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return localArrayList;
      try
      {
        paramString = new JSONArray(new JSONObject(paramString).optString("BizAccount"));
        int i = 0;
        while (i < paramString.length())
        {
          a locala = a.W(paramString.getJSONObject(i));
          if (locala != null) {
            localArrayList.add(locala);
          }
          i += 1;
        }
        return localArrayList;
      }
      catch (JSONException paramString)
      {
        x.k("MicroMsg.ProfileInfo", "", new Object[] { paramString });
      }
    }
  }
  
  private static List<b> JL(String paramString)
  {
    localArrayList = new ArrayList();
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return localArrayList;
      try
      {
        paramString = new JSONArray(new JSONObject(paramString).optString("ArticleInfo"));
        int i = 0;
        while (i < paramString.length())
        {
          b localb = b.X(paramString.getJSONObject(i));
          if (localb != null) {
            localArrayList.add(localb);
          }
          i += 1;
        }
        return localArrayList;
      }
      catch (JSONException paramString)
      {
        x.k("MicroMsg.ProfileInfo", "", new Object[] { paramString });
      }
    }
  }
  
  public static c a(String paramString, ih paramih)
  {
    c localc = new c();
    localc.field_username = paramString;
    paramString = paramih.rgX.iterator();
    while (paramString.hasNext())
    {
      paramih = (ii)paramString.next();
      if (paramih.riD.equals("OriginalArticleCount"))
      {
        localc.field_originalArticleCount = bi.getInt(paramih.mEl, -1);
      }
      else if (paramih.riD.equals("FriendSubscribeCount"))
      {
        localc.field_friendSubscribeCount = bi.getInt(paramih.mEl, -1);
      }
      else if (paramih.riD.equals("AllArticleWording"))
      {
        localc.field_allArticleWording = paramih.mEl;
      }
      else if (paramih.riD.equals("HistoryArticlesUrl"))
      {
        localc.field_historyArticlesUrl = paramih.mEl;
      }
      else if (paramih.riD.equals("ArticleList"))
      {
        localc.field_messageListStr = paramih.mEl;
        localc.juC = JL(localc.field_messageListStr);
      }
      else if (paramih.riD.equals("BizAccountList"))
      {
        localc.field_bizAccountListStr = paramih.mEl;
        localc.lZl = JK(localc.field_bizAccountListStr);
      }
      else if (paramih.riD.equals("MenuInfo"))
      {
        localc.field_serviceInfoListStr = paramih.mEl;
        localc.lYV = JJ(localc.field_serviceInfoListStr);
      }
      else if (paramih.riD.equals("UserRole"))
      {
        localc.field_userRole = bi.getInt(paramih.mEl, 0);
      }
      else if (paramih.riD.equals("BanReason"))
      {
        localc.field_banReason = paramih.mEl;
      }
      else if (paramih.riD.equals("ShowRecommendArticle"))
      {
        localc.field_showRecommendArticle = bi.getInt(paramih.mEl, 0);
      }
      else if (paramih.riD.equals("ShowService"))
      {
        localc.field_showService = bi.getInt(paramih.mEl, 0);
      }
    }
    return localc;
  }
  
  public final c.a AX()
  {
    return dzU;
  }
  
  public final boolean awi()
  {
    return this.field_userRole == 1;
  }
  
  public final List<b> bnM()
  {
    if (this.juC == null) {
      this.juC = JL(this.field_messageListStr);
    }
    return this.juC;
  }
  
  public final List<d> bnN()
  {
    if (this.lYV == null) {
      this.lYV = JJ(this.field_serviceInfoListStr);
    }
    return this.lYV;
  }
  
  public final boolean bnO()
  {
    return !bi.oW(this.field_allArticleWording);
  }
  
  public final boolean bnP()
  {
    return this.field_showRecommendArticle == 1;
  }
  
  public final boolean bnQ()
  {
    return this.field_showService == 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */