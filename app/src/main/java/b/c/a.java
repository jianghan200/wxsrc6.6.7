package b.c;

import b.c.b.e;
import b.i;

public final class a
{
  public static final <T> Class<T> a(b.e.b<T> paramb)
  {
    e.i(paramb, "$receiver");
    paramb = ((b.c.b.b)paramb).cJL();
    Object localObject;
    if (!paramb.isPrimitive())
    {
      localObject = paramb;
      if (paramb == null) {
        throw new i("null cannot be cast to non-null type java.lang.Class<T>");
      }
    }
    else
    {
      localObject = paramb.getName();
      if (localObject == null) {}
      for (;;)
      {
        localObject = paramb;
        if (paramb != null) {
          break;
        }
        throw new i("null cannot be cast to non-null type java.lang.Class<T>");
        switch (((String)localObject).hashCode())
        {
        default: 
          break;
        case -1325958191: 
          if (((String)localObject).equals("double")) {
            paramb = Double.class;
          }
          break;
        case 64711720: 
          if (((String)localObject).equals("boolean")) {
            paramb = Boolean.class;
          }
          break;
        case 3039496: 
          if (((String)localObject).equals("byte")) {
            paramb = Byte.class;
          }
          break;
        case 3052374: 
          if (((String)localObject).equals("char")) {
            paramb = Character.class;
          }
          break;
        case 109413500: 
          if (((String)localObject).equals("short")) {
            paramb = Short.class;
          }
          break;
        case 97526364: 
          if (((String)localObject).equals("float")) {
            paramb = Float.class;
          }
          break;
        case 104431: 
          if (((String)localObject).equals("int")) {
            paramb = Integer.class;
          }
          break;
        case 3327612: 
          if (((String)localObject).equals("long")) {
            paramb = Long.class;
          }
          break;
        }
      }
    }
    return (Class<T>)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/b/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */