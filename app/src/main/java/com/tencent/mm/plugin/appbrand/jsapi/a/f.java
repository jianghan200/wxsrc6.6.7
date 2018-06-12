package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.protocal.c.ed;
import com.tencent.mm.protocal.c.ee;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f
  extends a
{
  public static final int CTRL_INDEX = 208;
  public static final String NAME = "requestAuthUserAutoFillData";
  
  public final void a(final p paramp, final JSONObject paramJSONObject, final int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData data is invalid");
      paramp.E(paramInt, f("fail:data is invalid", null));
      return;
    }
    LinkedList localLinkedList1 = new LinkedList();
    final Object localObject1 = paramJSONObject.optJSONArray("fields");
    int i;
    if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
    {
      i = 0;
      while (i < ((JSONArray)localObject1).length())
      {
        localLinkedList1.add(((JSONArray)localObject1).optString(i));
        i += 1;
      }
    }
    localObject1 = paramJSONObject.optString("wording");
    final int j = paramJSONObject.optInt("authStatus", 2);
    final LinkedList localLinkedList2 = new LinkedList();
    Object localObject2 = paramJSONObject.optJSONArray("authGroupList");
    if ((localObject2 != null) && (((JSONArray)localObject2).length() > 0))
    {
      i = 0;
      while (i < ((JSONArray)localObject2).length())
      {
        localLinkedList2.add("  " + ((JSONArray)localObject2).optString(i));
        i += 1;
      }
    }
    if (localLinkedList1.size() == 0)
    {
      x.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData fields is empty");
      paramp.E(paramInt, f("fail:fields is empty", null));
      return;
    }
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      x.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData wording is empty");
      paramp.E(paramInt, f("fail:wording is empty", null));
      return;
    }
    localObject2 = paramp.mAppId;
    x.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData appId:%s", new Object[] { localObject2 });
    x.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "wording:%s, authType:%d, fieldIds:%s", new Object[] { localObject1, Integer.valueOf(j), paramJSONObject.optJSONArray("fields").toString() });
    if (paramJSONObject.optJSONArray("authGroupList") != null) {
      x.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "authGroupList:%s", new Object[] { paramJSONObject.optJSONArray("authGroupList").toString() });
    }
    paramJSONObject = new b.a();
    paramJSONObject.dIG = new ed();
    paramJSONObject.dIH = new ee();
    paramJSONObject.uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/authinfo";
    paramJSONObject.dIF = 1183;
    paramJSONObject.dII = 0;
    paramJSONObject.dIJ = 0;
    paramJSONObject = paramJSONObject.KT();
    final ed localed = (ed)paramJSONObject.dID.dIL;
    localed.reJ = localLinkedList1;
    localed.bPS = ((String)localObject2);
    localed.reL = j;
    ah.A(new Runnable()
    {
      public final void run()
      {
        f localf = f.this;
        p localp = paramp;
        int i = paramInt;
        ed localed = localed;
        b localb = paramJSONObject;
        int j = j;
        Object localObject2 = localObject1;
        Object localObject3 = localLinkedList2;
        if (j == 2) {}
        String str2;
        String str3;
        View localView;
        Object localObject4;
        LinearLayout localLinearLayout;
        for (String str1 = localp.mContext.getString(s.j.app_brand_auth_user_auto_fill_data_dialog_title);; str1 = localp.mContext.getString(s.j.app_brand_auth_user_auto_fill_data_dialog_title_after_write))
        {
          str2 = localp.mContext.getString(s.j.app_brand_auth_user_auto_fill_data_dialog_yes);
          str3 = localp.mContext.getString(s.j.app_brand_auth_user_auto_fill_data_dialog_no);
          String str4 = localp.mContext.getString(s.j.app_brand_auth_user_auto_fill_data_dialog_know_detail);
          localObject1 = (LayoutInflater)localp.mContext.getSystemService("layout_inflater");
          localView = ((LayoutInflater)localObject1).inflate(s.h.app_brand_auto_user_auto_fill_data, null);
          TextView localTextView = (TextView)localView.findViewById(s.g.app_brand_auth_auto_fill_data_content);
          localObject4 = (TextView)localView.findViewById(s.g.app_brand_auth_auto_fill_data_know_detail);
          localLinearLayout = (LinearLayout)localView.findViewById(s.g.app_brand_auth_auto_fill_data_list);
          localTextView.setText((CharSequence)localObject2);
          ((TextView)localObject4).setText(str4);
          ((TextView)localObject4).setOnClickListener(new f.2(localf, localp));
          localLinearLayout.removeAllViews();
          if ((localObject3 == null) || (((LinkedList)localObject3).size() <= 0)) {
            break;
          }
          localLinearLayout.setVisibility(0);
          localObject2 = ((LinkedList)localObject3).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject4 = (String)((Iterator)localObject2).next();
            localObject3 = (TextView)((LayoutInflater)localObject1).inflate(s.h.app_brand_auth_auto_fill_data_list_item, null);
            ((TextView)localObject3).setText((CharSequence)localObject4);
            localObject4 = new LinearLayout.LayoutParams(-1, -2);
            ((LinearLayout.LayoutParams)localObject4).bottomMargin = localp.getContentView().getResources().getDimensionPixelOffset(s.e.app_brand_auth_auto_fill_data_know_list_item_bottom_margin);
            ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
            localLinearLayout.addView((View)localObject3);
          }
        }
        Object localObject1 = (LinearLayout.LayoutParams)((TextView)localObject4).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).leftMargin = 0;
        ((TextView)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        localLinearLayout.setVisibility(8);
        x.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "show the auto fill data protocol dialog!");
        h.a(localp.mContext, false, str1, localView, str2, str3, new f.3(localf, localed, localp, i, localb), new f.4(localf, localed, localp, i, localb));
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */