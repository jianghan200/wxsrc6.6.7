package com.tencent.mm.plugin.topstory.ui.video;

import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.tencent.mm.plugin.topstory.ui.a.c;

public final class h
{
  public static final c a(a parama)
  {
    int i = 0;
    while (i < parama.bAt().getChildCount())
    {
      Object localObject = parama.bAt().getChildAt(i);
      if (((View)localObject).getTag() != null)
      {
        localObject = (c)parama.bAt().aP((View)localObject);
        int j = com.tencent.mm.plugin.topstory.a.a.oyO;
        int k = -(((c)localObject).SU.getHeight() - ((c)localObject).oCS) / 2;
        if ((((c)localObject).SU.getTop() >= j + k) && (((c)localObject).SU.getBottom() <= ((c)localObject).nqm.y + ((c)localObject).SU.getHeight() / 2)) {}
        for (j = 1; j != 0; j = 0) {
          return (c)localObject;
        }
      }
      i += 1;
    }
    return null;
  }
  
  public static final c b(a parama)
  {
    int i = 0;
    while (i < parama.bAt().getChildCount())
    {
      Object localObject = parama.bAt().getChildAt(i);
      if (((View)localObject).getTag() != null)
      {
        localObject = (c)parama.bAt().aP((View)localObject);
        if (((c)localObject).position == parama.bHP()) {
          return (c)localObject;
        }
      }
      i += 1;
    }
    return a(parama);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/video/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */