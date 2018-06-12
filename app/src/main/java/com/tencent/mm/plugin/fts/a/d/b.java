package com.tencent.mm.plugin.fts.a.d;

import android.content.Context;
import android.view.View;
import com.tencent.mm.plugin.fts.a.d.a.a;
import java.util.List;

public abstract class b
  implements e
{
  public Context context;
  public e.b jsY;
  public int jsZ;
  
  public b(Context paramContext, e.b paramb, int paramInt)
  {
    this.context = paramContext;
    this.jsY = paramb;
    this.jsZ = paramInt;
  }
  
  public static boolean bk(List<? extends Object> paramList)
  {
    return (paramList != null) && (paramList.size() > 0);
  }
  
  public boolean a(View paramView, a parama, boolean paramBoolean)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/fts/a/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */