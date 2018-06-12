package com.tencent.mm.ae;

import android.database.Cursor;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.ah;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public final class d
  extends ah
{
  public final boolean gV(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 604176383);
  }
  
  public final String getTag()
  {
    return "MicroMsg.VerifyFlagDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VerifyFlagDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    if (!gV(paramInt))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VerifyFlagDataTransfer", "do not need transfer");
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.e(336L, 10L, 1L);
    long l = System.currentTimeMillis();
    au.HU();
    if (bi.f((Integer)c.DT().get(86017, null)) == 3)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VerifyFlagDataTransfer", "check old contact not exist");
      return;
    }
    au.HU();
    c.FO().fV("rcontact", "update rcontact set verifyflag=0 where verifyflag is null;");
    au.HU();
    Cursor localCursor = c.FR().c("@all.weixin.android", "", null);
    localCursor.moveToFirst();
    while (!localCursor.isAfterLast())
    {
      ab localab = new ab();
      localab.d(localCursor);
      au.HU();
      c.FR().c(localab.field_username, localab);
      localCursor.moveToNext();
    }
    localCursor.close();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VerifyFlagDataTransfer", "update verifyflag from the beginning to update finish use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    au.HU();
    c.DT().set(86017, Integer.valueOf(3));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VerifyFlagDataTransfer", "update verifyflag use time " + (System.currentTimeMillis() - l) + " ms");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ae/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */