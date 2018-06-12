package com.tencent.mm.plugin.shake.b;

import android.database.Cursor;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends i<d>
{
  public static final String[] diD = { i.a(d.dhO, "shakeitem1") };
  public com.tencent.mm.sdk.e.e diF;
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.dhO, "shakeitem1", null);
    this.diF = parame;
    x.d("MicroMsg.NewShakeItemStorage", "ShakeItemStorage");
    parame.fV("shakeitem1", "DROP INDEX IF EXISTS shakeItemUsernameIndex ");
    parame.fV("shakeitem1", "CREATE INDEX IF NOT EXISTS shakeItemNewUsernameIndex ON shakeitem1 ( username )");
  }
  
  public final int Lb(String paramString)
  {
    int i = this.diF.delete("shakeitem1", "(username=?)", new String[] { paramString });
    if (i > 0) {
      doNotify();
    }
    x.i("MicroMsg.NewShakeItemStorage", "delByusername:" + paramString + " result:" + i);
    return i;
  }
  
  public final boolean a(d paramd, boolean paramBoolean)
  {
    if (paramd == null) {
      return false;
    }
    if ((!paramBoolean) && (!bi.oW(paramd.field_username))) {
      Lb(paramd.field_username);
    }
    paramd.bWA = -1;
    return super.b(paramd);
  }
  
  public final Cursor bur()
  {
    return rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by shakeItemID desc ", new String[] { "4" });
  }
  
  public final d bus()
  {
    d locald = new d();
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   order by shakeItemID desc limit 1", new String[0]);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locald.d(localCursor);
    }
    localCursor.close();
    return locald;
  }
  
  public final boolean but()
  {
    boolean bool = this.diF.fV("shakeitem1", "delete from shakeitem1");
    doNotify();
    return bool;
  }
  
  public final void buu()
  {
    x.i("MicroMsg.NewShakeItemStorage", "setAllOld");
    d locald = new d();
    locald.field_insertBatch = 0;
    locald.bWA = 1024;
    if (-1 != this.diF.update("shakeitem1", locald.wH(), "insertBatch!=?", new String[] { "0" })) {
      doNotify();
    }
  }
  
  public final int vT(int paramInt)
  {
    int i = this.diF.delete("shakeitem1", "shakeItemID=?", new String[] { String.valueOf(paramInt) });
    doNotify();
    x.i("MicroMsg.NewShakeItemStorage", "delById id:" + paramInt + " result:" + i);
    return i;
  }
  
  public final boolean vU(int paramInt)
  {
    if (paramInt == 0) {}
    for (boolean bool = this.diF.fV("shakeitem1", "delete from shakeitem1 where type = " + paramInt + " or type is null");; bool = this.diF.fV("shakeitem1", "delete from shakeitem1 where type = " + paramInt))
    {
      doNotify();
      return bool;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */