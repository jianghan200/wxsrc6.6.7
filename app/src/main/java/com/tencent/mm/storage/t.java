package com.tencent.mm.storage;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.k;
import java.util.LinkedList;
import java.util.List;

public final class t
  extends i<q>
{
  public static final String[] ciG = { "CREATE  INDEX IF NOT EXISTS msg_svr_id_index ON BizTimeLineSingleMsgInfo ( msgSvrId ) ", "CREATE  INDEX IF NOT EXISTS talker_index ON BizTimeLineSingleMsgInfo ( talker ) ", "CREATE  INDEX IF NOT EXISTS  create_time_index ON BizTimeLineSingleMsgInfo ( createTime ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_index ON BizTimeLineSingleMsgInfo ( status,talker ) " };
  public static final String[] diD = { i.a(q.dhO, "BizTimeLineSingleMsgInfo") };
  public final h dCZ;
  private final k<r.c, r.a> sNT = new t.1(this);
  
  public t(h paramh)
  {
    super(paramh, q.dhO, "BizTimeLineSingleMsgInfo", ciG);
    this.dCZ = paramh;
  }
  
  public final boolean Gy(String paramString)
  {
    q localq = new q();
    localq.field_talker = paramString;
    boolean bool = super.a(localq, false, new String[] { "talker" });
    paramString = new r.a();
    paramString.talker = localq.field_talker;
    paramString.sNZ = localq;
    paramString.sNY = r.b.sOb;
    b(paramString);
    return bool;
  }
  
  public final void a(r.c paramc)
  {
    this.sNT.remove(paramc);
  }
  
  public final void a(r.c paramc, Looper paramLooper)
  {
    this.sNT.a(paramc, paramLooper);
  }
  
  public final int axd()
  {
    int i = 0;
    Cursor localCursor = this.dCZ.b("SELECT count(*) FROM BizTimeLineSingleMsgInfo where status != 4", null, 0);
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    return i;
  }
  
  public final void b(r.a parama)
  {
    if (this.sNT.ci(parama)) {
      this.sNT.doNotify();
    }
  }
  
  public final boolean c(q paramq)
  {
    boolean bool = super.a(paramq, false);
    r.a locala = new r.a();
    locala.talker = paramq.field_talker;
    locala.sNZ = paramq;
    locala.sNY = r.b.sOa;
    b(locala);
    return bool;
  }
  
  public final q ckB()
  {
    q localq = null;
    Cursor localCursor = this.dCZ.b("SELECT * FROM BizTimeLineSingleMsgInfo where status != 4 order by createTime DESC limit 1", null, 0);
    if (localCursor.moveToFirst())
    {
      localq = new q();
      localq.d(localCursor);
    }
    localCursor.close();
    return localq;
  }
  
  public final List<q> ckI()
  {
    Cursor localCursor = this.dCZ.query("BizTimeLineSingleMsgInfo", null, "status!=?", new String[] { "4" }, null, null, "createTime DESC ");
    LinkedList localLinkedList = new LinkedList();
    while (localCursor.moveToNext())
    {
      q localq = new q();
      localq.d(localCursor);
      localLinkedList.add(localq);
    }
    localCursor.close();
    return localLinkedList;
  }
  
  public final boolean d(q paramq)
  {
    boolean bool = super.b(paramq, false, new String[] { "msgSvrId" });
    r.a locala = new r.a();
    locala.talker = paramq.field_talker;
    locala.sNZ = paramq;
    locala.sNY = r.b.sOc;
    b(locala);
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */