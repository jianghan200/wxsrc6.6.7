package com.tencent.mm.plugin.websearch;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.kx;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.f;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements f
{
  private void a(Context paramContext, int paramInt1, String paramString1, String paramString2, Map<String, String> paramMap, boolean paramBoolean, int paramInt2, String paramString3)
  {
    a(paramContext, paramInt1, paramString1, paramString2, paramMap, paramBoolean, paramInt2, paramString3, false);
  }
  
  private void a(final Context paramContext, final int paramInt1, final String paramString1, final String paramString2, final Map<String, String> paramMap, final boolean paramBoolean1, final int paramInt2, final String paramString3, final boolean paramBoolean2)
  {
    ((i)g.l(i.class)).a(paramContext, new Runnable()
    {
      public final void run()
      {
        boolean bool = false;
        if (!com.tencent.mm.plugin.websearch.api.p.zO(0))
        {
          x.e("StartWebSearchService", "fts h5 template not avail");
          return;
        }
        Object localObject1 = new JSONObject();
        String str;
        if (paramMap != null)
        {
          str = (String)paramMap.get("sugId");
          str = "0:" + str + ":" + paramString1 + ":";
        }
        try
        {
          ((JSONObject)localObject1).put("parentSearchID", str);
          localObject2 = String.valueOf(System.currentTimeMillis());
          str = com.tencent.mm.plugin.websearch.api.p.zK(paramInt1);
          com.tencent.mm.plugin.websearch.api.p.a((String)localObject2, paramString2, str, paramString1, paramInt1);
          kx localkx = new kx();
          localkx.bVh.scene = 0;
          a.sFg.m(localkx);
          localObject1 = com.tencent.mm.plugin.websearch.api.p.a(paramInt1, this.pKA, 0, Uri.encode(((JSONObject)localObject1).toString()), "", paramString2, paramString1, "", str, "", (String)localObject2);
          if (paramMap != null) {
            ((Map)localObject1).putAll(paramMap);
          }
        }
        catch (JSONException localJSONException)
        {
          try
          {
            ((Map)localObject1).put("query", com.tencent.mm.compatible.util.p.encode(paramString1, "UTF-8"));
            ((Map)localObject1).put("sessionId", paramString2);
            localObject1 = com.tencent.mm.plugin.websearch.api.p.v((Map)localObject1);
            Object localObject2 = com.tencent.mm.plugin.websearch.api.p.adR();
            ((Intent)localObject2).putExtra("ftsType", this.bpX);
            ((Intent)localObject2).putExtra("title", paramString3);
            ((Intent)localObject2).putExtra("ftsbizscene", paramInt1);
            ((Intent)localObject2).putExtra("ftsQuery", paramString1);
            if ((!TextUtils.isEmpty(paramString1)) || (paramBoolean2)) {
              bool = true;
            }
            ((Intent)localObject2).putExtra("ftsInitToSearch", bool);
            ((Intent)localObject2).putExtra("sessionId", paramString2);
            ((Intent)localObject2).putExtra("subSessionId", str);
            ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
            ((Intent)localObject2).putExtra("key_preload_biz", b.zH(paramInt1));
            if (paramBoolean1) {
              ((Intent)localObject2).putExtra("status_bar_style", "black");
            }
            if (paramInt2 != Integer.MAX_VALUE) {
              ((Intent)localObject2).putExtra("customize_status_bar_color", paramInt2);
            }
            ((Intent)localObject2).putExtra("key_load_js_without_delay", true);
            d.b(paramContext, "webview", ".ui.tools.fts.FTSSOSHomeWebViewUI", (Intent)localObject2);
            b.zI(paramInt1);
            return;
            localJSONException = localJSONException;
            x.k("StartWebSearchService", "", new Object[] { localJSONException });
          }
          catch (Exception localException)
          {
            for (;;)
            {
              ((Map)localObject1).put("query", paramString1);
            }
          }
        }
      }
    });
  }
  
  public static void bSD()
  {
    com.tencent.mm.plugin.websearch.api.p.fz(5000L);
  }
  
  public final void a(Context paramContext, int paramInt, String paramString1, String paramString2, Map<String, String> paramMap, String paramString3)
  {
    a(paramContext, paramInt, paramString1, paramString2, paramMap, false, Integer.MAX_VALUE, paramString3);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    a(paramContext, 36, paramString1, paramString2, paramMap, false, Integer.MAX_VALUE, "", true);
  }
  
  public final void b(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    a(paramContext, paramInt, paramString1, paramString2, null, "");
  }
  
  public final void b(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    a(paramContext, 3, paramString1, paramString2, paramMap, true, -1, "");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/websearch/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */