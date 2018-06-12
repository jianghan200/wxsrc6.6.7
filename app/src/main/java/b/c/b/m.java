package b.c.b;

import b.c.b.a.a;
import b.c.b.a.b;
import java.util.Collection;

public class m
{
  private static ClassCastException a(ClassCastException paramClassCastException)
  {
    throw ((ClassCastException)e.b(paramClassCastException, m.class.getName()));
  }
  
  public static Collection cK(Object paramObject)
  {
    if (((paramObject instanceof a)) && (!(paramObject instanceof b)))
    {
      if (paramObject == null) {}
      for (paramObject = "null";; paramObject = paramObject.getClass().getName()) {
        throw a(new ClassCastException((String)paramObject + " cannot be cast to " + "kotlin.collections.MutableCollection"));
      }
    }
    return cL(paramObject);
  }
  
  private static Collection cL(Object paramObject)
  {
    try
    {
      paramObject = (Collection)paramObject;
      return (Collection)paramObject;
    }
    catch (ClassCastException paramObject)
    {
      throw a((ClassCastException)paramObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/b/c/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */