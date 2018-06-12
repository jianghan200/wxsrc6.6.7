package com.tencent.mm.plugin.fts.a;

import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public abstract class b
  implements k
{
  private boolean isCreated;
  public boolean jpR;
  
  public b()
  {
    x.i("MicroMsg.FTS.BaseFTS5SearchLogic", "Create %s", new Object[] { getName() });
  }
  
  public abstract boolean BT();
  
  public a a(i parami)
  {
    return null;
  }
  
  public void a(String paramString, l paraml, int paramInt, HashMap<String, String> paramHashMap) {}
  
  public final boolean aPX()
  {
    return this.isCreated;
  }
  
  public void addSOSHistory(String paramString) {}
  
  public final void create()
  {
    try
    {
      x.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnCreate %s | isCreated =%b", new Object[] { getName(), Boolean.valueOf(this.isCreated) });
      if ((!this.isCreated) && (onCreate()))
      {
        x.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetCreated");
        this.isCreated = true;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void deleteSOSHistory() {}
  
  public void deleteSOSHistory(String paramString) {}
  
  public final void destroy()
  {
    x.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnDestroy %s | isDestroyed %b | isCreated %b", new Object[] { getName(), Boolean.valueOf(this.jpR), Boolean.valueOf(this.isCreated) });
    if ((!this.jpR) && (this.isCreated) && (BT()))
    {
      x.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetDestroyed");
      this.jpR = true;
    }
  }
  
  public abstract boolean onCreate();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fts/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */