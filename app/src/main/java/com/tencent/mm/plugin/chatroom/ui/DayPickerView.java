package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.k;
import android.util.AttributeSet;
import com.tencent.mm.R.n;
import com.tencent.mm.plugin.chatroom.a.b.a;
import java.util.Collection;

public class DayPickerView
  extends RecyclerView
{
  private TypedArray hKJ;
  private com.tencent.mm.plugin.chatroom.a.a hKK;
  protected com.tencent.mm.plugin.chatroom.a.b hMr;
  protected int hMs = 0;
  protected long hMt;
  private RecyclerView.k hMu;
  private Collection<com.tencent.mm.plugin.chatroom.d.a> hMv;
  private long hMw = -1L;
  protected int ie = 0;
  protected Context mContext;
  
  public DayPickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DayPickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!isInEditMode())
    {
      this.hKJ = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.DayPickerView);
      setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
      setLayoutManager(new LinearLayoutManager());
      this.mContext = paramContext;
      setVerticalScrollBarEnabled(false);
      setOnScrollListener(this.hMu);
      setFadingEdgeLength(0);
      this.hMu = new RecyclerView.k()
      {
        public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          super.c(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
          if ((b)paramAnonymousRecyclerView.getChildAt(0) == null) {
            return;
          }
          DayPickerView.this.hMt = paramAnonymousInt2;
          DayPickerView.this.ie = DayPickerView.this.hMs;
        }
      };
    }
  }
  
  public final void a(com.tencent.mm.plugin.chatroom.a.a parama, Collection<com.tencent.mm.plugin.chatroom.d.a> paramCollection)
  {
    this.hMv = paramCollection;
    this.hKK = parama;
    setUpAdapter(paramCollection);
    setAdapter(this.hMr);
    bg(this.hMr.getItemCount() - 1);
    this.hMr.RR.notifyChanged();
  }
  
  protected com.tencent.mm.plugin.chatroom.a.a getController()
  {
    return this.hKK;
  }
  
  public b.a<com.tencent.mm.plugin.chatroom.d.a> getSelectedDays()
  {
    return this.hMr.hKL;
  }
  
  protected TypedArray getTypedArray()
  {
    return this.hKJ;
  }
  
  public void setBeginDate(long paramLong)
  {
    this.hMw = paramLong;
  }
  
  protected void setUpAdapter(Collection<com.tencent.mm.plugin.chatroom.d.a> paramCollection)
  {
    if (this.hMr == null) {
      this.hMr = new com.tencent.mm.plugin.chatroom.a.b(getContext(), this.hKK, this.hKJ, this.hMw, paramCollection);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/DayPickerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */