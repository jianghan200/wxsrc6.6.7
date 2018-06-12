package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class b
  extends a
{
  ArrayList<Object> bA = new ArrayList();
  protected Context mContext;
  int olq;
  
  protected b(Context paramContext)
  {
    this.mContext = paramContext;
    this.olq = 3;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    bT(paramObject);
    this.bA.add(paramInt, paramObject);
    notifyDataSetChanged();
  }
  
  public final void add(Object paramObject)
  {
    bT(paramObject);
    this.bA.add(paramObject);
    notifyDataSetChanged();
  }
  
  public void clear()
  {
    this.olp.clear();
    this.bA.clear();
    notifyDataSetChanged();
  }
  
  public void cu(List<?> paramList)
  {
    clear();
    ct(paramList);
    this.bA.addAll(paramList);
    notifyDataSetChanged();
  }
  
  public void dG(int paramInt1, int paramInt2)
  {
    if (paramInt2 < getCount())
    {
      ArrayList localArrayList = this.bA;
      localArrayList.add(paramInt2, localArrayList.remove(paramInt1));
      notifyDataSetChanged();
    }
  }
  
  public final int getColumnCount()
  {
    return this.olq;
  }
  
  protected final Context getContext()
  {
    return this.mContext;
  }
  
  public int getCount()
  {
    return this.bA.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.bA.get(paramInt);
  }
  
  public boolean xF(int paramInt)
  {
    return true;
  }
  
  public boolean xG(int paramInt)
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/previewimageview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */