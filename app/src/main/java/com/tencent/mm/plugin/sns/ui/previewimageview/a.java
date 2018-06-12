package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.widget.BaseAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class a
  extends BaseAdapter
  implements d
{
  private int olo = 0;
  HashMap<Object, Integer> olp = new HashMap();
  
  protected final void bT(Object paramObject)
  {
    HashMap localHashMap = this.olp;
    int i = this.olo;
    this.olo = (i + 1);
    localHashMap.put(paramObject, Integer.valueOf(i));
  }
  
  protected final void ct(List<?> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      bT(paramList.next());
    }
  }
  
  public final long getItemId(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.olp.size())) {
      return -1L;
    }
    Object localObject = getItem(paramInt);
    return ((Integer)this.olp.get(localObject)).intValue();
  }
  
  public final boolean hasStableIds()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/previewimageview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */