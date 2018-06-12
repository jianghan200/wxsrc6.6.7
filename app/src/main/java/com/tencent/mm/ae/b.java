package com.tencent.mm.ae;

import android.database.Cursor;
import com.tencent.mm.model.ah;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends ah
{
  public final boolean gV(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 637735215);
  }
  
  public final String getTag()
  {
    return "MicroMsg.App.BizPlaceTopDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    x.d("MicroMsg.App.BizPlaceTopDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    long l1;
    com.tencent.mm.bt.h localh;
    Object localObject;
    if (gV(paramInt))
    {
      x.i("MicroMsg.App.BizPlaceTopDataTransfer", "begin biz place to top data transfer.");
      l1 = System.currentTimeMillis();
      com.tencent.mm.plugin.report.service.h.mEJ.a(336L, 0L, 1L, true);
      au.HU();
      localh = c.FO();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("select conv.username");
      ((StringBuilder)localObject).append(" from ");
      ((StringBuilder)localObject).append("rconversation");
      ((StringBuilder)localObject).append(" as conv, ");
      ((StringBuilder)localObject).append("rcontact");
      ((StringBuilder)localObject).append(" as ct ");
      ((StringBuilder)localObject).append(" where conv.");
      ((StringBuilder)localObject).append("parentRef");
      ((StringBuilder)localObject).append("='");
      ((StringBuilder)localObject).append("officialaccounts");
      ((StringBuilder)localObject).append("' and conv.");
      ((StringBuilder)localObject).append("username");
      ((StringBuilder)localObject).append(" = ct.");
      ((StringBuilder)localObject).append("username");
      ((StringBuilder)localObject).append(" and ct.");
      ((StringBuilder)localObject).append("verifyFlag");
      ((StringBuilder)localObject).append(" & ");
      ((StringBuilder)localObject).append(8);
      ((StringBuilder)localObject).append(" = 0");
      localObject = ((StringBuilder)localObject).toString();
      x.v("MicroMsg.App.BizPlaceTopDataTransfer", "transfer query sql(%s)", new Object[] { localObject });
      localObject = localh.b((String)localObject, null, 2);
      if (localObject == null) {
        x.i("MicroMsg.App.BizPlaceTopDataTransfer", "cursor is null.");
      }
    }
    else
    {
      return;
    }
    long l2 = System.currentTimeMillis();
    x.i("MicroMsg.App.BizPlaceTopDataTransfer", "do biz place to top data transfer, query cost : %s msec.", new Object[] { Long.valueOf(l2 - l1) });
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("update ");
    localStringBuilder.append("rconversation");
    localStringBuilder.append(" set ");
    localStringBuilder.append("parentRef");
    localStringBuilder.append("='' where ");
    localStringBuilder.append("username");
    localStringBuilder.append(" in (");
    if (((Cursor)localObject).moveToFirst())
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(336L, 1L, 1L, true);
      localStringBuilder.append("'");
      localStringBuilder.append(((Cursor)localObject).getString(0));
      localStringBuilder.append("'");
      paramInt = 1;
      while (((Cursor)localObject).moveToNext())
      {
        localStringBuilder.append(",");
        localStringBuilder.append("'");
        localStringBuilder.append(((Cursor)localObject).getString(0));
        localStringBuilder.append("'");
        paramInt += 1;
      }
    }
    ((Cursor)localObject).close();
    x.i("MicroMsg.App.BizPlaceTopDataTransfer", "cursor count is 0.");
    return;
    localStringBuilder.append(")");
    String str = localStringBuilder.toString();
    x.i("MicroMsg.App.BizPlaceTopDataTransfer", "transfer update count(%d)", new Object[] { Integer.valueOf(paramInt) });
    x.v("MicroMsg.App.BizPlaceTopDataTransfer", "transfer update sql(%s)", new Object[] { str });
    ((Cursor)localObject).close();
    if (localh.fV("rconversation", localStringBuilder.toString())) {
      com.tencent.mm.plugin.report.service.h.mEJ.a(336L, 2L, 1L, true);
    }
    for (;;)
    {
      long l3 = System.currentTimeMillis();
      x.i("MicroMsg.App.BizPlaceTopDataTransfer", "do biz place to top data transfer, update cost : %s msec,  total cost : %s msec.", new Object[] { Long.valueOf(l3 - l2), Long.valueOf(l3 - l1) });
      return;
      com.tencent.mm.plugin.report.service.h.mEJ.a(336L, 3L, 1L, true);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ae/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */