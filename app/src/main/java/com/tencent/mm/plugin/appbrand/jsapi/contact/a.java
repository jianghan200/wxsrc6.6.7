package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.ContentValues;
import com.tencent.mm.plugin.appbrand.appstorage.f;
import com.tencent.mm.plugin.appbrand.appstorage.f.a;
import com.tencent.mm.plugin.appbrand.appstorage.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import java.util.ArrayList;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 226;
  public static final String NAME = "addPhoneContact";
  private f fPg;
  
  private static void a(ArrayList<ContentValues> paramArrayList, f.a parama, int paramInt)
  {
    if ((parama != null) && (parama.acD().length() > 0))
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
      localContentValues.put("data1", parama.acD());
      localContentValues.put("data9", parama.fkE);
      localContentValues.put("data2", Integer.valueOf(paramInt));
      paramArrayList.add(localContentValues);
    }
  }
  
  private static void b(ArrayList<ContentValues> paramArrayList, String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
    localContentValues.put("data1", paramString);
    localContentValues.put("data2", Integer.valueOf(paramInt));
    paramArrayList.add(localContentValues);
  }
  
  private static f.a d(JSONObject paramJSONObject, String paramString)
  {
    return new f.a(paramJSONObject.optString(paramString + "Country"), paramJSONObject.optString(paramString + "State"), paramJSONObject.optString(paramString + "City"), paramJSONObject.optString(paramString + "Street"), paramJSONObject.optString(paramString + "PostalCode"));
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiAddPhoneContact", "addPhoneContact!");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail:data is null", null));
      x.e("MicroMsg.JsApiAddPhoneContact", "data is null");
      return;
    }
    if (bi.oW(paramJSONObject.optString("firstName")))
    {
      paraml.E(paramInt, f("fail:firstName is null", null));
      x.e("MicroMsg.JsApiAddPhoneContact", "firstName is null");
      return;
    }
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      x.e("MicroMsg.JsApiAddPhoneContact", "mmActivity is null, invoke fail!");
      return;
    }
    this.fPg = new f();
    this.fPg.fkq = paramJSONObject.optString("photoFilePath");
    this.fPg.bgn = paramJSONObject.optString("nickName");
    Object localObject = new f.b(paramJSONObject.optString("firstName"), paramJSONObject.optString("middleName"), paramJSONObject.optString("lastName"));
    this.fPg.fkp = ((f.b)localObject);
    this.fPg.fky = paramJSONObject.optString("remark");
    this.fPg.fku = paramJSONObject.optString("mobilePhoneNumber");
    this.fPg.fkC = paramJSONObject.optString("weChatNumber");
    this.fPg.fkt = d(paramJSONObject, "address");
    this.fPg.fkz = paramJSONObject.optString("organization");
    this.fPg.title = paramJSONObject.optString("title");
    this.fPg.fkA = paramJSONObject.optString("workFaxNumber");
    this.fPg.fkx = paramJSONObject.optString("workPhoneNumber");
    this.fPg.fkw = paramJSONObject.optString("hostNumber");
    this.fPg.csD = paramJSONObject.optString("email");
    this.fPg.url = paramJSONObject.optString("url");
    this.fPg.fks = d(paramJSONObject, "workAddress");
    this.fPg.fkB = paramJSONObject.optString("homeFaxNumber");
    this.fPg.fkv = paramJSONObject.optString("homePhoneNumber");
    this.fPg.fkr = d(paramJSONObject, "homeAddress");
    localMMActivity.geJ = new a.2(this, paraml, paramInt);
    localObject = paraml.mAppId;
    paraml = localMMActivity.getString(s.j.app_brand_phone_contact_add_new_contact);
    paramJSONObject = localMMActivity.getString(s.j.app_brand_phone_contact_add_exist_contact);
    localObject = new a.1(this, localMMActivity, (String)localObject);
    h.a(localMMActivity, "", new String[] { paraml, paramJSONObject }, "", (h.c)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/contact/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */