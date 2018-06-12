package com.tencent.mm.ui.contact;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.a.a;
import com.tencent.mm.ui.contact.a.a.b;
import junit.framework.Assert;

public abstract class n
  extends BaseAdapter
{
  private SparseArray<a> sNR;
  public int scene;
  public l ujW;
  private boolean ujX;
  boolean ujY;
  
  public n(l paraml, boolean paramBoolean, int paramInt)
  {
    this(paraml, paramBoolean, paramInt, false);
  }
  
  public n(l paraml, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    this.ujW = paraml;
    this.ujX = paramBoolean1;
    this.sNR = new SparseArray();
    this.scene = paramInt;
    this.ujY = paramBoolean2;
  }
  
  public final a FM(int paramInt)
  {
    if (this.sNR.indexOfKey(paramInt) >= 0) {
      return (a)this.sNR.get(paramInt);
    }
    if ((paramInt >= 0) && (paramInt < getCount()))
    {
      a locala = iW(paramInt);
      if (locala != null)
      {
        locala.hoR = c(locala);
        this.sNR.put(paramInt, locala);
        x.d("MicroMsg.MMSelectContactAdapter", "put item to cache viewType=%d|position=%d", new Object[] { Integer.valueOf(locala.hER), Integer.valueOf(paramInt) });
        return locala;
      }
      x.e("MicroMsg.MMSelectContactAdapter", "createDataItem Occur error !!!!!!!!! position = %d", new Object[] { Integer.valueOf(paramInt) });
      return locala;
    }
    x.e("MicroMsg.MMSelectContactAdapter", "getItem Occur error !!!!!!!!! position = %d", new Object[] { Integer.valueOf(paramInt) });
    return null;
  }
  
  public boolean FN(int paramInt)
  {
    return false;
  }
  
  public boolean bwq()
  {
    return this.ujX;
  }
  
  protected boolean c(a parama)
  {
    return false;
  }
  
  public final void clearCache()
  {
    if (this.sNR != null) {
      this.sNR.clear();
    }
  }
  
  public void finish()
  {
    clearCache();
  }
  
  public long getItemId(int paramInt)
  {
    return -1L;
  }
  
  public int getItemViewType(int paramInt)
  {
    if (FM(paramInt) != null) {
      return FM(paramInt).hER;
    }
    x.e("MicroMsg.MMSelectContactAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount=%d | position = %s", new Object[] { Integer.valueOf(getCount()), Integer.valueOf(paramInt) });
    return -1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    a locala = FM(paramInt);
    View localView = paramView;
    if (paramView == null) {
      localView = locala.Wg().a(this.ujW.getActivity(), paramViewGroup);
    }
    paramView = (a.a)localView.getTag();
    Assert.assertNotNull(paramView);
    if (!locala.umn)
    {
      locala.ck(this.ujW.getActivity());
      locala.umn = true;
    }
    locala.ujX = bwq();
    locala.Wg().a(this.ujW.getActivity(), paramView, locala, this.ujW.b(locala), this.ujW.a(locala));
    return localView;
  }
  
  public int getViewTypeCount()
  {
    return 8;
  }
  
  public abstract a iW(int paramInt);
  
  public final void mk(boolean paramBoolean)
  {
    this.ujX = paramBoolean;
    notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/contact/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */