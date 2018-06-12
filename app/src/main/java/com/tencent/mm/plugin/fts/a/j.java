package com.tencent.mm.plugin.fts.a;

import android.database.Cursor;
import com.tencent.mm.storage.ab;
import java.util.List;

public abstract interface j
{
  public abstract ab Co(String paramString);
  
  public abstract boolean Cp(String paramString);
  
  public abstract long Cq(String paramString);
  
  public abstract List<String> Cr(String paramString);
  
  public abstract Cursor h(String paramString, String[] paramArrayOfString);
  
  public abstract Cursor rawQuery(String paramString, String[] paramArrayOfString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fts/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */