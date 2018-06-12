package com.tencent.mm.plugin.fav.a;

import android.database.Cursor;
import com.tencent.mm.sdk.e.f;
import com.tencent.mm.sdk.e.i;
import java.util.LinkedList;
import java.util.List;

public abstract interface q
  extends f
{
  public static final String[] diD = { i.a(c.dhO, "FavCdnInfo") };
  
  public abstract c Br(String paramString);
  
  public abstract void a(p paramp);
  
  public abstract boolean a(c paramc, String... paramVarArgs);
  
  public abstract void aLt();
  
  public abstract LinkedList<c> aLu();
  
  public abstract Cursor aLv();
  
  public abstract Cursor aLw();
  
  public abstract void b(p paramp);
  
  public abstract boolean b(c paramc, String... paramVarArgs);
  
  public abstract List<c> dt(long paramLong);
  
  public abstract List<c> du(long paramLong);
  
  public abstract void dv(long paramLong);
  
  public abstract boolean dw(long paramLong);
  
  public abstract boolean e(c paramc);
  
  public abstract int p(long paramLong, int paramInt);
  
  public abstract void x(g paramg);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */