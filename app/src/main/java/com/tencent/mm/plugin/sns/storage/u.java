package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class u
  extends i<t>
  implements k
{
  public static final String[] diD = { i.a(t.dhO, "snsTagInfo2") };
  private e diF;
  
  public u(e parame)
  {
    super(parame, t.dhO, "snsTagInfo2", null);
    this.diF = parame;
  }
  
  public final boolean Lz(String paramString)
  {
    t localt = fk(5L);
    if (bi.oW(localt.field_memberList)) {
      return false;
    }
    return bi.F(localt.field_memberList.split(",")).contains(paramString);
  }
  
  public final boolean a(t paramt)
  {
    if (paramt.field_tagId == 0L) {
      return false;
    }
    long l = paramt.field_tagId;
    Cursor localCursor = this.diF.b("select *, rowid from snsTagInfo2 where tagId = ? ", new String[] { String.valueOf(l) }, 2);
    boolean bool = localCursor.moveToFirst();
    localCursor.close();
    if (!bool) {
      super.b(paramt);
    }
    for (;;)
    {
      return true;
      super.a(paramt);
    }
  }
  
  public final List<Long> bBG()
  {
    Cursor localCursor = this.diF.a("snsTagInfo2", new String[] { "tagId" }, null, null, null, null, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext()) {
      localArrayList.add(Long.valueOf(localCursor.getLong(0)));
    }
    localCursor.close();
    return localArrayList;
  }
  
  public final boolean bwW()
  {
    return bBG().size() != 0;
  }
  
  public final List<String> eD(long paramLong)
  {
    t localt = fk(paramLong);
    if ((localt.field_memberList != null) && (!localt.field_memberList.equals(""))) {
      return bi.F(localt.field_memberList.split(","));
    }
    return new ArrayList();
  }
  
  public final String eE(long paramLong)
  {
    return fk(paramLong).field_tagName;
  }
  
  public final t fk(long paramLong)
  {
    Cursor localCursor = this.diF.b("select *, rowid from snsTagInfo2 where tagId = ? ", new String[] { String.valueOf(paramLong) }, 2);
    t localt = new t();
    if (localCursor.moveToFirst()) {
      localt.d(localCursor);
    }
    localCursor.close();
    return localt;
  }
  
  public final int fl(long paramLong)
  {
    return this.diF.delete("snsTagInfo2", " tagId = ? ", new String[] { String.valueOf(paramLong) });
  }
  
  public final Cursor getCursor()
  {
    return this.diF.rawQuery("select *, rowid from snsTagInfo2 where tagId > 5", null);
  }
  
  public final boolean q(long paramLong, String paramString)
  {
    paramString = "select tagId, tagName, count, rowid from snsTagInfo2 where tagId > 5 AND  tagName  =\"" + bi.oU(paramString) + "\" AND  tagId != " + paramLong;
    x.d("MicroMsg.SnsTagInfoStorage", "isTagNameExist " + paramString);
    paramString = this.diF.b(paramString, null, 2);
    boolean bool = paramString.moveToFirst();
    paramString.close();
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */