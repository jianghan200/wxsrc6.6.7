package com.tencent.mm.ui.widget.sortlist;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.mm.ui.ao;

public class d
  implements DragSortListView.i
{
  private ListView CU;
  private ImageView isa;
  private Bitmap uOW;
  int uOX = -16777216;
  
  public d(ListView paramListView)
  {
    this.CU = paramListView;
  }
  
  public final View GK(int paramInt)
  {
    View localView = this.CU.getChildAt(this.CU.getHeaderViewsCount() + paramInt - this.CU.getFirstVisiblePosition());
    if (localView == null) {
      return null;
    }
    localView.setPressed(false);
    localView.setDrawingCacheEnabled(true);
    this.uOW = Bitmap.createBitmap(localView.getDrawingCache());
    localView.setDrawingCacheEnabled(false);
    if (this.isa == null) {
      this.isa = new ImageView(this.CU.getContext());
    }
    this.isa.setBackgroundColor(this.uOX);
    this.isa.setPadding(0, 0, 0, 0);
    this.isa.setImageBitmap(this.uOW);
    this.isa.setLayoutParams(new ViewGroup.LayoutParams(localView.getWidth(), localView.getHeight()));
    return this.isa;
  }
  
  public final void dV(View paramView)
  {
    if ((paramView instanceof ImageView)) {
      ((ImageView)paramView).setImageDrawable(null);
    }
    ao.t("bitmap recycle %s", new Object[] { this.uOW.toString() });
    this.uOW.recycle();
    this.uOW = null;
  }
  
  public void i(Point paramPoint) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/widget/sortlist/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */