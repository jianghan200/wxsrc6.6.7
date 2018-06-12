package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.widget.BaseAdapter;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.plugin.fav.a.n.a;

public final class h
  implements n.a
{
  private n hsx;
  long hsy = 0L;
  private BaseAdapter hsz;
  
  public h(BaseAdapter paramBaseAdapter)
  {
    this.hsz = paramBaseAdapter;
  }
  
  public final void aW(String paramString, int paramInt)
  {
    this.hsz.notifyDataSetChanged();
  }
  
  final n avp()
  {
    if (this.hsx == null) {
      this.hsx = new n();
    }
    return this.hsx;
  }
  
  public final boolean isPlaying()
  {
    return (this.hsx != null) && (this.hsx.aLq());
  }
  
  public final void onFinish()
  {
    this.hsy = 0L;
    this.hsz.notifyDataSetChanged();
  }
  
  public final void onPause()
  {
    this.hsy = 0L;
    this.hsz.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/timeline/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */