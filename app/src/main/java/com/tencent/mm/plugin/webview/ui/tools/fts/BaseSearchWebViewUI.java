package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.plugin.websearch.api.o;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.plugin.webview.fts.a.1;
import com.tencent.mm.plugin.webview.fts.a.2;
import com.tencent.mm.plugin.webview.fts.a.3;
import com.tencent.mm.plugin.webview.fts.a.4;
import com.tencent.mm.plugin.webview.fts.a.a;
import com.tencent.mm.plugin.webview.fts.c.b.a;
import com.tencent.mm.plugin.webview.fts.c.b.b;
import com.tencent.mm.plugin.webview.model.aa;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.30;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.32;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.36;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseSearchWebViewUI
  extends LoadDataWebviewUI
  implements b.b
{
  protected String bWm;
  protected String fuu;
  private View gmj;
  private com.tencent.mm.plugin.webview.fts.c.b qdA;
  private Set<b.a> qdB = new HashSet();
  protected int qdC;
  protected int qdD;
  protected String qdE;
  protected List<Runnable> qdF;
  protected boolean qdz;
  protected int scene;
  protected int type;
  
  private static int Y(Bundle paramBundle)
  {
    return bi.WU(paramBundle.getString("playerId"));
  }
  
  private void Z(Bundle paramBundle)
  {
    Object localObject1 = new ArrayList();
    String str1 = paramBundle.getString("title");
    String str2 = paramBundle.getString("desc");
    Object localObject2 = paramBundle.getString("items");
    try
    {
      JSONArray localJSONArray = new JSONArray((String)localObject2);
      i = 0;
      if (i < localJSONArray.length())
      {
        localObject3 = localJSONArray.optJSONObject(i);
        aa localaa;
        if (localObject3 != null)
        {
          localaa = new aa();
          localaa.iconUrl = ((JSONObject)localObject3).optString("icon");
          localaa.title = ((JSONObject)localObject3).optString("title");
          if (((JSONObject)localObject3).optInt("selected") != 1) {
            break label149;
          }
        }
        label149:
        for (boolean bool = true;; bool = false)
        {
          localaa.eQK = bool;
          localaa.desc = ((JSONObject)localObject3).optString("desc");
          ((List)localObject1).add(localaa);
          i += 1;
          break;
        }
      }
      localObject2 = com.tencent.mm.plugin.webview.fts.a.bTE();
    }
    catch (JSONException localJSONException)
    {
      x.e("BaseSearchWebViewUI", bi.i(localJSONException));
      x.v("BaseSearchWebViewUI", "doShowSearchActionSheet args: title %s,subTitle %s,items %s", new Object[] { str1, str2, localObject2 });
      if (((List)localObject1).isEmpty()) {
        break label403;
      }
    }
    Object localObject3 = new a.a()
    {
      public final void eh(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald;
        if (BaseSearchWebViewUI.b(BaseSearchWebViewUI.this) != null)
        {
          locald = BaseSearchWebViewUI.c(BaseSearchWebViewUI.this);
          if (!locald.qhq) {
            x.e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, not ready");
          }
        }
        else
        {
          return;
        }
        x.i("MicroMsg.JsApiHandler", "onSearchActionSheetClick success, ready");
        HashMap localHashMap = new HashMap();
        localHashMap.put("index", Integer.valueOf(paramAnonymousInt1));
        localHashMap.put("actionSheetId", Integer.valueOf(paramAnonymousInt2));
        ah.A(new d.30(locald, i.a.a("onSearchActionSheetClick", localHashMap, locald.qhs, locald.qht)));
      }
    };
    com.tencent.mm.ui.widget.a.d locald = new com.tencent.mm.ui.widget.a.d(this, 2, true);
    int i = locald.hashCode();
    locald.uAx = new a.1((com.tencent.mm.plugin.webview.fts.a)localObject2, (List)localObject1);
    locald.ofp = new a.2((com.tencent.mm.plugin.webview.fts.a)localObject2, (List)localObject1, locald);
    locald.ofq = new a.3((com.tencent.mm.plugin.webview.fts.a)localObject2, (a.a)localObject3, i);
    locald.uJQ = new a.4((com.tencent.mm.plugin.webview.fts.a)localObject2, (a.a)localObject3, i);
    localObject1 = View.inflate(this, R.i.search_action_sheet_title, null);
    if (!TextUtils.isEmpty(str1))
    {
      ((TextView)((View)localObject1).findViewById(R.h.title)).setText(str1);
      if (TextUtils.isEmpty(str2)) {
        break label420;
      }
      ((TextView)((View)localObject1).findViewById(R.h.sub_title)).setText(str2);
    }
    for (;;)
    {
      locald.uKi = true;
      locald.dS((View)localObject1);
      locald.bXO();
      ((com.tencent.mm.plugin.webview.fts.a)localObject2).pNK.put(Integer.valueOf(i), locald);
      paramBundle.putInt("actionSheetId", i);
      label403:
      return;
      ((View)localObject1).findViewById(R.h.title).setVisibility(8);
      break;
      label420:
      ((View)localObject1).findViewById(R.h.sub_title).setVisibility(8);
    }
  }
  
  private void bXs()
  {
    if ((this.qdF != null) && (!this.qdF.isEmpty()))
    {
      Object localObject = new ArrayList(this.qdF);
      x.i("BaseSearchWebViewUI", "jsapi ready callback, running jsapi count %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
      this.qdF.clear();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Runnable localRunnable = (Runnable)((Iterator)localObject).next();
        if (localRunnable != null) {
          localRunnable.run();
        }
      }
    }
  }
  
  protected final void I(Runnable paramRunnable)
  {
    if ((this.pNV != null) && (this.pNV.qhq))
    {
      paramRunnable.run();
      return;
    }
    x.i("BaseSearchWebViewUI", "jsapi not ready, waiting");
    if (this.qdF == null) {
      this.qdF = new ArrayList();
    }
    this.qdF.add(paramRunnable);
  }
  
  public final void a(b.a parama)
  {
    this.qdB.add(parama);
  }
  
  public void ant()
  {
    super.ant();
    this.qdA.pNV = this.pNV;
    if ((this.pNV != null) && (!this.pNV.qhq)) {
      this.pNV.a(new d.a()
      {
        public final void onReady()
        {
          BaseSearchWebViewUI.a(BaseSearchWebViewUI.this);
          x.d("BaseSearchWebViewUI", "jsapi ready");
          int i = BaseSearchWebViewUI.this.scene;
          String str = BaseSearchWebViewUI.this.bJK;
          str = BaseSearchWebViewUI.this.bWr;
        }
      });
    }
    while (this.gcO != null)
    {
      try
      {
        this.gcO.g(51, new Bundle());
        return;
      }
      catch (RemoteException localRemoteException)
      {
        x.printErrStackTrace("BaseSearchWebViewUI", localRemoteException, "", new Object[0]);
        return;
      }
      bXs();
      x.d("BaseSearchWebViewUI", "jsapi ready");
    }
    x.i("BaseSearchWebViewUI", "invoker is null, fail to invoke get geo");
  }
  
  protected void b(int paramInt, String paramString, Map<String, Object> paramMap) {}
  
  public final void bTT()
  {
    if (this.gmj == null) {}
    for (;;)
    {
      return;
      Object localObject = (ViewGroup)getWindow().getDecorView();
      ((ViewGroup)localObject).setSystemUiVisibility(0);
      ((ViewGroup)localObject).removeView(this.gmj);
      getWindow().clearFlags(1024);
      if (getRequestedOrientation() == 0) {
        setRequestedOrientation(1);
      }
      this.gmj = null;
      localObject = this.qdB.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((b.a)((Iterator)localObject).next()).ajd();
      }
    }
  }
  
  protected com.tencent.mm.plugin.webview.fts.b bXn()
  {
    return null;
  }
  
  protected final void bXr()
  {
    super.bXr();
    int i = this.scene;
    String str1 = this.bJK;
    String str2 = this.bWr;
    if (this.type == 0) {}
    for (boolean bool = true;; bool = false)
    {
      String str3 = this.bWm;
      int j = this.type;
      o.a(12, i, str1, str2, "", 0, bool, "", true, str3, this.qdE, j, this.qeP);
      return;
    }
  }
  
  public void j(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      super.j(paramInt, paramBundle);
    case 135: 
    case 137: 
    case 133: 
    case 134: 
    case 100002: 
    case 200000: 
    case 200001: 
    case 200002: 
    case 200003: 
      label517:
      do
      {
        do
        {
          do
          {
            do
            {
              for (;;)
              {
                return;
                b(paramBundle.getInt("FTS_KEY_onStartWebSearch_type", 0), paramBundle.getString("FTS_KEY_onStartWebSearch_query"), (Map)paramBundle.getSerializable("FTS_KEY_onStartWebSearch_params"));
                return;
                paramBundle = paramBundle.getString("fts_key_json_data");
                if (this.pNV != null)
                {
                  try
                  {
                    localObject1 = this.pNV;
                    ah.A(new d.32((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1, i.a.a("onGetMatchContactList", new JSONObject(paramBundle), ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).qhs, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).qht)));
                    return;
                  }
                  catch (JSONException paramBundle)
                  {
                    x.printErrStackTrace("BaseSearchWebViewUI", paramBundle, "", new Object[0]);
                    return;
                  }
                  Z(paramBundle);
                  return;
                  localObject1 = com.tencent.mm.plugin.webview.fts.a.bTE();
                  paramInt = paramBundle.getInt("actionSheetId");
                  paramBundle = (com.tencent.mm.ui.widget.a.d)((com.tencent.mm.plugin.webview.fts.a)localObject1).pNK.remove(Integer.valueOf(paramInt));
                  if (paramBundle != null)
                  {
                    paramBundle.bzW();
                    return;
                    localObject1 = bXn();
                    if (localObject1 == null) {
                      break label517;
                    }
                    paramInt = paramBundle.getInt("x", -1);
                    int i = paramBundle.getInt("y", -1);
                    localObject2 = paramBundle.getString("widgetId");
                    paramBundle = paramBundle.getString("eventId");
                    x.v("FTSSearchWidgetMgr", "tapSearchWAWidgetView x %d, y %d, widgetId %s, eventId %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), localObject2, paramBundle });
                    Object localObject3 = (View)((com.tencent.mm.plugin.webview.fts.b)localObject1).pNP.get(localObject2);
                    if (localObject3 == null) {
                      break;
                    }
                    localObject3 = ((com.tencent.mm.plugin.webview.fts.b)localObject1).pNU.bC((View)localObject3);
                    com.tencent.mm.plugin.webview.fts.a.a.b localb = new com.tencent.mm.plugin.webview.fts.a.a.b(paramInt, i, paramBundle);
                    if (localObject3 == null) {
                      x.e("BaseJsapiEvent", "null JSBridgeAccessible ");
                    }
                    for (boolean bool = false; !bool; bool = ((l)localObject3).Y(localb.getName(), localb.bTM()))
                    {
                      x.i("FTSSearchWidgetMgr", "onTap fail: exec js event %s ", new Object[] { localObject2 });
                      ((com.tencent.mm.plugin.webview.fts.b)localObject1).pNV.a(paramBundle, false, "onTap fail: exec js event  " + (String)localObject2, (String)localObject2);
                      return;
                    }
                  }
                }
              }
              x.i("FTSSearchWidgetMgr", "onTap fail: can not find Widget by widgetId %s", new Object[] { localObject2 });
              ((com.tencent.mm.plugin.webview.fts.b)localObject1).pNV.a(paramBundle, false, "onTap fail: can not find Widget by widgetId " + (String)localObject2, (String)localObject2);
              return;
              x.e("BaseSearchWebViewUI", "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView");
              this.pNV.a(paramBundle.getString(""), false, "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView", paramBundle.getString("widgetId"));
              return;
              localObject1 = this.qdA;
            } while (localObject1 == null);
            ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).w(Y(paramBundle), paramBundle.getString("viewProps"), paramBundle.getString("videoProps"));
            return;
            localObject1 = this.qdA;
          } while (localObject1 == null);
          ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).x(Y(paramBundle), paramBundle.getString("viewProps"), paramBundle.getString("videoProps"));
          return;
          localObject1 = this.qdA;
        } while (localObject1 == null);
        ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).Ak(Y(paramBundle));
        return;
        localObject1 = this.qdA;
      } while (localObject1 == null);
      ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).aT(Y(paramBundle), paramBundle.getString("type"));
      return;
    }
    Object localObject1 = this.pNV;
    if (!((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).qhq)
    {
      x.e("MicroMsg.JsApiHandler", "onGetPoiInfo fail, not ready");
      return;
    }
    x.i("MicroMsg.JsApiHandler", "onGetPoiInfo success, ready");
    Object localObject2 = new HashMap();
    ((Map)localObject2).put("json", paramBundle.getString("json"));
    ((Map)localObject2).put("searchId", paramBundle.getString("searchId"));
    ((Map)localObject2).put("poiId", paramBundle.getString("poiId"));
    ah.A(new d.36((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1, i.a.a("onGetPoiInfoReturn", (Map)localObject2, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).qhs, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).qht)));
  }
  
  public final void k(View paramView, boolean paramBoolean)
  {
    bTT();
    this.gmj = paramView;
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    ViewGroup localViewGroup = (ViewGroup)getWindow().getDecorView();
    localViewGroup.addView(paramView, localLayoutParams);
    paramView.setX(0.0F);
    paramView.setY(0.0F);
    if (com.tencent.mm.compatible.util.d.fS(19)) {
      localViewGroup.setSystemUiVisibility(2);
    }
    for (;;)
    {
      getWindow().addFlags(1024);
      if (paramBoolean) {
        setRequestedOrientation(0);
      }
      return;
      localViewGroup.setSystemUiVisibility(4098);
    }
  }
  
  public void onBackPressed()
  {
    Iterator localIterator = this.qdB.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = ((b.a)localIterator.next()).agV() | bool) {}
    if (!bool) {
      super.onBackPressed();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() != null) {
      this.qdz = getIntent().getBooleanExtra("jumpto_sns_contact_page", false);
    }
    this.qdA = new com.tencent.mm.plugin.webview.fts.c.b(this.mController.tml, this.mhH, this);
    this.scene = getIntent().getIntExtra("ftsbizscene", 0);
    this.qdC = this.scene;
    this.type = getIntent().getIntExtra("ftsType", 0);
    this.bWm = getIntent().getStringExtra("ftsQuery");
    this.qdE = getIntent().getStringExtra("tabId");
    this.fuu = getIntent().getStringExtra("searchId");
    this.qdD = this.type;
    int i = this.scene;
    paramBundle = this.bJK;
    String str1 = this.bWr;
    if (this.type == 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      String str2 = this.bWm;
      int j = this.type;
      String str3 = this.qdE;
      boolean bool2 = this.qeP;
      o.a(1, i, paramBundle, str1, this.fuu, 0, bool1, "", true, str2, str3, j, bool2);
      if (p.j(this, this.scene)) {
        break;
      }
      x.i("BaseSearchWebViewUI", "request for grant location permission");
      return;
    }
    x.i("BaseSearchWebViewUI", "has location permission");
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.qdB.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((b.a)((Iterator)localObject).next()).onDestroy();
    }
    this.qdB.clear();
    int i = this.scene;
    localObject = this.bJK;
    String str = this.bWr;
    if (this.type == 0) {}
    for (boolean bool = true;; bool = false)
    {
      o.a(14, i, (String)localObject, str, "", 0, bool, "", true, this.bWm, "", this.type, this.qeP);
      x.d("BaseSearchWebViewUI", "onDestroy");
      return;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    Iterator localIterator;
    if (paramInt == 25)
    {
      localIterator = this.qdB.iterator();
      while (localIterator.hasNext()) {
        ((b.a)localIterator.next()).bIu();
      }
    }
    if (paramInt == 24)
    {
      localIterator = this.qdB.iterator();
      while (localIterator.hasNext()) {
        ((b.a)localIterator.next()).bTS();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    Iterator localIterator = this.qdB.iterator();
    while (localIterator.hasNext()) {
      ((b.a)localIterator.next()).agK();
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("BaseSearchWebViewUI", "onRequestPermissionsResult, granted ? %d", new Object[] { Integer.valueOf(paramArrayOfInt[0]) });
  }
  
  protected void onResume()
  {
    super.onResume();
    Iterator localIterator = this.qdB.iterator();
    while (localIterator.hasNext()) {
      ((b.a)localIterator.next()).agL();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */