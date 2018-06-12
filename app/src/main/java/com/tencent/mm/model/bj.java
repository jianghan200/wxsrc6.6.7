package com.tencent.mm.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.c.am;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class bj
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS readerappnews1 ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE TABLE IF NOT EXISTS readerappweibo ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappnews1 ( time )", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappweibo ( time )" };
  public h dCZ;
  
  public bj(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public static String hf(int paramInt)
  {
    if (paramInt == 20) {
      return "readerappnews1";
    }
    if (paramInt == 11) {
      return "readerappweibo";
    }
    Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
    return null;
  }
  
  private static String iI(String paramString)
  {
    return "select tweetid,time,type,name,title,url,shorturl,longurl,pubtime,sourcename,sourceicon,istop,cover,digest,reserved1,reserved2,reserved3,reserved4 from " + paramString + "  ";
  }
  
  public final List<bi> H(String paramString, int paramInt)
  {
    localObject = null;
    localCursor = this.dCZ.a(hf(paramInt), new String[] { "*" }, "reserved3=?", new String[] { paramString }, null, null, null, 2);
    if (localCursor != null) {}
    label113:
    do
    {
      try
      {
        if (!localCursor.moveToFirst()) {
          break label113;
        }
        paramString = new ArrayList();
        boolean bool;
        do
        {
          bi localbi = new bi();
          localbi.d(localCursor);
          paramString.add(localbi);
          bool = localCursor.moveToNext();
        } while (bool);
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.ReaderAppInfoStorage", "getByFunctionMsgId, error: %s", new Object[] { paramString.getMessage() });
        paramString = (String)localObject;
        return null;
      }
      finally
      {
        if (localCursor == null) {
          break;
        }
        localCursor.close();
      }
      return paramString;
      paramString = (String)localObject;
    } while (localCursor == null);
    localCursor.close();
    return null;
  }
  
  public final boolean a(bi parambi)
  {
    if (parambi == null) {
      return false;
    }
    parambi.bWA = -1;
    ContentValues localContentValues = new ContentValues();
    if ((parambi.bWA & 0x1) != 0) {
      localContentValues.put("tweetid", parambi.Iv());
    }
    if ((parambi.bWA & 0x2) != 0) {
      localContentValues.put("time", Long.valueOf(parambi.time));
    }
    if ((parambi.bWA & 0x4) != 0) {
      localContentValues.put("type", Integer.valueOf(parambi.type));
    }
    if ((parambi.bWA & 0x8) != 0) {
      localContentValues.put("name", parambi.getName());
    }
    if ((parambi.bWA & 0x10) != 0) {
      localContentValues.put("title", parambi.getTitle());
    }
    if ((parambi.bWA & 0x20) != 0) {
      localContentValues.put("url", parambi.getUrl());
    }
    if ((parambi.bWA & 0x40) != 0) {
      localContentValues.put("shorturl", parambi.Iw());
    }
    if ((parambi.bWA & 0x80) != 0)
    {
      if (parambi.dCQ == null)
      {
        str = "";
        localContentValues.put("longurl", str);
      }
    }
    else
    {
      if ((parambi.bWA & 0x100) != 0) {
        localContentValues.put("pubtime", Long.valueOf(parambi.dCR));
      }
      if ((parambi.bWA & 0x200) != 0) {
        localContentValues.put("sourcename", parambi.Ix());
      }
      if ((parambi.bWA & 0x400) != 0) {
        localContentValues.put("sourceicon", parambi.Iy());
      }
      if ((parambi.bWA & 0x800) != 0) {
        localContentValues.put("istop", Integer.valueOf(parambi.dCU));
      }
      if ((parambi.bWA & 0x1000) != 0) {
        localContentValues.put("cover", parambi.Iz());
      }
      if ((parambi.bWA & 0x2000) != 0) {
        localContentValues.put("digest", parambi.IA());
      }
      if ((parambi.bWA & 0x4000) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(parambi.dCV));
      }
      if ((parambi.bWA & 0x8000) != 0) {
        localContentValues.put("reserved2", Long.valueOf(parambi.dCW));
      }
      if ((parambi.bWA & 0x10000) != 0) {
        localContentValues.put("reserved3", parambi.IB());
      }
      if ((parambi.bWA & 0x20000) != 0) {
        if (parambi.dCY != null) {
          break label448;
        }
      }
    }
    label448:
    for (String str = "";; str = parambi.dCY)
    {
      localContentValues.put("reserved4", str);
      if ((int)this.dCZ.insert(hf(parambi.type), "tweetid", localContentValues) == -1) {
        break label456;
      }
      return true;
      str = parambi.dCQ;
      break;
    }
    label456:
    return false;
  }
  
  public final List<bi> aV(long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = iI(hf(20)) + " where reserved2 = " + paramLong;
    x.d("MicroMsg.ReaderAppInfoStorage", "getInfoListByMsgSvrID :" + (String)localObject);
    localObject = this.dCZ.b((String)localObject, null, 2);
    while (((Cursor)localObject).moveToNext())
    {
      bi localbi = new bi();
      localbi.d((Cursor)localObject);
      localArrayList.add(localbi);
    }
    ((Cursor)localObject).close();
    return localArrayList;
  }
  
  public final void aW(long paramLong)
  {
    String str = "delete from " + hf(20) + " where reserved2 = " + paramLong;
    x.d("MicroMsg.ReaderAppInfoStorage", "deleteGroupByMsgSvrID:%s", new Object[] { str });
    if (this.dCZ.fV(hf(20), str))
    {
      hi(20);
      doNotify();
    }
  }
  
  public final void b(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject2 = H(paramString, paramInt);
    if ((localObject2 == null) || (((List)localObject2).size() == 0)) {
      return;
    }
    Object localObject1 = (bi)((List)localObject2).get(0);
    Object localObject3 = ((List)localObject2).iterator();
    label46:
    if (((Iterator)localObject3).hasNext())
    {
      localObject2 = (bi)((Iterator)localObject3).next();
      if (((bi)localObject2).dCU != 1) {
        break label421;
      }
      localObject1 = localObject2;
    }
    label421:
    for (;;)
    {
      break label46;
      if ((this.dCZ.delete(hf(paramInt), "reserved3=?", new String[] { paramString }) >= 0) && (paramBoolean1)) {
        doNotify();
      }
      if (!paramBoolean2) {
        break;
      }
      paramString = iI(hf(paramInt)) + " where istop = 1  group by time ORDER BY time DESC  limit 2";
      x.i("MicroMsg.ReaderAppInfoStorage", "processConversationAfterDeleteInfo, sql is %s", new Object[] { paramString });
      localObject3 = this.dCZ.b(paramString, null, 2);
      if (!((Cursor)localObject3).moveToFirst())
      {
        ((Cursor)localObject3).close();
        paramString = new ai();
        paramString.setUsername(bi.he(paramInt));
        paramString.setContent("");
        paramString.as(0L);
        paramString.eX(0);
        paramString.eV(0);
        ((i)g.l(i.class)).FW().a(paramString, bi.he(paramInt));
        return;
      }
      paramString = ((i)g.l(i.class)).FW().Yq(bi.he(paramInt));
      localObject2 = new bi();
      ((bi)localObject2).d((Cursor)localObject3);
      ((Cursor)localObject3).close();
      localObject3 = new ai();
      ((ai)localObject3).setUsername(bi.he(paramInt));
      ((ai)localObject3).setContent(((bi)localObject2).getTitle());
      ((ai)localObject3).as(((bi)localObject2).time);
      ((ai)localObject3).eX(0);
      if ((paramString.field_unReadCount > 0) && (localObject1 != null) && (paramString.field_content.equals(((bi)localObject1).getTitle()))) {
        ((ai)localObject3).eV(paramString.field_unReadCount - 1);
      }
      for (;;)
      {
        ((i)g.l(i.class)).FW().a((ai)localObject3, bi.he(paramInt));
        return;
        ((ai)localObject3).eV(0);
      }
    }
  }
  
  public final Cursor bb(int paramInt1, int paramInt2)
  {
    String str = "SELECT time from " + hf(paramInt2) + " GROUP BY time ORDER BY time ASC  LIMIT " + paramInt1 + " offset (SELECT COUNT(*) FROM (SELECT COUNT(*) FROM " + hf(paramInt2) + " GROUP BY time)) -" + paramInt1;
    return this.dCZ.b(str, null, 0);
  }
  
  public final List<bi> c(long paramLong, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = iI(hf(paramInt)) + " where time = " + paramLong + " order by istop desc , tweetid asc ";
    x.d("MicroMsg.ReaderAppInfoStorage", "getInfobyGroup :" + (String)localObject);
    localObject = this.dCZ.b((String)localObject, null, 2);
    while (((Cursor)localObject).moveToNext())
    {
      bi localbi = new bi();
      localbi.d((Cursor)localObject);
      localArrayList.add(localbi);
    }
    ((Cursor)localObject).close();
    return localArrayList;
  }
  
  public final int hg(int paramInt)
  {
    int i = 0;
    Object localObject = "select count(*) from (SELECT count(*) FROM " + hf(paramInt) + " group by time)";
    localObject = this.dCZ.b((String)localObject, null, 2);
    paramInt = i;
    if (((Cursor)localObject).moveToFirst()) {
      paramInt = ((Cursor)localObject).getInt(0);
    }
    ((Cursor)localObject).close();
    return paramInt;
  }
  
  public final void hh(int paramInt)
  {
    Object localObject = ((i)g.l(i.class)).FW().Yq(bi.he(paramInt));
    if ((localObject == null) || (!((am)localObject).field_username.equals(bi.he(paramInt)))) {}
    do
    {
      return;
      ((ai)localObject).setUsername(bi.he(paramInt));
      ((ai)localObject).setContent("");
      ((ai)localObject).eX(0);
      ((ai)localObject).eV(0);
      ((i)g.l(i.class)).FW().a((ai)localObject, bi.he(paramInt));
      localObject = "delete from " + hf(paramInt);
    } while (!this.dCZ.fV(hf(paramInt), (String)localObject));
    doNotify();
  }
  
  public final void hi(int paramInt)
  {
    Object localObject1 = iI(hf(paramInt)) + " where istop = 1  group by time ORDER BY time DESC  limit 2";
    x.i("MicroMsg.ReaderAppInfoStorage", "reset conversation, sql is %s", new Object[] { localObject1 });
    Object localObject2 = this.dCZ.b((String)localObject1, null, 2);
    if (!((Cursor)localObject2).moveToFirst())
    {
      ((Cursor)localObject2).close();
      localObject1 = new ai();
      ((ai)localObject1).setUsername(bi.he(paramInt));
      ((ai)localObject1).setContent("");
      ((ai)localObject1).as(0L);
      ((ai)localObject1).eX(0);
      ((ai)localObject1).eV(0);
      ((i)g.l(i.class)).FW().a((ai)localObject1, bi.he(paramInt));
      return;
    }
    localObject1 = new bi();
    ((bi)localObject1).d((Cursor)localObject2);
    ((Cursor)localObject2).close();
    localObject2 = new ai();
    ((ai)localObject2).setUsername(bi.he(paramInt));
    ((ai)localObject2).setContent(((bi)localObject1).getTitle());
    ((ai)localObject2).as(((bi)localObject1).time);
    ((ai)localObject2).eX(0);
    ((ai)localObject2).eV(0);
    ((i)g.l(i.class)).FW().a((ai)localObject2, bi.he(paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */