package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.telephony.PhoneNumberUtils;
import android.widget.Toast;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 72;
  public static final String NAME = "chooseContact";
  
  public final void a(final l paraml, JSONObject paramJSONObject, final int paramInt)
  {
    int i = 0;
    final MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      x.e("MicroMsg.JsApiChooseContact", "getPageContext failed, appid is %s", new Object[] { paraml.mAppId });
      paraml.E(paramInt, f("fail", null));
      return;
    }
    com.tencent.mm.plugin.appbrand.a.a(paraml.mAppId, new b.2(this, paraml, paramJSONObject, paramInt));
    paramJSONObject = c(paraml);
    if (paramJSONObject == null) {
      paraml.E(paramInt, f("fail", null));
    }
    while (i == 0)
    {
      x.i("MicroMsg.JsApiChooseContact", "check permission");
      return;
      boolean bool = com.tencent.mm.pluginsdk.permission.a.a(paramJSONObject, "android.permission.READ_CONTACTS", 48, "", "");
      i = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.pZ(paraml.mAppId);
        i = bool;
      }
    }
    localMMActivity.geJ = new MMActivity.a()
    {
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        if (100 != paramAnonymousInt1)
        {
          x.e("MicroMsg.JsApiChooseContact", "requestcode not equal, requestCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
          paraml.E(paramInt, b.this.f("fail", null));
        }
        do
        {
          return;
          if ((paramAnonymousInt2 == 0) || (paramAnonymousInt2 == 1))
          {
            paraml.E(paramInt, b.this.f("cancel", null));
            return;
          }
        } while (paramAnonymousInt2 != -1);
        paramAnonymousIntent = paramAnonymousIntent.getData();
        if (paramAnonymousIntent == null)
        {
          x.e("MicroMsg.JsApiChooseContact", "onActivityResult, uri == null");
          paraml.E(paramInt, b.this.f("fail", null));
          return;
        }
        if (!com.tencent.mm.pluginsdk.permission.a.bj(localMMActivity, "android.permission.READ_CONTACTS"))
        {
          x.e("MicroMsg.JsApiChooseContact", "onActivityResult, no contact permission");
          paraml.E(paramInt, b.this.f("fail:system permission denied", null));
          return;
        }
        Cursor localCursor1;
        Cursor localCursor2;
        try
        {
          localCursor1 = localMMActivity.getContentResolver().query(paramAnonymousIntent, null, null, null, null);
          if ((localCursor1 == null) || (localCursor1.getCount() <= 0)) {
            break label795;
          }
          localCursor1.moveToFirst();
          paramAnonymousInt1 = localCursor1.getColumnIndex("has_phone_number");
          if ((paramAnonymousInt1 > 0) && (localCursor1.getInt(paramAnonymousInt1) <= 0)) {
            break label795;
          }
          paramAnonymousIntent = localCursor1.getString(localCursor1.getColumnIndex("_id"));
          localCursor2 = localMMActivity.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + paramAnonymousIntent, null, null);
          x.i("MicroMsg.JsApiChooseContact", "onActivityResult, queried cursor = %s", new Object[] { localCursor1 });
          if (localCursor2 == null)
          {
            paraml.E(paramInt, b.this.f("fail", null));
            return;
          }
        }
        catch (SecurityException paramAnonymousIntent)
        {
          x.e("MicroMsg.JsApiChooseContact", "onActivityResult, permission denied: %s", new Object[] { paramAnonymousIntent.toString() });
          h.b(localMMActivity, ad.getResources().getString(s.j.app_brand_read_contact_error), "", true);
          paraml.E(paramInt, b.this.f("fail:system permission denied", null));
          return;
        }
        Object localObject1;
        Object localObject2;
        if (localCursor2.moveToFirst())
        {
          localObject1 = null;
          paramAnonymousIntent = null;
          if (!localCursor2.isAfterLast())
          {
            paramAnonymousInt1 = localCursor2.getColumnIndex("data1");
            paramAnonymousInt2 = localCursor2.getColumnIndex("display_name");
            localObject1 = localCursor2.getString(paramAnonymousInt1);
            localObject2 = localCursor2.getString(paramAnonymousInt2);
            x.d("MicroMsg.JsApiChooseContact", "onActivityResult, username : " + (String)localObject2);
            if (localObject1 != null)
            {
              x.d("MicroMsg.JsApiChooseContact", "onActivityResult, phoneNumber : " + (String)localObject1);
              if (localObject1 == null) {
                localObject1 = null;
              }
              for (;;)
              {
                x.d("MicroMsg.JsApiChooseContact", "onActivityResult, phoneNumber : " + (String)localObject1);
                if ((!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject1)) || (((String)localObject1).length() != 11)) {
                  break label775;
                }
                x.d("MicroMsg.JsApiChooseContact", "onActivityResult, phoneResult : " + (String)localObject1);
                label565:
                localCursor2.moveToNext();
                paramAnonymousIntent = (Intent)localObject1;
                localObject1 = localObject2;
                break;
                String str = ((String)localObject1).replaceAll("\\D", "");
                localObject1 = str;
                if (str.startsWith("86")) {
                  localObject1 = str.substring(2);
                }
              }
            }
          }
          else
          {
            localObject2 = localObject1;
            localObject1 = paramAnonymousIntent;
            paramAnonymousIntent = (Intent)localObject2;
          }
        }
        for (;;)
        {
          try
          {
            localCursor2.close();
            if ((localCursor1 != null) && (!localCursor1.isClosed())) {
              localCursor1.close();
            }
            if (!bi.oW((String)localObject1))
            {
              localObject2 = new HashMap(1);
              ((Map)localObject2).put("phoneNumber", localObject1);
              localObject1 = paramAnonymousIntent;
              if (paramAnonymousIntent == null) {
                localObject1 = "";
              }
              ((Map)localObject2).put("displayName", localObject1);
              paraml.E(paramInt, b.this.f("ok", (Map)localObject2));
              return;
            }
            paraml.E(paramInt, b.this.f("fail", null));
            Toast.makeText(localMMActivity, s.j.app_brand_pick_contact_error, 0).show();
            return;
          }
          catch (Exception localException)
          {
            continue;
          }
          label775:
          localObject1 = paramAnonymousIntent;
          break;
          localObject1 = paramAnonymousIntent;
          break label565;
          paramAnonymousIntent = null;
          localObject1 = null;
          continue;
          label795:
          paramAnonymousIntent = null;
          localObject1 = null;
        }
      }
    };
    localMMActivity.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 100);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/contact/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */