package b.f;

import b.a.a;
import b.c.b.e;
import b.d.c;
import java.util.Collection;
import java.util.Iterator;

public class g
  extends f
{
  public static final boolean U(CharSequence paramCharSequence)
  {
    e.i(paramCharSequence, "$receiver");
    if (paramCharSequence.length() != 0)
    {
      e.i(paramCharSequence, "$receiver");
      Object localObject = (Iterable)new c(0, paramCharSequence.length() - 1);
      if (((localObject instanceof Collection)) && (((Collection)localObject).isEmpty())) {
        break label123;
      }
      localObject = ((Iterable)localObject).iterator();
      if (!((Iterator)localObject).hasNext()) {
        break label123;
      }
      char c = paramCharSequence.charAt(((a)localObject).nextInt());
      if ((!Character.isWhitespace(c)) && (!Character.isSpaceChar(c))) {
        break label118;
      }
      i = 1;
      label106:
      if (i != 0) {
        break label121;
      }
    }
    label118:
    label121:
    label123:
    for (int i = 0;; i = 1)
    {
      if (i == 0) {
        break label128;
      }
      return true;
      i = 0;
      break label106;
      break;
    }
    label128:
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/b/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */