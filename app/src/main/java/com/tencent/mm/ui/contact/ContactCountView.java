package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;

public class ContactCountView
  extends FrameLayout
{
  private boolean YN = true;
  private int count = 0;
  private View ern;
  private TextView kui;
  private int uix = 1;
  
  public ContactCountView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public ContactCountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    inflate(getContext(), R.i.contact_count_view, this);
  }
  
  public final void cyd()
  {
    String[] arrayOfString = s.dAV;
    if (this.uix == 1)
    {
      au.HU();
      this.count = c.FR().b(arrayOfString, new String[] { q.GF(), "weixin", "helper_entry", "filehelper" });
      x.d("MicroMsg.ContactCountView", "contact count %d", new Object[] { Integer.valueOf(this.count) });
      if (this.kui != null)
      {
        if (this.uix != 1) {
          break label182;
        }
        this.kui.setText(getContext().getResources().getQuantityString(R.j.address_contact_count, this.count, new Object[] { Integer.valueOf(this.count) }));
      }
    }
    for (;;)
    {
      setVisible(this.YN);
      return;
      au.HU();
      this.count = c.FR().c(arrayOfString, new String[] { q.GF(), "weixin", "helper_entry", "filehelper" });
      break;
      label182:
      this.kui.setText(getContext().getResources().getQuantityString(R.j.address_chatroom_contact_count, this.count, new Object[] { Integer.valueOf(this.count) }));
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    x.d("MicroMsg.ContactCountView", "onMeasure");
    if (this.ern == null)
    {
      this.ern = ((FrameLayout)findViewById(R.h.contact_count_view_fl));
      this.kui = ((TextView)findViewById(R.h.contact_count_tv));
    }
    cyd();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setContactType(int paramInt)
  {
    this.uix = paramInt;
  }
  
  public void setVisible(boolean paramBoolean)
  {
    this.YN = paramBoolean;
    View localView;
    if (this.ern != null)
    {
      localView = this.ern;
      if ((!paramBoolean) || (this.count <= 0)) {
        break label36;
      }
    }
    label36:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/contact/ContactCountView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */