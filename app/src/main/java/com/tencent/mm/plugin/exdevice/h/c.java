package com.tencent.mm.plugin.exdevice.h;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.g.c.bw;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends i<b>
{
  public static final String[] diD = { i.a(b.dhO, "HardDeviceInfo") };
  private e diF;
  
  public c(e parame)
  {
    super(parame, b.dhO, "HardDeviceInfo", null);
    this.diF = parame;
    parame.fV("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceUsernameIndex ON HardDeviceInfo ( brandName )");
    parame.fV("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceMacIndex ON HardDeviceInfo ( mac )");
  }
  
  public static boolean Am(String paramString)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.exdevice.HardDeviceInfoStorage", "Ability is null or nil.");
    }
    while ((!paramString.contains("wxmsg_music")) && (!paramString.contains("wxmsg_poi")) && (!paramString.contains("wxmsg_image")) && (!paramString.contains("wxmsg_file")) && (!paramString.contains("wxmsg_video")) && (!paramString.contains("wxmsg_url"))) {
      return false;
    }
    return true;
  }
  
  public final b Ak(String paramString)
  {
    if (bi.oW(paramString)) {}
    Cursor localCursor;
    do
    {
      return null;
      localCursor = this.diF.a("HardDeviceInfo", null, "mac=?", new String[] { paramString }, null, null, null, 2);
    } while (localCursor == null);
    if (!localCursor.moveToFirst())
    {
      x.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:" + paramString);
      localCursor.close();
      return null;
    }
    paramString = new b();
    paramString.d(localCursor);
    localCursor.close();
    return paramString;
  }
  
  public final b Al(String paramString)
  {
    if (bi.oW(paramString)) {}
    Cursor localCursor;
    do
    {
      return null;
      localCursor = this.diF.a("HardDeviceInfo", null, "deviceID=?", new String[] { paramString }, null, null, null, 2);
    } while (localCursor == null);
    if (!localCursor.moveToFirst())
    {
      x.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceId:" + paramString);
      localCursor.close();
      return null;
    }
    paramString = new b();
    paramString.d(localCursor);
    localCursor.close();
    return paramString;
  }
  
  public final LinkedList<b> An(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.exdevice.HardDeviceInfoStorage", "The given brandName is null or nil.");
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    paramString = this.diF.a("HardDeviceInfo", null, "brandName=?", new String[] { paramString }, null, null, null, 2);
    if (paramString == null) {
      return localLinkedList;
    }
    if (paramString.moveToFirst()) {
      do
      {
        b localb = new b();
        localb.d(paramString);
        localLinkedList.add(localb);
      } while (paramString.moveToNext());
    }
    paramString.close();
    return localLinkedList;
  }
  
  public final List<b> aHI()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = axc();
    if ((localCursor != null) && (localCursor.moveToFirst())) {
      do
      {
        b localb = new b();
        localb.d(localCursor);
        String str = localb.cCX;
        if ((str != null) && (Am(str))) {
          localLinkedList.add(localb);
        }
      } while (localCursor.moveToNext());
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return localLinkedList;
  }
  
  public final List<b> aHJ()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = axc();
    if ((localCursor != null) && (localCursor.moveToFirst())) {
      do
      {
        b localb = new b();
        localb.d(localCursor);
        String str1 = localb.cCT;
        String str2 = localb.iconUrl;
        String str3 = localb.category;
        String str4 = localb.field_brandName;
        if ((!bi.oW(str3)) && (!str3.equals("1")) && (!str3.equals("0")) && (!bi.oW(str4)) && (!bi.oW(str1)) && (!bi.oW(str2))) {
          localLinkedList.add(localb);
        }
      } while (localCursor.moveToNext());
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return localLinkedList;
  }
  
  public final LinkedList<b> aHK()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = rawQuery("select * from HardDeviceInfo where mac > 0 and connProto like '3'", new String[0]);
    if (localCursor == null)
    {
      x.e("MicroMsg.exdevice.HardDeviceInfoStorage", "get cursor is null");
      return localLinkedList;
    }
    if (localCursor.moveToFirst()) {
      do
      {
        b localb = new b();
        localb.d(localCursor);
        localLinkedList.add(localb);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localLinkedList;
  }
  
  public final b cA(String paramString1, String paramString2)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2))) {
      x.e("MicroMsg.exdevice.HardDeviceInfoStorage", "brandName(%s) or deviceId(%s) is null or nil.", new Object[] { paramString1, paramString2 });
    }
    do
    {
      return null;
      paramString2 = this.diF.a("HardDeviceInfo", null, "brandName=? and deviceID=?", new String[] { paramString1, paramString2 }, null, null, null, 2);
    } while (paramString2 == null);
    if (!paramString2.moveToFirst())
    {
      x.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with brandName:" + paramString1);
      paramString2.close();
      return null;
    }
    paramString1 = new b();
    paramString1.d(paramString2);
    paramString2.close();
    return paramString1;
  }
  
  public final boolean cB(String paramString1, String paramString2)
  {
    if (bi.oW(paramString1)) {
      return false;
    }
    if (this.diF.delete("HardDeviceInfo", "deviceID=? and deviceType=? ", new String[] { paramString1, paramString2 }) <= 0)
    {
      x.i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo fail, deviceId = %s", new Object[] { paramString1 });
      return false;
    }
    x.i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo ok, deviceId = %s", new Object[] { paramString1 });
    return true;
  }
  
  public final b cX(long paramLong)
  {
    b localb = null;
    Cursor localCursor = this.diF.query("HardDeviceInfo", null, "mac=?", new String[] { String.valueOf(paramLong) }, null, null, null);
    if (localCursor == null) {
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localb = new b();
      localb.d(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      return localb;
      x.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:" + paramLong);
    }
  }
  
  public final b cz(String paramString1, String paramString2)
  {
    if ((bi.oW(paramString2)) || (bi.oW(paramString1))) {
      x.e("MicroMsg.exdevice.HardDeviceInfoStorage", "deviceType(%s) or deviceId(%s) is null or nil.", new Object[] { paramString2, paramString1 });
    }
    Cursor localCursor;
    do
    {
      return null;
      localCursor = this.diF.a("HardDeviceInfo", null, "deviceType=? and deviceID=?", new String[] { paramString2, paramString1 }, null, null, null, 2);
    } while (localCursor == null);
    if (!localCursor.moveToFirst())
    {
      x.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceType:%s and deviceId:%s", new Object[] { paramString2, paramString1 });
      localCursor.close();
      return null;
    }
    paramString1 = new b();
    paramString1.d(localCursor);
    localCursor.close();
    return paramString1;
  }
  
  public final int e(b paramb)
  {
    ContentValues localContentValues = paramb.wH();
    if (localContentValues.size() > 0) {}
    for (int i = this.diF.update("HardDeviceInfo", localContentValues, "deviceID = ? and deviceType = ? ", new String[] { paramb.field_deviceID, paramb.field_deviceType });; i = 0)
    {
      x.i("MicroMsg.exdevice.HardDeviceInfoStorage", "update: deviceId = %s, deviceType = %s, ret = %s ", new Object[] { paramb.field_deviceID, paramb.field_deviceType, Integer.valueOf(i) });
      return i;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/exdevice/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */