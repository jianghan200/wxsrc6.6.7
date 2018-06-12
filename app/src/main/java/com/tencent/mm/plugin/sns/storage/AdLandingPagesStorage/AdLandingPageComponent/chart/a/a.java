package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a;

import android.text.Spannable;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  extends LinkedHashMap<Spannable, Float>
{
  public long duration = 0L;
  public b nBJ = new b();
  public Interpolator nBK = null;
  private String nBL = "";
  
  public a() {}
  
  public a(b paramb)
  {
    this.nBJ = paramb;
  }
  
  public final boolean a(a parama)
  {
    if (size() != parama.size()) {
      return false;
    }
    parama = parama.entrySet().iterator();
    while (parama.hasNext()) {
      if (!containsKey(((Map.Entry)parama.next()).getKey())) {
        return false;
      }
    }
    return true;
  }
  
  public final Spannable[] bzI()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = entrySet().iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((Map.Entry)localIterator.next()).getKey());
    }
    return (Spannable[])localArrayList.toArray(new Spannable[localArrayList.size()]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/chart/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */