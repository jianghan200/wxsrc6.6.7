package com.tencent.mm.plugin.websearch.c.a;

import android.content.Context;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.websearch.a.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends a<l>
{
  public boolean bHx;
  private List<l> jsx;
  private List<String> pNe;
  
  public d(String paramString, List<String> paramList)
  {
    super(paramString);
    this.pNe = paramList;
  }
  
  public final void cL(List<l> paramList)
  {
    this.jsx = paramList;
    if (this.jsx != null)
    {
      paramList = new ArrayList(this.pNe.size());
      Iterator localIterator = this.jsx.iterator();
      while (localIterator.hasNext())
      {
        l locall = (l)localIterator.next();
        ab localab = ((i)g.l(i.class)).FR().Yg(locall.jrv);
        i = this.pNe.indexOf(localab.field_username);
        if (i >= 0)
        {
          if (i < paramList.size()) {
            paramList.add(i, locall);
          }
          for (;;)
          {
            localIterator.remove();
            break;
            paramList.add(locall);
          }
        }
      }
      int i = paramList.size() - 1;
      while (i >= 0)
      {
        this.jsx.add(0, paramList.get(i));
        i -= 1;
      }
    }
    this.bHx = true;
  }
  
  public final JSONObject eg(int paramInt1, int paramInt2)
  {
    JSONObject localJSONObject1 = new JSONObject();
    if (!this.bHx) {
      return localJSONObject1;
    }
    if ((paramInt1 < 0) || (paramInt2 <= 0)) {
      return localJSONObject1;
    }
    paramInt2 = paramInt1 + paramInt2 - 1;
    if (paramInt2 > this.jsx.size() - 1) {
      paramInt2 = this.jsx.size() - 1;
    }
    while (paramInt2 < paramInt1) {
      return localJSONObject1;
    }
    for (;;)
    {
      JSONObject localJSONObject2;
      try
      {
        if (paramInt2 != this.jsx.size() - 1) {
          break label554;
        }
        i = 0;
        localJSONObject1.put("continueFlag", i);
        localJSONObject1.put("offset", paramInt2 + 1);
        localJSONObject1.put("query", this.bWm);
        localJSONObject1.put("ret", 0);
        localJSONObject2 = new JSONObject();
        localJSONObject2.put("count", paramInt2 - paramInt1 + 1);
        localJSONObject2.put("totalCount", s.Hw());
        JSONArray localJSONArray2 = new JSONArray();
        if (paramInt1 <= paramInt2)
        {
          Object localObject1 = (l)this.jsx.get(paramInt1);
          JSONObject localJSONObject3 = new JSONObject();
          Object localObject2 = ((i)g.l(i.class)).FR().Yg(((l)localObject1).jrv);
          localJSONObject3.put("userName", ((ai)localObject2).field_username);
          localJSONObject3.put("nickName", ((ai)localObject2).field_nickname);
          String str = ((l)localObject1).content;
          Context localContext = ad.getContext();
          str = str.replaceFirst(this.bWm, "<em class=\\\"highlight\\\">" + this.bWm + "</em>");
          i = ((l)localObject1).jru;
          localObject1 = str;
          switch (i)
          {
          default: 
            localObject1 = "";
          }
          try
          {
            localJSONObject3.put("displayText", localObject1);
            localObject1 = "";
            localObject2 = q.KH().kc(((ai)localObject2).field_username);
            if (localObject2 != null)
            {
              str = ((j)localObject2).Ky();
              localObject1 = str;
              if (bi.oW(str)) {
                localObject1 = ((j)localObject2).Kx();
              }
            }
            localJSONObject3.put("thumbUrl", localObject1);
            localJSONArray2.put(localJSONObject3);
            paramInt1 += 1;
            continue;
            localObject1 = localContext.getString(a.a.search_contact_tag_wxid);
            localObject1 = (String)localObject1 + str;
            continue;
          }
          catch (JSONException localJSONException1)
          {
            x.printErrStackTrace("JsapiFtsMatchContact", localJSONException1, "", new Object[0]);
            continue;
          }
        }
        localJSONObject2.put("items", localJSONArray2);
      }
      catch (JSONException localJSONException2)
      {
        x.printErrStackTrace("JsapiFtsMatchContact", localJSONException2, "", new Object[0]);
        return localJSONObject1;
      }
      JSONArray localJSONArray1 = new JSONArray();
      localJSONArray1.put(localJSONObject2);
      localJSONObject1.put("data", localJSONArray1);
      continue;
      label554:
      int i = 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/websearch/c/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */