package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class bv
  extends i<bu>
{
  public static final String[] diD = { i.a(bu.dhO, "UserOpenIdInApp") };
  public e diF;
  
  public bv(e parame)
  {
    super(parame, bu.dhO, "UserOpenIdInApp", null);
    this.diF = parame;
    parame.fV("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppAppIdUsernameIndex ON UserOpenIdInApp ( appId,username )");
    parame.fV("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppOpenIdIndex ON UserOpenIdInApp ( openId )");
  }
  
  public final bu Zq(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    Cursor localCursor = this.diF.a("UserOpenIdInApp", null, "openId=?", new String[] { bi.oU(paramString) }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      x.w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with openId:" + paramString);
      localCursor.close();
      return null;
    }
    paramString = new bu();
    paramString.d(localCursor);
    localCursor.close();
    return paramString;
  }
  
  public final boolean a(bu parambu)
  {
    if ((parambu == null) || (bi.oW(parambu.field_appId)) || (bi.oW(parambu.field_openId)) || (bi.oW(parambu.field_username)))
    {
      x.w("MicroMsg.scanner.UserOpenIdInAppStorage", "wrong argument");
      return false;
    }
    ContentValues localContentValues = parambu.wH();
    if (this.diF.replace("UserOpenIdInApp", bu.dhO.sKz, localContentValues) > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.scanner.UserOpenIdInAppStorage", "replace: appId=%s, username=%s, ret=%s ", new Object[] { parambu.field_appId, parambu.field_username, Boolean.valueOf(bool) });
      return bool;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/storage/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */