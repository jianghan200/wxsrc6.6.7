package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 414;
  public static final String NAME = "searchContacts";
  private List<String[]> fPD;
  
  private static boolean bo(String paramString1, String paramString2)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)))
    {
      x.e("MicroMsg.JsApiSearchContacts", "phoneNumber or targetPhoneNumber is null, return false");
      return false;
    }
    int m = paramString1.length();
    int i = paramString2.length();
    if (m < 8)
    {
      x.d("MicroMsg.JsApiSearchContacts", "phoneNumberSize:%d, return false", new Object[] { Integer.valueOf(paramString1.length()) });
      return false;
    }
    if (m > i)
    {
      x.d("MicroMsg.JsApiSearchContacts", "phoneNumberSize:%d, targetPhoneNumberSize:%d return false", new Object[] { Integer.valueOf(m), Integer.valueOf(i) });
      return false;
    }
    int j = 0;
    int k;
    for (i = 0;; i = k)
    {
      k = i;
      if (j >= m) {
        break;
      }
      k = i;
      if (paramString1.charAt(j) != paramString2.charAt(j))
      {
        i += 1;
        k = i;
        if (i > 3) {
          break;
        }
        k = i;
      }
      j += 1;
    }
    return k <= 3;
  }
  
  private static List<String[]> cz(Context paramContext)
  {
    LinkedList localLinkedList = new LinkedList();
    Object localObject2 = paramContext.getContentResolver();
    if (!com.tencent.mm.pluginsdk.permission.a.bj(paramContext, "android.permission.READ_CONTACTS"))
    {
      x.e("MicroMsg.JsApiSearchContacts", "no contact permission");
      return localLinkedList;
    }
    try
    {
      paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, "sort_key_alt");
      if (paramContext == null)
      {
        x.e("MicroMsg.JsApiSearchContacts", "getMobileInfo: mobile is null");
        return localLinkedList;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.JsApiSearchContacts", paramContext, "", new Object[0]);
        x.e("MicroMsg.JsApiSearchContacts", "exception in getMoblieOrderInfo(), [%s]", new Object[] { paramContext.getMessage() });
        paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
      }
      try
      {
        if ((paramContext.getCount() > 0) && (paramContext.moveToFirst()))
        {
          boolean bool;
          do
          {
            localObject2 = paramContext.getString(paramContext.getColumnIndex("display_name"));
            localLinkedList.add(new String[] { paramContext.getString(paramContext.getColumnIndex("contact_id")), localObject2, paramContext.getString(paramContext.getColumnIndex("data1")), paramContext.getString(paramContext.getColumnIndex("raw_contact_id")) });
            bool = paramContext.moveToNext();
          } while (bool);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.JsApiSearchContacts", localException, "", new Object[0]);
          x.e("MicroMsg.JsApiSearchContacts", "exception in getMoblieOrderInfo()2, [%s]", new Object[] { localException.getMessage() });
          paramContext.close();
        }
      }
      finally
      {
        paramContext.close();
      }
      return localLinkedList;
    }
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiSearchContacts", "data is null, err");
      paraml.E(paramInt, f("fail:invalid data", null));
      return;
    }
    x.i("MicroMsg.JsApiSearchContacts", "JsApiSearchContacts invoke");
    x.d("MicroMsg.JsApiSearchContacts", "data:%s", new Object[] { paramJSONObject });
    Object localObject1 = c(paraml);
    if (localObject1 == null)
    {
      x.e("MicroMsg.JsApiSearchContacts", "getPageContext failed, appid is %s", new Object[] { paraml.mAppId });
      paraml.E(paramInt, f("fail", null));
      return;
    }
    com.tencent.mm.plugin.appbrand.a.a(paraml.mAppId, new e.1(this, paraml, paramJSONObject, paramInt));
    Object localObject2 = c(paraml);
    int i;
    if (localObject2 == null)
    {
      paraml.E(paramInt, f("fail", null));
      i = 0;
    }
    while (i == 0)
    {
      x.i("MicroMsg.JsApiSearchContacts", "check permission");
      return;
      boolean bool = com.tencent.mm.pluginsdk.permission.a.a((Activity)localObject2, "android.permission.READ_CONTACTS", 48, "", "");
      i = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.pZ(paraml.mAppId);
        i = bool;
      }
    }
    localObject2 = paramJSONObject.optString("phoneNumber");
    if (((String)localObject2).length() < 8)
    {
      x.e("MicroMsg.JsApiSearchContacts", "phoneNumber is short");
      paramJSONObject = new HashMap();
      paramJSONObject.put("result", "");
      paraml.E(paramInt, f("ok", paramJSONObject));
      return;
    }
    if (this.fPD == null) {
      this.fPD = cz((Context)localObject1);
    }
    if (this.fPD == null)
    {
      x.e("MicroMsg.JsApiSearchContacts", "addressList is null, err");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    JSONArray localJSONArray = new JSONArray();
    if ((this.fPD != null) && (!this.fPD.isEmpty()))
    {
      Iterator localIterator = this.fPD.iterator();
      if (localIterator.hasNext())
      {
        Object localObject3 = (String[])localIterator.next();
        paramJSONObject = localObject3[2];
        if (paramJSONObject == null) {
          paramJSONObject = null;
        }
        for (;;)
        {
          localObject1 = bi.aG(localObject3[1], "");
          if ((bi.oW(paramJSONObject)) || (!bo((String)localObject2, paramJSONObject))) {
            break;
          }
          try
          {
            localObject3 = new JSONObject();
            ((JSONObject)localObject3).put("phoneNumber", paramJSONObject);
            ((JSONObject)localObject3).put("name", localObject1);
            localJSONArray.put(localObject3);
          }
          catch (JSONException paramJSONObject)
          {
            x.printErrStackTrace("MicroMsg.JsApiSearchContacts", paramJSONObject, "", new Object[0]);
          }
          break;
          localObject1 = paramJSONObject.replaceAll("\\D", "");
          paramJSONObject = (JSONObject)localObject1;
          if (((String)localObject1).startsWith("86")) {
            paramJSONObject = ((String)localObject1).substring(2);
          }
        }
      }
    }
    x.d("MicroMsg.JsApiSearchContacts", "resultArray:%s", new Object[] { localJSONArray.toString() });
    paramJSONObject = new HashMap();
    paramJSONObject.put("result", localJSONArray.toString());
    paraml.E(paramInt, f("ok", paramJSONObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/contact/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */