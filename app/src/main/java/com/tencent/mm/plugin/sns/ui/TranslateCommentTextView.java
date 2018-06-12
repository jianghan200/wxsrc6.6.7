package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;

public class TranslateCommentTextView
  extends LinearLayout
{
  public SnsTranslateResultView nVv;
  public MaskTextView oic;
  
  public TranslateCommentTextView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public TranslateCommentTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    LayoutInflater.from(getContext()).inflate(i.g.timeline_comment_translate_item_layout, this);
    this.oic = ((MaskTextView)findViewById(i.f.comment_textview));
    this.nVv = ((SnsTranslateResultView)findViewById(i.f.sns_translate_result_view));
    this.nVv.setVisibility(8);
  }
  
  public TextView getOriginCommentTextView()
  {
    return this.oic;
  }
  
  public SnsTranslateResultView getTranslateResultView()
  {
    return this.nVv;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/TranslateCommentTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */