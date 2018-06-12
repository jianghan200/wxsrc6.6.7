package com.tencent.mm.plugin.wallet_payu.security_question.model;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public final class a
  extends g
{
  private Bundle jfZ;
  
  public a(MMActivity paramMMActivity, i parami, Bundle paramBundle)
  {
    super(paramMMActivity, parami);
    this.jfZ = paramBundle;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (((paraml instanceof c)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (c)paraml;
      this.jfZ.putParcelable("key_security_question", new PayUSecurityQuestion(paramString.id, paramString.pGj));
    }
    do
    {
      do
      {
        return false;
      } while (!(paraml instanceof b));
      paramString = (b)paraml;
    } while ((paramInt1 != 0) || (paramInt2 != 0) || (!paramString.iMA));
    this.jfZ.putString("payu_reference", paramString.pGi);
    com.tencent.mm.wallet_core.a.j(this.fEY, this.jfZ);
    return true;
  }
  
  public final boolean m(Object... paramVarArgs)
  {
    paramVarArgs = (PayUSecurityQuestion)this.jfZ.getParcelable("key_security_question");
    String str1 = this.jfZ.getString("key_question_answer");
    String str2 = this.jfZ.getString("payu_reference");
    this.uXK.a(new b(str2, paramVarArgs.id, str1), true);
    return false;
  }
  
  public final boolean r(Object... paramVarArgs)
  {
    this.uXK.a(new c(this.jfZ.getString("payu_reference")), true);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/security_question/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */