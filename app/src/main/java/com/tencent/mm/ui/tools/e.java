package com.tencent.mm.ui.tools;

import android.widget.TextView.OnEditorActionListener;
import java.util.ArrayList;

public abstract interface e
{
  public abstract void czt();
  
  public abstract boolean czu();
  
  public abstract boolean czv();
  
  public abstract String getSearchContent();
  
  public abstract void ms(boolean paramBoolean);
  
  public abstract void mt(boolean paramBoolean);
  
  public abstract void setAutoMatchKeywords(boolean paramBoolean);
  
  public abstract void setBackClickCallback(ActionBarSearchView.a parama);
  
  public abstract void setCallBack(ActionBarSearchView.b paramb);
  
  public abstract void setEditTextEnabled(boolean paramBoolean);
  
  public abstract void setHint(CharSequence paramCharSequence);
  
  public abstract void setKeywords(ArrayList<String> paramArrayList);
  
  public abstract void setNotRealCallBack(SearchViewNotRealTimeHelper.a parama);
  
  public abstract void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener);
  
  public abstract void setSearchContent(String paramString);
  
  public abstract void setSearchTipIcon(int paramInt);
  
  public abstract void setSelectedTag(String paramString);
  
  public abstract void setStatusBtnEnabled(boolean paramBoolean);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/tools/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */