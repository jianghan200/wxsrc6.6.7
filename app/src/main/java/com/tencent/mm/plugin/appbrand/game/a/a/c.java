package com.tencent.mm.plugin.appbrand.game.a.a;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class c
  extends i<b>
{
  public static final String[] dzV = { i.a(b.dhO, "WxagGameInfo") };
  private final boolean fAQ;
  
  public c(e parame)
  {
    super(parame, b.dhO, "WxagGameInfo", null);
    if (parame != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.fAQ = bool;
      if (!this.fAQ) {
        x.e("MicroMsg.MiniGameInfoStorage", "storage can not work!!!");
      }
      return;
    }
  }
  
  public final boolean U(String paramString, boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.fAQ)
    {
      if (!bi.oW(paramString)) {
        break label25;
      }
      bool1 = bool2;
    }
    label25:
    do
    {
      do
      {
        return bool1;
        b localb = new b();
        localb.field_RecordId = paramString;
        bool2 = super.a(localb, new String[0]);
        bool1 = bool2;
      } while (!bool2);
      bool1 = bool2;
    } while (!paramBoolean);
    b("single", 5, paramString);
    return bool2;
  }
  
  public final boolean a(a parama, boolean paramBoolean)
  {
    boolean bool3 = false;
    boolean bool1 = bool3;
    if (this.fAQ)
    {
      if (parama == null) {
        bool1 = bool3;
      }
    }
    else {
      return bool1;
    }
    Object localObject1 = parama.jQb;
    int i = parama.fig;
    if (!this.fAQ)
    {
      localObject1 = null;
      label46:
      if ((localObject1 != null) && (((b)localObject1).field_isSync)) {
        break label383;
      }
    }
    label383:
    for (boolean bool2 = true;; bool2 = false)
    {
      x.i("MicroMsg.MiniGameInfoStorage", "needUpdate:%b", new Object[] { Boolean.valueOf(bool2) });
      bool1 = bool3;
      if (!bool2) {
        break;
      }
      if ((!this.fAQ) || (localObject1 == null)) {}
      for (;;)
      {
        localObject1 = new b();
        if (bi.oW(parama.dfX))
        {
          localObject2 = parama.hbL;
          i = parama.fig;
          parama.dfX = String.valueOf(String.format(Locale.US, "%s|%d", new Object[] { localObject2, Integer.valueOf(i) }).hashCode());
        }
        ((b)localObject1).field_RecordId = parama.dfX;
        ((b)localObject1).field_AppId = parama.jQb;
        ((b)localObject1).field_AppName = parama.jSv;
        ((b)localObject1).field_UserName = parama.hbL;
        ((b)localObject1).field_IconUrl = parama.jPG;
        ((b)localObject1).field_BriefIntro = parama.jQp;
        ((b)localObject1).field_isSync = false;
        ((b)localObject1).field_createTime = System.currentTimeMillis();
        bool2 = b((com.tencent.mm.sdk.e.c)localObject1);
        bool1 = bool2;
        if (!bool2) {
          break;
        }
        bool1 = bool2;
        if (!paramBoolean) {
          break;
        }
        b("single", 2, ((b)localObject1).field_RecordId);
        return bool2;
        Object localObject2 = rawQuery(String.format("select * from %s where %s=? and %s=?", new Object[] { "WxagGameInfo", "AppId", "debugType" }), new String[] { localObject1, String.valueOf(i) });
        if (((Cursor)localObject2).moveToFirst())
        {
          localObject1 = new b();
          ((b)localObject1).d((Cursor)localObject2);
          ((Cursor)localObject2).close();
          break label46;
        }
        ((Cursor)localObject2).close();
        localObject1 = null;
        break label46;
        super.a((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
      }
    }
  }
  
  public final List<b> agq()
  {
    if (!this.fAQ) {
      return null;
    }
    Object localObject = String.format("select * from %s", new Object[] { "WxagGameInfo" });
    Cursor localCursor = rawQuery((String)localObject, new String[0]);
    x.i("MicroMsg.MiniGameInfoStorage", "getMiniGameList queryStr:%s", new Object[] { localObject });
    if (localCursor == null)
    {
      x.i("MicroMsg.MiniGameInfoStorage", "cursor is null");
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localObject = new ArrayList();
      do
      {
        b localb = new b();
        localb.d(localCursor);
        ((List)localObject).add(localb);
      } while (localCursor.moveToNext());
      localCursor.close();
      x.i("MicroMsg.MiniGameInfoStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      return (List<b>)localObject;
    }
    localCursor.close();
    x.i("MicroMsg.MiniGameInfoStorage", "no record");
    return null;
  }
  
  public final boolean an(List<String> paramList)
  {
    if ((!this.fAQ) || (bi.cX(paramList))) {
      return false;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      U((String)localIterator.next(), false);
    }
    b("batch", 5, paramList);
    return true;
  }
  
  public final void c(j.a parama)
  {
    a(parama, com.tencent.mm.plugin.appbrand.r.c.Em().lnJ.getLooper());
  }
  
  public final boolean d(List<a> paramList, boolean paramBoolean)
  {
    if ((!this.fAQ) || (bi.cX(paramList))) {
      return false;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      a(locala, false);
      localArrayList.add(locala.dfX);
    }
    if (paramBoolean) {
      b("batch", 2, localArrayList);
    }
    x.i("MicroMsg.MiniGameInfoStorage", "insert miniGame size:%d,   isSync:%b", new Object[] { Integer.valueOf(paramList.size()), Boolean.valueOf(false) });
    return true;
  }
  
  public final b sO(String paramString)
  {
    if ((!this.fAQ) || (bi.oW(paramString))) {
      return null;
    }
    Cursor localCursor = rawQuery(String.format("select * from %s where %s=?", new Object[] { "WxagGameInfo", "RecordId" }), new String[] { paramString });
    if (localCursor.moveToFirst())
    {
      paramString = new b();
      paramString.d(localCursor);
      localCursor.close();
      return paramString;
    }
    x.i("MicroMsg.MiniGameInfoStorage", "getMiniGame recordId:%s, no record in DB", new Object[] { paramString });
    localCursor.close();
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */