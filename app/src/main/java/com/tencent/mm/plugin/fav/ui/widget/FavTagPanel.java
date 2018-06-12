package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.base.MMTagPanel.d;
import java.util.Iterator;
import java.util.LinkedList;

public class FavTagPanel
  extends MMTagPanel
{
  LinkedList<MMTagPanel.d> jfF = new LinkedList();
  private a jfG = null;
  private View.OnClickListener jfH = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
      {
        FavTagPanel.a(FavTagPanel.this, (TextView)paramAnonymousView);
        if (FavTagPanel.a(FavTagPanel.this) != null) {
          paramAnonymousView.post(new FavTagPanel.1.1(this, paramAnonymousView));
        }
      }
      do
      {
        return;
        FavTagPanel.b(FavTagPanel.this, (TextView)paramAnonymousView);
      } while (FavTagPanel.a(FavTagPanel.this) == null);
      paramAnonymousView.post(new FavTagPanel.1.2(this, paramAnonymousView));
    }
  };
  
  public FavTagPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public FavTagPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void BJ(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.FavTagPanel", "want to remove type, but it is null or empty");
      return;
    }
    Iterator localIterator = this.jfF.iterator();
    while (localIterator.hasNext())
    {
      MMTagPanel.d locald = (MMTagPanel.d)localIterator.next();
      if (paramString.equals(locald.tyd))
      {
        this.jfF.remove(locald);
        removeView(locald.tye);
        a(locald);
        crR();
        return;
      }
    }
    x.w("MicroMsg.FavTagPanel", "want to remove type %s, but it not exsited!", new Object[] { paramString });
  }
  
  protected final void aMU()
  {
    if (getTagCount() > 0) {}
    while (this.jfF.isEmpty()) {
      return;
    }
    String str = ((MMTagPanel.d)this.jfF.getLast()).tyd;
    BJ(str);
    if (this.jfG != null) {
      this.jfG.BH(str);
    }
    crR();
  }
  
  public void setCallBack(a parama)
  {
    this.jfG = parama;
    super.setCallBack(parama);
  }
  
  public void setType(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.FavTagPanel", "want to add type, but it is null or empty");
      return;
    }
    paramString = paramString.trim();
    Object localObject = this.jfF.iterator();
    while (((Iterator)localObject).hasNext()) {
      if (paramString.equals(((MMTagPanel.d)((Iterator)localObject).next()).tyd))
      {
        x.w("MicroMsg.FavTagPanel", "want to add type %s, but it exsited!", new Object[] { paramString });
        return;
      }
    }
    this.jfF.clear();
    localObject = crQ();
    this.jfF.add(localObject);
    a((MMTagPanel.d)localObject, paramString, true);
    ((MMTagPanel.d)localObject).tye.setOnClickListener(this.jfH);
    addView(((MMTagPanel.d)localObject).tye, this.jfF.size() - 1);
    crR();
  }
  
  public static abstract interface a
    extends MMTagPanel.a
  {
    public abstract void BH(String paramString);
    
    public abstract void BI(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/widget/FavTagPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */