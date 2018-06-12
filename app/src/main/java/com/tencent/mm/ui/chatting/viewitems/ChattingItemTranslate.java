package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.bp.a;
import com.tencent.mm.pluginsdk.ui.d.f;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.widget.MMNeatTextView;
import com.tencent.neattextview.textview.view.NeatTextView.b;

public class ChattingItemTranslate
  extends RelativeLayout
{
  private SpannableStringBuilder qHp = new SpannableStringBuilder();
  private CharacterStyle qHs = new ForegroundColorSpan(-5066062);
  private int qHv = 3;
  private MMNeatTextView ueh;
  private LinearLayout uei;
  private ProgressBar uej;
  private TextView uek;
  private NeatTextView.b uel;
  private boolean uem;
  private GestureDetector uen = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()
  {
    public final boolean onDoubleTap(MotionEvent paramAnonymousMotionEvent)
    {
      if (ChattingItemTranslate.a(ChattingItemTranslate.this) == null) {
        return false;
      }
      return ChattingItemTranslate.a(ChattingItemTranslate.this).dK(ChattingItemTranslate.b(ChattingItemTranslate.this));
    }
  });
  
  public ChattingItemTranslate(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void mf(boolean paramBoolean)
  {
    Context localContext = ad.getContext();
    if (localContext == null) {
      return;
    }
    if (paramBoolean)
    {
      this.ueh.setPadding(a.fromDPToPix(localContext, 10), a.fromDPToPix(localContext, 8), a.fromDPToPix(localContext, 10), a.fromDPToPix(localContext, 4));
      this.uei.setVisibility(0);
      return;
    }
    this.ueh.setPadding(a.fromDPToPix(localContext, 10), a.fromDPToPix(localContext, 8), a.fromDPToPix(localContext, 10), a.fromDPToPix(localContext, 8));
    this.uei.setVisibility(8);
  }
  
  public final void a(CharSequence paramCharSequence, b paramb)
  {
    SpannableStringBuilder localSpannableStringBuilder;
    if (!bi.K(paramCharSequence))
    {
      this.ueh.setMinWidth(a.fromDPToPix(ad.getContext(), 80));
      this.ueh.setMaxWidth(a.fromDPToPix(ad.getContext(), 259));
      this.ueh.setVisibility(0);
      if (paramb == b.uer)
      {
        this.qHp.clear();
        MMNeatTextView localMMNeatTextView = this.ueh;
        localSpannableStringBuilder = this.qHp;
        if ((localSpannableStringBuilder == null) || (paramCharSequence == null) || (paramCharSequence.length() == 0))
        {
          localMMNeatTextView.Q(localSpannableStringBuilder);
          label97:
          this.uej.setVisibility(8);
          if (paramb != b.ues) {
            break label197;
          }
          mf(true);
        }
      }
    }
    for (;;)
    {
      setVisibility(0);
      return;
      int i;
      if (paramCharSequence.length() < this.qHv) {
        i = paramCharSequence.length();
      }
      for (int j = 0;; j = i - this.qHv)
      {
        localSpannableStringBuilder.append(paramCharSequence).setSpan(this.qHs, j, i, 33);
        break;
        i = paramCharSequence.length();
      }
      this.ueh.Q(paramCharSequence);
      break label97;
      label197:
      mf(false);
      continue;
      if (paramb != b.uep)
      {
        this.uej.setVisibility(0);
        this.ueh.setVisibility(8);
        mf(false);
      }
    }
  }
  
  public final void init()
  {
    this.ueh = ((MMNeatTextView)findViewById(R.h.chatting_voice_play_transform_text));
    this.uej = ((ProgressBar)findViewById(R.h.chatting_voice_play_transform_textload));
    this.uei = ((LinearLayout)findViewById(R.h.chatting_voice_play_transform_finish_icon_layout));
    this.uek = ((TextView)findViewById(R.h.chatting_voice_play_transform_finish_icon));
    this.ueh.setOnTouchListener(new f(this.ueh, new m(this.ueh.getContext())));
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    int j = paramMotionEvent.getAction();
    if ((j == 1) && (this.uem)) {}
    for (int i = 1; i != 0; i = 0)
    {
      x.d("MicroMsg.ChattingItemTranslate", "ignore Action Up Event this time");
      return bool2;
    }
    if (j == 0) {
      this.uem = false;
    }
    if ((this.uel != null) && (this.uen != null)) {}
    for (boolean bool1 = this.uen.onTouchEvent(paramMotionEvent);; bool1 = false)
    {
      bool2 = bool1;
      if (bool1) {
        break;
      }
      return super.onTouchEvent(paramMotionEvent);
    }
  }
  
  public void setBrandWording(String paramString)
  {
    this.uek.setText(paramString);
  }
  
  public void setOnDoubleClickListener(NeatTextView.b paramb)
  {
    this.uel = paramb;
  }
  
  public static final class a
    extends au
  {
    public int hER = 1;
    
    public a(bd parambd, boolean paramBoolean, int paramInt)
    {
      super(paramBoolean, paramInt, null, '\000');
    }
  }
  
  public static enum b
  {
    private b() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */