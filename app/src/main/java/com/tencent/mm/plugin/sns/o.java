package com.tencent.mm.plugin.sns;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.storage.av;
import java.util.LinkedList;

public final class o
  implements m
{
  public final void a(long paramLong, ImageView paramImageView, int paramInt)
  {
    Object localObject = af.byo().fi(paramLong);
    if (localObject == null) {}
    do
    {
      return;
      localObject = ((n)localObject).bAJ();
    } while (((bsu)localObject).sqc.ruA.size() <= 0);
    localObject = (ate)((bsu)localObject).sqc.ruA.get(0);
    Bitmap localBitmap = af.byl().b((ate)localObject);
    if (localBitmap != null)
    {
      paramImageView.setImageBitmap(localBitmap);
      return;
    }
    af.byl().b((ate)localObject, paramImageView, paramInt, av.tbu);
  }
  
  public final boolean ew(long paramLong)
  {
    n localn = af.byo().fi(paramLong);
    if (localn == null) {}
    while (localn.bAJ().sqc.ruA.size() <= 0) {
      return false;
    }
    return true;
  }
  
  public final bsu ng(String paramString)
  {
    return e.ng(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */