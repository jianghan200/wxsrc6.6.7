package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"UseSparseArrays"})
public class PreviewContactView
  extends LinearLayout
{
  private final Context context;
  private List<String> list = new ArrayList();
  private TableLayout nQm;
  private final Map<Integer, View> nQn = new HashMap();
  @SuppressLint({"UseSparseArrays"})
  private final Map<Integer, TableRow> nQo = new HashMap();
  private int nQp = 5;
  
  public PreviewContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    this.nQm = ((TableLayout)LayoutInflater.from(this.context).inflate(i.g.sns_preview_view, this, true).findViewById(i.f.content));
  }
  
  public void setImageClick(a parama) {}
  
  public void setLineNum(int paramInt)
  {
    this.nQp = paramInt;
    setList(this.list);
  }
  
  public void setList(List<String> paramList)
  {
    if (paramList == null) {}
    do
    {
      return;
      this.list = paramList;
      this.nQm.removeAllViews();
    } while (paramList.size() == 0);
    int m = paramList.size();
    int j = 0;
    int i = 0;
    label38:
    TableRow localTableRow;
    if (i < m)
    {
      localTableRow = (TableRow)this.nQo.get(Integer.valueOf(j));
      if (localTableRow != null) {
        break label264;
      }
      localTableRow = new TableRow(this.context);
      this.nQo.put(Integer.valueOf(j), localTableRow);
    }
    label264:
    for (;;)
    {
      localTableRow.removeAllViews();
      int k = 0;
      while ((k < this.nQp) && (i < m))
      {
        Object localObject2 = (View)this.nQn.get(Integer.valueOf(i));
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = View.inflate(this.context, i.g.sns_preview_contact_view, null);
          this.nQn.put(Integer.valueOf(i), localObject1);
        }
        localObject2 = (String)paramList.get(i);
        ImageView localImageView = (ImageView)((View)localObject1).findViewById(i.f.iv);
        localImageView.setBackgroundDrawable(null);
        a.b.a(localImageView, (String)localObject2);
        ((View)localObject1).setTag(Integer.valueOf(0));
        ((View)localObject1).setClickable(false);
        localTableRow.addView((View)localObject1);
        k += 1;
        i += 1;
      }
      this.nQm.addView(localTableRow);
      j += 1;
      break label38;
      break;
    }
  }
  
  static abstract class a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/PreviewContactView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */