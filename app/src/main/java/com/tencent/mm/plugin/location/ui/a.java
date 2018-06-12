package com.tencent.mm.plugin.location.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.j;
import com.tencent.mm.ui.base.j.a;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
  extends j
{
  private int kEh = 8;
  private ArrayList<String> kEi = new ArrayList();
  
  public final void B(ArrayList<String> paramArrayList)
  {
    this.kEi.clear();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      this.kEi.add(str);
    }
    if (this.tvj == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.MMGridPaperAdapter", "notifyDataSetChange, notifier is null ? %B", new Object[] { Boolean.valueOf(bool) });
      if (this.tvj != null) {
        break;
      }
      return;
    }
    this.tvj.avj();
  }
  
  public final View d(int paramInt, View paramView)
  {
    a locala = new a();
    if (paramView == null)
    {
      paramView = View.inflate(ad.getContext(), a.f.avatar_dialog_item, null);
      locala.eKk = ((ImageView)paramView.findViewById(a.e.avatar_img));
      locala.kEj = ((TextView)paramView.findViewById(a.e.username));
      paramView.setTag(locala);
    }
    for (;;)
    {
      Object localObject = (String)this.kEi.get(paramInt);
      a.b.a(locala.eKk, (String)localObject);
      String str = r.gT((String)localObject);
      localObject = str;
      if (str.length() > this.kEh) {
        localObject = str.subSequence(0, this.kEh + 1) + "...";
      }
      locala.kEj.setText((CharSequence)localObject);
      return paramView;
      locala = (a)paramView.getTag();
    }
  }
  
  public final int getCount()
  {
    return this.kEi.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.kEi.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  final class a
  {
    ImageView eKk;
    TextView kEj;
    
    a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/location/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */