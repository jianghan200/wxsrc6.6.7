package com.tencent.mm.plugin.emoji.ui.widget;

import android.content.Context;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class MMCopiableTextView
  extends EditText
  implements View.OnLongClickListener
{
  private final String TAG = "MicroMsg.MMCopiableTextView";
  private int gKG;
  private int iss;
  
  public MMCopiableTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public MMCopiableTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    setOnLongClickListener(this);
    setLongClickable(true);
  }
  
  protected boolean getDefaultEditable()
  {
    return false;
  }
  
  protected void onCreateContextMenu(ContextMenu paramContextMenu) {}
  
  public boolean onLongClick(View paramView)
  {
    paramView = getEditableText().toString();
    if ((!bi.oW(paramView)) && (this.gKG > 0) && (this.iss > 0) && (this.iss > this.gKG))
    {
      ClipboardManager localClipboardManager = (ClipboardManager)getContext().getSystemService("clipboard");
      if (localClipboardManager != null)
      {
        localClipboardManager.setText(paramView.substring(this.gKG, this.iss).trim());
        x.i("MicroMsg.MMCopiableTextView", "copy text :%s", new Object[] { localClipboardManager.getText() });
      }
      Toast.makeText(getContext(), R.l.app_copy_ok, 0).show();
    }
    return false;
  }
  
  public void setEndIndex(int paramInt)
  {
    this.iss = paramInt;
  }
  
  public void setStartIndex(int paramInt)
  {
    this.gKG = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/widget/MMCopiableTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */