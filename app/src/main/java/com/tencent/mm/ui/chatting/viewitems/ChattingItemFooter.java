package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.j;
import com.tencent.mm.ac.q;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public class ChattingItemFooter
  extends LinearLayout
  implements View.OnClickListener
{
  private static final int[] ucW = { R.g.chatfrom_bg_app_buttonleft, R.g.chatfrom_bg_app_buttonleft, R.g.chatfrom_bg_app_buttonright, R.g.chatfrom_bg_app_buttonone };
  private static final int[] ucX = { R.g.reader_news_multbg_buttonleft, R.g.reader_news_multbg_buttonmid, R.g.reader_news_multbg_buttonright, R.g.reader_news_multbg_buttonone };
  private LayoutInflater Bc;
  private String gtX;
  private Context mContext;
  
  public ChattingItemFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    this.Bc = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  private TextView a(int paramInt1, int paramInt2, LinearLayout.LayoutParams paramLayoutParams)
  {
    if (paramInt1 < paramInt2) {
      return (TextView)getChildAt(paramInt1);
    }
    TextView localTextView = (TextView)this.Bc.inflate(R.i.chatting_item_footer_item, null);
    localTextView.setLongClickable(false);
    localTextView.setOnClickListener(this);
    localTextView.setLayoutParams(paramLayoutParams);
    addView(localTextView);
    return localTextView;
  }
  
  private void d(j paramj)
  {
    paramj = new q(this.gtX, 1, paramj.getInfo(), null);
    au.DF().a(paramj, 0);
  }
  
  public final boolean l(List<j> paramList, String paramString)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      x.d("ChattingItemFooter", "no menulist!");
      setVisibility(8);
      return false;
    }
    this.gtX = paramString;
    int i = getChildCount();
    paramString = ucW;
    Object localObject = new LinearLayout.LayoutParams(0, -1);
    ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
    int j = paramList.size();
    switch (j)
    {
    }
    for (;;)
    {
      if ((i > j) && (i - 1 > 0)) {
        removeViews(j, i - 1);
      }
      setLongClickable(true);
      setVisibility(0);
      return true;
      paramList = (j)paramList.get(0);
      localObject = a(0, i, (LinearLayout.LayoutParams)localObject);
      ((TextView)localObject).setText(paramList.name);
      ((TextView)localObject).setTag(paramList);
      ((TextView)localObject).setBackgroundResource(paramString[3]);
      continue;
      j localj = (j)paramList.get(1);
      TextView localTextView = a(1, i, (LinearLayout.LayoutParams)localObject);
      localTextView.setText(localj.name);
      localTextView.setTag(localj);
      localTextView.setBackgroundResource(paramString[1]);
      localj = (j)paramList.get(0);
      localTextView = a(0, i, (LinearLayout.LayoutParams)localObject);
      localTextView.setText(localj.name);
      localTextView.setTag(localj);
      localTextView.setBackgroundResource(paramString[0]);
      paramList = (j)paramList.get(j - 1);
      localObject = a(j - 1, i, (LinearLayout.LayoutParams)localObject);
      ((TextView)localObject).setText(paramList.name);
      ((TextView)localObject).setTag(paramList);
      ((TextView)localObject).setBackgroundResource(paramString[2]);
    }
  }
  
  public void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if (!(paramView instanceof j)) {
      return;
    }
    paramView = (j)paramView;
    switch (paramView.type)
    {
    default: 
      return;
    case 1: 
      x.d("ChattingItemFooter", "get latest message");
      paramView.state = j.dMg;
      d(paramView);
      return;
    }
    x.d("ChattingItemFooter", "start webview url");
    paramView.state = j.dMg;
    d(paramView);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramView.value);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("geta8key_username", this.gtX);
    d.b(this.mContext, "webview", ".ui.tools.WebViewUI", localIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */