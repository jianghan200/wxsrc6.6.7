package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import com.tencent.mm.br.g;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMEditText;

public final class m
{
  private Context mContext;
  private StringBuilder qHo;
  private SpannableStringBuilder qHp = new SpannableStringBuilder();
  private SpannableString qHq;
  private SpannableStringBuilder qHr = new SpannableStringBuilder();
  private CharacterStyle qHs = new ForegroundColorSpan(-5066062);
  private int qHt;
  private int qHu;
  public int qHv = 3;
  
  public m(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public final void a(MMEditText paramMMEditText)
  {
    if (paramMMEditText == null) {
      return;
    }
    this.qHv = 0;
    this.qHq = g.cjL().a(paramMMEditText.getText().toString(), paramMMEditText.getTextSize());
    x.d("MicroMsg.VoiceInputHelper", "setFinalText emojiSpannableString = %s", new Object[] { this.qHq });
    paramMMEditText.setText(this.qHq);
    paramMMEditText.setSelection(this.qHq.length());
  }
  
  public final void a(MMEditText paramMMEditText, String paramString, boolean paramBoolean)
  {
    if (paramMMEditText == null) {
      return;
    }
    if (this.qHo == null) {
      throw new IllegalStateException("You should saveHistory before setText");
    }
    int k = this.qHt + paramString.length();
    this.qHp.clear();
    this.qHr.clear();
    SpannableStringBuilder localSpannableStringBuilder2;
    if (paramBoolean)
    {
      this.qHq = g.cjL().a(this.qHo.subSequence(0, this.qHt), paramMMEditText.getTextSize());
      SpannableStringBuilder localSpannableStringBuilder1 = this.qHp.append(this.qHq);
      localSpannableStringBuilder2 = this.qHr;
      if ((localSpannableStringBuilder2 == null) || (paramString == null) || (paramString.length() == 0)) {
        localSpannableStringBuilder1.append(localSpannableStringBuilder2).append(this.qHo.subSequence(this.qHu, this.qHo.length()));
      }
    }
    for (;;)
    {
      x.d("MicroMsg.VoiceInputHelper", "setText historySelectStart = %s, historySelectEnd = %s, cursor = %s, length = %s, text = %s, spannableStringBuilder = %s", new Object[] { Integer.valueOf(this.qHt), Integer.valueOf(this.qHu), Integer.valueOf(k), Integer.valueOf(this.qHp.length()), paramString, this.qHp });
      paramMMEditText.setText(this.qHp);
      if (k > this.qHp.length()) {
        break;
      }
      if (k != 0) {
        break label332;
      }
      paramMMEditText.setSelection(this.qHp.length());
      return;
      int i;
      if (paramString.length() < this.qHv) {
        i = paramString.length();
      }
      for (int j = 0;; j = i - this.qHv)
      {
        localSpannableStringBuilder2.append(paramString).setSpan(this.qHs, j, i, 33);
        break;
        i = paramString.length();
      }
      this.qHq = g.cjL().a(paramString, paramMMEditText.getTextSize());
      this.qHp.append(this.qHq);
    }
    label332:
    paramMMEditText.setSelection(k);
  }
  
  public final void b(MMEditText paramMMEditText)
  {
    if (paramMMEditText == null) {}
    do
    {
      return;
      this.qHt = paramMMEditText.getSelectionStart();
      this.qHu = paramMMEditText.getSelectionEnd();
      this.qHo = new StringBuilder(paramMMEditText.getText());
      x.d("MicroMsg.VoiceInputHelper", "saveHistory historySelectStart = %s, historySelectEnd = %s, historyStringBuilder = %s", new Object[] { Integer.valueOf(this.qHt), Integer.valueOf(this.qHu), this.qHo });
    } while (!paramMMEditText.getText().toString().equalsIgnoreCase(""));
    this.qHp.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */