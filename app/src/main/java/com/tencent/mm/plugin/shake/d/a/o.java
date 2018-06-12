package com.tencent.mm.plugin.shake.d.a;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class o
  extends i<n>
{
  public static final String[] ciG = new String[0];
  public static final String[] diD = { i.a(n.dhO, "shaketvhistory") };
  public e diF;
  
  public o(e parame)
  {
    super(parame, n.dhO, "shaketvhistory", diD);
    this.diF = parame;
  }
  
  public final Cursor bvi()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("SELECT * FROM shaketvhistory ORDER BY createtime DESC");
    localObject = ((StringBuilder)localObject).toString();
    return this.diF.rawQuery((String)localObject, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */