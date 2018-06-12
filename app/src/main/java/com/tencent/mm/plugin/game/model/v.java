package com.tencent.mm.plugin.game.model;

import android.database.Cursor;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class v
{
  private static boolean a(s params)
  {
    long l = System.currentTimeMillis() / 1000L;
    return params.field_expireTime < l;
  }
  
  public static s aTX()
  {
    long l = ((Long)g.Ei().DT().get(aa.a.sRz, Long.valueOf(0L))).longValue();
    if (l != 0L) {}
    for (s locals1 = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().dH(l);; locals1 = null)
    {
      s locals2;
      if ((locals1 != null) && (!locals1.field_isHidden))
      {
        locals2 = locals1;
        if (!a(locals1)) {}
      }
      else
      {
        an.Dy("");
        locals2 = null;
      }
      return locals2;
    }
  }
  
  public static void aTY()
  {
    long l = ((Long)g.Ei().DT().get(aa.a.sRz, Long.valueOf(0L))).longValue();
    s locals = null;
    if (l != 0L) {
      locals = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().dH(l);
    }
    if ((locals == null) || (locals.field_isHidden)) {
      return;
    }
    g.Ei().DT().a(aa.a.sRz, Long.valueOf(0L));
  }
  
  public static s aTZ()
  {
    long l = ((Long)g.Ei().DT().get(aa.a.sRD, Long.valueOf(0L))).longValue();
    Object localObject;
    if (l == 0L) {
      localObject = null;
    }
    s locals;
    do
    {
      return (s)localObject;
      locals = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().dH(l);
      if ((locals == null) || (locals.field_isHidden)) {
        break;
      }
      localObject = locals;
    } while (!a(locals));
    return null;
  }
  
  public static void aUa()
  {
    long l = ((Long)g.Ei().DT().get(aa.a.sRD, Long.valueOf(0L))).longValue();
    s locals = null;
    if (l != 0L) {
      locals = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().dH(l);
    }
    if ((locals == null) || (locals.field_isHidden)) {
      return;
    }
    g.Ei().DT().a(aa.a.sRD, Long.valueOf(0L));
  }
  
  public static s aUb()
  {
    long l = ((Long)g.Ei().DT().get(aa.a.sRA, Long.valueOf(0L))).longValue();
    Object localObject;
    if (l == 0L) {
      localObject = null;
    }
    s locals;
    do
    {
      return (s)localObject;
      locals = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().dH(l);
      if ((locals == null) || (locals.field_isHidden)) {
        break;
      }
      localObject = locals;
    } while (!a(locals));
    return null;
  }
  
  public static void aUc()
  {
    long l = ((Long)g.Ei().DT().get(aa.a.sRA, Long.valueOf(0L))).longValue();
    s locals = null;
    if (l != 0L) {
      locals = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().dH(l);
    }
    if ((locals == null) || (locals.field_isHidden)) {
      return;
    }
    g.Ei().DT().a(aa.a.sRA, Long.valueOf(0L));
  }
  
  public static void b(s params)
  {
    if (bi.oW(params.field_mergerId)) {}
    label278:
    for (;;)
    {
      return;
      Object localObject2 = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj();
      Object localObject1 = params.field_mergerId;
      int i = params.field_msgType;
      String str = "select * from GameRawMessage where msgType=" + i + " and mergerId= \"" + (String)localObject1 + "\" order by createTime desc limit 1";
      localObject1 = new s();
      localObject2 = ((w)localObject2).rawQuery(str, new String[0]);
      if (localObject2 == null) {
        localObject1 = null;
      }
      for (;;)
      {
        if (localObject1 == null) {
          break label278;
        }
        ((s)localObject1).aTW();
        if (bi.cX(((s)localObject1).jMr)) {
          break;
        }
        params.aTW();
        localObject2 = new LinkedList(((s)localObject1).jMr);
        if (!bi.cX(params.jMr))
        {
          str = ((s.h)params.jMr.get(0)).userName;
          if (!bi.oW(str))
          {
            Iterator localIterator = ((s)localObject1).jMr.iterator();
            while (localIterator.hasNext())
            {
              s.h localh = (s.h)localIterator.next();
              if (localh.userName.equals(str)) {
                ((LinkedList)localObject2).remove(localh);
              }
            }
          }
        }
        if (!bi.cX((List)localObject2)) {
          params.field_rawXML = ao.a(params.field_rawXML, (LinkedList)localObject2, ((s)localObject1).jMw);
        }
        ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().a((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
        return;
        if (((Cursor)localObject2).moveToFirst()) {
          ((s)localObject1).d((Cursor)localObject2);
        }
        ((Cursor)localObject2).close();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */