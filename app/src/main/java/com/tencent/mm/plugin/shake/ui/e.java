package com.tencent.mm.plugin.shake.ui;

import android.database.Cursor;
import android.widget.ImageView;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.plugin.shake.b.f;
import com.tencent.mm.plugin.shake.b.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static void a(ImageView paramImageView, String paramString, int paramInt, boolean paramBoolean)
  {
    if (paramImageView == null) {}
    do
    {
      return;
      paramImageView.setImageBitmap(null);
    } while (bi.oW(paramString));
    Object localObject = new c.a();
    ((c.a)localObject).dXA = m.lV(paramString);
    ((c.a)localObject).dXy = true;
    ((c.a)localObject).dXV = true;
    ((c.a)localObject).dXW = paramBoolean;
    if (paramInt != 0) {
      ((c.a)localObject).dXR = paramInt;
    }
    localObject = ((c.a)localObject).Pt();
    o.Pj().a(paramString, paramImageView, (c)localObject);
  }
  
  public static String bvA()
  {
    Object localObject2 = m.buD();
    Object localObject1 = new ArrayList();
    Object localObject3 = "SELECT * FROM " + ((g)localObject2).getTableName() + " where status != 1";
    localObject2 = ((g)localObject2).diF.b((String)localObject3, null, 2);
    if (localObject2 != null)
    {
      while (((Cursor)localObject2).moveToNext())
      {
        localObject3 = new f();
        ((f)localObject3).d((Cursor)localObject2);
        ((List)localObject1).add(localObject3);
      }
      ((Cursor)localObject2).close();
    }
    localObject2 = new StringBuilder();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      ((StringBuilder)localObject2).append(((f)((Iterator)localObject1).next()).field_reserved1);
      ((StringBuilder)localObject2).append("|");
    }
    return ((StringBuilder)localObject2).toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */