package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.EditText;
import com.tencent.mm.plugin.appbrand.widget.input.c.c;
import com.tencent.mm.plugin.appbrand.widget.input.c.g;
import com.tencent.mm.plugin.appbrand.widget.input.c.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

 enum b
{
  static <Input extends EditText,  extends z> void a(Input paramInput, int paramInt1, int paramInt2)
  {
    if ((paramInput == null) || (paramInput.getEditableText() == null))
    {
      x.w("MicroMsg.AppBrandInputCommStyleHelper", "applySelection, invalid input %s", new Object[] { paramInput });
      return;
    }
    if (paramInt1 <= -2) {
      paramInt1 = paramInput.getSelectionStart();
    }
    label137:
    for (;;)
    {
      if (paramInt2 <= -2) {
        paramInt2 = paramInput.getSelectionEnd();
      }
      for (;;)
      {
        int i = paramInt1;
        if (paramInt1 > paramInt2) {
          i = paramInt2;
        }
        Selection.removeSelection(paramInput.getEditableText());
        paramInput.setSelection(i, paramInt2);
        return;
        if ((paramInt1 != -1) && (paramInt1 <= paramInput.getText().length())) {
          break label137;
        }
        paramInt1 = paramInput.getText().length();
        break;
        if ((paramInt2 == -1) || (paramInt2 > paramInput.getText().length())) {
          paramInt2 = paramInput.getText().length();
        }
      }
    }
  }
  
  static <Input extends EditText,  extends z> void a(Input paramInput, h paramh)
  {
    if ((paramInput == null) || (paramh == null)) {
      return;
    }
    if ((paramh.gLJ != null) && (paramh.gLJ.floatValue() != paramInput.getTextSize())) {
      paramInput.setTextSize(paramh.gLJ.floatValue());
    }
    if (paramh.gLI != null) {
      paramInput.setTextColor(paramh.gLI.intValue());
    }
    z localz;
    if (paramh.gLH != null)
    {
      if ((paramInput.getBackground() == null) || (!(paramInput.getBackground() instanceof ColorDrawable)) || (((ColorDrawable)paramInput.getBackground()).getColor() != paramh.gLH.intValue())) {
        paramInput.setBackground(new ColorDrawable(paramh.gLH.intValue()));
      }
      if (!bi.oW(paramh.gLM))
      {
        localObject = new SpannableStringBuilder(paramh.gLM);
        i = paramh.gLM.length();
        ((SpannableStringBuilder)localObject).setSpan(new StyleSpan(c.wk(paramh.gLN).style), 0, i, 18);
        if (paramh.gLP != null) {
          ((SpannableStringBuilder)localObject).setSpan(new ForegroundColorSpan(paramh.gLP.intValue()), 0, i, 18);
        }
        if (paramh.gLO != null) {
          ((SpannableStringBuilder)localObject).setSpan(new AbsoluteSizeSpan(paramh.gLO.intValue(), false), 0, i, 18);
        }
        paramInput.setHint((CharSequence)localObject);
      }
      if (paramh.gLK != null)
      {
        localObject = Typeface.create("sans-serif", c.wk(paramh.gLK).style);
        if (localObject != null) {
          paramInput.setTypeface((Typeface)localObject);
        }
      }
      Object localObject = g.wl(paramh.fTI);
      localz = (z)paramInput;
      if (localz != null) {}
      switch (com.tencent.mm.plugin.appbrand.widget.input.c.g.1.gMg[localObject.ordinal()])
      {
      default: 
        label328:
        if (!af.f(paramh.gLR)) {
          break;
        }
      }
    }
    for (int i = 8;; i = 0)
    {
      paramInput.setVisibility(i);
      ((z)paramInput).setFixed(af.f(paramh.gLV));
      return;
      paramInput.setBackground(null);
      break;
      localz.apM();
      break label328;
      localz.apN();
      break label328;
      localz.apO();
      break label328;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */