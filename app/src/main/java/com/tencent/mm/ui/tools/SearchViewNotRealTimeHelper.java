package com.tencent.mm.ui.tools;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.y;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import java.util.ArrayList;

public class SearchViewNotRealTimeHelper
  extends LinearLayout
  implements e
{
  private EditText jzo;
  public Button uBI;
  private a uBJ;
  private View uvc;
  private ImageButton uve;
  private ActionBarSearchView.a uvj;
  
  public SearchViewNotRealTimeHelper(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public SearchViewNotRealTimeHelper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    y.gq(getContext()).inflate(a.h.actionbar_searchview_with_searchbtn, this, true);
    this.jzo = ((EditText)findViewById(a.g.edittext));
    this.uve = ((ImageButton)findViewById(a.g.status_btn));
    this.uvc = findViewById(a.g.ab_back_container);
    this.uBI = ((Button)findViewById(a.g.button));
    this.uBI.setEnabled(false);
    this.jzo.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        if ((paramAnonymousEditable == null) || (paramAnonymousEditable.length() <= 0))
        {
          SearchViewNotRealTimeHelper.a(SearchViewNotRealTimeHelper.this).setVisibility(8);
          SearchViewNotRealTimeHelper.b(SearchViewNotRealTimeHelper.this).setEnabled(false);
          return;
        }
        SearchViewNotRealTimeHelper.a(SearchViewNotRealTimeHelper.this).setVisibility(0);
        SearchViewNotRealTimeHelper.b(SearchViewNotRealTimeHelper.this).setEnabled(true);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    });
    this.jzo.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if ((3 == paramAnonymousInt) && (SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this) != null)) {
          return SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this).pj(SearchViewNotRealTimeHelper.this.getSearchContent());
        }
        return false;
      }
    });
    c.d(this.jzo).Gi(100).a(null);
    this.uve.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        SearchViewNotRealTimeHelper.d(SearchViewNotRealTimeHelper.this).setText("");
        if (SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this) != null) {
          SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this).ava();
        }
      }
    });
    this.uvc.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        x.v("MicroMsg.SearchViewNotRealTimeHelper", "home btn click");
        if (SearchViewNotRealTimeHelper.e(SearchViewNotRealTimeHelper.this) != null) {
          SearchViewNotRealTimeHelper.e(SearchViewNotRealTimeHelper.this).bae();
        }
      }
    });
    this.uBI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this) != null) {
          SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this).wY(SearchViewNotRealTimeHelper.this.getSearchContent());
        }
      }
    });
  }
  
  public final void czt()
  {
    this.jzo.clearFocus();
  }
  
  public final boolean czu()
  {
    return false;
  }
  
  public final boolean czv()
  {
    return false;
  }
  
  public String getSearchContent()
  {
    Editable localEditable = this.jzo.getEditableText();
    if (localEditable == null) {
      return "";
    }
    return localEditable.toString();
  }
  
  public boolean hasFocus()
  {
    return false;
  }
  
  public final void ms(boolean paramBoolean) {}
  
  public final void mt(boolean paramBoolean)
  {
    this.jzo.setText("");
  }
  
  public void setAutoMatchKeywords(boolean paramBoolean) {}
  
  public void setBackClickCallback(ActionBarSearchView.a parama)
  {
    this.uvj = parama;
  }
  
  public void setCallBack(ActionBarSearchView.b paramb) {}
  
  public void setCallBack(a parama)
  {
    this.uBJ = parama;
  }
  
  public void setEditTextEnabled(boolean paramBoolean) {}
  
  public void setFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener) {}
  
  public void setHint(CharSequence paramCharSequence)
  {
    setSearchHint(paramCharSequence);
  }
  
  public void setKeywords(ArrayList<String> paramArrayList) {}
  
  public void setNotRealCallBack(a parama)
  {
    this.uBJ = parama;
  }
  
  public void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener) {}
  
  public void setSearchBtnText(CharSequence paramCharSequence)
  {
    this.uBI.setText(paramCharSequence);
  }
  
  public void setSearchColor(int paramInt)
  {
    this.jzo.setTextColor(paramInt);
  }
  
  public void setSearchContent(CharSequence paramCharSequence)
  {
    this.jzo.setText("");
    this.jzo.append(paramCharSequence);
  }
  
  public void setSearchContent(String paramString)
  {
    setSearchContent(paramString);
  }
  
  public void setSearchHint(CharSequence paramCharSequence)
  {
    this.jzo.setHint(paramCharSequence);
  }
  
  public void setSearchHintColor(int paramInt)
  {
    this.jzo.setHintTextColor(paramInt);
  }
  
  public void setSearchIcon(int paramInt)
  {
    this.jzo.setCompoundDrawablesWithIntrinsicBounds(paramInt, 0, 0, 0);
  }
  
  public void setSearchTipIcon(int paramInt) {}
  
  public void setSelectedTag(String paramString) {}
  
  public void setShowBackIcon(boolean paramBoolean)
  {
    if (this.uvc != null)
    {
      if (paramBoolean) {
        this.uvc.setVisibility(0);
      }
    }
    else {
      return;
    }
    this.uvc.setVisibility(8);
  }
  
  public void setStatusBtnEnabled(boolean paramBoolean) {}
  
  public static abstract interface a
  {
    public abstract void ava();
    
    public abstract boolean pj(String paramString);
    
    public abstract void wY(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */