package com.tencent.mm.bt;

import android.content.ContentValues;
import android.os.Looper;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class i
{
  private al bAZ = new al(Looper.getMainLooper(), new al.a()
  {
    public final boolean vD()
    {
      if (!i.this.tdH.isOpen()) {
        return false;
      }
      i.this.cob();
      return false;
    }
  }, false);
  private String table = null;
  h tdH;
  private BlockingQueue<a> teb = new LinkedBlockingQueue();
  
  public i(h paramh, String paramString)
  {
    this.tdH = paramh;
    this.table = paramString;
  }
  
  final int a(a parama)
  {
    this.teb.add(parama);
    if (this.teb.size() >= 40) {
      cob();
    }
    if (this.bAZ.ciq()) {
      this.bAZ.J(60000L, 60000L);
    }
    return 0;
  }
  
  public final int cob()
  {
    x.d("MicroMsg.MemoryStorage.Holder", "appendAllToDisk table:%s trans:%b queue:%d", new Object[] { this.table, Boolean.valueOf(this.tdH.inTransaction()), Integer.valueOf(this.teb.size()) });
    if (this.teb.isEmpty()) {
      return 0;
    }
    long l;
    if (!this.tdH.inTransaction()) {
      l = this.tdH.dO(Thread.currentThread().getId());
    }
    for (;;)
    {
      if (!this.teb.isEmpty())
      {
        a locala = (a)this.teb.poll();
        if (locala == null) {
          x.w("MicroMsg.MemoryStorage.Holder", "appendToDisk Holder == null. table:%s", new Object[] { this.table });
        } else if ((this.tdH == null) || (!this.tdH.isOpen())) {
          x.e("MicroMsg.MemoryStorage.Holder", "appendToDisk diskDB already close. table:%s", new Object[] { this.table });
        } else if (locala.sIz == 2) {
          this.tdH.insert(this.table, locala.sKz, locala.values);
        } else if (locala.sIz == 5) {
          this.tdH.delete(this.table, locala.ted, locala.tee);
        } else if (locala.sIz == 1) {
          this.tdH.fV(this.table, locala.sql);
        } else if (locala.sIz == 4) {
          this.tdH.replace(this.table, locala.sKz, locala.values);
        } else if (locala.sIz == 3) {
          this.tdH.update(this.table, locala.values, locala.ted, locala.tee);
        }
      }
      else
      {
        if (l <= 0L) {
          break;
        }
        this.tdH.gp(l);
        return 0;
        l = 0L;
      }
    }
  }
  
  public static final class a
  {
    public int sIz;
    public String sKz;
    public String sql;
    public String ted;
    public String[] tee;
    public ContentValues values;
    
    public final void J(String[] paramArrayOfString)
    {
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0)) {}
      for (;;)
      {
        return;
        this.tee = new String[paramArrayOfString.length];
        int i = 0;
        while (i < paramArrayOfString.length)
        {
          this.tee[i] = new String(paramArrayOfString[i]);
          i += 1;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */