package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.av.b;
import com.tencent.mm.sdk.platformtools.av.c;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import junit.framework.Assert;

public final class x
  extends m
  implements av.c<Object, Object>
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS userinfo ( id INTEGER PRIMARY KEY, type INT, value TEXT )", "CREATE TABLE IF NOT EXISTS userinfo2 ( sid TEXT PRIMARY KEY, type INT, value TEXT )" };
  private h dCZ;
  private long eky;
  private av<Object, Object> sOm;
  private av<Object, Object> sOn;
  private BlockingQueue<Integer> sOo = new LinkedBlockingQueue();
  private BlockingQueue<String> sOp = new LinkedBlockingQueue();
  
  public x(h paramh)
  {
    this.dCZ = paramh;
    this.sOm = new av(this, g.Em().lnJ.getLooper(), 100, 20, 60000L, 100L);
    this.sOm.setTag(Integer.valueOf(1));
    this.sOn = new av(this, g.Em().lnJ.getLooper(), 100, 20, 60000L, 100L);
    this.sOn.setTag(Integer.valueOf(3));
  }
  
  private static boolean a(String paramString, Object paramObject, boolean paramBoolean)
  {
    if ((paramObject == null) && (paramBoolean)) {}
    while (((paramString.equals("INT")) && ((paramObject instanceof Integer))) || ((paramString.equals("LONG")) && ((paramObject instanceof Long))) || ((paramString.equals("STRING")) && ((paramObject instanceof String))) || ((paramString.equals("BOOLEAN")) && ((paramObject instanceof Boolean))) || ((paramString.equals("FLOAT")) && ((paramObject instanceof Float))) || ((paramString.equals("DOUBLE")) && ((paramObject instanceof Double)))) {
      return true;
    }
    if ((paramObject != null) && (b.chp())) {
      Assert.assertTrue("checkType failed, input type and value[" + paramString + ", " + paramObject + "] are not match", false);
    }
    if (paramBoolean) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConfigStorage", "checkType failed, input type and value[%s, %s] are not match", new Object[] { paramString, paramObject });
    }
    return false;
  }
  
  private static int ck(Object paramObject)
  {
    if ((paramObject instanceof Integer)) {
      return 1;
    }
    if ((paramObject instanceof Long)) {
      return 2;
    }
    if ((paramObject instanceof String)) {
      return 3;
    }
    if ((paramObject instanceof Boolean)) {
      return 4;
    }
    if ((paramObject instanceof Float)) {
      return 5;
    }
    if ((paramObject instanceof Double)) {
      return 6;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConfigStorage", "unresolve failed, unknown type=" + paramObject.getClass().toString());
    return -1;
  }
  
  private static Object m(int paramInt, String paramString)
  {
    String str = paramString;
    switch (paramInt)
    {
    }
    for (;;)
    {
      str = null;
      return str;
      try
      {
        return Integer.valueOf(paramString);
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConfigStorage", "exception:%s", new Object[] { bi.i(paramString) });
      }
      return Long.valueOf(paramString);
      return Boolean.valueOf(paramString);
      return Float.valueOf(paramString);
      paramString = Double.valueOf(paramString);
      return paramString;
    }
  }
  
  public final long Dj(int paramInt)
  {
    Long localLong = (Long)get(paramInt, null);
    if (localLong == null) {
      return 0L;
    }
    return localLong.longValue();
  }
  
  public final boolean Sc()
  {
    if (this.dCZ.inTransaction())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigStorage", "summer preAppend inTransaction return false");
      return false;
    }
    this.eky = this.dCZ.dO(Thread.currentThread().getId());
    if (this.eky <= 0L)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigStorage", "summer preAppend ticket: " + this.eky + " return false");
      return false;
    }
    return true;
  }
  
  public final void Sd()
  {
    if (this.eky > 0L) {
      this.dCZ.gp(this.eky);
    }
  }
  
  protected final boolean Xu()
  {
    boolean bool = true;
    if ((this.dCZ == null) || (this.dCZ.cjr())) {
      if (this.dCZ != null) {
        break label49;
      }
    }
    label49:
    for (Object localObject = "null";; localObject = Boolean.valueOf(this.dCZ.cjr()))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ConfigStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
      bool = false;
      return bool;
    }
  }
  
  public final void a(av<Object, Object> paramav, av.b<Object, Object> paramb)
  {
    Object localObject1 = paramb.qSV;
    Object localObject2 = paramb.values;
    int i = paramb.sIz;
    switch (((Integer)paramav.getTag()).intValue())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return;
                if (i != 1) {
                  break;
                }
              } while ((localObject2 == null) || (!(localObject2 instanceof a)));
              paramav = (a)localObject2;
            } while (paramav.type == -1);
            localObject1 = new ContentValues();
            ((ContentValues)localObject1).put("id", (Integer)paramb.qSV);
            ((ContentValues)localObject1).put("type", Integer.valueOf(paramav.type));
            ((ContentValues)localObject1).put("value", paramav.dDi.toString());
            this.dCZ.replace("userinfo", "id", (ContentValues)localObject1);
            return;
          } while (i != 2);
          this.dCZ.delete("userinfo", "id=" + localObject1, null);
          return;
          if (i != 1) {
            break;
          }
        } while ((localObject2 == null) || (!(localObject2 instanceof a)));
        paramav = (a)localObject2;
      } while (paramav.type == -1);
      localObject1 = new ContentValues();
      ((ContentValues)localObject1).put("sid", (String)paramb.qSV);
      ((ContentValues)localObject1).put("type", Integer.valueOf(paramav.type));
      ((ContentValues)localObject1).put("value", paramav.dDi.toString());
      this.dCZ.replace("userinfo2", "id", (ContentValues)localObject1);
      return;
    } while (i != 2);
    this.dCZ.delete("userinfo2", "sid= ?", new String[] { localObject1.toString() });
  }
  
  public final void a(aa.a parama, Object paramObject)
  {
    if (parama == null) {}
    label156:
    label281:
    label290:
    for (;;)
    {
      return;
      Object localObject = parama.name();
      if (!bi.oW((String)localObject))
      {
        String[] arrayOfString = ((String)localObject).split("_");
        String str = arrayOfString[(arrayOfString.length - 1)];
        if (str.equals("SYNC")) {
          str = arrayOfString[(arrayOfString.length - 2)];
        }
        for (int i = 1;; i = 0)
        {
          if (!a(str, paramObject, true)) {
            break label290;
          }
          int j = ((String)localObject).lastIndexOf(str);
          str = ((String)localObject).substring(0, str.length() + j);
          boolean bool2;
          boolean bool1;
          if (paramObject == null)
          {
            bool2 = this.sOn.s(str, null);
            bool1 = bool2;
            if (bool2)
            {
              bool1 = bool2;
              if (!this.sOp.contains(str))
              {
                this.sOp.add(str);
                bool1 = bool2;
              }
            }
            if (bool1) {
              if (paramObject != null) {
                break label281;
              }
            }
          }
          for (j = 5;; j = 4)
          {
            b(j, this, parama);
            if (i == 0) {
              break;
            }
            lm(true);
            return;
            localObject = new a();
            ((a)localObject).type = ck(paramObject);
            if (((a)localObject).type == -1) {
              break;
            }
            ((a)localObject).dDi = paramObject.toString();
            bool2 = this.sOn.s(str, localObject);
            bool1 = bool2;
            if (!bool2) {
              break label156;
            }
            bool1 = bool2;
            if (!this.sOp.contains(str)) {
              break label156;
            }
            this.sOp.remove(str);
            bool1 = bool2;
            break label156;
          }
        }
      }
    }
  }
  
  public final Object get(int paramInt, Object paramObject)
  {
    boolean bool;
    Object localObject2;
    Object localObject1;
    if (this.dCZ != null)
    {
      bool = true;
      Assert.assertTrue("db is null", bool);
      localObject2 = this.sOm.get(Integer.valueOf(paramInt));
      if ((localObject2 != null) || (this.sOo.contains(Integer.valueOf(paramInt)))) {
        break label182;
      }
      localObject1 = new a();
      localObject2 = this.dCZ.a("userinfo", null, "id=" + paramInt, null, null, null, null, 2);
      if (((Cursor)localObject2).moveToFirst())
      {
        ((a)localObject1).type = ((Cursor)localObject2).getInt(1);
        ((a)localObject1).dDi = ((Cursor)localObject2).getString(2);
      }
      ((Cursor)localObject2).close();
      localObject2 = m(((a)localObject1).type, ((a)localObject1).dDi);
      this.sOm.s(Integer.valueOf(paramInt), localObject1);
      localObject1 = localObject2;
      if (localObject2 != null) {
        break label221;
      }
    }
    label182:
    do
    {
      return paramObject;
      bool = false;
      break;
      localObject1 = localObject2;
      if (!(localObject2 instanceof a)) {
        break label221;
      }
      localObject1 = (a)localObject2;
      localObject1 = m(((a)localObject1).type, ((a)localObject1).dDi);
    } while (localObject1 == null);
    label221:
    return localObject1;
  }
  
  public final Object get(aa.a parama, Object paramObject)
  {
    if (parama == null) {}
    do
    {
      return paramObject;
      parama = parama.name();
    } while (bi.oW(parama));
    Object localObject = parama.split("_");
    String str = localObject[(localObject.length - 1)];
    if (str.equals("SYNC")) {
      str = localObject[(localObject.length - 2)];
    }
    for (;;)
    {
      parama = parama.substring(0, parama.lastIndexOf(str) + str.length());
      boolean bool;
      if (this.dCZ != null)
      {
        bool = true;
        Assert.assertTrue("db is null", bool);
        localObject = this.sOn.get(parama);
        if ((localObject != null) || (this.sOp.contains(parama))) {
          break label253;
        }
        a locala = new a();
        localObject = this.dCZ.a("userinfo2", null, "sid=?", new String[] { parama }, null, null, null, 2);
        if (((Cursor)localObject).moveToFirst())
        {
          locala.type = ((Cursor)localObject).getInt(1);
          locala.dDi = ((Cursor)localObject).getString(2);
        }
        ((Cursor)localObject).close();
        localObject = m(locala.type, locala.dDi);
        this.sOn.s(parama, locala);
        parama = (aa.a)localObject;
        if (localObject == null) {
          parama = (aa.a)paramObject;
        }
      }
      for (;;)
      {
        if (!a(str, parama, false)) {
          break label294;
        }
        return parama;
        bool = false;
        break;
        label253:
        parama = (aa.a)localObject;
        if ((localObject instanceof a))
        {
          parama = (a)localObject;
          localObject = m(parama.type, parama.dDi);
          parama = (aa.a)localObject;
          if (localObject == null) {
            parama = (aa.a)paramObject;
          }
        }
      }
      label294:
      break;
    }
  }
  
  public final boolean getBoolean(aa.a parama, boolean paramBoolean)
  {
    parama = get(parama, Boolean.valueOf(paramBoolean));
    boolean bool = paramBoolean;
    if (parama != null)
    {
      bool = paramBoolean;
      if ((parama instanceof Boolean)) {
        bool = ((Boolean)parama).booleanValue();
      }
    }
    return bool;
  }
  
  public final int getInt(int paramInt1, int paramInt2)
  {
    Integer localInteger = (Integer)get(paramInt1, null);
    if (localInteger == null) {
      return paramInt2;
    }
    return localInteger.intValue();
  }
  
  public final long i(aa.a parama)
  {
    parama = get(parama, Long.valueOf(0L));
    if ((parama != null) && ((parama instanceof Long))) {
      return ((Long)parama).longValue();
    }
    return 0L;
  }
  
  public final void lm(boolean paramBoolean)
  {
    long l = System.currentTimeMillis();
    this.sOm.li(paramBoolean);
    this.sOn.li(paramBoolean);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigStorage", "summer config appendAllToDisk force[%b] end takes[%d]ms ", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(System.currentTimeMillis() - l) });
  }
  
  public final void set(int paramInt, Object paramObject)
  {
    boolean bool1;
    boolean bool2;
    if (this.dCZ != null)
    {
      bool1 = true;
      Assert.assertTrue("db is null", bool1);
      if (paramObject != null) {
        break label111;
      }
      bool2 = this.sOm.s(Integer.valueOf(paramInt), null);
      bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (!this.sOo.contains(Integer.valueOf(paramInt)))
        {
          this.sOo.add(Integer.valueOf(paramInt));
          bool1 = bool2;
        }
      }
      label83:
      if (bool1) {
        if (paramObject != null) {
          break label212;
        }
      }
    }
    label111:
    label212:
    for (int i = 5;; i = 4)
    {
      b(i, this, Integer.valueOf(paramInt));
      a locala;
      do
      {
        return;
        bool1 = false;
        break;
        locala = new a();
        locala.type = ck(paramObject);
      } while (locala.type == -1);
      locala.dDi = paramObject.toString();
      bool2 = this.sOm.s(Integer.valueOf(paramInt), locala);
      bool1 = bool2;
      if (!bool2) {
        break label83;
      }
      bool1 = bool2;
      if (!this.sOo.contains(Integer.valueOf(paramInt))) {
        break label83;
      }
      this.sOo.remove(Integer.valueOf(paramInt));
      bool1 = bool2;
      break label83;
    }
  }
  
  public final void setInt(int paramInt1, int paramInt2)
  {
    set(paramInt1, Integer.valueOf(paramInt2));
  }
  
  public final void setLong(int paramInt, long paramLong)
  {
    set(paramInt, Long.valueOf(paramLong));
  }
  
  static final class a
  {
    public String dDi = null;
    public int type = -1;
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == null) {}
      do
      {
        do
        {
          do
          {
            return false;
          } while (!(paramObject instanceof a));
          paramObject = (a)paramObject;
        } while (this.type != ((a)paramObject).type);
        if (this.dDi != null) {
          break;
        }
      } while (((a)paramObject).dDi != null);
      return true;
      return this.dDi.equals(((a)paramObject).dDi);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */