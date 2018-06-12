package com.tencent.mm.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.u;

public class SmileyGrid
  extends GridView
{
  public static int uSB = 1;
  public ListAdapter Do;
  private int fdx = ChatFooterPanel.qFd;
  private int gKK;
  public int gKM;
  private AdapterView.OnItemClickListener hpE = new SmileyGrid.1(this);
  private j qNc;
  private int uSC = 20;
  public int uSD = 0;
  private int uSE = 0;
  private ChatFooterPanel.a uSF;
  private boolean uSG;
  public AdapterView.OnItemClickListener uSH = new AdapterView.OnItemClickListener()
  {
    public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      paramAnonymousAdapterView = paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt);
      if ((paramAnonymousAdapterView instanceof u))
      {
        paramAnonymousInt = ((u)paramAnonymousAdapterView).position;
        paramAnonymousAdapterView = com.tencent.mm.br.e.cjH().mi(paramAnonymousInt);
        ((c)g.n(c.class)).getProvider().bg(paramAnonymousAdapterView, paramAnonymousInt);
        if (SmileyGrid.d(SmileyGrid.this) != null) {
          if (!SmileyGrid.f(SmileyGrid.this)) {
            break label140;
          }
        }
      }
      label140:
      for (paramAnonymousAdapterView = com.tencent.mm.br.e.cjH().mh(paramAnonymousInt);; paramAnonymousAdapterView = com.tencent.mm.br.e.cjH().getText(paramAnonymousInt))
      {
        SmileyGrid.d(SmileyGrid.this).append(paramAnonymousAdapterView);
        h.mEJ.h(13470, new Object[] { paramAnonymousAdapterView.replaceAll(",", " "), Integer.valueOf(SmileyGrid.b(SmileyGrid.this)), Integer.valueOf(1) });
        return;
      }
    }
  };
  
  public SmileyGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void cCb()
  {
    setOnItemClickListener(this.hpE);
  }
  
  public int getSmileyType()
  {
    return this.uSC;
  }
  
  public final void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    x.v("MicroMsg.emoji.SmileyGrid", "type:" + paramInt1 + " itemsPerPage:" + paramInt4 + " totalPage:" + paramInt5 + " curPage:" + this.gKM);
    setOnItemClickListener(this.hpE);
    this.uSC = paramInt1;
    this.gKM = paramInt2;
    this.gKK = paramInt3;
    this.uSD = paramInt4;
    this.uSE = paramInt5;
  }
  
  @TargetApi(8)
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void release()
  {
    this.uSF = null;
    this.qNc = null;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    super.setAdapter(paramListAdapter);
    this.Do = paramListAdapter;
  }
  
  public void setCallback(j paramj)
  {
    this.qNc = paramj;
  }
  
  public void setOnTextOperationListener(ChatFooterPanel.a parama)
  {
    this.uSF = parama;
  }
  
  public void setScene(int paramInt)
  {
    this.fdx = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/view/SmileyGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */